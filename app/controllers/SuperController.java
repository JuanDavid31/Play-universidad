package controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;
import javax.inject.*;
import play.data.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuperController extends Controller {

    @Inject
    private FormFactory fForms;

    public Result indice(){
        return ok(index.render());
    }

    public Result mostrarUsuarios(){
        List<UsuarioEntity> todos = UsuarioController.darTodos();
        return ok(usuarios.render(todos));
    }
    
    public Result adicionarUsuario(){
        Form<UsuarioEntity> formulario = fForms.form(UsuarioEntity.class);
        return ok(adicionarUsuario.render(formulario));
    }

    public Result guardarUsuario(){
        Form<UsuarioEntity> formulario = fForms.form(UsuarioEntity.class).bindFromRequest();
        UsuarioEntity usuario = formulario.get();
        UsuarioController.guardar(usuario);
        return redirect("/usuarios");
    }

    public Result editarUsuario(int id){
        UsuarioEntity usuario = UsuarioController.darUsuario(id);
        Form<UsuarioEntity> formulario = fForms.form(UsuarioEntity.class).fill(usuario);
        return ok(editarUsuario.render(formulario));
    }

    public Result actualizarUsuario(int id){
        UsuarioEntity nuevo = fForms.form(UsuarioEntity.class).bindFromRequest().get();
        UsuarioEntity antiguo = UsuarioController.darUsuario(id);
        UsuarioController.actualizar(antiguo, nuevo);
        return redirect("/usuarios");
    }

    public Result eliminarUsuario(int id){
        UsuarioEntity usuario = UsuarioController.darUsuario(id);
        UsuarioController.eliminar(usuario);
        return redirect("/usuarios");
    }

    public Result agregarUsuariosRandom(){
        for(int i = 0; i < 10; i++){
            UsuarioEntity usuario = new UsuarioEntity();
            int randomNumber = (int)(Math.random()*1000);
            usuario.setcId(randomNumber);
            usuario.setdNombre("Pacho " + randomNumber);
            UsuarioController.guardar(usuario);
        }
        return redirect("/usuarios");
    }

    public Result eliminarUsuarios(){
        List<UsuarioEntity> usuarios = UsuarioController.darTodos();
        for(UsuarioEntity usuario : usuarios){
            System.out.println(usuario.toString());
            UsuarioController.eliminar(usuario);
        }
        return redirect("/usuarios");
    }

    public Result mostrarCanciones(){
        String id = session("conectado");
        if(id != null){
            List<CancionEntity> todas = UsuarioController.darUsuario(Integer.parseInt(id)).getCanciones();
            return ok(canciones.render(todas));
        }
        return badRequest("Debe iniciar sesion");
    }

    public Result adicionarCancion(){
        return ok(adicionarCancion.render());
    }

    public Result subirCancion(){
        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        try {
            return CancionController.subirCancion(body);
        } catch (IOException e) {
            e.printStackTrace();
            return badRequest("La cancion no se pudo subir");
        }
    }

    public Result eliminarCancion(int id){
        CancionEntity cancion = CancionController.darCancion(id);
        CancionController.eliminar(cancion);
        return redirect("/canciones");
    }

    public static String darSesionActual(){
        String id = session("conectado");
        if(id != null){
            return UsuarioController.darUsuario(Integer.parseInt(id)).getdNombre();
        }
        return "Sesion no iniciada";
    }

    public Result iniciarSesion(int id){
        session("conectado",Integer.toString(id));
        return indice();
    }

    public Result cerrarSesion(){
        session().clear();
        return indice();
    }

    public Result darUsuariosJson(){
        List<UsuarioEntity> usuarios = UsuarioController.darTodos();
        return ok(Json.toJson(usuarios));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result rutaSecreta2(){

        ObjectNode result = Json.newObject();
        result.put("exampleField1", "foobar");

        JsonNode json = request().body().asJson();
        String nombre = json.findPath("nombre").textValue();
        if(nombre == null) {
            return ok(result);
        } else {
            result.put("nombre", nombre);
            return ok(result);
        }
    }



    //Ajax para subir archivo

    public Result rutaSecreta3(){

        ObjectNode result = Json.newObject();

        Http.MultipartFormData<File> body = request().body().asMultipartFormData();

        File archivo = subir1(body);
        if(archivo != null){
            result.put("Dentrodelif", "El archivo no es null");
            Map resultados = null;
            try {
                resultados = alojarEnCloudDinary1(archivo);
                result.put("Try", "ya aloje la cancion");
            } catch (IOException e) {
                e.printStackTrace();
                result.put("Catch", "En el catch");
                return ok(result);
            }
            resultados.put("nombre", body.getFiles().get(0).getFilename());
            guardar1(resultados);

            result.put("resultado", "BUENISIMO");

            //Subida exitosa
            return ok(result);
        }

        result.put("resultado", "Malo");

        // Debes subir un archivo en formato .mp3
        return ok(result);

    }

    private static File subir1(Http.MultipartFormData body){
        Http.MultipartFormData.FilePart<File> archivo = (Http.MultipartFormData.FilePart<File>) body.getFiles().get(0);
        if (cancionValida1(archivo)){
            return  archivo.getFile();
        }else { System.out.println("El FilePart es null");
            return null;
        }
    }

    private static boolean cancionValida1(Http.MultipartFormData.FilePart<File> archivo){
        return archivo != null && (archivo.getFilename().endsWith(".mp3") || archivo.getFilename().endsWith(".MP3"));
    }

    private static Map alojarEnCloudDinary1(File cancion) throws IOException {
        Map configuracion = new HashMap();
        configuracion.put("cloud_name","juandavid");
        configuracion.put("api_key","846846898798748");
        configuracion.put("api_secret","07y51L8pSLMbFq0IENcKarmZ1c4");
        Cloudinary cd = new Cloudinary(configuracion);
        return cd.uploader().upload(cancion, ObjectUtils.asMap("resource_type", "auto"));
    }

    private static void guardar1(Map datos){
        UsuarioEntity usuario = UsuarioController.darUsuario(1);
        CancionEntity cancion = new CancionEntity();
        cancion.setdNombre(datos.get("nombre").toString());
        cancion.setdUri(datos.get("url").toString());
        adicionarUsuarioACancion1(usuario, cancion);
        UsuarioController.adicionarCancion(usuario, cancion);
    }

    public static void adicionarUsuarioACancion1(UsuarioEntity usuario, CancionEntity cancion){
        cancion.setUsuario(usuario);
        cancion.save();
    }

}

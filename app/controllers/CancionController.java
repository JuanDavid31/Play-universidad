package controllers;

import com.cloudinary.utils.ObjectUtils;
import models.*;
import play.mvc.*;
import play.mvc.Controller;
import play.mvc.Http.MultipartFormData.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

import com.cloudinary.*;

public class CancionController extends Controller {

    public static List darTodos(){
        return CancionEntity.find.all();
    }

    public static CancionEntity darCancion(int id){
        return CancionEntity.find.ref(id);
    }

    public static void adicionarUsuarioACancion(UsuarioEntity usuario, CancionEntity cancion){
        cancion.setUsuario(usuario);
        cancion.save();
    }

    public static void eliminar(CancionEntity cancion){
        cancion.getUsuario().getCanciones().remove(cancion);
        cancion.delete();
    }

    public static Result subirCancion(Http.MultipartFormData<File> body) throws IOException {
        File archivo = subir(body);
        if(archivo != null){
            Map resultados = alojarEnCloudDinary(archivo);
            resultados.put("nombre", body.getFile("cancion").getFilename());
            guardar(resultados);
            // aquí haría falta un flash para subida exitosa
            return redirect("/canciones");
        }
        // podría dejar el mismo redirec con un flash de error
        return badRequest("El achivo es null");
    }

    private static File subir(Http.MultipartFormData body){
        FilePart<File> archivo = body.getFile("cancion");
        if (cancionValida(archivo)){
            return  archivo.getFile();
        }else {
            return null;
        }
    }

    private static boolean cancionValida(FilePart<File> archivo){
        return archivo != null && (archivo.getFilename().endsWith(".mp3") || archivo.getFilename().endsWith(".MP3"));
    }

    public static Map alojarEnCloudDinary(File cancion) throws IOException {
        Map configuracion = new HashMap();
        configuracion.put("cloud_name","juandavid");
        configuracion.put("api_key","846846898798748");
        configuracion.put("api_secret","07y51L8pSLMbFq0IENcKarmZ1c4");
        Cloudinary cd = new Cloudinary(configuracion);
        return cd.uploader().upload(cancion, ObjectUtils.asMap("resource_type", "auto"));
    }

    private static void guardar(Map datos){
        UsuarioEntity usuario = UsuarioController.darUsuario(Integer.parseInt(session("conectado")));
        CancionEntity cancion = new CancionEntity();
        cancion.setdNombre(datos.get("nombre").toString());
        cancion.setdUri(datos.get("url").toString());
        adicionarUsuarioACancion(usuario, cancion);
        UsuarioController.adicionarCancion(usuario, cancion);
    }
}

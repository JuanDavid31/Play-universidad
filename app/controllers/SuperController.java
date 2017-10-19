package controllers;

import models.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;
import javax.inject.*;
import play.data.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

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

    public Result rutaSecreta2(){
	    return ok("fffgg");
    }

}

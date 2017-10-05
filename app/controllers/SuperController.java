package controllers;

import models.*;
import play.mvc.*;
import views.html.*;
import javax.inject.*;
import play.data.*;
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
            System.out.println(usuario.toString() + " " + usuario.delete());
        }
        return redirect("/usuarios");
    }

    public Result mostrarCanciones(){
        List<CancionEntity> todas = CancionController.darTodos();
        return ok(canciones.render(todas));
    }

    public Result adicionarCancion(){
        Form<CancionEntity> formulario = fForms.form(CancionEntity.class);
        return ok(adicionarCancion.render(formulario));
    }

    public Result subirCancion(){

        return redirect("/canciones");
    }

    public Result eliminarCancion(int id){
        CancionEntity cancion = CancionController.darCancion(id);
        CancionController.eliminar(cancion);
        return redirect("/canciones");
    }

}

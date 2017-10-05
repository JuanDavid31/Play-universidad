package controllers;

import models.UsuarioEntity;
import play.mvc.Controller;

import java.util.List;

public class UsuarioController extends Controller {


    public static List<UsuarioEntity> darTodos(){
        return UsuarioEntity.find.all();
    }

    public static UsuarioEntity darUsuario(int id){
        return UsuarioEntity.find.ref(id);
    }

    public static void guardar(UsuarioEntity usuario){
        usuario.save();
    }

    public static void actualizar(UsuarioEntity antiguo, UsuarioEntity nuevo){
        antiguo.setdNombre(nuevo.getdNombre());
        guardar(antiguo);
    }

    public static void eliminar(UsuarioEntity usuario){
        usuario.delete();
    }

}

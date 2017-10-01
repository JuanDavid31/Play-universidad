package controllers;

import io.ebean.Finder;
import models.UsuarioEntity;
import play.mvc.Controller;

import java.util.List;

public class UsuarioController extends Controller {


    public static List<UsuarioEntity> darTodos(){
        return UsuarioEntity.find.all();
    }

    public static void adicionar(UsuarioEntity usuario){
        usuario.save();
    }

    public static void eliminar(UsuarioEntity usuario){
        usuario.delete();
    }


}

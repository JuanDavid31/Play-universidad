package controllers;

import models.CancionEntity;
import play.db.jpa.*;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.List;


public class CancionController extends Controller {

    
    public static void adicionar(CancionEntity cancion){
        cancion.save();

    }

    public static CancionEntity consultar(int id){

        //CancionEntity cancion = CancionEntity.find(id);
        return new CancionEntity();
    }

    public static List<CancionEntity> consultarTodos(){

        return new ArrayList<>();

    }

    public static void actualizar(CancionEntity cancion){

    }

    public static void eliminar(int id){
        CancionEntity cancion = consultar(id);
        //JPA.em().remove(cancion);
    }
}

package controllers;

import models.CancionEntity;
import play.mvc.Controller;
import java.util.ArrayList;
import java.util.List;


public class CancionController extends Controller {

    public static List darTodos(){
        return CancionEntity.find.all();
    }

    public static CancionEntity darCancion(int id){
        return CancionEntity.find.ref(id);
    }

    public static void adicionar(CancionEntity cancion){
        cancion.save();
    }

    public static void eliminar(CancionEntity cancion){
        cancion.delete();
    }
}

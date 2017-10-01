package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import io.ebean.Ebean;
import models.CancionEntity;
import models.UsuarioEntity;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.math.BigInteger;
import java.util.List;

public class SuperController extends Controller {

    public Result indice(){

        return TODO;
    }

    public Result mostrarUsuarios(){
        List<UsuarioEntity> usuarios = UsuarioController.darTodos();
        JsonNode json = Json.toJson(usuarios);
        return ok( json );
    }
    
    public Result adicionarUsuario(int id, String nombre){

        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setcId(id);
        usuario.setdNombre(nombre);
        UsuarioController.adicionar(usuario);
        return redirect("/usuarios");
    }

    public Result eliminarUsuario(int id){
        UsuarioEntity usuario = UsuarioEntity.find.ref(id);
        UsuarioController.eliminar(usuario);
        return redirect("/usuarios");
    }

    public Result agregarUsuariosRandom(){
        for(int i = 0; i < 10; i++){
            UsuarioEntity usuario = new UsuarioEntity();
            int randomNumber = (int)(Math.random()*1000);
            usuario.setcId(randomNumber);
            usuario.setdNombre("Pacho " + randomNumber);
            UsuarioController.adicionar(usuario);
        }
        return redirect("/usuarios");
    }

    public Result eliminarUsuarios(){
        List<UsuarioEntity> usuarios = UsuarioController.darTodos();
        for(int i = 0; i < usuarios.size(); i++){
            System.out.println(usuarios.get(i).toString() + " " + usuarios.get(i).delete());
        }
        return redirect("/usuarios");
    }

}

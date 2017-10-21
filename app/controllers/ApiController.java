package controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.libs.*;
import play.mvc.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.*;

import java.io.*;
import java.util.*;

public class ApiController extends Controller {

    public Result darUsuariosJson(){
        List<UsuarioEntity> usuarios = UsuarioController.darTodos();
        return ok(Json.toJson(usuarios));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result adicionarUsuario(){
        JsonNode json = request().body().asJson();
        String nombre = json.findPath("nombre").textValue();
        ObjectNode result = Json.newObject();
        result.put("Metodo", "POST");

        if(nombre == null) {
            return badRequest("Nombre es null");
        } else {
            UsuarioEntity usuario = new UsuarioEntity();
            usuario.setdNombre(nombre);
            UsuarioController.guardar(usuario);
            result.put("Resultado", "Adicionado");
            return ok(result);
        }
    }

    public Result adicionarCancion(int id){

        ObjectNode result = Json.newObject();
        MultipartFormData<File> body = request().body().asMultipartFormData();
        File archivo = subir(body);
        if(archivo != null){
            Map resultados = null;
            try {
                resultados = CancionController.alojarEnCloudDinary(archivo);
            } catch (IOException e) {
                e.printStackTrace();
                return internalServerError("Hubo un problema al subir el archivo, intentelo de nuevo");
            }
            resultados.put("nombre", body.getFiles().get(0).getFilename());
            result.put("id", id);
            guardar(resultados);
            result.put("resultado", "Subida exitosa");
            return ok(result);
        }
        return badRequest("Debes subir un archivo en formato .mp3");
    }

    private static File subir(MultipartFormData<File> body){
        FilePart<File> archivo = body.getFiles().get(0);
        if (cancionValida(archivo)){
            return  archivo.getFile();
        }else {
            return null;
        }
    }

    private static boolean cancionValida(FilePart<File> archivo){
        return archivo != null && (archivo.getFilename().endsWith(".mp3") || archivo.getFilename().endsWith(".MP3"));
    }

    private static void guardar(Map datos){
        UsuarioEntity usuario = UsuarioController.darUsuario( Integer.parseInt(datos.get("id").toString()));
        CancionEntity cancion = new CancionEntity();
        cancion.setdNombre(datos.get("nombre").toString());
        cancion.setdUri(datos.get("url").toString());
        adicionarUsuarioACancion(usuario, cancion);
        UsuarioController.adicionarCancion(usuario, cancion);
    }

    private static void adicionarUsuarioACancion(UsuarioEntity usuario, CancionEntity cancion){
        cancion.setUsuario(usuario);
        cancion.save();
    }

    public Result actualizarUsuario(int id){
        ObjectNode result = Json.newObject();
        result.put("Metodo", "PUT");
        JsonNode json = request().body().asJson();
        String nombre = json.findPath("nombre").textValue();
        if(nombre == null) {
            return badRequest("El nombre es null");
        } else {
            UsuarioEntity usuario = UsuarioController.darUsuario(id);
            usuario.setdNombre(nombre);
            UsuarioController.guardar(usuario);
            result.put("Resultado", "Usuario editado");
            return ok(result);
        }
    }

    public Result eliminarUsuario(int id){
        UsuarioEntity usuario = UsuarioController.darUsuario(id);
        if(usuario.delete()){
            return ok("Usuario eliminado");
        }
        return internalServerError("No se pudo eliminar el usuario, intente de nuevo");
    }
}

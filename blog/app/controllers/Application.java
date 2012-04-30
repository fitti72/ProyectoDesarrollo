package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.DAO.MongoDB.UsuarioMongoDB;
import models.DAO.UsuarioDAO;
import models.OD.UsuarioOD;

public class Application extends Controller {

    public static void index() {
        
        UsuarioOD persona = new UsuarioOD(2,"Pedro","Manuel","Scott","Nieto","scott7462@gmail.com","scott746","Venezuela","Soy negro","M","07/11/1988","foto","1234");
        persona.eliminar(persona);
        render();
    }

}
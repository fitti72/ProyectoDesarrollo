/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models.DAO.MongoDB;

import com.mongodb.*;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.OD.UsuarioOD;

/**
 *
 * @author SCOTT
 */
public class UsuarioMongoDB implements models.DAO.UsuarioDAO{

    private UsuarioOD usuario;
    
    public UsuarioMongoDB(UsuarioOD usuario) {
        this.usuario = usuario;
    }

    
    
    
    public DBCollection conectarMongo(){
        Mongo m;
        try {
            m = new Mongo();
            DB db = m.getDB( "blog" );
            DBCollection coleccionUsuario = db.getCollection("usuario");
        return coleccionUsuario;
        } catch (UnknownHostException ex) {
            Logger.getLogger(UsuarioMongoDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (MongoException ex) {
            Logger.getLogger(UsuarioMongoDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    
    public void insertarUsuario(UsuarioOD Usuario) {
        
        
        DBCollection coleccionUsuario = conectarMongo();
        
        if(coleccionUsuario!=null){
            
            BasicDBObject usuario = new BasicDBObject();
            usuario.put("id_u", Usuario.getId_u());
            usuario.put("nombre", Usuario.getNombre());
            usuario.put("nombres", Usuario.getNombres());
            usuario.put("apellido", Usuario.getApellido());
            usuario.put("apellidos", Usuario.getApellidos());
            usuario.put("email", Usuario.getEmail());
            usuario.put("fecha", Usuario.getFecha());
            usuario.put("nick", Usuario.getNick());
            usuario.put("pais", Usuario.getPais());
            usuario.put("biografia", Usuario.getBiografia());
            usuario.put("sexo", Usuario.getSexo());
            usuario.put("foto", Usuario.getFoto());     
            usuario.put("clave", Usuario.getClave());
            coleccionUsuario.insert(usuario);
            
        }
        else
        {
            System.out.println("coleccion no existente");
        }
    }

    
    
    public void eliminarUsuario(UsuarioOD Usuario) {
         DBCollection coleccionUsuario = conectarMongo();
        
        if(coleccionUsuario!=null){
            
            BasicDBObject usuario = new BasicDBObject();
            usuario.put("id_u", Usuario.getId_u());
            usuario.remove(usuario);
            
        }
        else
        {
            System.out.println("coleccion no existente");
        }
    }

    public void modificarUsuario(UsuarioOD Usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void listarUsuario(UsuarioOD Usuario) {
      
    }
    
//     public UsuarioOD buscarUsuario(UsuarioOD Usuario) {
//         
//         
//      
//    }
  
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models.DAO;

import models.OD.UsuarioOD;

/**
 *
 * @author SCOTT
 */
public interface UsuarioDAO {
    
    public void insertarUsuario(UsuarioOD Usuario); 
    public void eliminarUsuario(UsuarioOD Usuario);
    public void modificarUsuario(UsuarioOD Usuario);
    public void listarUsuario(UsuarioOD Usuario);
    //public UsuarioOD buscarUsuario(UsuarioOD Usuario);
    
}

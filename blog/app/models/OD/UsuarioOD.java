/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models.OD;

import java.util.Date;
import models.DAO.MongoDB.UsuarioMongoDB;
import models.DAO.UsuarioDAO;

/**
 *
 * @author SCOTT
 */
public class UsuarioOD {
    
    private int id_u;
    private String nombre; 
    private String nombres;
    private String apellido;
    private String apellidos;
    private String email;
    private String nick;
    private String pais;
    private String biografia;
    private String sexo;
    private String fecha;
    private String foto;
    private String clave;

    public UsuarioOD(int id_u, String nombre, String nombres, String apellido, String apellidos, String email, String nick, String pais, String biografia, String sexo,String fecha, String foto, String clave) {
        this.id_u = id_u;
        this.nombre = nombre;
        this.nombres = nombres;
        this.apellido = apellido;
        this.apellidos = apellidos;
        this.email = email;
        this.nick = nick;
        this.pais = pais;
        this.biografia = biografia;
        this.sexo = sexo;
        this.fecha = fecha;
        this.foto = foto;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId_u() {
        return id_u;
    }

    public void setId_u(int id_u) {
        this.id_u = id_u;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void insertar(UsuarioOD persona){
        UsuarioDAO DAO = new UsuarioMongoDB(persona);
        DAO.insertarUsuario(persona);
    }
    
    public void buscar(UsuarioOD persona){
        UsuarioDAO DAO = new UsuarioMongoDB(persona);
        //DAO.buscarUsuario(persona);
    }
    public void eliminar(UsuarioOD persona){
        UsuarioDAO DAO = new UsuarioMongoDB(persona);
        DAO.eliminarUsuario(persona);
    }
    
    
}

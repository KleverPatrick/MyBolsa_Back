package tech.MyBolsa.productosmanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String usuario;
    private String contraseña;

    public Usuario(){

    }
    public Usuario(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
 
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario( String usuario){
        this.usuario = usuario;
    }

    public String getContraseña(){
        return contraseña;
    }
    public void setContraseña (String contraseña){
        this.contraseña = contraseña;
    }

    @Override
    public String toString(){
        return "Usuario{"+
        "id=" + id +
        ", usuario ='" + usuario + '\'' +
        ", contraseña='" + contraseña + '\'' +
        '}';
    }

}

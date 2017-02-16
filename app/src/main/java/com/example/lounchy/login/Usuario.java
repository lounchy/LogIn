package com.example.lounchy.login;

/**
 * Created by Menchu y Dainis on 14/02/2017.
 */

public class Usuario {
    private int id;
    private String nombrePersona;
    private String altura;
    private String nombreUsuario;
    private String contrasenia;



    public Usuario(String nombrePersona, String altura, String nombreUsuario, String contrasenia) {
        this.nombrePersona = nombrePersona;
        this.altura = altura;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }


    public Usuario(String usuario, String contrasenia){
        this.nombreUsuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Usuario(int id) {
        this.id = id;
    }
    public Usuario(){}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNombrePersona() {return nombrePersona;}

    public void setNombrePersona(String nombrePersona) {this.nombrePersona = nombrePersona;}

    public String getAltura() {return altura;}

    public void setAltura(String altura) {this.altura = altura;}

    public String getNombreUsuario() {return nombreUsuario;}

    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}

    public String getContrasenia() {return contrasenia;}

    public void setContrasenia(String contrasenia) {this.contrasenia = contrasenia;}
}

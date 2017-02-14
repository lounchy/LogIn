package com.example.lounchy.login;

/**
 * Created by Menchu y Dainis on 14/02/2017.
 */

public class Usuario {
    private int id;
    private String nombre;
    private String altura;
    private String usuario;
    private String contraseña;

    public Usuario(int id, String nombre, String altura, String usuario, String contraseña) {
        this.id = id; this.nombre = nombre; this.altura = altura; this.usuario = usuario; this.contraseña = contraseña;
        setNombre(nombre); setId(id); setAltura(altura); setUsuario(usuario); setContraseña(contraseña);
    }

    public Usuario(){}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getAltura() {return altura;}

    public void setAltura(String altura) {this.altura = altura;}

    public String getUsuario() {return usuario;}

    public void setUsuario(String usuario) {this.usuario = usuario;}

    public String getContraseña() {return contraseña;}

    public void setContraseña(String contraseña) {this.contraseña = contraseña;}
}

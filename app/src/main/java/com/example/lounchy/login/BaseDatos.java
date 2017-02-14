package com.example.lounchy.login;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

/**
 * Created by Menchu y Dainis on 14/02/2017.
 */

public class BaseDatos extends SQLiteOpenHelper {
    private static final String SQL_CREA_TABLA_USUARIO = "CREATE TABLE USUARIO(id INTEGER PRIMARY KEY, nombre TEXT, altura TEXT, usuario TEXT, contraseña TEXT)";

    public BaseDatos(Context context, String nombre, SQLiteDatabase.CursorFactory cursor, int version) {
        super(context, nombre, cursor, version);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREA_TABLA_USUARIO);

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void insertarUsuario(Usuario usuario){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("INSERT INTO USUARIO(nombre, altura, usuario, contraseña)" +
                "VALUES(" +
                "'"+usuario.getNombre()+"',"+
                "'"+usuario.getAltura()+"',"+
                "'"+usuario.getUsuario()+"',"+
                "'"+usuario.getContraseña()+")");
        sqLiteDatabase.close();
    }
    public List<Usuario> selecionarUsuario(){
        List<Usuario> usuarioList = null;
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor cursor;


        return usuarioList;
    }
}

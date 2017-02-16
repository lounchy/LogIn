package com.example.lounchy.login;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Menchu y Dainis on 14/02/2017.
 */

public class BaseDatos extends SQLiteOpenHelper {
    private static final String SQL_CREA_TABLA_USUARIO = "CREATE TABLE USUARIO(id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, altura TEXT, usuario TEXT, contrasenia TEXT)";
    public static final String NOMBRE_BASA_DATOS = "Registro Base Datos";

    //Constructor
    public BaseDatos(Context context, String nombre, SQLiteDatabase.CursorFactory cursor, int version) {
        super(context, nombre, cursor, version);

    }

    //Methodo onCreate obligatorio para SQLiteOpenHelper
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREA_TABLA_USUARIO);
    }

    //Methodo onUpgrade obligatorio para SQLiteOpenHelper
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    /*
     *insertarUsuario encarga de sacar los valores y guardar
     */
    public void insertarUsuario(Usuario usuario){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase(); //consultar los datos
        sqLiteDatabase.execSQL("INSERT INTO USUARIO(nombre, altura, usuario, contrasenia)" +
                "VALUES('" +
                usuario.getNombrePersona()+"',"+
                "'"+usuario.getAltura()+"',"+
                "'"+usuario.getNombreUsuario()+"',"+
                "'"+usuario.getContrasenia()+"'"+")");
        sqLiteDatabase.close();
    }

    /**
     * existeUsuario encarga de comprobar usuario en base dedatos
     * @param usuario con dos valores, Nombre usuario y Contraseña
     * @return usuario existe o no existe
     */
    public boolean existeUsuario(Usuario usuario){
        boolean usuarioExiste = false;

        //declaro nueva variable CONSULTA_USUARIO (COnsulta Nombre de usuario y Contraseña)
        String CONSULTA_USUARIO = "SELECT * FROM USUARIO WHERE usuario='" + usuario.getNombreUsuario()+ "' AND contrasenia='" + usuario.getContrasenia()+"'";
        SQLiteDatabase baseDatos = getReadableDatabase(); //consultar los datos
        Cursor cursor = baseDatos.rawQuery(CONSULTA_USUARIO, null);

        if (cursor.getCount()==1)//existe 1 usuario
        {
            usuarioExiste=true;
        }
        else // no existe usuario
        {
            usuarioExiste= false;
        }

        //para asegurarme cierro basedatos y cursor
        baseDatos.close();
        cursor.close();
        return usuarioExiste;
    }

    /**
     * existeNombreUsuario encarga de comprobar nombre de usuario en base dedatos
     * @param usuario con solo un valor Nombre usuario
     * @return nombre de usuario existe o no existe
     */
    public boolean existeNombreUsuario(Usuario usuario){
        boolean nombreUsuarioExiste = false;

        //declaro nueva variable CONSULTA_NOMBRE_USUARIO (COnsulta Nombre de usuario)
        String CONSULTA_NOMBRE_USUARIO="SELECT * FROM USUARIO WHERE usuario = '" + usuario.getNombreUsuario()+"'";
        SQLiteDatabase baseDatos = getReadableDatabase(); //consulta los datos
        Cursor cursor = baseDatos.rawQuery(CONSULTA_NOMBRE_USUARIO, null);
        if (cursor.getCount()==1)//existe
        {
            nombreUsuarioExiste = true;
        }
        //por seguridad cierro
        baseDatos.close();
        cursor.close();
        return nombreUsuarioExiste;
    }

    /**
     * contraseniaCorrecta encarga de comprobar la contraseña en la base de datos
     * @param usuario con solo un valor contraseña
     * @return contraseña corecta/incorecta
     */
    public boolean contraseniaCorecta(Usuario usuario)
    {
        boolean contraseniaOk = false;
        //declaro nueva variable CONSULTA_CONTRASEÑA
        String CONSULTA_CONTRASENIA = "SELECT * FROM USUARIO WHERE contrasenia = '" + usuario.getContrasenia()+"'";
        SQLiteDatabase baseDatos = getReadableDatabase();//consulta los datos
        Cursor cursor = baseDatos.rawQuery(CONSULTA_CONTRASENIA, null);
        if (cursor.getCount()==1) // contraseña correcta
        {
            contraseniaOk = true;
        }

        //por seguridad cierro
        baseDatos.close();
        cursor.close();
        return contraseniaOk;
    }

    //Aqui nesecitaria ayuda
    public int buscarId(Usuario usuario){


        String CONSULTA_ID = "SELECT * FROM USUARIO WHERE id = '" + usuario.getId() + "'";
        SQLiteDatabase baseDatos = getReadableDatabase();
        Cursor cursor = baseDatos.rawQuery(CONSULTA_ID, null);
        if (cursor.moveToFirst()){
            return cursor.getInt(usuario.getId());
        }
        else {
            return -1;
        }

    }

}


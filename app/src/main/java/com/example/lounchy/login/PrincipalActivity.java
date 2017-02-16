package com.example.lounchy.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {
    private int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Usuario usuario = new Usuario(id);

        BaseDatos baseDatos = new BaseDatos(this, BaseDatos.NOMBRE_BASA_DATOS, null, 1);

        //Aqui nesecitaria ayuda


        if (baseDatos.buscarId(usuario)!= usuario.getId()){
            Log.e(getClass().getCanonicalName(), "Usuario no logeado");
            Intent intent =new Intent(this, LoginActivity.class);
            startActivity(intent);

        }else {
            Log.e(getClass().getCanonicalName(), "Usuario  logeado con id " + usuario.getId());

            setContentView(R.layout.activity_principal);

            EscuchaButon escuchaButon = new EscuchaButon(this);

            Button salir = (Button)findViewById(R.id.salir_button);
            salir.setOnClickListener(escuchaButon);

        }


    }
}

package com.example.lounchy.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        BaseDatos baseDatos = new BaseDatos(this, "BaseDatosUsuario", null, 1);
        final Button bCrearCuenta = (Button) findViewById(R.id.crear_nueva_cuenta_button);
        final EditText etNombre = (EditText) findViewById(R.id.nombre_registro_et);
        final EditText etAltura = (EditText) findViewById(R.id.altura_registro_et);
        final EditText etUsuario = (EditText) findViewById(R.id.usuario_registro_et);
        final EditText etContraseña = (EditText) findViewById(R.id.contraseña_registro_et);


        bCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(getClass().getCanonicalName(), "pulsado boton : " + bCrearCuenta);


                String iNombre = etNombre.getText().toString();
                String iAltura = etAltura.getText().toString();
                String iUsuario = etUsuario.getText().toString();
                String iContraseña = etContraseña.getText().toString();
            }
        });
    }
}

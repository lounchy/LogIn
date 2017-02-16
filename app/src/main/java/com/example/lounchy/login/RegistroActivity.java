package com.example.lounchy.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        EscuchaButon escuchaButon = new EscuchaButon(this);
        Button crearCuenta = (Button)findViewById(R.id.crear_nueva_cuenta_button);
        crearCuenta.setOnClickListener(escuchaButon);
    }
}

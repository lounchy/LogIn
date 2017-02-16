package com.example.lounchy.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EscuchaButon escuchaButon = new EscuchaButon(this);

        Button entrar = (Button)findViewById(R.id.entrar_button);
        entrar.setOnClickListener(escuchaButon);

        Button nuevaCuenta = (Button)findViewById(R.id.no_tienes_cuenta_button);
        nuevaCuenta.setOnClickListener(escuchaButon);





    }
}

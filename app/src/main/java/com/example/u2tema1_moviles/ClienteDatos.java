package com.example.u2tema1_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ClienteDatos extends AppCompatActivity {
    TextView txtmensaje,txtsexo,txtcelular,txtdomicilio;
    String titulo,sexo,celular,domicilio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_datos);

        Bundle extras = getIntent().getExtras();
        titulo = extras.getString("Nombre");
        sexo=extras.getString("sexo");
        celular=extras.getString("celular");
        domicilio=extras.getString("Domicilio");

        txtmensaje=findViewById(R.id.titulo);
        txtsexo=findViewById(R.id.sexo);
        txtcelular=findViewById(R.id.celular);
        txtdomicilio=findViewById(R.id.domicilio);

        txtmensaje.setText(titulo);
        txtsexo.setText(sexo);
        txtcelular.setText(celular);
        txtdomicilio.setText(domicilio);
    }


}

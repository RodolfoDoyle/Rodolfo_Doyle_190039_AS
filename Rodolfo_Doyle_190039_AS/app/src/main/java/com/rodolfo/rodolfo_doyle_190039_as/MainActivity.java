package com.rodolfo.rodolfo_doyle_190039_as;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
//Variavel
    FloatingActionButton fab = findViewById(R.id.fab);
    @Override
//Criar instancias
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//Layout
        setContentView(R.layout.activity_main);
//O que o botão faz qdo clica
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
//Configurando o que rola quando clica
            public void onClick(View view) {
//Texto que aparece quando clica
                Snackbar.make(view, "DALE OHATÃO", Snackbar.LENGTH_LONG).setAction("Action", null).show();
//Tamo junto
            }
        });
    }
}

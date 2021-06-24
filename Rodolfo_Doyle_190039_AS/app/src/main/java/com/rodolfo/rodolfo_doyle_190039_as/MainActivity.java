package com.rodolfo.rodolfo_doyle_190039_as;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab = findViewById(R.id.fab);
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        fab.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG).setAction("Action", null).show();

            }
        });
    }
}

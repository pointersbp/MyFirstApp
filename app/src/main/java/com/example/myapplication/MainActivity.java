package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 //   private TextView nombre, apellido, fecha;
    private Spinner drop;
    private Button enviar, limpiar;
 //   private CheckBox java, python, c, cmas;
 //   private RadioButton programar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drop = findViewById(R.id . spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this, R.array.generos, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        drop.setAdapter(adapter);

        Button limpiar = (Button)findViewById(R.id.button2);
        limpiar.setText("Limpiar");

        Button enviar = (Button)findViewById(R.id.button4);
        enviar.setText("Enviar");

    }
}
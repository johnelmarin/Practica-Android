package com.marin.mark.evaluacionpractica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.marin.mark.evaluacionpractica.adapters.NameAdapter;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btnChangeText);
        Button button1 = findViewById(R.id.btnChangeText1);

        View.OnClickListener ButtonClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.inputHello);
                String value = String.valueOf(input.getText());
                Log.i("MAIN_APP", "El valor del input es: " + value);



                // Llamar por telefono
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", value, null));
                startActivity(intent);

            }
        };

        View.OnClickListener ButtonClick1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.inputHello1);
                String value = String.valueOf(input.getText());
                Log.i("MAIN_APP", "El valor del input es: " + value);


                //Enviar sms por telefono

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", value, null));
                startActivity(intent);
            }


        };
        button.setOnClickListener(ButtonClick);
        button1.setOnClickListener(ButtonClick1);

//      Listas
        RecyclerView rv = findViewById(R.id.rvNames);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //
        //
        List<String> datos = Arrays.asList("dato1", "datos2", "datos3");
        NameAdapter adapter = new NameAdapter(datos);

        rv.setAdapter(adapter);

    }



}
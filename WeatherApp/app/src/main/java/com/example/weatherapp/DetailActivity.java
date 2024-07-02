package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        TextView cityNameTextView = findViewById(R.id.nombreCiudad);
        TextView temperatureTextView = findViewById(R.id.temperaturaActual);
        TextView temperatureminTextView = findViewById(R.id.temperaturaMinima);
        TextView temperaturamaxTextView = findViewById(R.id.temperaturaMaxima);

        cityNameTextView.setText("Ciudad de Prueba");
        temperatureTextView.setText("25°C");
        temperatureminTextView.setText("Soleado");
        temperaturamaxTextView.setText("Maximo Sol");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void volve(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}
package com.example.abreu.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.abreu.R;

public class Pacientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pacientes);

        Button botonRegistar = findViewById(R.id.button);
        Button botonCancelar = findViewById(R.id.button3);

        botonRegistar.setOnClickListener(v-> {
            Toast.makeText( this,"Datos registrados correctamente", Toast.LENGTH_SHORT).show();

        });

        botonCancelar.setOnClickListener(v -> {
            finish();

        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
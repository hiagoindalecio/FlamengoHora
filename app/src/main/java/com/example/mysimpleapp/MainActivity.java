package com.example.mysimpleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        getDelegate().onStart();
        getDelegate().onStart();

        Button btnAtualiza = findViewById(R.id.btnAtualiza);
        btnAtualiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartClock();
            }
        });
    }

    protected void StartClock() {
        final TextView txtHora = findViewById(R.id.txtHora);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        txtHora.setText(sdf.format(new Date()));
    }
}
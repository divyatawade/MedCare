package com.example.med_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adminview extends AppCompatActivity {

    Button hospreg,docreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminview);

        hospreg=findViewById(R.id.hospreg);
        docreg = findViewById(R.id.docreg);

        hospreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), hos_reg.class);
                startActivity(i);

            }
        });

        docreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), doc_reg.class);
                startActivity(i);

            }
        });
    }
}
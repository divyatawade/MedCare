package com.example.med_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button adminlog,userlog,doclog,drivlog,hoslog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adminlog = findViewById(R.id.adminlog);
        userlog = findViewById(R.id.userlog);
        doclog= findViewById(R.id.doclog);
        drivlog= findViewById(R.id.drivlog);
        hoslog= findViewById(R.id.hoslog);

        adminlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), adminloginpage.class);
                startActivity(i);

            }
        });
        userlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), userlogin.class);
                startActivity(i);

            }
        });
        doclog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), doclogin.class);
                startActivity(i);

            }
        });
        /*drivlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), drivlogin.class);
                startActivity(i);

            }
        });*/
        hoslog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), hoslogin.class);
                startActivity(i);

            }
        });

    }
}
package com.example.med_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class adminloginpage extends AppCompatActivity {

    EditText adminid, adminpassword;
    Button adminsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminloginpage);

        adminid = findViewById(R.id.adminid);
        adminpassword = findViewById(R.id.adminpassword);
        adminsignin = findViewById(R.id.adminsignin);

        adminsignin.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View v) {
                SetValidation();
                if (adminid.getText().toString().equals("ADMIN123") && adminpassword.getText().toString().equals("ADMIN123")) {
                    Intent i = new Intent(getApplicationContext(), adminview.class);
                    startActivity(i);
                } else {
                    Toast.makeText(adminloginpage.this, "Wrong username or password", Toast.LENGTH_LONG).show();
                    adminid.setText("");
                    adminpassword.setText("");
                }

            }
        });


    }
    public void SetValidation() {
        boolean isEmailValid,isPasswordValid;
        if (adminid.getText().toString().isEmpty()) {
            adminid.setError(getResources().getString(R.string.ID_error));
            isEmailValid = false;
        }
        else  {
            isEmailValid = true;
        }

        // Check for a valid password.
        if (adminpassword.getText().toString().isEmpty()) {
            adminpassword.setError(getResources().getString(R.string.pass_error));
            isPasswordValid = false;
        }
        else  {
            isPasswordValid = true;
        }


    }

}


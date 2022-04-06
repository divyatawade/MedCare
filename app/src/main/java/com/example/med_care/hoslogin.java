package com.example.med_care;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class hoslogin extends AppCompatActivity {

    EditText ID,password;
    Button usignin;
    DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoslogin);

        ID = findViewById(R.id.ID);
        password = findViewById(R.id.password);
        usignin = findViewById(R.id.usignin);
        Toast.makeText(hoslogin.this, "31", Toast.LENGTH_LONG).show();

        usignin.setOnClickListener(new View.OnClickListener() {

            @Override
              public void onClick(View v) {
                Toast.makeText(hoslogin.this, "36", Toast.LENGTH_LONG).show();

                ref = FirebaseDatabase.getInstance().getReference().child("Hospital");
                Toast.makeText(hoslogin.this, "40", Toast.LENGTH_LONG).show();

                  ref.addValueEventListener(new ValueEventListener() {
                      @Override
                      public void onDataChange(@NonNull DataSnapshot snapshot) {
                          Toast.makeText(hoslogin.this, "57", Toast.LENGTH_LONG).show();

                          for(DataSnapshot snap : snapshot.getChildren())
                          {
                              hospitalhelper sh = snap.getValue(hospitalhelper.class);
                              String hosid = sh.getHosid();
                              String hospass = sh.getPassword();
                              if(sh.getHosid().equals(ID.getText().toString()) && sh.getPassword().equals(password.getText().toString()))
                              {
                                  Toast.makeText(hoslogin.this, "hospital login Successfully", Toast.LENGTH_LONG).show();

                              }

                          }

                      }

                      @Override
                      public void onCancelled(@NonNull DatabaseError error) {

                      }
                  });
              }
          }
        );

    }
}
package com.example.med_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class hos_reg extends AppCompatActivity {

    EditText hid,hname,haddress,hpass,hphone,hregno;
    CheckBox hbed,hamb,hblood;
    Button button;
    String beds,ambulance,bloodbank;
    FirebaseDatabase rootNode;
    DatabaseReference reference,ref2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hos_reg);

        hid = findViewById(R.id.hid);
        hname = findViewById(R.id.hname);
        haddress = findViewById(R.id.haddress);
        hpass = findViewById(R.id.hpass);
        hbed = findViewById(R.id.hbed);
        hblood = findViewById(R.id.hblood);
        hamb = findViewById(R.id.hamb);
        hregno=findViewById(R.id.hreg);
        hphone = findViewById(R.id.hphone);
        button = findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();

                String address = haddress.getText().toString(),
                        name = hname.getText().toString(),
                        reg_no = hregno.getText().toString(),
                        password = hpass.getText().toString(),
                        phone = hphone.getText().toString(),
                        pluscode = " ", hosid = hid.getText().toString();
                ambulance = ambchbox();
                beds = bedchbox();
                bloodbank=bloodchbox();

                hospitalhelper vh;
                vh = new hospitalhelper(address, ambulance, beds, bloodbank, hosid, name, password, phone, pluscode, reg_no);
                DatabaseReference reference1 = FirebaseDatabase.getInstance().getReference().child("Hospital");
                reference1.child(hosid).setValue(vh);

                if(SetValidation())
                {
                    Toast.makeText(hos_reg.this, "Registered Succefully", Toast.LENGTH_LONG).show();
                    Intent i= new Intent(getApplicationContext(),hoslogin.class);
                    startActivity(i);
                }

            }
        });

    }
    public String bedchbox() {
        hbed.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (hbed.isChecked()) {
                    beds = "yes";
                } else {
                    beds = "no";
                }
            }
        });
        return beds;
    }
    public String ambchbox() {
        hamb.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (hamb.isChecked()) {
                    ambulance = "yes";
                } else {
                    ambulance = "no";
                }
            }
        });
        return ambulance;
    }
    public String bloodchbox(){
    hblood.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (hblood.isChecked()) {
                    bloodbank = "yes";
                }
                else {
                    bloodbank = "no";
                }
            }
        });
    return ambulance;
    }
    public boolean SetValidation() {
        boolean isambuValid,isPasswordValid,addressvalid,bedval,bloodval,hosidval,nameval,phoneval,regnoval;
        if (haddress.getText().toString().isEmpty()) {
            haddress.setError(getResources().getString(R.string.Add_error));
            addressvalid = false;
        }
        else  {
            addressvalid  = true;
        }


        if (hpass.getText().toString().isEmpty()) {
            hpass.setError(getResources().getString(R.string.pass_error));
            isPasswordValid = false;
        }
        else  {
            isPasswordValid = true;
        }
        if (hid.getText().toString().isEmpty()) {
            hid.setError(getResources().getString(R.string.ID_error));
            hosidval = false;
        }
        else  {
            hosidval = true;
        }
        if (hname.getText().toString().isEmpty()) {
            hname.setError(getResources().getString(R.string.name_error));
            nameval = false;
        }
        else  {
            nameval = true;
        }
        if (hphone.getText().toString().isEmpty()) {
            hphone.setError(getResources().getString(R.string.phone_error));
            phoneval = false;
        }
        else  {
            phoneval = true;
        }
        if (hregno.getText().toString().isEmpty()) {
            hregno.setError(getResources().getString(R.string.blood_error));
            regnoval = false;
        }
        else  {
            regnoval = true;
        }

        if (isPasswordValid && regnoval && nameval && hosidval && addressvalid==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
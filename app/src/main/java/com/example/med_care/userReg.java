package com.example.med_care;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.med_care.ui.userhelper;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class userReg extends AppCompatActivity {
    EditText uname,uid,umail,upass,umobile;
    Button submit;
    FirebaseDatabase rootnode;
    DatabaseReference reference,ref2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reg);

        uname=findViewById(R.id.uname);
        uid=findViewById(R.id.uid);
        umail=findViewById(R.id.umail);
        upass=findViewById(R.id.upass);
        umobile=findViewById(R.id.umob);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getApplicationContext(),"userregnopen5",Toast.LENGTH_SHORT).show();
                if(SetValidation()) {
                    String username = uname.getText().toString(),
                            userid = uid.getText().toString(),
                            usermail = umail.getText().toString(),
                            userpass = upass.getText().toString(),
                            usermob = umobile.getText().toString();
                    userhelper uh = new userhelper(username, userid, usermail, userpass, usermob);
                    DatabaseReference reference1 = FirebaseDatabase.getInstance().getReference().child("User");
                    reference1.child(userid).setValue(uh);
                    Toast.makeText(userReg.this, "Registered Successfully", Toast.LENGTH_LONG).show();
                    Intent i= new Intent(getApplicationContext(),userlogin.class);
                    startActivity(i);
                }

            }
        });
    }
    public boolean SetValidation()
    {
        boolean nameval,idval,mailval,passval,mobval,retVal;
        if(uname.getText().toString().isEmpty())    {
            uname.setError("Enter Name");
            nameval=false;
        }
        else{
            nameval=true;
        }

        if(uid.getText().toString().isEmpty()) {
            uid.setError("Enter ID");
            idval = false;
        }
        else{
            idval=true;
        }
        if(umail.getText().toString().isEmpty()){
            umail.setError("Enter Mail");
            mailval=false;
        }
        else {
            mailval=true;
        }
        if(upass.getText().toString().isEmpty()){
            upass.setError("Enter Password");
            passval=false;
        }
        else{
            passval=true;
        }
        if(umobile.getText().toString().isEmpty()){
            umobile.setError("Enter Mobile");
            mobval=false;
        }
        else{
            mobval=true;
        }
        retVal = nameval && idval && mailval && passval && mobval;
        return retVal;
    }

}

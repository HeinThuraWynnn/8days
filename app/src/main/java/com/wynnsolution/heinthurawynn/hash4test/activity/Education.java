package com.wynnsolution.heinthurawynn.hash4test.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wynnsolution.heinthurawynn.hash4test.R;
import com.wynnsolution.heinthurawynn.hash4test.parcel.UserData;
import com.wynnsolution.heinthurawynn.hash4test.rmodel.UserDataR;

import io.realm.Realm;

public class Education extends AppCompatActivity {
    EditText edtUniName;
    Button btnRegister;
    String user_university;
    UserData userData;
    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        userData = getIntent().getParcelableExtra("user_data");
        Log.d("USER_DATA",userData.toString());
        edtUniName = (EditText) findViewById(R.id.edtUniName);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_university = edtUniName.getText().toString();
                userData.setUser_uni(user_university);

                realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                UserDataR userDataR = realm.createObject(UserDataR.class);
                userDataR.setUser_name(userData.getUser_name());
                userDataR.setUser_mail(userData.getUser_email());
                userDataR.setUser_password(userData.getUser_password());
                userDataR.setUser_address(userData.getUser_address());
                userDataR.setUser_education(userData.getUser_education());
                userDataR.setUser_uni(userData.getUser_uni());
                realm.commitTransaction();

                Toast.makeText(getApplicationContext(), "Thank U for Inserting Data! Your Data are: "+ userData.getUser_name()+" " + userData.getUser_email()+" "
                        + userData.getUser_password()+" "+userData.getUser_address()+userData.getUser_education()+" "+userData.getUser_uni(),Toast.LENGTH_SHORT).show();


            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}

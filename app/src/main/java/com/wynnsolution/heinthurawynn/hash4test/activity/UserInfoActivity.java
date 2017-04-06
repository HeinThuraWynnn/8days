package com.wynnsolution.heinthurawynn.hash4test.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wynnsolution.heinthurawynn.hash4test.R;
import com.wynnsolution.heinthurawynn.hash4test.parcel.UserData;

public class UserInfoActivity extends AppCompatActivity {
    EditText edtAddress,edtEducation;
    Button submit;
    String user_address,user_education;
    UserData userData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        edtAddress = (EditText) findViewById(R.id.edtAddress);
        edtEducation = (EditText) findViewById(R.id.edtEducation);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userData = getIntent().getParcelableExtra("user_data");

                user_address = edtAddress.getText().toString();
                user_education = edtEducation.getText().toString();
                userData.setUser_address(user_address);
                userData.setUser_education(user_education);
                Intent intent =new Intent(UserInfoActivity.this,Education.class);
                intent.putExtra("user_data",userData);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Thank U for Inserting Data! Your Data are: "+ userData.getUser_name()+" " + userData.getUser_email()+" "
                        + userData.getUser_password()+" "+userData.getUser_address()+userData.getUser_education(),Toast.LENGTH_SHORT).show();

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

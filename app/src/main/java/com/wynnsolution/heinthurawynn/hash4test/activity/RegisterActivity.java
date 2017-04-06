package com.wynnsolution.heinthurawynn.hash4test.activity;

import android.content.Intent;
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

public class RegisterActivity extends AppCompatActivity {
    EditText edtName,edtMail,edtPassword,edtConfirmPassword;
    String user_name,user_email,user_password;
    Button btnNext;
    UserData userData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtName = (EditText) findViewById(R.id.editName);
        edtMail = (EditText) findViewById(R.id.edtMail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        edtConfirmPassword = (EditText) findViewById(R.id.edtConfirmPassword);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_name = edtName.getText().toString();
                user_email = edtMail.getText().toString();
                user_password = edtPassword.getText().toString();

                userData = new UserData();
                userData.setUser_name(user_name);
                userData.setUser_email(user_email);
                userData.setUser_password(user_password);
                Log.d("USER_DATA", userData.toString());

                Intent intent = new Intent(RegisterActivity.this, UserInfoActivity.class);
                intent.putExtra("user_data", userData);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Thank U for Inserting Data! Your Data are: "+ userData.getUser_name()+" " + userData.getUser_email()+" " + userData.getUser_password(),Toast.LENGTH_SHORT).show();
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
    }

}

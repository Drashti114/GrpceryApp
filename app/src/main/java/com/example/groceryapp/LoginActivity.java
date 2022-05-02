package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    //UI Views
    private EditText etemail,etpwd;
    private TextView tvfpwd,tvnoacnt;
    private Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //init UI Views
        etemail=findViewById(R.id.etemail);
        etpwd=findViewById(R.id.etpwd);
        tvfpwd=findViewById(R.id.tvfpwd);
        tvnoacnt=findViewById(R.id.tvnoacnt);
        btnlogin=findViewById(R.id.btnlogin);

        tvnoacnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterUserActivity.class));
            }
        });

        tvfpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,ForgotPasswordActivity.class));
            }
        });

    }
}
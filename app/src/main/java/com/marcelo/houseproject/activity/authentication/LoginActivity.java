package com.marcelo.houseproject.activity.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.marcelo.houseproject.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        onClick();
    }

    private void onClick(){
        findViewById(R.id.text_create_account).setOnClickListener(view ->
                startActivity(new Intent(this,RegisterActivity.class))
                );

        findViewById(R.id.text_forgot_password).setOnClickListener(view ->
                startActivity( new Intent(this,ForgotPasswordActivity.class))
                );
    }
}
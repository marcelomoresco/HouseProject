package com.marcelo.houseproject.activity.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.marcelo.houseproject.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        onPopClick();
        initComponents();
    }

    private void onPopClick(){
        findViewById(R.id.ib_pop).setOnClickListener(view -> finish());
    }

    private void initComponents(){
        TextView textToolbar = findViewById(R.id.text_toolbar);
        textToolbar.setText("Crie sua conta");
    }
}
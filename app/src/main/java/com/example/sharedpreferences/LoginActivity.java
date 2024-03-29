package com.example.sharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sharedpreferences.helper.SharedPref;

public class LoginActivity extends AppCompatActivity {

    Button mBtmLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mBtmLogin = findViewById(R.id.btn_login);

        mBtmLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPref.getInstance(LoginActivity.this).setLogin(true);

                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            }
        });

    }
}

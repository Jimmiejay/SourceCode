package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class P4_login extends AppCompatActivity {

    Button btn_login;

    TextView tv_forgetpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p4login);

        btn_login = findViewById(R.id.buttonlogin);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), P5_requestotp.class);
                startActivity(intent4);
            }
        });

        tv_forgetpwd = (TextView) findViewById(R.id.forgetpwd);
        tv_forgetpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), P12_forgetPWD.class);
                startActivity(intent4);
            }
        });


    }
}
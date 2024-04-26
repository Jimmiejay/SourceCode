package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class P12_forgetPWD extends AppCompatActivity {

    ImageView arb4;
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p12forgetpwd);

        arb4 = (ImageView) findViewById(R.id.arrowback4);
        arb4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent7 = new Intent(P12_forgetPWD.this, P4_login.class);
                startActivity(intent7);
            }
        });

        btn_send =  findViewById(R.id.button_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent7 = new Intent(P12_forgetPWD.this, P13_resetpwd.class);
                startActivity(intent7);
            }
        });
    }
}
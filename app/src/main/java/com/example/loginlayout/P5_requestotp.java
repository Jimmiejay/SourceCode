package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class P5_requestotp extends AppCompatActivity {

    ImageView arb2;
    Button btn_otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p5requestotp);

        arb2 = (ImageView)findViewById(R.id.arrowback2);
        arb2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent5 = new Intent(P5_requestotp.this, P4_login.class);
                startActivity(intent5);
            }
        });

        btn_otp = findViewById(R.id.button_otp);
        btn_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getApplicationContext(), P6_verify.class);
                startActivity(intent6);
            }
        });

    }
}
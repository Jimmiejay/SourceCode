package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class P6_verify extends AppCompatActivity {

    ImageView arb3;
    EditText otp1;
    EditText otp2;
    EditText otp3;
    EditText otp4;
    EditText otp5;
    EditText otp6;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p6verify);

        arb3 = (ImageView) findViewById(R.id.arrowback3);
        arb3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent7 = new Intent(P6_verify.this, P5_requestotp.class);
                startActivity(intent7);
            }
        });

        otp1 = findViewById(R.id.editTextNumberSigned1);
        otp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent8);
            }
        });

        otp2 = findViewById(R.id.editTextNumberSigned2);
        otp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent9);
            }
        });

        otp3 = findViewById(R.id.editTextNumberSigned3);
        otp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent10);
            }
        });

        otp4 = findViewById(R.id.editTextNumberSigned4);
        otp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent11);
            }
        });

        otp5 = findViewById(R.id.editTextNumberSigned5);
        otp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent12);
            }
        });

        otp6 = findViewById(R.id.editTextNumberSigned6);
        otp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent13);
            }
        });

        num0 = findViewById(R.id.buttonnum0);
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent14);
            }
        });

        num1 = findViewById(R.id.buttonnum1);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent15);
            }
        });

        num2 = findViewById(R.id.buttonnum2);
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent16);
            }
        });

        num3 = findViewById(R.id.buttonnum3);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent17 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent17);
            }
        });

        num4 = findViewById(R.id.buttonnum4);
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent18);
            }
        });

        num5 = findViewById(R.id.buttonnum5);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent19 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent19);
            }
        });

        num6 = findViewById(R.id.buttonnum6);
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent20 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent20);
            }
        });

        num7 = findViewById(R.id.buttonnum7);
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent21 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent21);
            }
        });

        num8 = findViewById(R.id.buttonnum8);
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent22 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent22);
            }
        });

        num9 = findViewById(R.id.buttonnum9);
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent23 = new Intent(P6_verify.this, P7_pincode.class);
                startActivity(intent23);
            }
        });

    }
}
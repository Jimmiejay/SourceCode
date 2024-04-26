package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class P3_condition extends AppCompatActivity {

    Button btn_y;
    Button btn_n;
    ImageView arb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p3condition);

        btn_y = findViewById(R.id.button_y);
        btn_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), P4_login.class);
                startActivity(intent2);
            }
        });

        btn_n = findViewById(R.id.button_n);
        btn_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), P2_welcome.class);
                startActivity(intent2);
            }
        });

        arb = (ImageView)findViewById(R.id.arrowback1);
        arb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view1) {
                Intent intent3 = new Intent(P3_condition.this, P2_welcome.class);
                startActivity(intent3);
            }
        });
    }
}
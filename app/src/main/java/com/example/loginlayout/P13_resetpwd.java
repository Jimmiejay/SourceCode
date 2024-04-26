package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class P13_resetpwd extends AppCompatActivity {

    Button btn_cpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p13resetpwd);

        btn_cpt = findViewById(R.id.button_complete);
        btn_cpt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent7 = new Intent(P13_resetpwd.this, P7_pincode.class);
                startActivity(intent7);
            }
        });


    }
}
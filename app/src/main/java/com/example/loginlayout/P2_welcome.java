package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class P2_welcome extends AppCompatActivity {

    Button buttonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p2welcome);

        buttonth = findViewById(R.id.button_th);
        buttonth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), P3_condition.class);
                startActivity(intent1);
            }
        });
    }
}
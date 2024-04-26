package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class P1_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p1main);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(P1_main.this, P2_welcome.class));
            }
        },3000);
    }
}
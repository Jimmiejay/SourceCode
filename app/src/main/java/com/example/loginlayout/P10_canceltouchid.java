package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class P10_canceltouchid extends AppCompatActivity {

    TextView tv_cancle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p10canceltouchid);

        tv_cancle = (TextView) findViewById(R.id.text_cancel);
        tv_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent27 = new Intent(P10_canceltouchid.this, P11_loginwithpin.class);
                startActivity(intent27);
            }
        });

    }
}
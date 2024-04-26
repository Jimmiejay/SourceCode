package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class P9_touchid extends AppCompatActivity {

    TextView tv_cross;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p9touchid);

        tv_cross = (TextView) findViewById(R.id.text_cross);
        tv_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent26 = new Intent(P9_touchid.this, P10_canceltouchid.class);
                startActivity(intent26);
            }
        });
    }
}
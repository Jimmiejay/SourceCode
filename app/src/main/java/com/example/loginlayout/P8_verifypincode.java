package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class P8_verifypincode extends AppCompatActivity {
    Button btn_n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p8verifypincode);

        btn_n4 = findViewById(R.id.button_n4);
        btn_n4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent25 = new Intent(P8_verifypincode.this, P9_touchid.class);
                startActivity(intent25);
            }
        });


    }
}
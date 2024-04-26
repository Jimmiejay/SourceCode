package com.example.loginlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class P7_pincode extends AppCompatActivity {

    Button btn_n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p7pincode);

        btn_n4 = findViewById(R.id.button_n4);
        btn_n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent24 = new Intent(getApplicationContext(), P8_verifypincode.class);
                startActivity(intent24);
            }
        });

    }
}
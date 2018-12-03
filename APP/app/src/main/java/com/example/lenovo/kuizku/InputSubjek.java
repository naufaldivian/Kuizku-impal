package com.example.lenovo.kuizku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class InputSubjek extends AppCompatActivity {
    private Button btnBack, btnMulai;
    private ImageView ivSubjek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_subjek);

        btnBack = findViewById(R.id.btn_back);
        btnMulai = findViewById(R.id.btn_mulai);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InputSubjek.this, Soal.class);
                startActivity(intent);
            }
        });
    }
}

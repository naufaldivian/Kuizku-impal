package com.example.lenovo.kuizku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv_logo;
    private TextView tv_kuis;
    private Button btnMain, btnKeluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_logo = findViewById(R.id.logokuis);
        tv_kuis = findViewById(R.id.tuliskuis);
        btnMain = findViewById(R.id.btn_main);
        btnKeluar = findViewById(R.id.btn_keluar);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InputSubjek.class);
                startActivity(intent);
            }
        });
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}

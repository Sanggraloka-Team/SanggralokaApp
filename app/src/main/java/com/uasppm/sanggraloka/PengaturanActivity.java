package com.uasppm.sanggraloka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PengaturanActivity extends AppCompatActivity {

    Button btnSimpanPengaturan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);

        btnSimpanPengaturan = findViewById(R.id.button_simpan_pengaturan);

        btnSimpanPengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Data Tersimpan", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
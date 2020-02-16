package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class second extends AppCompatActivity {

    private Button btnHasil;
    private TextView tvHasil;
    private EditText etAlas, etTinggi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnHasil = findViewById(R.id.btn_hasil);
        tvHasil = findViewById(R.id.tv_hasil);
        etAlas = findViewById(R.id.et_alas);
        etTinggi = findViewById(R.id.et_tinggi);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAlas = etAlas.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double alas = Double.parseDouble(sAlas);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = (alas * tinggi) / 2;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}

package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button segitiga,persegi,lingkaran;
    TextView luas,keliling;
    EditText panjang,lebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        segitiga = findViewById(R.id.idsegitiga);
        persegi = findViewById(R.id.idpersegi);
        lingkaran = findViewById(R.id.idlingkaran);

        luas = findViewById(R.id.luas);
        keliling = findViewById(R.id.keliling);

        panjang = findViewById(R.id.panjang1);
        lebar = findViewById(R.id.lebar1);

        segitiga.setOnClickListener(this);
        persegi.setOnClickListener(this);
        lingkaran.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.idsegitiga:
                LKSegitiga();
                break;
            case R.id.idpersegi:
                LKPersegi();
                break;
            case R.id.idlingkaran:
                LKlingkaran();
                break;
        }
    }

    private void LKSegitiga(){
        float alas = Float.parseFloat(panjang.getText().toString());
        float tinggi = Float.parseFloat(lebar.getText().toString());

        float luasSegitiga = ((alas * tinggi) / 2);
        luas.setText(""+luasSegitiga);

        float kelilingSegitiga = (3 * alas);
        keliling.setText(""+kelilingSegitiga);
    }
    private void LKPersegi() {
        float lPersegi = Float.parseFloat(panjang.getText().toString());
        float pPersegi = Float.parseFloat(lebar.getText().toString());

        float luasPersegi = (pPersegi * lPersegi);
        luas.setText("" + luasPersegi);

        float kelilingPersegi = (2 * (pPersegi + lPersegi));
        keliling.setText("" + kelilingPersegi);
    }
    private void LKlingkaran() {
        float diameter = Float.parseFloat(panjang.getText().toString());
        float jarijari = diameter / 2;

        float luasLingkaran = (22 * (jarijari * jarijari) / 7);
        luas.setText("" + luasLingkaran);

        float kelilingLingkaran = ((22 * diameter) / 7);
        keliling.setText("" + kelilingLingkaran);
    }

}
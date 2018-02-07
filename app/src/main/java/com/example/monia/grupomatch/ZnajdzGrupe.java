package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ZnajdzGrupe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_znajdz_grupe);
    }

    public void klik(View view) {
        Intent intent;
        switch (view.getId()) {
           case R.id.zmiennaprzedmiot2:
                intent = new Intent(ZnajdzGrupe.this, Przedmiot.class);
                startActivity(intent);
                break;



        }
}}

package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Przedmiot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przedmiot);

    }

    public void klik(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.osobyBtn:
                intent = new Intent(Przedmiot.this, Osoby.class);
                startActivity(intent);
                break;




            case R.id.tematyBtn:
                intent = new Intent(Przedmiot.this, Tematy.class);
                startActivity(intent);
                break;






        }
}}

package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Rejestracja1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejestracja1);
    }


    Intent intent2;

    public void klik2(View view) {
        switch (view.getId()) {

            case R.id.dalejBtn:
                intent2 = new Intent(Rejestracja1.this, Rejestracja2.class);
                startActivity(intent2);

                break;
        }}
}

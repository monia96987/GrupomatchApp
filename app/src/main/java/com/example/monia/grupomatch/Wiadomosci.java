package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Wiadomosci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiadomosci);
    }

    public void klik(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.wiadomoscBtn:
                intent = new Intent(Wiadomosci.this, Wiadomosc.class);
                startActivity(intent);
                break;


        }
    }
}
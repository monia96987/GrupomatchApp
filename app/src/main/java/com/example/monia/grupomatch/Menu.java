package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void klik(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.mojegrupyBtn:
                intent = new Intent(Menu.this, MojeGrupy1.class);
                startActivity(intent);
                break;

            case R.id.znajdzgrupeBtn:
                    intent = new Intent(Menu.this, ZnajdzGrupe.class);
                    startActivity(intent);
                    break;

            case R.id.wiadomosciBtn:
                intent = new Intent(Menu.this, Wiadomosci.class);
                startActivity(intent);
                break;



        }
    }}
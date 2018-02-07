package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Wiadomosc extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiadomosc);

        button = (Button) findViewById(R.id.usunwBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(Wiadomosc.this, button);
                popupMenu.getMenuInflater().inflate(R.menu.wiadomoscmenu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(Wiadomosc.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupMenu.show();
            }});}

    public void klik(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.wyslijBtn:
                intent = new Intent(Wiadomosc.this, Wiadomosci.class);
                startActivity(intent);

                break;
    }
}}

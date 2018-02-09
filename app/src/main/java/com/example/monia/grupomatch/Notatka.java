package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Notatka extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notatka);

        button = (Button) findViewById(R.id.usunnBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(Notatka.this, button);
                popupMenu.getMenuInflater().inflate(R.menu.notatkamenu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent;
                        switch (item.getItemId())
                        {
                            case R.id.usunn:
                                intent = new Intent(Notatka.this, MojeGrupy2.class);
                                startActivity(intent);
                                Toast.makeText(Notatka.this, "Notatka została usunięta" , Toast.LENGTH_LONG).show();
                                break;
                            case R.id.wrocn:
                                break;
                        }
                        return true;

                    }
                });
                popupMenu.show();
            }});

    }
    public void klik(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.zapiszBtn:
                intent = new Intent(Notatka.this, MojeGrupy2.class);
                startActivity(intent);
                Toast.makeText(Notatka.this, "Notatka została zapisana" , Toast.LENGTH_LONG).show();

                break;






        }
}}

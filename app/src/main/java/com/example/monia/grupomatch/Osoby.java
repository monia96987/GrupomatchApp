package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Osoby extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osoby);

        button = (Button) findViewById(R.id.zmiennaosoba);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(Osoby.this, button);
                popupMenu.getMenuInflater().inflate(R.menu.studentmenu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent;
                        switch (item.getItemId())
                        {
                            case R.id.dodajs:
                                Toast.makeText(Osoby.this, "Osoba dodana do Twojej grupy" , Toast.LENGTH_LONG).show();
                                break;
                            case R.id.wrocw:
                                break;
                        }
                        return true;

                    }
                });
                popupMenu.show();
            }});

    }
}

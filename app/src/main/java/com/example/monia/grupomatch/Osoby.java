package com.example.monia.grupomatch;

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
                        Toast.makeText(Osoby.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupMenu.show();
            }});

    }
}

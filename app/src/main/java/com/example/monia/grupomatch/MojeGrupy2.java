package com.example.monia.grupomatch;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MojeGrupy2 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moje_grupy2);

       button = (Button) findViewById(R.id.zmiennaczlonek);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(MojeGrupy2.this, button);
                popupMenu.getMenuInflater().inflate(R.menu.czlonekmenu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MojeGrupy2.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
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
            case R.id.zmiennanotatka:
                intent = new Intent(MojeGrupy2.this, Notatka.class);
                startActivity(intent);
                break;

            case R.id.one:
                intent = new Intent(MojeGrupy2.this, Menu.class);
                startActivity(intent);
                break;








        }

}}
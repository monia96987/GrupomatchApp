package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MojeGrupy1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moje_grupy1);}

        public void klik4(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.zmiennaprzedmiot:
                intent = new Intent(MojeGrupy1.this, MojeGrupy2.class);
                startActivity(intent);
                break;


        }
    }

}

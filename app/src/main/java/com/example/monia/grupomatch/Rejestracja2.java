package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Rejestracja2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejestracja3);
    }

    public void klik(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.rejestr2Btn:
                intent = new Intent(Rejestracja2.this, Menu.class);
                startActivity(intent);
                break;






        }
    }
}

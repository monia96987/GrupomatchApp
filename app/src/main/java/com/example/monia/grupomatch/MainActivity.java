package com.example.monia.grupomatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klik(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.rejestr1Btn:
            intent = new Intent(MainActivity.this, Rejestracja1.class);
            startActivity(intent);
            break;




            case R.id.zalogujBtn:
                intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
                break;










        }
}
}

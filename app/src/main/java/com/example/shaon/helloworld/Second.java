package com.example.shaon.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String userName = getIntent().getExtras().getString("Name");

        Toast.makeText(Second.this,userName,Toast.LENGTH_LONG).show();
    }
}

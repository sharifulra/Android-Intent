package com.example.shaon.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btnClick);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // One Activity to other activity
//                Intent in1 = new Intent(getApplicationContext(),Second.class);
////                startActivity(in1);


                // One Activity to other with parameter


                Intent in2 = new Intent(getApplicationContext(),Second.class);
                in2.putExtra("Name","Shaon");

                startActivity(in2);

            }
        });
    }



}

package com.niaapps.motivateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView main;
    ImageButton happy;
    String [] array;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.motivate);
        happy = findViewById(R.id.imageButton2);
        array =  getResources().getStringArray(R.array.messages);


        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.setText(array[count]);
                count++;

                if(count >= array.length){
                    count = 0;
                }
            }
        });
    }

}
package com.example.helloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.example.helloactivity.R;
import com.example.helloactivity.HelloAnim;


public class MainActivity extends AppCompatActivity {

    HelloAnim secretTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        secretTextView = findViewById(R.id.tvaa);
        secretTextView.hide();
        secretTextView.toggle();
        secretTextView.setDuration(12000);
        secretTextView.setIsVisible(false);
        secretTextView.show();    // fade in

        secretTextView.hide();
        secretTextView.setDuration(8000);
        secretTextView.setText("اَلسَّلَامُ عَلَيْكُم وَرَحْمَةُ ٱللَّٰهِ تَعَالَى وَبَرَكَاتُه");
        secretTextView.show();


        /*
        secretTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secretTextView.show();    // fade in
                secretTextView.hide();    // fade out
                //secretTextView.toggle();  // fade in or out depending on current state

                secretTextView.setText("اَلسَّلَامُ عَلَيْكُم وَرَحْمَةُ ٱللَّٰهِ تَعَالَى وَبَرَكَاتُه");
            }

        });

         */
/*
        change = (Button) findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secretTextView.setText("اَلسَّلَامُ عَلَيْكُم وَرَحْمَةُ ٱللَّٰهِ تَعَالَى وَبَرَكَاتُه");
            }
        });
*/
    }


}
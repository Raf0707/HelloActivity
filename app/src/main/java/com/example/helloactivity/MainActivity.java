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
import android.view.animation.*;
import android.widget.*;

import com.example.helloactivity.R;
import com.example.helloactivity.HelloAnim;


public class MainActivity extends AppCompatActivity {

    final int MENU_ALPHA_ID = 1;
    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        tv = findViewById(R.id.tva);
        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.tva:
                menu.add(0, MENU_ALPHA_ID, 0, "alpha");
                break;
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem itemm) {
        Animation anim = null;
        switch (itemm.getItemId()) {
            case MENU_ALPHA_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
                break;
        }
        tv.startAnimation(anim);
        return super.onContextItemSelected(itemm);
    }


}
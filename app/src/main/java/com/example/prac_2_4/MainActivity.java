package com.example.prac_2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLinear(View view){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void onClickRelative(View view){
        Intent intent2 = new Intent(this, Activity3.class);
        startActivity(intent2);
    }

    public void onClickTable(View view){
        Intent intent3 = new Intent(this, TableAct.class);
        startActivity(intent3);
    }

    public void onClickFrame(View view){
        Intent intent4 = new Intent(this, FrameAct.class);
        startActivity(intent4);
    }

    public void onClickGrid(View view){
        Intent intent5 = new Intent(this, GridAct.class);
        startActivity(intent5);
    }

    public void onClickScroll(View view){
        Intent intent6 = new Intent(this, ScrollAct.class);
        startActivity(intent6);
    }
}
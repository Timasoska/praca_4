package com.example.prac_2_4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_ACTIVITY2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Запрет на изменение ориентации экрана
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void onClickLinear(View view){
        Intent intent = new Intent(this, Activity2.class);
        startActivityForResult(intent, REQUEST_CODE_ACTIVITY2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_ACTIVITY2 && resultCode == RESULT_OK) {
            if (data != null) {
                MyData resultData = data.getParcelableExtra("myData");
                if (resultData != null) {
                    String name = resultData.getName();
                    int age = resultData.getAge();
                    Log.d("MainActivity", "Received data: Name - " + name + ", Age - " + age);
                }
            }
        }
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
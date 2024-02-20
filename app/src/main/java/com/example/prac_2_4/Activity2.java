package com.example.prac_2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // первое текстовое поле
        TextView textView1 = new TextView(this);
        textView1.setText("Это");
        textView1.setTextSize(30);
        // textView1 имеет вес 3
        linearLayout.addView(textView1, new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, 0, 3));
        // второе текстовое поле
        TextView textView2 = new TextView(this);
        textView2.setText("Android");
        textView2.setBackgroundColor(0xFFBDBDBD);
        textView2.setTextSize(30);
        // textView2 имеет вес 2
        linearLayout.addView(textView2, new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, 0, 2));
        //button
        Button button = new Button(this);
        button.setText("Back");
        button.setOnClickListener(this::onClick);
        linearLayout.addView(button, new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, 0, 2));
        setContentView(linearLayout);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
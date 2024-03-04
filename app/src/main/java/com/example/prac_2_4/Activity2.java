package com.example.prac_2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        TextView textView1 = new TextView(this);
        textView1.setText("Это");
        textView1.setTextSize(30);
        linearLayout.addView(textView1, new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        TextView textView2 = new TextView(this);
        textView2.setText("Android");
        textView2.setTextSize(30);
        linearLayout.addView(textView2, new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        Button button = new Button(this);
        button.setText("Back");
        button.setOnClickListener(this::sendDataBack);
        linearLayout.addView(button, new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        setContentView(linearLayout);
    }

    public void sendDataBack(View view) {
        MyData myData = new MyData("John", 30);
        Intent intent = new Intent();
        intent.putExtra("myData", myData);
        setResult(RESULT_OK, intent);
        finish();
    }
}
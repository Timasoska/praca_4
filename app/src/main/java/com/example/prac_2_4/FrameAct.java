package com.example.prac_2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
public class FrameAct extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);

        Button button = new Button(this);
        button.setText("BACK");
        button.setOnClickListener(this::onClickBack);

        FrameLayout.LayoutParams layoutParams = new
                FrameLayout.LayoutParams
                (FrameLayout.LayoutParams.WRAP_CONTENT,
                        FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER_VERTICAL | Gravity.BOTTOM;

        TextView textView = new TextView(this);
        textView.setText("Hello World!");


        FrameLayout.LayoutParams layoutParams2 = new
                FrameLayout.LayoutParams
                (FrameLayout.LayoutParams.WRAP_CONTENT,
                        FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.TOP;
        textView.setLayoutParams(layoutParams);
        button.setLayoutParams(layoutParams2);
        textView.setTextSize(26);
        frameLayout.addView(textView);
        frameLayout.addView(button);
        setContentView(frameLayout);
    }

    public void onClickBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

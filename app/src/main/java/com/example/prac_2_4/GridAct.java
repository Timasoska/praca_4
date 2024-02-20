package com.example.prac_2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class GridAct extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GridLayout gridLayout = new GridLayout( this);
        // количество строк
        gridLayout.setRowCount(3);
        // количество столбцов
        gridLayout.setColumnCount(3);
        for(int i = 1; i <=3; i++){
            Button btn = new Button(this);
            btn.setText(String.valueOf(i));
            gridLayout.addView(btn);
        }
        Button btn4 = new Button(this);
        btn4.setText("BACK");
        btn4.setOnClickListener(this::onClick);
        GridLayout.LayoutParams layoutParams4 = new
                GridLayout.LayoutParams();
        layoutParams4.columnSpec = GridLayout.spec(0,2);
        layoutParams4.width = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 180,
                getResources().getDisplayMetrics());
        gridLayout.addView(btn4, layoutParams4);
        Button btn5 = new Button(this);
        btn5.setText("5");
        GridLayout.LayoutParams layoutParams5 = new
                GridLayout.LayoutParams();
        layoutParams5.rowSpec = GridLayout.spec(1,2);
        layoutParams5.height = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 100,
                getResources().getDisplayMetrics());
        gridLayout.addView(btn5, layoutParams5);
        Button btn6 = new Button(this);
        btn6.setText("6");
        Button btn7 = new Button(this);
        btn7.setText("7");
        gridLayout.addView(btn6);
        gridLayout.addView(btn7);

        setContentView(gridLayout);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

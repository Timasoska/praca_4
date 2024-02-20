package com.example.prac_2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
public class TableAct extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout tableLayout = new TableLayout( this);

        // первая строка
        TableRow tableRow1 = new TableRow(this);
        TextView textView1 = new TextView(this);
        Button button = new Button(this);
        button.setText("BACK");
        button.setOnClickListener(this::onClickBack);
        TableRow tableRow3 = new TableRow(this);
        tableRow3.addView(button, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 1.0f));

        textView1.setText("Логин");
        tableRow1.addView(textView1, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 0.5f));
        EditText editText1 = new EditText(this);
        tableRow1.addView(editText1, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 1.0f));
        // вторая строка
        TableRow tableRow2 = new TableRow(this);
        TextView textView2 = new TextView(this);
        textView2.setText("Email");
        tableRow2.addView(textView2, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 0.5f));
        EditText editText2 = new EditText(this);
        tableRow2.addView(editText2, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 1.f));
        tableLayout.addView(tableRow1);
        tableLayout.addView(tableRow2);
        tableLayout.addView(tableRow3);
        setContentView(tableLayout);
    }

    public void onClickBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
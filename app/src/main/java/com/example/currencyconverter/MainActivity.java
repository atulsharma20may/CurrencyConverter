package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText dollarAmount = findViewById(R.id.editText);
        TextView inrAmount = findViewById(R.id.textView2);

        int dollar = Integer.parseInt(dollarAmount.getText().toString());
        int inr = dollar*77;

        inrAmount.setText(inr + "");
    }

    public void reset(View view) {
        EditText dollarAmount = findViewById(R.id.editText);
        TextView inrAmount = findViewById(R.id.textView2);

        dollarAmount.setText("");
        inrAmount.setText("");
    }
}
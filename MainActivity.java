package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirst, etSecond;
    TextView tvAns, tvAbout;
    Button addition, subtraction, multiplication, division, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        tvAns = findViewById(R.id.tvAns);

        addition = findViewById(R.id.addition);
        subtraction = findViewById(R.id.subtraction);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);

        about = findViewById(R.id.about);
        tvAbout = findViewById(R.id.tvAbout);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue + secondValue;

                tvAns.setText("Ans is " + ans);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue - secondValue;

                tvAns.setText("Ans is " + ans);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue * secondValue;

                tvAns.setText("Ans is " + ans);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());

                ans = firstValue / secondValue;

                tvAns.setText("Ans is " + ans);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvAbout.setText("This App developed by Nazmul Khan Liton");
            }
        });
    }
}
package com.mmm.bmi;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edHei,edWid;
        TextView txtRes;
        Button btnRsset,btnCalculator;

        edHei = findViewById(R.id.edHei);
        edWid = findViewById(R.id.edWid);
        txtRes = findViewById(R.id.txtRes);
        btnRsset = findViewById(R.id.btnRsset);
        btnCalculator = findViewById(R.id.btnCalculator);

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strwid = edWid.getText().toString();
                String strhig = edHei.getText().toString();
                float weight = Float.parseFloat(strwid);
                float height = Float.parseFloat(strhig)/100;
                float bmivalue = weight/(height*height);
                txtRes.setText("BMI= "+bmivalue);

            }
        });

        btnRsset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edHei.setText("");
                edWid.setText("");
                txtRes.setText("");
            }
        });
    }
}
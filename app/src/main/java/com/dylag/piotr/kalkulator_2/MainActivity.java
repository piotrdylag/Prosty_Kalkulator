package com.dylag.piotr.kalkulator_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.pow;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnAdd, btnsub, btndivide, btnmul, btnpot;
    private TextView result;
    private EditText first, second;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnsub = (Button) findViewById(R.id.btnsubstract);
        btndivide = (Button) findViewById(R.id.btnDivide);
        btnmul = (Button) findViewById(R.id.btnMultiply);
        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        result = (TextView) findViewById(R.id.result);
        btnpot = (Button) findViewById(R.id.btnpot);


        btnAdd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btnpot.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        String num1 = first.getText().toString();
        String num2 = second.getText().toString();
        switch (view.getId()) {
            case R.id.btnAdd:
                float addition = Float.parseFloat(num1) + Float.parseFloat(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnsubstract:
                float subtraction = Float.parseFloat(num1) - Float.parseFloat(num2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDivide:
                try {
                    float division = Float.parseFloat(num1) / Float.parseFloat(num2);
                    result.setText(String.valueOf(division));
                } catch (Exception e) {
                    result.setText("Cannot DIVIDE!");
                }
                break;
            case R.id.btnMultiply:
                float multiply = Float.parseFloat(num2) * Float.parseFloat(num1);
                result.setText(String.valueOf(multiply));
                break;
            case R.id.btnpot:
                double Math.pow(double)num1,(double)num2);
                result.setText(String.valueOf(power));
                break;


        }
    }



}


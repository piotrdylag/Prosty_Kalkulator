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
        double num1 = Double.parseDouble(first.getText().toString());
        double num2 = Double.parseDouble(second.getText().toString());
        switch (view.getId()) {
            case R.id.btnAdd:
                double addition = num1 + num2;
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnsubstract:
                double subtraction = num1 - num2;
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDivide:
                try {
                    double division = num1 / num2;
                    result.setText(String.valueOf(division));
                } catch (Exception e) {
                    result.setText("Cannot DIVIDE!");
                }
                break;
            case R.id.btnMultiply:
                double multiply = num1 * num2;
                result.setText(String.valueOf(multiply));
                break;
            case R.id.btnpot:
               double power = Math.pow(num1, num2);
                result.setText(String.valueOf(power));
                break;


        }
    }



}


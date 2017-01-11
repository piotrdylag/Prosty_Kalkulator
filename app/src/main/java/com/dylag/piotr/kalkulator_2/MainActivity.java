package com.dylag.piotr.kalkulator_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdd, btnsub, btndivide, btnmul;
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


        btnAdd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmul.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String num1 = first.getText().toString();
        String num2 = second.getText().toString();
        switch (view.getId()) {
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnsubstract:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDivide:
                try {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    result.setText(String.valueOf(division));
                } catch (Exception e) {
                    result.setText("Cannot DIVIDE!");
                }
                break;
            case R.id.btnMultiply:
                int multiply = Integer.parseInt(num2) * Integer.parseInt(num1);
                result.setText(String.valueOf(multiply));
                break;



        }
    }
}

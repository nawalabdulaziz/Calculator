package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editcalcid1;
    private EditText editcalcid2;
    private TextView textcalcid;
    private Button btncalcid1;
    private Button btncalcid2;
    private Button btncalcid3;
    private Button btncalcid4;
    private Button btncalcid5;
    private Button btncalcid6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editcalcid1=(EditText)findViewById(R.id.editText1);
        editcalcid2=findViewById(R.id.editText2);
        textcalcid=findViewById(R.id.TextView);

        btncalcid1= findViewById(R.id.button1);
        btncalcid2= findViewById(R.id.button2);
        btncalcid3= findViewById(R.id.button3);
        btncalcid4= findViewById(R.id.button4);
        btncalcid5= findViewById(R.id.button5);
        btncalcid6= findViewById(R.id.button6);

        btncalcid1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(editcalcid1.getText()+"");
                int value2 = Integer.parseInt(editcalcid2.getText()+"");

                textcalcid.setText(value1+value2+"");
            }
        });

        btncalcid2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(editcalcid1.getText()+"");
                int value2 = Integer.parseInt(editcalcid2.getText()+"");

                textcalcid.setText(value1-value2+"");
            }
        });

        btncalcid3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(editcalcid1.getText()+"");
                int value2 = Integer.parseInt(editcalcid2.getText()+"");

                textcalcid.setText(value1/value2+"");
            }
        });

        btncalcid4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(editcalcid1.getText()+"");
                int value2 = Integer.parseInt(editcalcid2.getText()+"");

                textcalcid.setText(value1*value2+"");
            }
        });

        btncalcid5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(editcalcid1.getText()+"");
                int value2 = Integer.parseInt(editcalcid2.getText()+"");

                textcalcid.setText(value1%value2+"");
            }
        });

        btncalcid6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(editcalcid1.getText()+"");
                int value2 = Integer.parseInt(editcalcid2.getText()+"");

                textcalcid.setText(Math.pow(value1,value2)+"");
            }
        });

    }
}
package com.bignerdranch.android.androidstartsinergycl27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        final Button calculate =(Button) findViewById(R.id.calc);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAnswer();
                Intent i =new Intent(Calculator.this,MainActivity.class);
            }
        });
    }

    private void calculateAnswer() {
        EditText numOne =(EditText) findViewById(R.id.editTextNumberDecimal);
        EditText numTwo =(EditText) findViewById(R.id.editTextNumberDecimal2);

        RadioButton add=(RadioButton) findViewById(R.id.radioButton);
        RadioButton sub=(RadioButton) findViewById(R.id.radioButton2);
        RadioButton mult=(RadioButton) findViewById(R.id.radioButton3);
        RadioButton diw=(RadioButton) findViewById(R.id.radioButton7);

        TextView ans = (TextView) findViewById(R.id.answer);

        float numone =Integer.parseInt(numOne.getText().toString());
        float numtwo=Integer.parseInt(numTwo.getText().toString());

        float answer=0;

        if(add.isChecked()){
            answer=numone+numtwo;
        }else
        if(sub.isChecked()){
            answer=numone-numtwo;
        }
        if(mult.isChecked()){
            answer=numone*numtwo;
        }
        if(diw.isChecked()){
            if(numtwo==0) {
                Toast.makeText(this, "Error:Divide on ZERRO", Toast.LENGTH_SHORT).show();
                ans.setText("Error:Divide on ZERRO");
                return;
            }
            answer=numone/numtwo;
        }
        ans.setText("  "+answer);
    }
}
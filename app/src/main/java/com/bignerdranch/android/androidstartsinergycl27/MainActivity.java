package com.bignerdranch.android.androidstartsinergycl27;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        TextView textView =new TextView(this);
        textView.setText("Android Hi");
        textView.setTextSize(28);

        ConstraintLayout.LayoutParams layoutParams  =new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.leftToLeft =ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop =ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.rightToRight =ConstraintLayout.LayoutParams.PARENT_ID;



        constraintLayout.addView(textView);

        setContentView(constraintLayout);

    }
}
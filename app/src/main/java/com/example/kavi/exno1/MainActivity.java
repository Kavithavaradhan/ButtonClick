package com.example.kavi.exno1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 1;
    private Button frstbtn;
    private Button scndbtn;
    private Button thrdbtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frstbtn = (Button) findViewById(R.id.button1);
        scndbtn = (Button) findViewById(R.id.button2);
        thrdbtn = (Button) findViewById(R.id.button3);
        textView = (TextView) findViewById(R.id.text);

        frstbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (count){
                    case 1: textView.setTextColor(Color.parseColor("#7f00ff"));
                        break;
                    case 2: textView.setTextColor(Color.parseColor("#00FF00"));
                        break;
                }
                count++;
                if (count == 3){
                    count = 1;
                }

            }
        });

        scndbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (count){
                    case 1: textView.setTypeface(Typeface.DEFAULT,Typeface.BOLD_ITALIC);
                        break;
                    case 2: textView.setTypeface(Typeface.DEFAULT,Typeface.ITALIC);
                        break;
                }
                count++;
                if (count == 3){
                    count = 1;
                }
            }
        });

        thrdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (count){
                    case 1: textView.setTextSize(60);
                        break;
                    case 2: textView.setTextSize(70);
                        break;

                }
                count++;
                if (count == 3){
                    count = 1;
                }
            }
        });

    }

}
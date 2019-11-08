package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main3Activity extends AppCompatActivity {
    private TextView txans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txans = (TextView)findViewById(R.id.txans);

        Intent intent=getIntent();
        final int month = intent.getIntExtra("Month",0);
        final String N1 = intent.getStringExtra("N1");
        final String N2 = intent.getStringExtra("N2");
        final String N3 = intent.getStringExtra("N3");
        final String N4 = intent.getStringExtra("N4");
        final String N5 = intent.getStringExtra("N5");
        final String N6 = intent.getStringExtra("N6");
        final String N7 = intent.getStringExtra("N7");
        final String N8 = intent.getStringExtra("N8");
        final String enter = intent.getStringExtra("enter");

        for(int i=0;i<6;i++){
            if (enter.matches(N1)){
                txans.setText("恭喜獎金1000萬元");
                break;
            }
            else if(enter.matches(N2)){
                txans.setText("恭喜獎金200萬元");
                break;
            }


            else if(enter.substring(i).matches(N6.substring(i))){
                switch (i){
                    
                    case 5:
                        txans.setText("恭喜獎金2百元");
                        break;
                }
                break;
            }
            else if(enter.substring(i).matches(N7.substring(i))){
                switch (i){

                    case 5:
                        txans.setText("恭喜獎金2百元");
                        break;
                }
                break;
            }
            else if(enter.substring(i).matches(N8.substring(i))){
                switch (i){

                    case 5:
                        txans.setText("恭喜獎金2百元");
                        break;
                }
                break;
            }
            else if(enter.substring(i).matches(N3.substring(i))
                    ||enter.substring(i).matches(N4.substring(i))
                    ||enter.substring(i).matches(N5.substring(i))){
                switch (i){
                    case 0:
                        txans.setText("恭喜獎金20萬元");
                        break;
                    case 1:
                        txans.setText("恭喜獎金4萬元");
                        break;
                    case 2:
                        txans.setText("恭喜獎金1萬元");
                        break;
                    case 3:
                        txans.setText("恭喜獎金4千元");
                        break;
                    case 4:
                        txans.setText("恭喜獎金1千元");
                        break;
                    case 5:
                        txans.setText("恭喜獎金2百元");
                        break;
                }
                break;
            }
            else {
                txans.setText("沒有中獎 ");
            }
        }

        final Button button = (Button) findViewById(R.id.Back_Month_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final Button button1 = (Button) findViewById(R.id.Back_Number_button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                intent.putExtra("Month",month);
                startActivity(intent);
            }
        });

    }
}
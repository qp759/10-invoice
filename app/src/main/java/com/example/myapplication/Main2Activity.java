package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private TextView T1;
    private TextView T2;
    private TextView T3;
    private TextView T4;
    private TextView T5;
    private TextView T6;
    private TextView T7;
    private TextView T8;
    private EditText editText;
    String N1,N2,N3,N4,N5,N6,N7,N8 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        N1 = "0";
        N2 = "0";
        N3 = "0";
        N4 = "0";
        N5 = "0";
        N6 = "0";
        N7 = "0";
        N8 = "0";
        T1 = (TextView)findViewById(R.id.T1);
        T2 = (TextView)findViewById(R.id.T2);
        T3 = (TextView)findViewById(R.id.T3);
        T4 = (TextView)findViewById(R.id.T4);
        T5 = (TextView)findViewById(R.id.T5);
        T6 = (TextView)findViewById(R.id.T6);
        T7 = (TextView)findViewById(R.id.T7);
        T8 = (TextView)findViewById(R.id.T8);
        editText = findViewById(R.id.editText);

        Intent intent=getIntent();
        final int month = intent.getIntExtra("Month",0);

        switch (month){
            case 1:
                N1 = "00106725";
                N2 = "90819218";
                N3 = "13440631";
                N4 = "26650552";
                N5 = "09775722";
                N6 = "_____809";
                N7 = "_____264";
                N8 = "本期增開六獎只有兩個";
                break;
            case 2:
                N1 = "03802602";
                N2 = "00708299";
                N3 = "33877270";
                N4 = "21772506";
                N5 = "61786409";
                N6 = "_____136";
                N7 = "_____022";
                N8 = "本期增開六獎只有兩個";
                break;
            case 3:
                N1 = "46356460";
                N2 = "56337787";
                N3 = "93339845";
                N4 = "83390355";
                N5 = "80431063";
                N6 = "_____984";
                N7 = "_____240";
                N8 = "本期增開六獎只有兩個";
                break;
            case 4:
                N1 = "45698621";
                N2 = "19614436";
                N3 = "96182420";
                N4 = "47464012";
                N5 = "62781818";
                N6 = "_____928";
                N7 = "_____899";
                N8 = "本期增開六獎只有兩個";
                break;
        }

        T1.setText(N1);
        T2.setText(N2);
        T3.setText(N3);
        T4.setText(N4);
        T5.setText(N5);
        T6.setText(N6);
        T7.setText(N7);
        T8.setText(N8);

        final Button button = (Button) findViewById(R.id.Back_button_B);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final Button button1 = (Button) findViewById(R.id.Ans_button_B);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(editText.getText().toString().matches(""))
                {
                    Toast toast = Toast.makeText(Main2Activity.this, "欄位不能為空白", Toast.LENGTH_LONG);
                    toast.show();
                }
                else if(editText.getText().toString().length()<8||editText.getText().toString().length()>8){
                    Toast toast = Toast.makeText(Main2Activity.this, "發票號碼共8碼", Toast.LENGTH_LONG);
                    toast.show();
                }
                else{
                    String enter =editText.getText().toString();
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                    intent.putExtra("Month",month);
                    intent.putExtra("N1",N1);
                    intent.putExtra("N2",N2);
                    intent.putExtra("N3",N3);
                    intent.putExtra("N4",N4);
                    intent.putExtra("N5",N5);
                    intent.putExtra("N6",N6);
                    intent.putExtra("N7",N7);
                    intent.putExtra("N8",N8);
                    intent.putExtra("enter",enter);
                    startActivity(intent);
                }

            }
        });

    }
}
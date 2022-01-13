package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {
    private TextView tv2;
    private Button b2;

    private String jokess [] = {"Better days are coming.","If you want to go big, stop thinking small.","Be patient. Some things take time.","A negative mind will never give you a positive life.","Be with someone who is proud to have you.","Self-love heals the deepest wounds.","One day, you will be just a memory for some people. Do your best to be a good one."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv2 =(TextView) findViewById(R.id.textView2);b2 =(Button) findViewById(R.id.button13);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random(); int num = random.nextInt(jokess.length); tv2.setText(jokess[num]);

            }
        });



    }
    public void toastMsg1(String msg) {
        Toast toast = Toast.makeText(MainActivity3.this, msg, Toast.LENGTH_LONG);
        toast.show();

    }
    public void toastMsgg1(String msg) {
        Toast toast = Toast.makeText(MainActivity3.this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void uyarı1(View view) {
        toastMsg1("Sharing done");
    }
    public void share1(View view) {
        toastMsgg1("added to favorites");
    }
    public void sett1(View view) {
        Intent intent = new Intent(MainActivity3.this,MainActivity10.class);
        startActivity(intent);
    }






}


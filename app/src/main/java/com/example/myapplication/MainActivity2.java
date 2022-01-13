package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv1;
    private Button b1;

    private String jokes [] = {"Better days are coming.","What hurts today makes you stronger tomorrow.","Be patient. Some things take time.","No pain, no gain. Shut up and train.","Be with someone who is proud to have you.","Train insane or remain the same","Good things come to those who sweat","Sore. The most satisfying pain.","The only bad workout is the one that didn’t happen.","Work hard in silence. Let success be your noise.","When you feel like quitting think about why you started","Making excuses burns zero calories per hour."};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 =(TextView) findViewById(R.id.textView);b1 =(Button) findViewById(R.id.button12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random(); int num = random.nextInt(jokes.length); tv1.setText(jokes[num]);

            }
        });



    }
    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(MainActivity2.this, msg, Toast.LENGTH_LONG);
        toast.show();

    }
    public void toastMsgg(String msg) {
        Toast toast = Toast.makeText(MainActivity2.this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void uyarı(View view) {
        toastMsg("Sharing done");
    }
    public void share(View view) {
        toastMsgg("added to favorites");
    }
    public void sett(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity10.class);
        startActivity(intent);
    }






}
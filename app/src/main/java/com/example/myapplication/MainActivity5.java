package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {
    private TextView tv4;
    private Button b4;

    private String jokess [] = {"There are no shortcuts to any place worth going.","Be yourself because an original is always worth more than a copy.","A beautiful face will age, and a perfect body will change, but a beautiful soul will always be a beautiful soul.","Keep your eyes on the stars, and your feet on the ground.","On earth there is no heaven, but there are pieces of it.","Self-love heals the deepest wounds.","Let us so live that when we come to die even the undertaker will be sorry."};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        tv4 =(TextView) findViewById(R.id.textView4);b4 =(Button) findViewById(R.id.button15);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random(); int num = random.nextInt(jokess.length); tv4.setText(jokess[num]);

            }
        });



    }
    public void toastMsg1(String msg) {
        Toast toast = Toast.makeText(MainActivity5.this, msg, Toast.LENGTH_LONG);
        toast.show();

    }
    public void toastMsgg1(String msg) {
        Toast toast = Toast.makeText(MainActivity5.this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void uyarı3(View view) {
        toastMsg1("Sharing done");
    }
    public void share3(View view) {
        toastMsgg1("added to favorites");
    }
    public void sett3(View view) {
        Intent intent = new Intent(MainActivity5.this,MainActivity10.class);
        startActivity(intent);


    }
}
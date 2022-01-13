package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity4 extends AppCompatActivity {
    private TextView tv3;
    private Button b3;

    private String jokess [] = {"True friendship comes when the silence between two people is comfortable","What is a friend? A single soul dwelling in two bodies.","Only a true best friend can protect you from your immortal enemies","Friendship is the only cement that will ever hold the world together","Truly great friends are hard to find, difficult to leave, and impossible to forget","Best friends make the good times better and hard times easier","A friend’s frown is better than a fool’s smile","The road to a friend’s house is never long.","Friends are flowers that never fade.","Be slow to fall into friendship; but when thou art in, continue firm & constant."};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tv3 =(TextView) findViewById(R.id.textView3);b3 =(Button) findViewById(R.id.button14);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random(); int num = random.nextInt(jokess.length); tv3.setText(jokess[num]);

            }
        });



    }
    public void toastMsg1(String msg) {
        Toast toast = Toast.makeText(MainActivity4.this, msg, Toast.LENGTH_LONG);
        toast.show();

    }
    public void toastMsgg1(String msg) {
        Toast toast = Toast.makeText(MainActivity4.this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void uyarı2(View view) {
        toastMsg1("Sharing done");
    }
    public void share2(View view) {
        toastMsgg1("added to favorites");
    }
    public void sett2(View view) {
        Intent intent = new Intent(MainActivity4.this,MainActivity10.class);
        startActivity(intent);

    }
}
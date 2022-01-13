package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void yan(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);


    }
    public void yan1(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent);


    }
    public void yan2(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(intent);


    }
    public void yan3(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity5.class);
        startActivity(intent);


    }
    public void yan4(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity6.class);
        startActivity(intent);


    }

    public void yan5(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity7.class);
        startActivity(intent);


    }
    public void yan6(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity8.class);
        startActivity(intent);


    }



    /* protected void onResume() {
        super.onResume();
        //your code here
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Notification");
        alert.setMessage("Allow notifications?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Allowed",Toast.LENGTH_SHORT).show();


            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                System.exit(0);
                Toast.makeText(MainActivity.this,"Not allowed",Toast.LENGTH_SHORT).show();
            }
        });
        alert.create().show();
    }*/



    }

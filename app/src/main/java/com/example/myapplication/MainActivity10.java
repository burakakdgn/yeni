package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public void toastM(String msg) {
        Toast toast = Toast.makeText(MainActivity10.this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void ho(View view) {
        toastM("set to 2 hours");
    }
    public void toastM1(String msg) {
        Toast toast = Toast.makeText(MainActivity10.this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void ho1(View view) {
        toastM1("set to 4 hours");
    }
    public void toastM2(String msg) {
        Toast toast = Toast.makeText(MainActivity10.this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void ho2(View view) {
        toastM2("set to 8 hours");
    }



}
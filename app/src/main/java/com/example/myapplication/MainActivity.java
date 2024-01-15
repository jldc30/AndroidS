package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reply(View v){
        Intent i = new Intent(this,MainActivity2.class);
        //String name = ((EditText)findViewById(R.id.button)).getText().toString();
        String name = ((Button)v).getText().toString();
        i.putExtra("Name",name);
        startActivity(i);
    }
}
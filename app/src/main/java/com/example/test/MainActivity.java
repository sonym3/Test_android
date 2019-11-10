package com.example.test;

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
        final EditText in1=(EditText) findViewById(R.id.editText);
        Button btnSubmit = (Button)findViewById(R.id.button);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(getApplicationContext(),Main2Activity.class);
                myIntent.putExtra("ID",Integer.parseInt(in1.getText().toString()));
                startActivity(myIntent);
            }
        });

    }






    }


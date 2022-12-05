package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private Button button;
private TextView result;
private EditText h1;
private EditText w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.Calculate);
        result  = findViewById(R.id.result);
        h1 = findViewById(R.id.Height);
        w1 = findViewById(R.id.weight);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_LONG).show();
                int val =  Integer.parseInt(h1.getText().toString());
                int val1 = Integer.parseInt(w1.getText().toString());
                int BMI = val + (val1*val1);
                result.setText("value "+BMI);
            }
        });








    }




}
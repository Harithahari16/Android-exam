package com.example.sjcet.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
EditText et1, et2;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.txt);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        bt=findViewById(R.id.btn);

    }
    public void click(View view) {
        if ((et1.getText() == null) && (et2.getText() == null))
            Toast.makeText(this, "Username or Password is empty", Toast.LENGTH_SHORT).show();

        else {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
            tv.setText("Haritha");

        }


    }

        }



package com.example.sjcet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.txt);
        String msg = getIntent().getStringExtra("mykey");
        tv.setText("msg");
        tv.setOnCreateContextMenuListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
    }



    public boolean OnOptionItemSelected(MenuItem item) {
        switch ((item.getItemId())) {
            case R.id.signout:
                Toast.makeText(this, "Sign out selected", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}

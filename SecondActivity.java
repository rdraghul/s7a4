package com.example.raghul.intentlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("un");

        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText("Welcome, "+username);
    }
}

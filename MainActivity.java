package com.example.raghul.intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText un = (EditText)findViewById(R.id.editText);
        final EditText pw = (EditText)findViewById(R.id.editText2);

        Button bn = (Button) findViewById(R.id.button);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pw.getText().toString().equals("pword")) {
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("un", un.getText().toString());
                    startActivity(i);
                }
                else
                    Toast.makeText(getApplicationContext(),"Username Password Mismatch",Toast.LENGTH_LONG).show();
            }
        });


    }
}

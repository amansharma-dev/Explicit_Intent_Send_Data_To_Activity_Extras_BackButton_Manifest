package com.example.explicit_intent_send_data_to_activity_extras_backbutton_manifest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity {

    private TextView firstName_tv,lastName_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        firstName_tv = findViewById(R.id.firstName);
        lastName_tv = findViewById(R.id.lastName);

        Intent intent = getIntent();

        String firstName = intent.getStringExtra(MainActivity.FIRST_NAME);
        String lastName = intent.getStringExtra(MainActivity.LAST_NAME);

        firstName_tv.setText(firstName);
        lastName_tv.setText(lastName);

        Toast.makeText(getApplicationContext(),"Getting Data From MainActivity",Toast.LENGTH_SHORT).show();
    }
}

package com.example.explicit_intent_send_data_to_activity_extras_backbutton_manifest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button_toActivity2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity_2.class);
                intent.putExtra(FIRST_NAME,"Matt");
                intent.putExtra(LAST_NAME,"Simons");
                startActivity(intent);

            }
        });
    }
}

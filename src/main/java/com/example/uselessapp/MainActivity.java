package com.example.uselessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton uselessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uselessButton = (ImageButton) findViewById(R.id.smileyimageButton);

        uselessButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //finish();
                System.exit(0);

            }
        });
    }
}

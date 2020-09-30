package com.example.deafanddumbtalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        final Button text = findViewById(R.id.texttospeech);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text();
            }
        });

        final Button text1= findViewById(R.id.speechtotext);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1();
            }
        });


        final Button text2= findViewById(R.id.signlanguage);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text2();
            }
        });
    }
    private void text1() {
        startActivity(new Intent(getApplicationContext(),SpeechToText.class));
    }
    private void text() {
        startActivity(new Intent(getApplicationContext(),TextToSpeech.class));
    }
    private void text2() {
        startActivity(new Intent(getApplicationContext(),SignLanguage.class));
    }

}
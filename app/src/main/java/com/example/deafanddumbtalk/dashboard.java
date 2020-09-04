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
    }

    private void text() {
        startActivity(new Intent(getApplicationContext(),TextToSpeech.class));
        finish();
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();//logout
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }



}
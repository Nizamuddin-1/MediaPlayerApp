package com.example.media;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2,b3;
        b1 = findViewById(R.id.play);
        b2 = findViewById(R.id.pause);
        b3 = findViewById(R.id.stop);
        MediaPlayer p;
        p = MediaPlayer.create(this,R.raw.nizam);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.pause();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.stop();
            }
        });
    }
}
package com.example.tozi2001.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG =
            SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private MediaPlayer mpE;
    private MediaPlayer mpKnight;
    private MediaPlayer mpMC;
    private MediaPlayer mpFalcon;
    private MediaPlayer mpPaul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpKnight = MediaPlayer.create(this, R.raw.heko);
        mpMC = MediaPlayer.create(this, R.raw.classic_hurt_1_);
        mpFalcon = MediaPlayer.create(this, R.raw.showmeyamoves);
        mpPaul = MediaPlayer.create(this, R.raw.hiimpaul);

        }

    public void onButton1Click( View v) {
        mpE.seekTo(0);
        Log.e (TAG, "Button 1 Clicked");
        mpE.start();
    }
    public void onButton2Click(View v) {
        mpKnight.seekTo(0);
        Log.e (TAG, "Button 2 Clicked");
        mpKnight.start();
    }
    public void onButton3Click(View v) {
        mpMC.seekTo(0);
        Log.e (TAG, "Button 3 Clicked");
        mpMC.start();
    }
    public void onButton4Click(View v) {
        mpFalcon.seekTo(0);
        Log.e (TAG, "Button 4 Clicked");
        mpFalcon.start();
    }
    public void onButton5Click (View v) {
        mpPaul.seekTo(0);
        Log.e (TAG, "Button 5 Clicked");
        mpPaul.start();
    }
            }




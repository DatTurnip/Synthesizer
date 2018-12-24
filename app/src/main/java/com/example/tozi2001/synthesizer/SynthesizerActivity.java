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
    private Button button6;
    private Button button7;
    private MediaPlayer mpB;
    private MediaPlayer mpKnight;
    private MediaPlayer mpMC;
    private MediaPlayer mpFalcon;
    private MediaPlayer mpPaul;
    private MediaPlayer mpMario;
    private MediaPlayer mpS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        mpB = MediaPlayer.create(this, R.raw.broski);
        mpKnight = MediaPlayer.create(this, R.raw.heko);
        mpMC = MediaPlayer.create(this, R.raw.classic_hurt_1_);
        mpFalcon = MediaPlayer.create(this, R.raw.showmeyamoves);
        mpPaul = MediaPlayer.create(this, R.raw.hiimpaul);
        mpMario = MediaPlayer.create( this, R.raw.maria);
        mpS = MediaPlayer.create(this, R.raw.sponch);


        }

    public void onButton1Click( View v) {
        mpB.seekTo(0);
        Log.e (TAG, "Button 1 Clicked");
        mpB.start();
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
    public void onButton6Click (View v) {
        mpMario.seekTo(0);
        Log.e (TAG, "Button 6 Clicked");
        mpMario.start();
    }
    public void onButton7Click (View v) {
        mpS.seekTo(0);
        Log.e (TAG, "Button 7 Clicked");
        mpS.start();
    }
            }




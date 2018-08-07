package com.a.mediaplayerdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton play,pause,stop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(ImageButton)findViewById(R.id.imageButton);
        pause=(ImageButton)findViewById(R.id.imageButton2);
        stop=(ImageButton)findViewById(R.id.imageButton3);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
       mediaPlayer=MediaPlayer.create(this,R.raw.aaj);




    }
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.imageButton:
                mediaPlayer.start();
                break;
            case R.id.imageButton2:
                mediaPlayer.pause();
                break;
            case R.id.imageButton3:
               // mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer=MediaPlayer.create(this,R.raw.aaj);

                break;

        }
    }
}

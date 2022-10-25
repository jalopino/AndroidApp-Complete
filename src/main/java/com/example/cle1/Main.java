package com.example.cle1;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.splashscreen.SplashScreen;
import android.media.MediaPlayer;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class Main extends Activity{
    //Splash screen audio variable counter
    public static int start = 0;
    //Init Button Objects ----------------
    ImageButton uq, tnf, s, rl, ow, nb, n, a;
    //Init media
    MediaPlayer music;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Check if splash screen played already
        if (start == 0) {
            //Run Splash Audio
            music = MediaPlayer.create(Main.this, R.raw.sound);
            music.start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Splash screen counter
        start++;
        SplashScreen.installSplashScreen(this);
        setContentView(R.layout.main_activity);

        //Buttons go here
        //Uniqlo
        uq=(ImageButton)findViewById(R.id.uqbtn);
        uq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main.this, UQActivity.class);
                startActivity(intent);
            }
        });
        //The North Face
        tnf=(ImageButton)findViewById(R.id.tnfbtn);
        tnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main.this, TFNActivity.class);
                startActivity(intent);
            }
        });
        //Ralph Lauren
        rl=(ImageButton)findViewById(R.id.rlbtn);
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main.this, RLActivity.class);
                startActivity(intent);
            }
        });
        //Off-White
        ow=(ImageButton)findViewById(R.id.owbtn);
        ow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main.this, OWActivity.class);
                startActivity(intent);
            }
        });
        //New Balance
        nb=(ImageButton)findViewById(R.id.nbbtn);
        nb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main.this, NBActivity.class);
                startActivity(intent);
            }
        });
        //Nike
        n=(ImageButton)findViewById(R.id.nbtn);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main.this, NActivity.class);
                startActivity(intent);
            }
        });
        //Adidas
        a=(ImageButton)findViewById(R.id.abtn);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main.this, AActivity.class);
                startActivity(intent);
            }
        });
        //Supreme
        s=(ImageButton)findViewById(R.id.sbtn);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main.this, SActivity.class);
                startActivity(intent);
            }
        });
    }
}

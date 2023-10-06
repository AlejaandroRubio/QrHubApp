package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Button Binstagram, Bfacebook, Btwitter, Byoutube,Blinkedin,Btiktok,Breset;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binstagram = findViewById(R.id.buttonInstagram);
        Bfacebook = findViewById(R.id.buttonFacebook);
        Btwitter = findViewById(R.id.buttonTwitter);
        Byoutube = findViewById(R.id.buttonYouTube);
        Blinkedin = findViewById(R.id.buttonLinkedin);
        Btiktok = findViewById(R.id.buttonTikTok);
        Breset = findViewById(R.id.buttonReset);


        //region Botones clickListener
        Binstagram.setOnClickListener(v -> {
            onclickPoster(1);
        });

        Bfacebook.setOnClickListener(v -> {
            onclickPoster(2);
        });

        Btwitter.setOnClickListener(v -> {
            onclickPoster(3);
        });

        Blinkedin.setOnClickListener(v -> {
            onclickPoster(4);
        });

        Byoutube.setOnClickListener(v -> {
            onclickPoster(5);
        });

        Btiktok.setOnClickListener(v -> {
            onclickPoster(6);
        });

        Breset.setOnClickListener(v -> {
            onclickPoster(7);
        });

        //endregion


    }


    //region onclickPoster
    public void onclickPoster(int qrCode) {

        ImageView QrShow = (ImageView) findViewById(R.id.QrCodeInScreen);
        ImageView SMlogo = (ImageView) findViewById(R.id.imageSMlogo);
        ImageView background = (ImageView) findViewById(R.id.imageBackground);

        switch (qrCode){

            //Instagram
            case 1:
                QrShow.setImageResource(R.drawable.instagramqr);
                SMlogo.setImageResource(R.drawable.logoinstagram);
                background.setImageResource(0);
                break;

            //Facebook
            case 2:
                QrShow.setImageResource(0); // El nombre del archivo de la imagen
                SMlogo.setImageResource(R.drawable.logofacebook);
                background.setImageResource(0);
                break;
            //Twitter
            case 3:
                QrShow.setImageResource(0); // El nombre del archivo de la imagen
                SMlogo.setImageResource(R.drawable.logotwitterxx);
                background.setImageResource(0);
                break;

            //Linkedin
            case 4:
                QrShow.setImageResource(0);
                SMlogo.setImageResource(R.drawable.logolinkedin);
                background.setImageResource(0);
                break;
            //Youtube
            case 5:
                QrShow.setImageResource(0);
                SMlogo.setImageResource(R.drawable.logoyoutube);
                background.setImageResource(0);
                break;
            //Tiktok
            case 6:
                QrShow.setImageResource(0);
                SMlogo.setImageResource(R.drawable.logotiktok);
                background.setImageResource(0);
                break;
            //Reset
            case 7:
                QrShow.setImageResource(0);
                SMlogo.setImageResource(R.drawable.squidwardtentacles);
                background.setImageResource(R.drawable.ic_launcher_background);
                break;
        }

    }
    //endregion
}

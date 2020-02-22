package com.example.somdosbichos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageButton btnCao;
    private ImageButton btnGato;
    private ImageButton btnLeao;
    private ImageButton btnMacaco;
    private ImageButton btnOvelha;
    private ImageButton btnVaca;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCao = (ImageButton) findViewById(R.id.btnCao);
        btnGato = (ImageButton) findViewById(R.id.btnGato);
        btnLeao = (ImageButton) findViewById(R.id.btnLeao);
        btnMacaco = (ImageButton) findViewById(R.id.btnMacaco);
        btnOvelha = (ImageButton) findViewById(R.id.btnOvelha);
        btnVaca = (ImageButton) findViewById(R.id.btnVaca);

        btnCao.setOnClickListener(this);
        btnGato.setOnClickListener(this);
        btnLeao.setOnClickListener(this);
        btnMacaco.setOnClickListener(this);
        btnOvelha.setOnClickListener(this);
        btnVaca.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCao:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                tocarSom();
                break;
            case R.id.btnGato:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                tocarSom();
                break;
            case R.id.btnLeao:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                tocarSom();
                break;
            case R.id.btnMacaco:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocarSom();
                break;
            case R.id.btnOvelha:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocarSom();
                break;
            case R.id.btnVaca:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocarSom();
                break;
        }
    }

    public void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }
}

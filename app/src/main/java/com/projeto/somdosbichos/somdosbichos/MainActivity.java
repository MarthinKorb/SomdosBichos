package com.projeto.somdosbichos.somdosbichos;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = findViewById(R.id.caoId);
        gato = findViewById(R.id.gatoId);
        leao = findViewById(R.id.leaoId);
        macaco = findViewById(R.id.macacoId);
        ovelha = findViewById(R.id.ovelhaId);
        vaca = findViewById(R.id.vacaId);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.caoId) {
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
            tocarSom();
        } else if (v.getId() == R.id.gatoId) {
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
            tocarSom();
        } else if (v.getId() == R.id.leaoId) {
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
            tocarSom();
        } else if (v.getId() == R.id.macacoId) {
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
            tocarSom();
        } else if (v.getId() == R.id.ovelhaId) {
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
            tocarSom();
        } else if (v.getId() == R.id.vacaId) {
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
            tocarSom();
        }
    }

    public void tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if  (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}

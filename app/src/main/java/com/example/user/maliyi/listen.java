package com.example.user.maliyi;

import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class listen extends AppCompatActivity {

    Button btn4,btn5,btn6,btn7,btn8,btn3;
    MediaPlayer mediaPlayer;
    ImageButton listen_paino,listen_vocal,listen_linedi,listen_shortvoice,listen_gree,listen_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen);

        btn3=(Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder al = new AlertDialog.Builder(listen.this);
                al.setTitle("說明");
                al.setMessage("又稱箏、秦箏。中國撥弦樂器，音域寬廣，音色清亮，表現力豐富。目前通用古箏弦製是21弦箏。");
                al.show();
            }
        });


        btn4=(Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder al = new AlertDialog.Builder(listen.this);
                al.setTitle("說明");
                al.setMessage("西洋古典音樂中的一種鍵盤樂器，普遍用於獨奏、" +
                        "重奏、伴奏等演出，鋼琴音域寬廣，音色宏亮、清脆，富於變化，表現力很強。獨奏時，可演奏各種氣勢磅礡、寬廣、抒情的音樂");
                al.show();
            }
        });

        btn5=(Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder al = new AlertDialog.Builder(listen.this);
                al.setTitle("說明");
                al.setMessage("四弦的弓弦樂器，是現代管弦樂團弦樂組中最重要的樂器" +
                        "，一般在管弦樂作品中會分成第一小提琴與第二小提琴兩個聲部，又被稱作為樂器中的女王");
                al.show();
            }
        });

        btn6=(Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder al = new AlertDialog.Builder(listen.this);
                al.setTitle("說明");
                al.setMessage("木管樂器，笛端有1個吹孔，吹孔以下有尖版開口，" +
                        "笛身有8至10個音孔，其中2個為半音孔，由口吹氣至吹口的窄管，窄管的氣撞到尖板，令空氣震盪。直笛音色優美圓潤，是巴洛克時代的標準獨奏樂器。");
                al.show();
            }
        });

        btn7=(Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder al = new AlertDialog.Builder(listen.this);
                al.setTitle("說明");
                al.setMessage("低音銅管樂器。在管弦樂隊、管樂隊中經常使用，是音域最低，體積最大的銅管樂器。亦稱「低音大喇叭」或「土巴號」");
                al.show();
            }
        });

        btn8=(Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder al = new AlertDialog.Builder(listen.this);
                al.setTitle("說明");
                al.setMessage("吹管樂器。陶笛外形呈壺狀而非長管狀，屬球形的閉管樂器。而他的雛型曾在不同文化中出現。");
                al.show();
            }
        });

        listen_one = (ImageButton) findViewById(R.id.listen_one);
        listen_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(listen.this, R.raw.ss_1);
                mediaPlayer.start();
            }
        });

        listen_paino = (ImageButton) findViewById(R.id.listen_paino);
        listen_paino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(listen.this, R.raw.paino_v);
                mediaPlayer.start();
            }
        });

        listen_vocal = (ImageButton) findViewById(R.id.listen_vocal);
        listen_vocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(listen.this, R.raw.vocal_v);
                mediaPlayer.start();
            }
        });

        listen_linedi = (ImageButton) findViewById(R.id.listen_linedi);
        listen_linedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(listen.this, R.raw.linedi);
                mediaPlayer.start();
            }
        });

        listen_shortvoice = (ImageButton) findViewById(R.id.listen_shortvoice);
        listen_shortvoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(listen.this, R.raw.shortvoice);
                mediaPlayer.start();
            }
        });

        listen_gree = (ImageButton) findViewById(R.id.listen_gree);
        listen_gree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(listen.this, R.raw.gree);
                mediaPlayer.start();
            }
        });

    }
}

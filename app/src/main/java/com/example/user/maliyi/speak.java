package com.example.user.maliyi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class speak extends AppCompatActivity {

    ImageView img;
    Button sp_bt1,sp_bt2;
    int rnd;
    boolean t=true;
    int[] pic={R.drawable.lion,R.drawable.tiger,R.drawable.ox,R.drawable.fox};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak);

        //lion 0 //tiger 1 //ox  2 //fox 3 //
        img = (ImageView) findViewById(R.id.img);

        Random x = new Random();
        rnd = x.nextInt(4);
        img.setImageResource(pic[rnd]);

        sp_bt1=(Button) findViewById(R.id.sp_bt1);
        sp_bt2=(Button) findViewById(R.id.sp_bt2);

        sp_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random x = new Random();
                rnd = x.nextInt(4);
                img.setImageResource(pic[rnd]);
            }
        });

        sp_bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rnd==0){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("說明");
                    al.setMessage("獅子");
                    al.show();
                }else if(rnd==1){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("說明");
                    al.setMessage("老虎");
                    al.show();
                }else if(rnd==2){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("說明");
                    al.setMessage("牛");
                    al.show();
                }else if(rnd==3){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("說明");
                    al.setMessage("狐狸");
                    al.show();
                }
            }
        });

    }

}

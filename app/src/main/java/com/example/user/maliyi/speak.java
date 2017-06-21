package com.example.user.maliyi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class speak extends AppCompatActivity implements SensorEventListener,GestureDetector.OnGestureListener,View.OnTouchListener {

    GestureDetector gd;

    ImageView img;
    Button sp_bt1,sp_bt2;
    int rnd;
    int[] pic={R.drawable.lion,R.drawable.tiger,R.drawable.ox,R.drawable.fox,R.drawable.dog,R.drawable.cat,R.drawable.ant};

    SensorManager sm;
    Sensor sr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak);

        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        sr = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        gd = new GestureDetector(this, this);

        //lion 0 //tiger 1 //ox  2 //fox 3 //dog 4//cat 5 //ant 6
        img = (ImageView) findViewById(R.id.img);
        img.setOnTouchListener(this);

        Random x = new Random();
        rnd = x.nextInt(7);
        img.setImageResource(pic[rnd]);

        sp_bt1=(Button) findViewById(R.id.sp_bt1);
        sp_bt2=(Button) findViewById(R.id.sp_bt2);

        sp_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random x = new Random();
                rnd = x.nextInt(7);
                img.setImageResource(pic[rnd]);
            }
        });

        sp_bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rnd==0){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("獅子");
                    al.setMessage("被稱為萬獸之王。是一種生存在非洲和亞洲的大型貓科動物，" +
                            "豹屬之中最著名的一種，現存中是繼老虎之後第二大的貓科。");
                    al.show();
                }else if(rnd==1){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("老虎");
                    al.setMessage("體形最大的貓科動物，是亞洲最具代表性的猛獸。老虎跟人一樣有密切關係的群體動物");
                    al.show();
                }else if(rnd==2){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("牛");
                    al.setMessage("即是牛族，成員大多都是的草食性動物，其中包括對人類非常重要的家牛" +
                            "、黃牛、水牛和氂牛。最大的野生牛族成員是非洲水牛和美洲野牛。這一族統稱為牛。有一部份的牛被人類做為家畜。");
                    al.show();
                }else if(rnd==3){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("狐狸");
                    al.setMessage("食肉目犬科，狐狸繁殖率高，抗病力強，食性雜，好飼養。" +
                            "毛長，耳尖，腿相對較短，尾巴狹長，像體型中等而尾蓬鬆的狗");
                    al.show();
                }else if(rnd==4){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("狗");
                    al.setMessage("一種常見的犬科哺乳動物。狗是狼的近親。狗種類有數百種。同人一樣，狗是有高度社會跟集體獵食動物。");
                    al.show();
                }else if(rnd==5){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("貓");
                    al.setMessage("通常是指家貓，一種小型貓科動物，是全世界最普遍的寵物，飼養率僅次於狗。貓平均有12年命。");
                    al.show();
                }else if(rnd==6){
                    AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
                    al.setTitle("螞蟻");
                    al.setMessage("一種有社會性的生活習性的昆蟲，屬於膜翅，螞蟻特徵的觸角，是明顯的膝狀彎曲，腹部有一、二節呈結節狀。");
                    al.show();
                }
            }
        });

    }

    @Override
    public void onResume(){
        super.onResume();
        sm.registerListener(this, sr, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onPause(){
        super.onPause();
        sm.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x, y, z;
        x = event.values[0];
        y = event.values[1];
        z = event.values[2];

        if (Math.abs(x)<1 && Math.abs(y)<1 && z<-9) { //朝下平放
            Random u = new Random();
            rnd = u.nextInt(7);
            img.setImageResource(pic[rnd]);
        }
        else if (Math.abs(x) + Math.abs(y) + Math.abs(z) > 32){ //手機搖晃
            Random u = new Random();
            rnd = u.nextInt(7);
            img.setImageResource(pic[rnd]);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Random x = new Random();
        rnd = x.nextInt(7);
        img.setImageResource(pic[rnd]);
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        gd.onTouchEvent(event);
        if(rnd==0){
            AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
            al.setTitle("哈囉~");
            al.setMessage("我是萬獸之王~");
            al.show();
        }else if(rnd==1){
            AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
            al.setTitle("哈囉~");
            al.setMessage("我跟獅子很像但我不是他XD");
            al.show();
        }else if(rnd==2){
            AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
            al.setTitle("哈囉~");
            al.setMessage("嗚嗚，我不要變成牛排QQ");
            al.show();
        }else if(rnd==3){
            AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
            al.setTitle("哈囉~");
            al.setMessage("我發誓我絕對不會再腳滑了 ! ! ! ");
            al.show();
        }else if(rnd==4){
            AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
            al.setTitle("哈囉~");
            al.setMessage("汪汪，主人我喜歡你，你喜歡我嗎");
            al.show();
        }else if(rnd==5){
            AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
            al.setTitle("哈囉~");
            al.setMessage("喵喵~我是人見人愛的喵喵");
            al.show();
        }else if(rnd==6){
            AlertDialog.Builder al = new AlertDialog.Builder(speak.this);
            al.setTitle("哈囉~");
            al.setMessage("我不是邊緣人 ! 我有一堆夥伴 ! ");
            al.show();
        }
        return false;
    }
}

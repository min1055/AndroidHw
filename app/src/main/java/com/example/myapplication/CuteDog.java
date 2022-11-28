package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CuteDog extends AppCompatActivity {

    final String TAG = this.getClass().getSimpleName();
    ImageView tv;
    final int IMAGE_1 = 100;
    final int IMAGE_2 = 101;
    final int IMAGE_3 = 102;
    final int interval = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cute_dog);

        unInit();
    }

    private void unInit() {
        tv = findViewById(R.id.imageView3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Message msg =myHandler.obtainMessage();
        msg.what = IMAGE_2;
        myHandler.sendMessageDelayed(msg, interval);
    }

    @Override
    protected void onStop() {
        super.onStop();
        myHandler.removeCallbacksAndMessages(null);
    }

    private Handler myHandler = new Handler(Looper.getMainLooper()){

        @Override
        public void handleMessage(Message msg){
            switch (msg.what){
                case IMAGE_1:
                    tv.setImageResource(R.drawable.ic_dog_rotate_right_1);
                    Log.d(TAG,"IMAGE_1"+ SystemClock.elapsedRealtime());
                    msg = this.obtainMessage();
                    msg.what = IMAGE_2;
                    myHandler.sendMessageDelayed(msg,interval);
                    break;
                case IMAGE_2:
                    tv.setImageResource(R.drawable.ic_dog_rotate_right_2);
                    Log.d(TAG,"IMAGE_2"+ SystemClock.elapsedRealtime());
                    msg = this.obtainMessage();
                    msg.what = IMAGE_3;
                    myHandler.sendMessageDelayed(msg,interval);
                    break;
                case IMAGE_3:
                    tv.setImageResource(R.drawable.ic_dog_rotate_right_3);
                    Log.d(TAG,"IMAGE_3"+ SystemClock.elapsedRealtime());
                    msg = this.obtainMessage();
                    msg.what = IMAGE_1;
                    myHandler.sendMessageDelayed(msg,interval);
                    break;
            }
        }
    };
}
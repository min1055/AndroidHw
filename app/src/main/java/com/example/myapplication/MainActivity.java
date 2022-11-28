package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

//    private AppBarConfiguration appBarConfiguration;
//    private ActivityMainBinding binding;
    final String TAG=this.getClass().getSimpleName();
    static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count++;
        Log.d(TAG, "enter onCreate(), #" +count);

    }


    @Override
    protected void onStart() {
        super.onStart();
        //找到view root 設定click監聽
//        findViewById(android.R.id.content).setOnClickListener(this);

        Log.d(TAG, "enter onStart(), #" +count);
        Message msg =myHandler.obtainMessage();

        myHandler.sendMessageDelayed(msg, 500);
    }


    @Override
    protected void onStop() {
        Log.d(TAG, "enter onStop(), #" +count);
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "enter onDestroy(), #" +count);
        count--;
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "enter onPause(), #" +count);
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "enter onResume(), #" +count);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "enter onRestart(), #" +count);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case android.R.id.content:
                startActivity(new Intent(this,Bookkeeping.class));

                //新增過場動畫
                overridePendingTransition(android.R.anim.slide_in_left,
                        android.R.anim.slide_out_right);
                //讓main activity終止
//                MainActivity.this.finish();
                break;
        }
    }

    private Handler myHandler = new Handler(Looper.getMainLooper()){

        @Override
        public void handleMessage(Message msg){
            startActivity(new Intent(MainActivity.this, Bookkeeping.class));
            overridePendingTransition(android.R.anim.slide_in_left,
                    android.R.anim.slide_out_right);
            //讓main activity終止
            MainActivity.this.finish();
        }
    };



//    @Override
//    public void onClick(View view) {
//        tx.setTextColor(Color.GREEN);
//    }

//    private View.OnClickListener myClickListener =new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            tx.setTextColor(Color.BLUE);
//        }
////    };
//    public void onButtonClick(View view){
//        tx.setTextColor(Color.MAGENTA);
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }

//    @Override
//    public void onClick(View view) {
//        tx.setTextColor(Color.BLACK);
//    }
}
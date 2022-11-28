package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Bookkeeping extends AppCompatActivity implements View.OnClickListener{

    //    private AppBarConfiguration appBarConfiguration;
//    private ActivityMainBinding binding;
    final String TAG=this.getClass().getSimpleName();
    static int count = 0;
    TextView theDate, theTime;
    Button btSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookkeeping_constraintlayout);
        count++;
        Log.d(TAG, "enter onCreate(), #" +count);
        uiInit();
    }

    private void uiInit(){
        theDate = findViewById(R.id.textView11);
        theTime = findViewById(R.id.textView13);
        btSave =findViewById(R.id.button);
    }

    @Override
    protected void onStart() {
        super.onStart();
        varInit();
        setListener();
        Log.d(TAG, "enter onStart(), #" +count);
    }

    private void varInit() {
    }

    private void setListener() {
        theTime.setOnClickListener(this);
        theDate.setOnClickListener(this);
        btSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                startActivity(new Intent(this,MainActivity.class));

                //新增過場動畫
                overridePendingTransition(android.R.anim.slide_in_left,
                        android.R.anim.slide_out_right);
                break;
        }
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "enter onStop(), #" +count);
        super.onStop();
        releaseUiListener();
    }

    private void releaseUiListener() {
        theTime.setOnClickListener(null);
        theDate.setOnClickListener(null);
        btSave.setOnClickListener(null);
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
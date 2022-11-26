package com.example.myapplication;

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

    TextView theDate, theTime;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookkeeping_constraintlayout);

        Log.d(TAG, "enter onCreate()");
        uiInit();
    }

    private void uiInit(){
        theDate = findViewById(R.id.textView11);
        theTime = findViewById(R.id.textView13);
    }

    @Override
    protected void onStart() {
        super.onStart();
        varInit();
        setListener();
        Log.d(TAG, "enter onStart()");
    }

    private void varInit() {
    }

    private void setListener() {
        theTime.setOnClickListener(this);
        theDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "enter onClick()");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "enter onStop()");
        super.onStop();
        releaseUiListener();
    }

    private void releaseUiListener() {
        theTime.setOnClickListener(null);
        theDate.setOnClickListener(null);
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "enter onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "enter onPause()");
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "enter onResume()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "enter onRestart()");
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
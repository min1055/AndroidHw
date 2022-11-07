package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{

//    private AppBarConfiguration appBarConfiguration;
//    private ActivityMainBinding binding;

    TextView tx;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tx = findViewById(R.id.textView);
//        bt = findViewById(R.id.button);


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
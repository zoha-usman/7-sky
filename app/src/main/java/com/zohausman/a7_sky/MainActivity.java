package com.zohausman.a7_sky;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
//    Create button is already build by android
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("lifecycle","onCreate invoke");
        Toast.makeText(this, "OnCreate Activity is Created", Toast.LENGTH_LONG).show();


    }
    protected void onStart() {
// as these method are by default
        super.onStart();
        Log.i("lifecycle","onStart invoke");
        Toast.makeText(this, "OnStart Activity Start", Toast.LENGTH_LONG).show();


    }
    protected void onResume() {

        super.onResume();
        Log.i("lifecycle","onResume invoke");
        Toast.makeText(this, "OnResume Activity Resume", Toast.LENGTH_LONG).show();
    }
    protected void onPause() {

        super.onPause();
        Log.i("lifecycle","onPause invoke");
        Toast.makeText(this, "OnPause Activity Pasused", Toast.LENGTH_LONG).show();
    }
    protected void onStop() {

        super.onStop();
        Log.i("lifecycle","onStop invoke");
        Toast.makeText(this, "OnStop Activity Stop", Toast.LENGTH_LONG).show();
    }
    protected void onDestroy() {

        super.onDestroy();
        Log.i("lifecycle","onDestroy invoke");
        Toast.makeText(this, "OnDestroy Activity Destroyed", Toast.LENGTH_LONG).show();
    }
    protected void onRestart() {

        super.onRestart();
        Log.i("lifecycle","onRestart invoke");
        Toast.makeText(this, "OnRestart Activity Restart", Toast.LENGTH_LONG).show();
    }
}
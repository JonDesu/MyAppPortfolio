package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendToToast(View v){

        String toastMessage = null;

        switch (v.getId()){
            case R.id.buildBiggerButton:
                toastMessage = "Build It Bigger!";
                break;
            case R.id.capstonAppButton:
                toastMessage = "Capstone App!";
                break;
            case R.id.scoresAppButton:
                toastMessage = "SCORE!!!";
                break;
            case R.id.libraryAppButton:
                toastMessage = "Library App!";
                break;
            case R.id.spotStreamerButton:
                toastMessage = "Spotify Streamer!";
                break;
            case R.id.xyzAppButton:
                toastMessage = "XYZ App!";
                break;
            default:
                break;
        }

        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }
}

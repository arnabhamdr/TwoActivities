package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.activitesandintent.extra.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);


        switch (view.getId()){
            case R.id.button_1:
                intent.putExtra(EXTRA_MESSAGE, getString(R.string.display_one)); startActivity(intent);
                break;
            case R.id.button_2:
                intent.putExtra(EXTRA_MESSAGE, getString(R.string.display_two)); startActivity(intent);
                break;
            case R.id.button_3:
                intent.putExtra(EXTRA_MESSAGE, getString(R.string.display_three)); startActivity(intent);
                break;
            default:
                Toast.makeText(MainActivity.this, "There was an error", Toast.LENGTH_LONG).show();
                break;
        }

    }
}

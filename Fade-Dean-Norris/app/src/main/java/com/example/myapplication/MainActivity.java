package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isSmiling = true;
    public void fade(View view){
        ImageView smilingView = (ImageView) findViewById(R.id.smilingView);
        ImageView angryView =  (ImageView) findViewById(R.id.angryView);
        if (isSmiling){
            smilingView.animate().alpha(0).setDuration(2000);
            angryView.animate().alpha(1).setDuration(2000);
            isSmiling = false;
        }
        else{
            smilingView.animate().alpha(1).setDuration(2000);
            angryView.animate().alpha(0).setDuration(2000);
            isSmiling = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
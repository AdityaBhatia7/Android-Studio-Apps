package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        Double amountInDollars = Double.parseDouble(editText.getText().toString());
        Double amountInRupees = amountInDollars*75;
        Toast.makeText(this, "Amount in Rupees: "+amountInRupees.toString(), Toast.LENGTH_SHORT).show();
    }
}
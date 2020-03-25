package com.example.myfirstjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
    }

    public void toastMe(View view){
        // Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view) {
        TextView showCountTextView = (TextView) findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;
        showCountTextView.setText(count.toString());
    }

    private static final String TOTAL_COUNT = "total_count";

    public void randomMe(View view) {
        Intent randomIntent = new Intent(this, SecondActivity.class);

        TextView showCountTextView = (TextView) findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();
        int count = Integer.parseInt(countString);
        randomIntent.putExtra(TOTAL_COUNT, count);

        startActivity(randomIntent);
    }
}

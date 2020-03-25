package com.example.counterhomeworkb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mTextCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextCount = findViewById(R.id.text_count);

        // Restore the state.
        if (savedInstanceState != null) {
            mTextCount.setText(savedInstanceState.getString("count_text"));
        }
    }

    public void clickAction(View view) {
        mCount++;
        mTextCount.setText(Integer.toString(mCount));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("count_text", mTextCount.getText().toString());
    }
}

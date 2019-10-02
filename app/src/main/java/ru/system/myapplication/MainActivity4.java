package ru.system.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private final String TAG = this.getClass().getName();

    public Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(this::onClick);
        Log.d(TAG, new StringBuilder(TAG).append("onCreate").toString());
    }

    private void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, new StringBuilder(TAG).append("onStart").toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, new StringBuilder(TAG).append("onResume").toString());

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, new StringBuilder(TAG).append("onPause").toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, new StringBuilder(TAG).append("onStop").toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, new StringBuilder(TAG).append("onDestroy").toString());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, new StringBuilder(TAG).append("onRestart").toString());
    }
}

package ru.system.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String SAVED_STRING = "STRING";
    private static final String SAVED_PARCEL = "PARCEL";
    private final String TAG = this.getClass().getName();

    public Button mButton;

    public String mButtonText;
    private MainParcel mMainParcel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(this::onClick);
        Random rand = new Random();
        int x = rand.nextInt(10);
        mButtonText = x + "";
        Log.d(TAG, "this is new int " + x);
        mButton.setText(mButtonText);
        mMainParcel = new MainParcel();
        Log.d("MainActivity", "MainActivity onCreate");
    }

    private void onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(SAVED_STRING, mButtonText);
        outState.putParcelable(SAVED_PARCEL, mMainParcel);
        Log.d(TAG, new StringBuilder(TAG).append("onSaveInstanceState").toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        mButtonText = savedInstanceState.getString(SAVED_STRING);
        mMainParcel = savedInstanceState.getParcelable(SAVED_PARCEL);
        mButton.setText(mButtonText);
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, new StringBuilder(TAG).append("onRestoreInstanceState").toString());
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

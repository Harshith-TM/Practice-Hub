package com.example.practice;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.i("Activity Life Cycle", "Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity Life Cycle", "Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity Life Cycle", "Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity Life Cycle", "Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity Life Cycle", "Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity Life Cycle", "Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity Life Cycle", "Activity Destroyed");
    }
}
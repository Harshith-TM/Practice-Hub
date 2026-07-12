package com.example.practice;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;

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
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button1 = findViewById(R.id.Button1);
        button1.setOnClickListener(v -> Toast.makeText(this, "Button 1 Clicked", Toast.LENGTH_SHORT).show());
        button2 = findViewById(R.id.Button2);
        button2.setOnClickListener(v -> Toast.makeText(this, "Button 1 Clicked", Toast.LENGTH_SHORT).show());
        button3 = findViewById(R.id.Button3);
        button3.setOnClickListener(v -> Toast.makeText(this, "Button 1 Clicked", Toast.LENGTH_SHORT).show());
        button4 = findViewById(R.id.Button4);
        button4.setOnClickListener(v -> Toast.makeText(this, "Button 1 Clicked", Toast.LENGTH_SHORT).show());
    }
}
package com.example.practice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

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
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button startActivity = findViewById(R.id.StartActivity);
        startActivity.setOnClickListener(v -> {
            //Explicit Intent
            Intent intent = new Intent(MainActivity.this, Activity2.class); //Source MainActivity.this, Destination Activity2.class
            startActivity(intent);
        });

        Button openDialer = findViewById(R.id.OpenDialer);
        openDialer.setOnClickListener(v1 -> {
            //Implicit Intent
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+91-1234567890"));
            startActivity(intent);
        });
    }
}

/*
A messaging object used to request an action or handle runtime
communication between core application components. Intents can
be used to starting an Activity, starting a Service, or sending a Broadcast.

Types:

>Explicit:Starts a specific component like an activity or a service or sending a
broadcast message. destination both context and destination is specified.

>Implicit:Performs a specific task or action, like opening a website or maps or other app.
Implicit intent just performs the action, android handles the destination.
Common Intent Actions
| Action                        | Description                                  |
| ----------------------------- | -------------------------------------------- |
| `Intent.ACTION_VIEW`          | View a webpage, image, or file               |
| `Intent.ACTION_DIAL`          | Open the phone dialer                        |
| `Intent.ACTION_CALL`          | Directly call a number (requires permission) |
| `Intent.ACTION_SEND`          | Share text or files                          |
| `Intent.ACTION_SENDTO`        | Send an email or SMS                         |
| `Intent.ACTION_CAMERA_BUTTON` | Camera-related action                        |
| `Intent.ACTION_MAIN`          | Main entry point of an app                   |
*/
package com.example.practice;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SimpleAlertDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.simple_alert_dialog);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button showAlertButton = findViewById(R.id.ShowAlertButton);
        showAlertButton.setOnClickListener(v -> DisplayAlertDialog());
    }

    private void DisplayAlertDialog() {
        AlertDialog.Builder simpleDialogBuilder = new AlertDialog.Builder(this);

        simpleDialogBuilder.setTitle("Alert");
        simpleDialogBuilder.setMessage("This is a simple alert dialog.");
        simpleDialogBuilder.setPositiveButton("OK", (dialog, which) -> {
            Toast.makeText(this, "Ok Button Pressed", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
        simpleDialogBuilder.setNegativeButton("Cancel", (dialog, which) -> {
            Toast.makeText(this, "Cancel Button Pressed", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        AlertDialog simpleDialog = simpleDialogBuilder.create();
        simpleDialog.show();
    }
}
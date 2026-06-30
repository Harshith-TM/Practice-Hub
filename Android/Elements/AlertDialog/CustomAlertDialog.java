package com.example.practice;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomAlertDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.custom_alert_dialog);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button showAlertButton = findViewById(R.id.ShowAlertButton);
        showAlertButton.setOnClickListener(v -> DisplayAlertDialog());
    }

    private void DisplayAlertDialog() {
        AlertDialog.Builder customDialogBuilder = new AlertDialog.Builder(this);

        LayoutInflater inflater = getLayoutInflater();
        View customDialogView = inflater.inflate(R.layout.custom_alert, null);

        customDialogBuilder.setView(customDialogView);

        AlertDialog dialog = customDialogBuilder.create();
        dialog.show();

        EditText userName = customDialogView.findViewById(R.id.UserName);
        Button submitButtom = customDialogView.findViewById(R.id.SubmitButton);

        submitButtom.setOnClickListener(v -> {
            String name = userName.getText().toString();

            Toast.makeText(CustomAlertDialog.this,"Hello " + name,Toast.LENGTH_SHORT).show();

            dialog.dismiss();
        });
    }
}
package com.example.practice;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    TextView textView1, textView2;
    Button button1, button2;

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

        editText1 = findViewById(R.id.EditText1);
        editText2 = findViewById(R.id.EditText2);

        textView1 = findViewById(R.id.TextView1);
        textView2 = findViewById(R.id.TextView2);

        button1 = findViewById(R.id.Button1);
        button2 = findViewById(R.id.Button2);

        button1.setOnClickListener(v -> {
            String string = editText1.getText().toString();
            textView1.setText(string);
            Toast.makeText(this, "Text Entered in Box1", Toast.LENGTH_LONG).show();
        });

        button2.setOnClickListener(v -> {
            String string = editText2.getText().toString();
            textView2.setText(string);
            Toast.makeText(this, "Text Entered in Box2", Toast.LENGTH_LONG).show();
        });
    }
}
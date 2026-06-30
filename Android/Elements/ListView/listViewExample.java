package com.example.practice;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        setContentView(R.layout.list_view_example);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String[] items = {"List Item 1", "List Item 2", "List Item 3", "List Item 4", "List Item 5"};
        
        ListView simpleListView = findViewById(R.id.SimpleListView);
        ArrayAdapter<String> simpleListAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        simpleListView.setAdapter(simpleListAdapter);
        simpleListView.setOnItemClickListener((parent, view, position, id) -> {
            String clickedItem = (String)parent.getItemAtPosition(position);
            Toast.makeText(MainActivity.this, "Simple List Item: " + clickedItem, Toast.LENGTH_SHORT).show();
        });

        ListView customListView = findViewById(R.id.CustomListView);
        ArrayAdapter<String> customListAdapter = new ArrayAdapter<>(this, R.layout.custom_list_item, R.id.itemTextView, items);
        customListView.setAdapter(customListAdapter);
        customListView.setOnItemClickListener((parent, view, position, id) -> {
            String clickedItem = (String)parent.getItemAtPosition(position);
            Toast.makeText(MainActivity.this, "Custom List Item: " + clickedItem, Toast.LENGTH_SHORT).show();
        });
    }
}
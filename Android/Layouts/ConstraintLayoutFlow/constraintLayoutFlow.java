package com.example.practice;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class constraintLayoutFlow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.constraint_layout_flow);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //import androidx.constraintlayout.helper.widget.Flow;  import statement for Constraint layout flow
        //Constraint layout flow can also use accessed and modified programmatically
        //Flow flow = findViewById(R.id.constraint_layout_flow);
        //flow.setReferencedIds(new int[]{R.id.textView1,R.id.textView2,R.id.textView3,R.id.textView4,R.id.textView5,R.id.textView6});
        //flow.setPadding(10);

	//Mostly Flow is declared and customised in XML so there is no need to modify it programmatically.
    }
}
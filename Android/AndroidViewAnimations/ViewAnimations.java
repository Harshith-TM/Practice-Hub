package com.example.practice;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ViewAnimations extends AppCompatActivity {

    ImageView imageView;
    Button blink,fade,move,rotate,zoom,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.view_animations);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imageView = findViewById(R.id.imageView);
        blink = findViewById(R.id.blink_animation);
        fade = findViewById(R.id.fade_animation);
        move = findViewById(R.id.move_animation);
        rotate = findViewById(R.id.rotate_animation);
        zoom = findViewById(R.id.zoom_animation);

        stop = findViewById(R.id.StopButton);
        stop.setOnClickListener(v -> {
            imageView.clearAnimation();
            Toast.makeText(this, "Animation Cleared", Toast.LENGTH_SHORT).show();
        });

        createAnimation("Blink Animation",blink,R.anim.blink_anim);
        createAnimation("Fade Animation",fade,R.anim.fade_anim);
        createAnimation("Move Animation",move,R.anim.move_anim);
        createAnimation("Rotate Animation",rotate,R.anim.rotate_anim);
        createAnimation("Zoom Animation",zoom,R.anim.zoom_anim);
    }

    private void createAnimation(String animationName,View view, int animId) {
        view.setOnClickListener(v->{
            Animation animation = AnimationUtils.loadAnimation(ViewAnimations.this,animId);
            imageView.startAnimation(animation);
            Toast.makeText(this, animationName, Toast.LENGTH_SHORT).show();
        });
    }
}
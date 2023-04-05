package com.example.ihoro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.ihoro.Controller.MainActivity;
import com.example.ihoro.R;

public class SplashActivity extends AppCompatActivity {

    private ImageView logoImageView;
    private TextView countdownTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Ánh xạ các view
        logoImageView = findViewById(R.id.logoImageView);

        // Áp dụng animation cho logo
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        logoImageView.startAnimation(animation);

        // Bắt đầu đếm ngược và chuyển sang MainActivity sau khi đếm ngược kết thúc
        new CountDownTimer(2000, 1000) {
            public void onTick(long millisUntilFinished) {

            }
            public void onFinish() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }.start();
    }
}
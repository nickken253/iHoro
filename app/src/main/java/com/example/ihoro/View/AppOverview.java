package com.example.ihoro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.ihoro.R;

public class AppOverview extends AppCompatActivity {
    private Button btn_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_overview);
        btn_close = (Button) findViewById(R.id.btn_close);
        btn_close.setOnClickListener(v -> {
            finish();
        });
    }
}
package com.example.ihoro.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.ihoro.R;

public class MainActivity extends AppCompatActivity {

    private Button btn_test;
    private Button btn_horoPerson;
    private Button btn_horoCouple;
    private Button btn_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        onClick();
    }
    public void onClick()
    {
        btn_test = (Button) findViewById(R.id.bt_run);
        btn_test.setOnClickListener(v -> {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, (CharSequence) "Clicked", Toast.LENGTH_SHORT);
            toast.show();
        });

        btn_horoPerson = (Button) findViewById(R.id.btn_horo_person);
        btn_horoPerson.setOnClickListener(v -> {
            Intent intent = new Intent(this, HoroPerson.class);
            startActivity(intent);
        });
    }
}
package com.example.ihoro.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.ihoro.Model.DataHoroscope;
import com.example.ihoro.R;

public class ShowResultCouple extends AppCompatActivity {
    private Button btn_close;
    private TextView tv_name;
    private TextView tv_gender;
    private TextView tv_birthday;
    private TextView tv_birthday_lunar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result_couple);

        DataHoroscope dataHoroscope = new DataHoroscope();

        btn_close = (Button) findViewById(R.id.btn_close);
        tv_name = (TextView) findViewById(R.id.tv_couple_info_name);
        tv_gender = (TextView) findViewById(R.id.tv_couple_info_gender);
        tv_birthday = (TextView) findViewById(R.id.tv_couple_info_birthday);
        tv_birthday_lunar = (TextView) findViewById(R.id.tv_couple_info_birthday_lunar);


        Intent intent = getIntent();

        String name = intent.getStringExtra("Name");
        Log.e("Name", name);
        tv_name.setText(name);

        String birthday = intent.getStringExtra("Birthday");
        Log.e("Birthday", birthday);
        tv_birthday.setText(birthday);

        onClick();
    }

    private void onClick()
    {
        btn_close.setOnClickListener(v -> {
            finish();
        });
    }
}
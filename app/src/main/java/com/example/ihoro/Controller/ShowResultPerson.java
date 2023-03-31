package com.example.ihoro.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.ihoro.Model.LunarCalendar;
import com.example.ihoro.R;

public class ShowResultPerson extends AppCompatActivity {

    private Button btn_close;
    private TextView tv_name;
    private TextView tv_gender;
    private TextView tv_birthday;
    private TextView tv_birthday_lunar;
//    private DataHoroscope dataHoroscope = new DataHoroscope();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result_person);


        LunarCalendar lunarCalendar = new LunarCalendar();
        btn_close = (Button) findViewById(R.id.btn_close);
        tv_name = (TextView) findViewById(R.id.tv_person_info_name);
        tv_gender = (TextView) findViewById(R.id.tv_person_info_gender);
        tv_birthday = (TextView) findViewById(R.id.tv_person_info_birthday);
        tv_birthday_lunar = (TextView) findViewById(R.id.tv_person_info_birthday_lunar);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        Log.e("Name", name);
        tv_name.setText("Tên: " + name);

        String gender = intent.getStringExtra("Gender");
        Log.e("Gender", gender);
        tv_gender.setText("Giới tính: " + gender);

        String birthday = intent.getStringExtra("Birthday");
        Log.e("Birthday", birthday);
        tv_birthday.setText("Ngày sinh: " + birthday);

        tv_birthday_lunar.setText("Âm lịch: " + lunarCalendar.Solar2Lunar(birthday));
        onClick();
    }

    private void onClick()
    {
        btn_close.setOnClickListener(v -> {
            finish();
        });
    }
}
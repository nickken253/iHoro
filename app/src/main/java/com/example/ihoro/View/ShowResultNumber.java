package com.example.ihoro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.ihoro.Model.Data.DataNumber;
import com.example.ihoro.R;

import java.util.List;

public class ShowResultNumber extends AppCompatActivity {

    private TextView tv_number_info_name;
    private TextView tv_number_info_birthday;
    private TextView tv_number_main;
    private TextView tv_number_main_info;
    private TextView tv_number_pros;
    private TextView tv_number_cons;
    private Button btn_close;
    private String name;
    private String birthday;
    private DataNumber dataNumber = new DataNumber();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result_number);

        btn_close = (Button) findViewById(R.id.btn_close);
        tv_number_info_name = (TextView) findViewById(R.id.tv_number_info_name);
        tv_number_info_birthday = (TextView) findViewById(R.id.tv_number_info_birthday);
        tv_number_main = (TextView) findViewById(R.id.tv_number_main);
        tv_number_main_info = (TextView) findViewById(R.id.tv_number_main_info);
        tv_number_pros = (TextView) findViewById(R.id.tv_number_pros);
        tv_number_cons = (TextView) findViewById(R.id.tv_number_cons);

        Intent intent = getIntent();
        name = intent.getStringExtra("Name");
        birthday = intent.getStringExtra("Birthday");
        int sum = calculate(birthday);
        List<String> main = dataNumber.getMainNumber();
        List<String> pros = dataNumber.getPros();
        List<String> cons = dataNumber.getCons();
        tv_number_info_name.setText("Tên: " + name);
        tv_number_info_birthday.setText("Ngày sinh: " + birthday);
        tv_number_main.setText("Số: " + sum);
        if(sum == 11) sum = 10;
        else if(sum == 22) sum = 11;
        tv_number_main_info.setText(main.get(sum));
        tv_number_pros.setText(pros.get(sum));
        tv_number_cons.setText(cons.get(sum));
        btn_close.setOnClickListener(v -> {
            finish();
        });
    }
    private int calculate(String date)
    {
        int sum = 0;
        for (int i = 0; i < date.length(); i++) {
            char c = date.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        while (sum != 11 && sum != 22 && sum >= 10) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        }
        return sum;
    }
}
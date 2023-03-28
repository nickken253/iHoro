package com.example.ihoro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ihoro.Controller.ConvertDuongToAmLich;
import com.example.ihoro.Model.DataHoroscope;
import com.example.ihoro.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ShowResultPerson extends AppCompatActivity {

    private Button btn_close;
    private TextView tv_name;
    private TextView tv_gender;
    private TextView tv_birthday;
    private TextView tv_birthday_lunar;
    private DataHoroscope dataHoroscope = new DataHoroscope();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result_person);



        ConvertDuongToAmLich amLich = new ConvertDuongToAmLich();
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

        int[] formatedDay = standardized(birthday);
        String lunarBirthday = FormatDate(amLich.convertSolar2Lunar(formatedDay[0], formatedDay[1], formatedDay[2], 7.0));
        tv_birthday_lunar.setText("Âm lịch: " + lunarBirthday);
        onClick();
    }

    private void onClick()
    {
        btn_close.setOnClickListener(v -> {
            finish();
        });
    }
    private int[] standardized(String birthday)
    {

        String[] dateParts = birthday.split("/");
        int[] dateInts = new int[dateParts.length];
        for (int i = 0; i < dateParts.length; i++) {
            dateInts[i] = Integer.parseInt(dateParts[i]);
        }
        return dateInts;
    }
    private String FormatDate(int[] birthday)
    {
        int solarYear = birthday[2];
        String dateString = birthday[0] + "/" + birthday[1] + "/";
        SimpleDateFormat inputFormat = new SimpleDateFormat("d/M/");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/");

        String formattedDate = "";
        String lunarYear = "";
        try {
            // Parse chuỗi ngày/tháng/năm vào đối tượng Date
            Date date = inputFormat.parse(dateString);

            // Chuyển đổi lại sang chuỗi theo định dạng mới
            formattedDate = outputFormat.format(date);

            List<String> can = dataHoroscope.getThienCan();
            List<String> chi = dataHoroscope.getDiaChi();
            lunarYear = can.get((solarYear - 3) % 10) + " " + chi.get((solarYear - 3) % 12);
            Log.e("Lunar Birthday", formattedDate + lunarYear);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formattedDate + lunarYear;
    }

}
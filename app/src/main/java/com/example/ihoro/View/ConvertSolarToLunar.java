package com.example.ihoro.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ihoro.Model.LunarCalendar;
import com.example.ihoro.R;

import java.util.Calendar;

public class ConvertSolarToLunar extends AppCompatActivity {

    private Button btn_input_solar;
    private Button btn_output_lunar;
    private Button btn_result;
    private TextView tv_warning;
    private Button btn_close;
    private DatePickerDialog.OnDateSetListener setDateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_solar_to_lunar);

        btn_close = (Button) findViewById(R.id.btn_close);
        btn_input_solar = (Button) findViewById(R.id.btn_input_solar);
        btn_output_lunar = (Button) findViewById(R.id.btn_output_lunar);
        btn_result = (Button) findViewById(R.id.btn_result);
        tv_warning = (TextView) findViewById(R.id.tv_warning);
        setDate();
        onClick();
    }
    private void onClick()
    {
        btn_input_solar.setOnClickListener(v -> {
            btn_input_solar.setBackground(ContextCompat.getDrawable(this, R.drawable.et_line));
            tv_warning.setVisibility(View.INVISIBLE);

            btn_input_solar.setShowSoftInputOnFocus(false);
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog dialog = new DatePickerDialog(this, android.R.style.Theme_DeviceDefault_Dialog, setDateListener, year, month, day);
            dialog.show();
        });
        btn_result.setOnClickListener(v -> {
            if(!checkFormInfo())
            {
                Toast.makeText(this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
            }
            else
            {
                LunarCalendar lunarCalendar = new LunarCalendar();
                btn_output_lunar.setText(lunarCalendar.Solar2Lunar(btn_input_solar.getText().toString()));
            }
        });
        btn_close.setOnClickListener(v -> {
            finish();
        });
    }
    public void setDate() {
        setDateListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;
                String formatDay = "" + day;
                String formatMonth = "" + month;
                if (day < 10) formatDay = "0" + day;
                if (month < 10) formatMonth = "0" + month;
                Log.e("DATE: ", formatDay + "/" + formatMonth + "/" + year);
                String date = formatDay + "/" + formatMonth + "/" + year;
                btn_input_solar.setText(date);
            }
        };
    }
    private boolean checkFormInfo() {
        boolean checked = true;
        if (TextUtils.isEmpty(btn_input_solar.getText())) {
            btn_input_solar.setBackground(ContextCompat.getDrawable(this, R.drawable.et_line_warning));
            tv_warning.setVisibility(View.VISIBLE);
            checked = false;
        }
        return checked;
    }
}
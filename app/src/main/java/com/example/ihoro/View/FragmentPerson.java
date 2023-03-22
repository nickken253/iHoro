package com.example.ihoro.View;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import com.example.ihoro.R;

import java.util.Calendar;

public class FragmentPerson extends Fragment {

    EditText etDate;
    EditText etTime;
    SwitchCompat sc_hasTime;
    DatePickerDialog.OnDateSetListener setDateListener;
    TimePickerDialog.OnTimeSetListener setTimeListener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person, container, false);

        etDate = (EditText) view.findViewById(R.id.et_birthday);
        etTime = (EditText) view.findViewById(R.id.et_time);
        sc_hasTime = (SwitchCompat) view.findViewById(R.id.sc_has_time);

        etDate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus) {
                    etDate.setShowSoftInputOnFocus(false);
                    Calendar calendar = Calendar.getInstance();
                    int year = calendar.get(Calendar.YEAR);
                    int month = calendar.get(Calendar.MONTH);
                    int day = calendar.get(Calendar.DAY_OF_MONTH);

                    DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_DeviceDefault_Dialog, setDateListener, year, month, day);
                    dialog.show();
                }
            }
        });
        sc_hasTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        etTime.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus) {
                    etDate.setShowSoftInputOnFocus(false);
                    Calendar calendar = Calendar.getInstance();
                    int hour = calendar.get(Calendar.HOUR);
                    int minute = calendar.get(Calendar.MINUTE);

                    TimePickerDialog dialog = new TimePickerDialog(getContext(), android.R.style.Theme_DeviceDefault_Dialog, setTimeListener, hour, minute, true);
                    dialog.show();
                }
            }
        });
//        share
        setDateListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;
                String formatDay = "" + day;
                String formatMonth = "" + month;
                if(day < 10) formatDay = "0" + day;
                if(month < 10) formatMonth = "0" + month;
                Log.e("DATE: ", formatDay + "/" + formatMonth + "/" + year);
                String date = formatDay + "/" + formatMonth + "/" + year;
                etDate.setText(date);
                etTime.clearFocus();
                etDate.setShowSoftInputOnFocus(true);
            }
        };
        setTimeListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hour, int minute) {
                String formatHour = "" + hour;
                String formatMinute = "" + minute;
                if(hour < 10) formatHour = "0" + hour;
                if(minute < 10) formatMinute = "0" + minute;
                Log.e("DATE: ", formatHour + ":" + formatMinute);
                String date = formatHour + ":" + formatMinute;
                etTime.setText(date);
                etTime.clearFocus();
                etTime.setShowSoftInputOnFocus(true);
            }
        };
        return view;
    }
}

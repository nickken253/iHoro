package com.example.ihoro.View;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import com.example.ihoro.R;

import java.util.Calendar;

public class FragmentPerson extends Fragment {

    private Button btn_Date;
    private Button btn_Time;
    private EditText et_Name;
    private Button btn_Gender;
    private Button btn_showResult;
    private DatePickerDialog.OnDateSetListener setDateListener;
    private TimePickerDialog.OnTimeSetListener setTimeListener;
    private String gender = "";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person, container, false);


        btn_Date = (Button) view.findViewById(R.id.btn_birthday);
        btn_Time = (Button) view.findViewById(R.id.btn_time);
        et_Name = (EditText) view.findViewById(R.id.et_name);
        btn_Gender = (Button) view.findViewById(R.id.btn_gender);
        btn_showResult = (Button) view.findViewById(R.id.btn_result_person);

//        Spinner genderSpinner = (Spinner) view.findViewById(R.id.btn_gender);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.gender_array, R.layout.my_spinner);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        genderSpinner.setAdapter(adapter);
//        genderSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if(position == 0) { // nếu chọn hint
//                    genderSpinner.setSelection(-1); // gỡ bỏ hint
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
        setDate();
        onClick();
        return view;
    }
    public void onClick()
    {

        btn_showResult.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ShowResultPerson.class);
            intent.putExtra("Name", et_Name.getText().toString());
            intent.putExtra("Gender", btn_Gender.getText().toString());
            intent.putExtra("Birthday", btn_Date.getText().toString());
            startActivity(intent);
        });
        btn_Time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_Date.setShowSoftInputOnFocus(false);
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR);
                int minute = calendar.get(Calendar.MINUTE);

                TimePickerDialog dialog = new TimePickerDialog(getContext(), android.R.style.Theme_DeviceDefault_Dialog, setTimeListener, hour, minute, true);
                dialog.show();
            }
        });
        btn_Date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_Date.setShowSoftInputOnFocus(false);
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_DeviceDefault_Dialog, setDateListener, year, month, day);
                dialog.show();
            }
        });
        btn_Gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showGenderDialog();
            }
        });
    }
    public void setDate()
    {
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
                btn_Date.setText(date);
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
                btn_Time.setText(date);
                btn_Time.clearFocus();
                btn_Time.setShowSoftInputOnFocus(true);
            }
        };

    }
    public void showGenderDialog() {
        final CharSequence[] items = {"Nam", "Nữ"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Chọn Giới Tính");
        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                gender = items[item].toString();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                if (TextUtils.isEmpty(gender)) {
                    gender = "Nam";
                }
                // Thực hiện xử lý khi người dùng chọn giới tính
                Toast.makeText(getActivity(), "Bạn đã chọn " + gender, Toast.LENGTH_SHORT).show();
                btn_Gender.setText(gender.toLowerCase());
            }
        });

        builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}

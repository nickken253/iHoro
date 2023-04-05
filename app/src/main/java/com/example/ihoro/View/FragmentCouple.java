package com.example.ihoro.View;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.ihoro.R;

import java.util.Calendar;

public class FragmentCouple extends Fragment {
    private EditText et_couple_name_hus;
    private EditText et_couple_name_wif;
    private Button btn_couple_birthday_hus;
    private Button btn_couple_birthday_wif;
    private Button btn_couple_result_person;
    private TextView tv_couple_warning_name_hus;
    private TextView tv_couple_warning_date_hus;
    private TextView tv_couple_warning_name_wif;
    private TextView tv_couple_warning_date_wif;

    private DatePickerDialog.OnDateSetListener setDateListener1;
    private DatePickerDialog.OnDateSetListener setDateListener2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_couple, container, false);
        et_couple_name_hus = (EditText) view.findViewById(R.id.et_couple_name_hus);
        et_couple_name_wif = (EditText) view.findViewById(R.id.et_couple_name_wif);
        btn_couple_birthday_hus = (Button) view.findViewById(R.id.btn_couple_birthday_hus );
        btn_couple_birthday_wif = (Button) view.findViewById(R.id.btn_couple_birthday_wif);
        btn_couple_result_person = (Button) view.findViewById(R.id.btn_couple_result_person);
        tv_couple_warning_name_hus = (TextView) view.findViewById(R.id.tv_couple_warning_name_hus);
        tv_couple_warning_date_hus = (TextView) view.findViewById(R.id.tv_couple_warning_date_hus);
        tv_couple_warning_name_wif = (TextView) view.findViewById(R.id.tv_couple_warning_name_wif);
        tv_couple_warning_date_wif = (TextView) view.findViewById(R.id.tv_couple_warning_date_wif);
        onClick();
        setDate();
        return view;
    }
    private void onClick()
    {
        btn_couple_result_person.setOnClickListener(v -> {
            if(!checkFormInfo())
            {
                Toast.makeText(getActivity(), "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent intent = new Intent(getActivity(), ShowResultCouple.class);
                intent.putExtra("HusName", et_couple_name_hus.getText().toString());
                intent.putExtra("WifName", et_couple_name_wif.getText().toString());
                intent.putExtra("HusDate",btn_couple_birthday_hus.getText().toString());
                intent.putExtra("WifDate",btn_couple_birthday_wif.getText().toString());
                startActivity(intent);
            }
        });
        btn_couple_birthday_hus.setOnClickListener(v -> {
            et_couple_name_hus.clearFocus();
            btn_couple_birthday_hus.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line));
            tv_couple_warning_date_hus.setVisibility(View.INVISIBLE);

            btn_couple_birthday_hus.setShowSoftInputOnFocus(false);
            Calendar calendar_hus = Calendar.getInstance();
            int year1 = calendar_hus.get(Calendar.YEAR);
            int month1 = calendar_hus.get(Calendar.MONTH);
            int day1 = calendar_hus.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog1 = new DatePickerDialog(getContext(), android.R.style.Theme_DeviceDefault_Dialog, setDateListener1, year1, month1, day1);
            dialog1.show();
        });
        btn_couple_birthday_wif.setOnClickListener(v -> {
            et_couple_name_wif.clearFocus();
            btn_couple_birthday_wif.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line));
            tv_couple_warning_date_wif.setVisibility(View.INVISIBLE);

            btn_couple_birthday_wif.setShowSoftInputOnFocus(false);
            Calendar calendar_wif = Calendar.getInstance();
            int year2 = calendar_wif.get(Calendar.YEAR);
            int month2 = calendar_wif.get(Calendar.MONTH);
            int day2 = calendar_wif.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog2 = new DatePickerDialog(getContext(), android.R.style.Theme_DeviceDefault_Dialog, setDateListener2, year2, month2, day2);
            dialog2.show();
        });
        et_couple_name_hus.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                et_couple_name_hus.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line));
                tv_couple_warning_name_hus.setVisibility(View.INVISIBLE);
            }
        });
        et_couple_name_wif.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                et_couple_name_wif.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line));
                tv_couple_warning_name_wif.setVisibility(View.INVISIBLE);
            }
        });
    }
    private boolean checkFormInfo() {
        boolean checked = true;
        if (TextUtils.isEmpty(et_couple_name_hus.getText())) {
            et_couple_name_hus.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line_warning));
            tv_couple_warning_name_hus.setVisibility(View.VISIBLE);
            checked = false;
        }
        if (TextUtils.isEmpty(et_couple_name_wif.getText())) {
            et_couple_name_wif.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line_warning));
            tv_couple_warning_name_wif.setVisibility(View.VISIBLE);
            checked = false;
        }
        if (TextUtils.isEmpty(btn_couple_birthday_hus.getText())) {
            btn_couple_birthday_hus.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line_warning));
            tv_couple_warning_date_hus.setVisibility(View.VISIBLE);
            checked = false;
        }
        if (TextUtils.isEmpty(btn_couple_birthday_wif.getText())) {
            btn_couple_birthday_wif.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line_warning));
            tv_couple_warning_date_wif.setVisibility(View.VISIBLE);
            checked = false;
        }
        return checked;
    }
    public void setDate() {
        setDateListener1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;
                String formatDay = "" + day;
                String formatMonth = "" + month;
                if (day < 10) formatDay = "0" + day;
                if (month < 10) formatMonth = "0" + month;
                Log.e("DATE: ", formatDay + "/" + formatMonth + "/" + year);
                String date = formatDay + "/" + formatMonth + "/" + year;
                btn_couple_birthday_hus.setText(date);
            }
        };
        setDateListener2 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;
                String formatDay = "" + day;
                String formatMonth = "" + month;
                if (day < 10) formatDay = "0" + day;
                if (month < 10) formatMonth = "0" + month;
                Log.e("DATE: ", formatDay + "/" + formatMonth + "/" + year);
                String date = formatDay + "/" + formatMonth + "/" + year;
                btn_couple_birthday_wif.setText(date);
            }
        };
    }
}

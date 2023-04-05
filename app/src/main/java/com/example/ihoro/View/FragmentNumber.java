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

public class FragmentNumber extends Fragment {

    private EditText et_number_name;
    private TextView tv_warning_number_name;
    private Button btn_number_birthday;
    private TextView tv_warning_number_date;
    private Button btn_result_number;
    private DatePickerDialog.OnDateSetListener setDateListener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_number, container, false);
        et_number_name = (EditText) view.findViewById(R.id.et_number_name);
        tv_warning_number_name = (TextView) view.findViewById(R.id.tv_warning_number_name);
        btn_number_birthday = (Button) view.findViewById(R.id.btn_number_birthday);
        tv_warning_number_date = (TextView) view.findViewById(R.id.tv_warning_number_date);
        btn_result_number = (Button) view.findViewById(R.id.btn_result_number);

        setDate();
        onClick();
        return view;
    }
    private void onClick()
    {
        et_number_name.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                et_number_name.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line));
                tv_warning_number_name.setVisibility(View.INVISIBLE);
            }
        });
        btn_result_number.setOnClickListener(v -> {
            et_number_name.clearFocus();
            if (!checkFormInfo()) {
                Toast.makeText(getActivity(), "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(getActivity(), ShowResultNumber.class);
                intent.putExtra("Name", et_number_name.getText().toString());
                intent.putExtra("Birthday", btn_number_birthday.getText().toString());
                startActivity(intent);
            }

        });
        btn_number_birthday.setOnClickListener(v -> {
            et_number_name.clearFocus();
            btn_number_birthday.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line));
            tv_warning_number_name.setVisibility(View.INVISIBLE);

            btn_number_birthday.setShowSoftInputOnFocus(false);
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_DeviceDefault_Dialog, setDateListener, year, month, day);
            dialog.show();
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
                btn_number_birthday.setText(date);
            }
        };
    }
    private boolean checkFormInfo(){
        boolean checked = true;
        if (TextUtils.isEmpty(et_number_name.getText())) {
            et_number_name.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line_warning));
            tv_warning_number_name.setVisibility(View.VISIBLE);
            checked = false;
        }
        if (TextUtils.isEmpty(btn_number_birthday.getText())) {
            btn_number_birthday.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.et_line_warning));
            tv_warning_number_date.setVisibility(View.VISIBLE);
            checked = false;
        }
        return checked;
    }
}

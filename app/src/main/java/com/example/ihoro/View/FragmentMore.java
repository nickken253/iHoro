package com.example.ihoro.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ihoro.R;

public class FragmentMore extends Fragment {

    private Button btn_more_info;
    private Button btn_convert;
    private Button btn_chatGPT;
    private Button btn_app_info;
    private Button btn_map;
    private Button btn_link;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        btn_more_info = (Button) view.findViewById(R.id.btn_more_info);
        btn_convert = (Button) view.findViewById(R.id.btn_convert);
        btn_chatGPT = (Button) view.findViewById(R.id.btn_chatGPT);
        btn_app_info = (Button) view.findViewById(R.id.btn_app_info);
        btn_map = (Button) view.findViewById(R.id.btn_map );
        btn_link = (Button) view.findViewById(R.id.btn_link);

        onClick();
        return view;
    }
    public void onClick()
    {
        btn_more_info.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), HoroscopeOverview.class);
            startActivity(intent);
//            Toast.makeText(getActivity(), "Chức năng đang cập nhật", Toast.LENGTH_SHORT).show();
        });
        btn_app_info.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AppOverview.class);
            startActivity(intent);
//            Toast.makeText(getActivity(), "Chức năng đang cập nhật", Toast.LENGTH_SHORT).show();
        });
        btn_chatGPT.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ChatGPT.class);
            startActivity(intent);
//            Toast.makeText(getActivity(), "Chức năng đang cập nhật", Toast.LENGTH_SHORT).show();
        });
        btn_convert.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ConvertSolarToLunar.class);
            startActivity(intent);
//            Toast.makeText(getActivity(), "Chức năng đang cập nhật", Toast.LENGTH_SHORT).show();
        });
        btn_link.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Chức năng đang cập nhật", Toast.LENGTH_SHORT).show();
        });
        btn_map.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Chức năng đang cập nhật", Toast.LENGTH_SHORT).show();
        });
    }
}

package com.example.ihoro.View;

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

    private Button btn_info;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        btn_info = (Button) view.findViewById(R.id.btn_more_info);
        onClick();
        return view;
    }
    public void onClick()
    {
        btn_info.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Chức năng đang cập nhật", Toast.LENGTH_SHORT).show();
        });
    }
}

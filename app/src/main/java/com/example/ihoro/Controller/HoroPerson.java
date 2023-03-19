package com.example.ihoro.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.ihoro.R;
import com.example.ihoro.View.FragmentPersonHistory;
import com.example.ihoro.View.FragmentPersonInfor;
import com.example.ihoro.View.FragmentPersonView;

public class HoroPerson extends AppCompatActivity {

    private final int ID_VIEW = 2;
    private final int ID_SAVED = 1;
    private final int ID_INFOR = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horo_person);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        MeowBottomNavigation bottomNavigation = findViewById(R.id.meowNavigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_SAVED, R.drawable.outline_save_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_VIEW, R.drawable.baseline_search_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_INFOR, R.drawable.baseline_library_books_24));

        getSupportFragmentManager().beginTransaction().replace(R.id.horo_person_fragment_container, new FragmentPersonView()).commit();
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Fragment selectedFragment = null;
                switch (item.getId())
                {
                    case ID_VIEW: selectedFragment = new FragmentPersonView();
                        break;

                    case ID_SAVED: selectedFragment = new FragmentPersonHistory();
                        break;

                    case ID_INFOR: selectedFragment = new FragmentPersonInfor();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.horo_person_fragment_container, selectedFragment).commit();
            }
        });
        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                // CODE
            }
        });
        bottomNavigation.setOnShowListener((new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                String name;
                switch (item.getId())
                {
                    case ID_VIEW: name = "View";
                    break;

                    case ID_SAVED: name = "Saved";
                    break;

                    case ID_INFOR: name = "Infor";
                    break;
                    default: name = "";
                }
            }
        }));

        bottomNavigation.setCount(ID_SAVED, "");
        bottomNavigation.show(ID_VIEW, true);
    }
}
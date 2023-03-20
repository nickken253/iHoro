package com.example.ihoro.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.WindowManager;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.ihoro.R;
import com.example.ihoro.View.FragmentSaved;
import com.example.ihoro.View.FragmentInfor;
import com.example.ihoro.View.FragmentPerson;

public class HoroPerson extends AppCompatActivity {


    private final int ID_PERSON = 1;
    private final int ID_COUPLE = 2;
    private final int ID_NUMBER = 3;
    private final int ID_SAVED = 4;
    private final int ID_INFOR = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horo_person);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        MeowBottomNavigation bottomNavigation = findViewById(R.id.meowNavigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_PERSON, R.drawable.baseline_person_outline_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_COUPLE, R.drawable.outline_couple_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_NUMBER, R.drawable.outline_shape_line_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_SAVED, R.drawable.outline_save_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_INFOR, R.drawable.baseline_library_books_24));

        getSupportFragmentManager().beginTransaction().replace(R.id.horo_person_fragment_container, new FragmentPerson()).commit();
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Fragment selectedFragment = null;
                switch (item.getId())
                {
                    case ID_PERSON:
                        break;
                    case ID_COUPLE: selectedFragment = new FragmentPerson();
                        break;

                    case ID_NUMBER: selectedFragment = new FragmentSaved();
                        break;

                    case ID_SAVED: selectedFragment = new FragmentInfor();
                        break;
                    case ID_INFOR:
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
                    case ID_COUPLE: name = "View";
                    break;

                    case ID_PERSON: name = "Saved";
                    break;

                    case ID_NUMBER: name = "Infor";
                    break;
                    default: name = "";
                }
            }
        }));

        bottomNavigation.setCount(ID_PERSON, "");
        bottomNavigation.show(ID_COUPLE, true);
    }
}
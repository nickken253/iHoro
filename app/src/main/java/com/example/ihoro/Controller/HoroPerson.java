package com.example.ihoro.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.ihoro.R;
import com.example.ihoro.View.FragmentCouple;
import com.example.ihoro.View.FragmentNumber;
import com.example.ihoro.View.FragmentSaved;
import com.example.ihoro.View.FragmentInfor;
import com.example.ihoro.View.FragmentPerson;

public class HoroPerson extends AppCompatActivity {


    private final int ID_PERSON = 1;
    private final int ID_COUPLE = 2;
    private final int ID_NUMBER = 3;
    private final int ID_SAVED = 4;
    private final int ID_INFOR = 5;
    private Fragment selectedFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horo_person);

        // Nav Drawer
//        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        findViewById(R.id.image_menu).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                drawerLayout.openDrawer(GravityCompat.START);
//            }
//        });

        // Bottom Nav
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        MeowBottomNavigation bottomNavigation = findViewById(R.id.meowNavigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_SAVED, R.drawable.outline_save_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_COUPLE, R.drawable.outline_couple_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_PERSON, R.drawable.baseline_person_outline_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_NUMBER, R.drawable.outline_shape_line_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_INFOR, R.drawable.baseline_library_books_24));

        selectedFragment = new FragmentPerson();
        getSupportFragmentManager().beginTransaction().replace(R.id.horo_person_fragment_container, selectedFragment).commit();
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                switch (item.getId())
                {
                    case ID_PERSON: selectedFragment = new FragmentPerson();
                        break;
                    case ID_COUPLE: selectedFragment = new FragmentCouple();
                        break;

                    case ID_NUMBER: selectedFragment = new FragmentNumber();
                        break;

                    case ID_SAVED: selectedFragment = new FragmentSaved();
                        break;
                    case ID_INFOR: selectedFragment = new FragmentInfor();
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
                // CODE
            }
        }));

        bottomNavigation.setCount(ID_SAVED, "");
        bottomNavigation.show(ID_PERSON, true);
    }
}
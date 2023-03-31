package com.example.ihoro.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.ihoro.Model.MyPagerAdapter;
import com.example.ihoro.R;
import com.example.ihoro.View.FragmentCouple;
import com.example.ihoro.View.FragmentMore;
import com.example.ihoro.View.FragmentNumber;
import com.example.ihoro.View.FragmentSaved;
import com.example.ihoro.View.FragmentInfor;
import com.example.ihoro.View.FragmentPerson;

import java.util.ArrayList;
import java.util.List;

public class HoroPerson extends AppCompatActivity {


    private final int ID_PERSON = 3;
    private final int ID_COUPLE = 2;
    private final int ID_NUMBER = 4;
    private final int ID_SAVED = 1;
    private final int ID_INFOR = 5;
    private Fragment selectedFragment;
    private final List<Fragment> fragments = new ArrayList<>();
//    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horo_person);

        MeowBottomNavigation bottomNavigation = findViewById(R.id.meowNavigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_SAVED, R.drawable.outline_save_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_COUPLE, R.drawable.outline_couple_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_PERSON, R.drawable.baseline_person_outline_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_NUMBER, R.drawable.outline_shape_line_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_INFOR, R.drawable.baseline_library_books_24));

        ViewPager viewPager = findViewById(R.id.vp_fragment);
        fragments.add(new FragmentSaved());
        fragments.add(new FragmentCouple());
        fragments.add(new FragmentPerson());
        fragments.add(new FragmentNumber());
        fragments.add(new FragmentMore());
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(2);
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                switch (item.getId()) {
                    case ID_PERSON: {
                        selectedFragment = new FragmentPerson();
                        viewPager.setCurrentItem(2);
                        break;
                    }
                    case ID_COUPLE: {
                        selectedFragment = new FragmentCouple();
                        viewPager.setCurrentItem(1);
                        break;
                    }
                    case ID_NUMBER: {
                        selectedFragment = new FragmentNumber();
                        viewPager.setCurrentItem(3);
                        break;
                    }
                    case ID_SAVED: {
                        selectedFragment = new FragmentSaved();
                        viewPager.setCurrentItem(0);
                        break;
                    }
                    case ID_INFOR: {
                        selectedFragment = new FragmentMore();
                        viewPager.setCurrentItem(4);
                        break;
                    }
                }
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
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {
                bottomNavigation.show(position + 1, true);
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
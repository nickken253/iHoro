package com.example.ihoro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.ihoro.Model.Data.Advices;
import com.example.ihoro.Model.Data.DataHoroscopeCouple;
import com.example.ihoro.Model.LunarCalendar;
import com.example.ihoro.R;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class ShowResultCouple extends AppCompatActivity {
    private Button btn_close;
    private TextView tv_couple_info_name_hus;
    private TextView tv_couple_info_birthday_hus;
    private TextView tv_couple_info_fate_hus;
    private TextView tv_couple_info_lunar_birthday_hus;
    private TextView tv_couple_info_name_wif;
    private TextView tv_couple_info_birthday_wif;
    private TextView tv_couple_info_fate_wif;
    private TextView tv_couple_info_lunar_birthday_wif;
    private TextView tv_couple_info_fate;
    private TextView tv_couple_info_fate_subhead;
    private TextView tv_couple_info_can_chi;
    private TextView tv_couple_info_can_chi_conclude;
    private TextView tv_couple_advice;
    private String namAmLichChong;
    private String namAmLichVo;
    private String cungChong;
    private String cungVo;
    private String husCan;
    private String wifChi;
    private DataHoroscopeCouple dataHoroscopeCouple = new DataHoroscopeCouple();
    private LunarCalendar lunarCalendar = new LunarCalendar();
    private Advices advices = new Advices();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result_couple);

        btn_close = (Button) findViewById(R.id.btn_close);
        tv_couple_info_name_hus = (TextView) findViewById(R.id.tv_couple_info_name_hus);
        tv_couple_info_birthday_hus = (TextView) findViewById(R.id.tv_couple_info_birthday_hus);
        tv_couple_info_fate_hus = (TextView) findViewById(R.id.tv_couple_info_fate_hus);
        tv_couple_info_lunar_birthday_hus = (TextView) findViewById(R.id.tv_couple_info_lunar_birthday_hus);
        tv_couple_info_name_wif = (TextView) findViewById(R.id.tv_couple_info_name_wif);
        tv_couple_info_birthday_wif = (TextView) findViewById(R.id.tv_couple_info_birthday_wif);
        tv_couple_info_fate_wif = (TextView) findViewById(R.id.tv_couple_info_fate_wif);
        tv_couple_info_lunar_birthday_wif = (TextView) findViewById(R.id.tv_couple_info_lunar_birthday_wif);
        tv_couple_info_fate = (TextView) findViewById(R.id.tv_couple_info_fate);
        tv_couple_info_fate_subhead = (TextView) findViewById(R.id.tv_couple_info_fate_subhead);
        tv_couple_info_can_chi = (TextView) findViewById(R.id.tv_couple_info_can_chi);
        tv_couple_info_can_chi_conclude = (TextView) findViewById(R.id.tv_couple_info_can_chi_conclude);
        tv_couple_advice = (TextView) findViewById(R.id.tv_couple_advice);


        resultInfo();
        resultFate();
        resultCanChi();
        resultAdvice();
        onClick();
    }
    private void resultInfo()
    {
        Intent intent = getIntent();
        List<String[]> namTuoi60 = dataHoroscopeCouple.getTuoiAm60();
        List<String[]> menh60 = dataHoroscopeCouple.getMenh60();

        String hus_name = intent.getStringExtra("HusName");
        Log.e("HusName", hus_name);
        tv_couple_info_name_hus.setText("Tên chồng: " + hus_name);

        String hus_birthday = intent.getStringExtra("HusDate");
        Log.e("HusDate", hus_birthday);
        tv_couple_info_birthday_hus.setText("Ngày sinh dương: " + hus_birthday);
        String hus_lunarBirthday = lunarCalendar.Solar2Lunar(hus_birthday);
        tv_couple_info_lunar_birthday_hus.setText("Ngày sinh âm: " + hus_lunarBirthday);
        namAmLichChong = lunarCalendar.convertToChi(hus_birthday);
        for(int i = 0; i < namTuoi60.get(0).length;i++)
        {
            if(Objects.equals(lunarCalendar.convertToCanChi(hus_birthday), namTuoi60.get(0)[i]))
            {
                cungChong = menh60.get(0)[i];
                break;
            }
        }
        tv_couple_info_fate_hus.setText("Cung: " + cungChong);

        String wif_name = intent.getStringExtra("WifName");
        Log.e("WifName", wif_name);
        tv_couple_info_name_wif.setText("Tên vợ: " + wif_name);

        String wif_birthday = intent.getStringExtra("WifDate");
        Log.e("WifDate", wif_birthday);

        tv_couple_info_birthday_wif.setText("Ngày sinh dương: " + wif_birthday);
        String wif_lunarBirthday = lunarCalendar.Solar2Lunar(wif_birthday);

        tv_couple_info_lunar_birthday_wif.setText("Ngày sinh âm: " + wif_lunarBirthday);
        namAmLichVo = lunarCalendar.convertToChi(wif_birthday);

        for(int i = 0; i < namTuoi60.get(0).length; i++)
        {
            if(Objects.equals(lunarCalendar.convertToCanChi(wif_birthday), namTuoi60.get(0)[i]))
            {
                cungVo = menh60.get(0)[i];
                break;
            }
        }
        tv_couple_info_fate_wif.setText("Cung: " + cungVo);
    }
    private void resultFate()
    {
        List<String[]> batQueCungMenh = dataHoroscopeCouple.getBatQueCungMenh();
        List<String> batQue = dataHoroscopeCouple.getBatQue();
        int pos = 0;
        String cungMenh = "";
        for(int i = 0; i < batQue.size(); i++)
        {
            if(Objects.equals(cungVo, batQue.get(i)))
            {
                pos = i;
                break;
            }
        }
        Log.e("Cung Chồng", "" + pos);
        for(int i = 0; i < batQue.size();i++)
        {
            if(Objects.equals(cungChong, batQue.get(i)))
            {
                cungMenh = batQueCungMenh.get(i)[pos];
                break;
            }
        }
        Log.e("Mệnh", cungMenh);
        tv_couple_info_fate_subhead.setText("Chồng cung " + cungChong + " lấy vợ cung " + cungVo + ":");
        tv_couple_info_fate.setText("\"" + cungMenh + "\"");
    }
    private void resultCanChi()
    {
        Intent intent = getIntent();
        String canChi = "";
        String canChiConlucde = "";
        List<String[]> canChiChu = dataHoroscopeCouple.getThienCanDiaChiChu();
        List<String[]> canChiLuan = dataHoroscopeCouple.getThienCanDiaChiLuan();
        List<String> Can = dataHoroscopeCouple.getThienCan();
        List<String> Chi = dataHoroscopeCouple.getDiaChi();
        String canChong = lunarCalendar.convertToCan(intent.getStringExtra("HusDate"));
        String chiVo = lunarCalendar.convertToChi(intent.getStringExtra("WifDate"));
        for(int i = 0; i < Can.size(); i++)
        {
            if(Objects.equals(canChong, Can.get(i)))
            {
                for(int j = 0; j < Chi.size(); j++)
                {
                    if(Objects.equals(chiVo, Chi.get(j)))
                    {
                        canChi = canChiChu.get(i)[j];
                        canChiConlucde = canChiLuan.get(i)[j];
                    }
                }
            }
        }
        tv_couple_info_can_chi.setText("\"" + canChi + "\"");
        tv_couple_info_can_chi_conclude.setText("=> " + canChiConlucde);
    }
    private void resultAdvice()
    {
        List<String> loiKhuyen = advices.getLoiKhuyen();
        Random random = new Random();
        int randomNumber = random.nextInt(loiKhuyen.size() - 1);
        String khuyen = "- " + loiKhuyen.get(randomNumber);
        tv_couple_advice.setText(khuyen);
    }
    private void onClick()
    {
        btn_close.setOnClickListener(v -> {
            finish();
        });
    }
}
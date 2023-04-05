package com.example.ihoro.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ihoro.Model.Data.Advices;
import com.example.ihoro.Model.AppDatabase;
import com.example.ihoro.Model.Data.DataHoroscope;
import com.example.ihoro.Model.LunarCalendar;
import com.example.ihoro.Model.Person;
import com.example.ihoro.Model.Adapter.PersonAdapter;
import com.example.ihoro.R;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class ShowResultPerson extends AppCompatActivity {

    private int day;
    private int month;
    private int year;
    private int gioiTinh;
    private boolean isSaved;
    private String namAmLich;
    private String thienCan;
    private String menhNguHanh;
    private Button btn_close;
    private Button btn_saved;
    private Button btn_unsaved;
    private TextView tv_name;
    private TextView tv_gender;
    private TextView tv_birthday;
    private TextView tv_birthday_lunar;
    private TextView tv_fate;
    private TextView tv_person_hour;
    private TextView tv_person_hour_info;
    private TextView tv_person_day_info;
    private TextView tv_person_month_info;

    private TextView tv_person_fate_star_info;
    private TextView tv_person_fate_star;
    private TextView tv_person_fate_star_conclude;
    private TextView tv_person_bone_info;
    private TextView tv_person_advice;
    private DataHoroscope dataHoroscope = new DataHoroscope();
    private Advices advices = new Advices();
    private String gender;
    private String name;
    private String birthday;
    private String time;
    private AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result_person);

        btn_close = (Button) findViewById(R.id.btn_close);
        btn_saved = (Button) findViewById(R.id.btn_saved);
        btn_unsaved = (Button) findViewById(R.id.btn_unsaved);

        tv_name = (TextView) findViewById(R.id.tv_person_info_name);
        tv_gender = (TextView) findViewById(R.id.tv_person_info_gender);
        tv_birthday = (TextView) findViewById(R.id.tv_person_info_birthday);
        tv_birthday_lunar = (TextView) findViewById(R.id.tv_person_info_birthday_lunar);
        tv_fate = (TextView) findViewById(R.id.tv_person_info_fate);
        resultInfo();

        tv_person_hour = (TextView) findViewById(R.id.tv_person_hour);
        tv_person_hour_info = (TextView) findViewById(R.id.tv_person_hour_info);
        resultHour();

        tv_person_day_info = (TextView) findViewById(R.id.tv_person_day_info);
        resultDay();

        tv_person_month_info = (TextView) findViewById(R.id.tv_person_month_info);
        resultMonth();

        tv_person_fate_star_info = (TextView) findViewById(R.id.tv_person_fate_star_info);
        tv_person_fate_star = (TextView) findViewById(R.id.tv_person_fate_star);
        tv_person_fate_star_conclude = (TextView) findViewById(R.id.tv_person_fate_star_conclude);
        resultFateStar();

        tv_person_bone_info = (TextView) findViewById(R.id.tv_person_bone_info);
        resultBone();

        tv_person_advice = (TextView) findViewById(R.id.tv_person_advice);
        resultAdvice();

        database = Room.databaseBuilder(this, AppDatabase.class, "mydb")
                .allowMainThreadQueries()
                .build();
        onClick();
    }

    private void resultInfo() {
        LunarCalendar lunarCalendar = new LunarCalendar();
        Intent intent = getIntent();
        isSaved = intent.getBooleanExtra("Saved", false);
        if(isSaved)
        {
            btn_saved.setVisibility(View.VISIBLE);
            btn_unsaved.setVisibility(View.INVISIBLE);
        }
        else
        {
            btn_unsaved.setVisibility(View.VISIBLE);
            btn_saved.setVisibility(View.INVISIBLE);
        }
        name = intent.getStringExtra("Name");
        Log.e("Name", name);
        tv_name.setText("Tên: " + name);

        gender = intent.getStringExtra("Gender");
        Log.e("Gender", gender);
        if (Objects.equals(gender, "nam") || Objects.equals(gender, "Nam")) {
            gender = "Nam";
            gioiTinh = 1;
        } else {
            gender = "Nữ";
            gioiTinh = 2;
        }
        tv_gender.setText("Giới tính: " + gender);

        birthday = intent.getStringExtra("Birthday");
        Log.e("Birthday", birthday);
        tv_birthday.setText("Ngày sinh: " + birthday);

        tv_birthday_lunar.setText("Âm lịch: " + lunarCalendar.Solar2Lunar(birthday));
        menhNguHanh = lunarCalendar.Menh(birthday);
        tv_fate.setText("Mệnh: " + menhNguHanh);

        thienCan = lunarCalendar.convertToCan(birthday);
        namAmLich = lunarCalendar.convertToChi(birthday);
        day = lunarCalendar.Solar2LunarRawNoTextOutput(birthday)[0];
        month = lunarCalendar.Solar2LunarRawNoTextOutput(birthday)[1];
        year = lunarCalendar.Solar2LunarRawNoTextOutput(birthday)[2];
    }

    private void resultHour() {
        Intent intent = getIntent();
        time = intent.getStringExtra("Time");
        if (Objects.equals(time, "") || time == null) {
            tv_person_hour.setText("/Bạn đã không nhập giờ sinh/");
            tv_person_hour_info.setVisibility(View.GONE);
        } else {
            LunarCalendar lunarCalendar = new LunarCalendar();
            List<Map.Entry<Integer, Integer>> listTime = dataHoroscope.getListStartHour();
            int hour = listTime.get(month - 1).getKey();
            int minute = listTime.get(month - 1).getValue();

            Log.e("Giờ sinh trong Data", hour + ":" + minute);
            int m_hour = lunarCalendar.standardizedTime(time)[0];
            int m_minute = lunarCalendar.standardizedTime(time)[1];
            String gioSinh = "";
            int cnt = 0;
            int startHour = hour;
            int endHour = hour + 2;
            while (true) {
                int startMinute = startHour * 60 + minute;
                int endMinute = endHour * 60 + minute - 1;
                int myMinute = m_hour * 60 + m_minute;
                if (myMinute >= startMinute && myMinute <= endMinute || myMinute + 1440 >= startMinute && myMinute + 1440 <= endMinute) {
                    gioSinh = dataHoroscope.getGioSinh().get(cnt);
                    Log.e("Giờ sinh", time + " => " + gioSinh);
                    break;
                }
                startHour = (startHour + 2) % 24;
                endHour = startHour + 2;
                cnt++;
                cnt %= 12;
            }
            tv_person_hour.setText("Giờ sinh: " + time + " ~ giờ " + gioSinh);
            tv_person_hour_info.setVisibility(View.VISIBLE);
            String gioSinhChiTiet = "";
            if (cnt == 0) cnt = 12;

            // Đổi kiểu 1
            {
                List<int[]> gioTheoThang = dataHoroscope.getGioTheoThangSo();
                List<String[]> gioTheoThangChu = dataHoroscope.getGioTheoThangChu();
                for (int i = 0; i < gioTheoThang.get(month - 1).length; i++) {
                    if (gioTheoThang.get(month - 1)[i] == cnt) {
                        gioSinhChiTiet += "- " + gioTheoThangChu.get(0)[i] + "\n";
                    }
                }
            }

            // Đổi kiểu 2
            {
                List<int[]> gioTheoThang2 = dataHoroscope.getGioTheoThang2So();
                List<String[]> gioTheoThangChu2 = dataHoroscope.getGioTheoThang2Chu();
                for (int i = 0; i < gioTheoThang2.get(cnt - 1).length; i++) {
                    Log.e("i", "" + i);
                    if (gioTheoThang2.get(cnt - 1)[i] == month) {
                        gioSinhChiTiet += "- " +gioTheoThangChu2.get(0)[i] + "\n";

                    }
                }
            }

            // Luận không vợ không chồng
            {
                List<int[]> gioKhongVoChong = dataHoroscope.getGioKhongVoChong();
                List<String> Chi = dataHoroscope.getDiaChi();
                for (int i = 0; i < Chi.size(); i++) {
                    if (Objects.equals(namAmLich, Chi.get(i))) {
                        for (int j = 0; j < gioKhongVoChong.get(i).length; j++) {
                            if (gioKhongVoChong.get(i)[j] == cnt) {
                                gioSinhChiTiet += "Số sinh vào giờ này, trắc trở lương duyên, trai không vợ, gái không chồng.\n";
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            if(gioSinhChiTiet.equals("")) gioSinhChiTiet = "Nhờ phước ông bà cha mẹ, bạn sinh vào giờ tốt, không phạm phải vấn đề gì nghiêm trọng.";
            tv_person_hour_info.setText(gioSinhChiTiet);
        }
    }

    private void resultDay() {
        List<String[]> days = dataHoroscope.getDays();
        String reDay = "- " + days.get(0)[day % 6];
        tv_person_day_info.setText(reDay);
    }

    private void resultMonth() {
        String thangSinh = "";
        // Phá sản
        {
            List<String[]> phaSanBanThan;
            List<String[]> phaSan2;
            String doiTac = "";
            if (gioiTinh == 1) {
                phaSanBanThan = dataHoroscope.getPhaSanChong();
                phaSan2 = dataHoroscope.getPhaSanVo();
                doiTac = "vợ";
            } else {
                phaSanBanThan = dataHoroscope.getPhaSanVo();
                phaSan2 = dataHoroscope.getPhaSanChong();
                doiTac = "chồng";
            }
            for (int i = 0; i < phaSanBanThan.get(month - 1).length; i++) {
                if (Objects.equals(namAmLich, phaSanBanThan.get(month - 1)[i])) {
                    thangSinh += "- Người này tuổi " + namAmLich + " sinh vào tháng " + month + " là phạm phải tháng phá sản của bản thân, cẩn thận tiền mất bất thình lình.\n";
                    break;
                }
            }
            for (int i = 0; i < phaSan2.get(month - 1).length; i++) {
                if (Objects.equals(namAmLich, phaSan2.get(month - 1)[i])) {
                    thangSinh += "- Người này tuổi " + namAmLich + " sinh vào tháng " + month + " là phạm phải tháng phá sản của " + doiTac + ", cẩn thận tiền mất bất thình lình.\n";
                    break;
                }
            }
        }
        // Thiên can tốt xấu
        {
            LunarCalendar lunarCalendar = new LunarCalendar();
            List<String[]> thienCanTotXauChu = dataHoroscope.getThienCanTotXauChu();
            List<int[]> thienCanTotXauSo = dataHoroscope.getThienCanTotXauSo();
            List<String> Can = dataHoroscope.getThienCan();
            Log.e("THIÊN CAN", thienCan);
            for (int i = 0; i < Can.size(); i++) {
                if (Objects.equals(thienCan, Can.get(i))) {
                    if (i == 1) {
                        for (int j = 0; j < thienCanTotXauSo.get(1).length; j++) {
                            if (thienCanTotXauSo.get(1)[j] == month) {
                                thangSinh += "- " + thienCanTotXauChu.get(0)[j] + "\n";
                            }
                        }
                        for (int j = 0; j < thienCanTotXauSo.get(10).length; j++) {
                            if (thienCanTotXauSo.get(10)[j] == month) {
                                thangSinh += "- " + thienCanTotXauChu.get(0)[j] + "\n";
                            }
                        }
                    } else {
                        for (int j = 0; j < thienCanTotXauSo.get(i).length; j++) {
                            if (thienCanTotXauSo.get(1)[j] == month) {
                                thangSinh += "- " + thienCanTotXauChu.get(0)[j] + "\n";
                            }
                        }
                    }
                }
            }
        }
        // Cô thần Quả tú
        {
            String phamSao = "";
            List<String[]> coThanQuaTu;
            if (gioiTinh == 1) {
                coThanQuaTu = dataHoroscope.getCoThanQuaTuNam();
                phamSao = "Cô Thần, hôn nhân trễ nải, chịu cảnh nhiều đời vợ, phải đau khổ buồn phiền mãi không thôi.  Ngày nay hiện đại, tình yêu dễ đến, nên có thể linh nghiệm tới mức là nhiều đời người yêu, về sau tình cảm hôn nhân gia đình cũng khó viên mãn.";
            } else {
                coThanQuaTu = dataHoroscope.getCoThanQuaTuNu();
                phamSao = "Quả Tú, hôn nhân trễ nải, chịu cảnh nhiều đời chồng, phải đau khổ buồn phiền mãi không thôi. Ngày nay hiện đại, tình yêu dễ đến, nên có thể linh nghiệm tới mức là nhiều đời người yêu, về sau tình cảm hôn nhân gia đình cũng khó viên mãn.";
            }
            for (int i = 0; i < coThanQuaTu.get(month - 1).length; i++) {
                if (Objects.equals(namAmLich, coThanQuaTu.get(month - 1)[i])) {
                    thangSinh += "- Người này tuổi " + namAmLich + " sinh vào tháng " + month + " là phạm phải " + phamSao;
                }
            }
        }
        if (thangSinh.equals("")) thangSinh = "Nhờ phước ông bà cha mẹ, bạn sinh vào tháng tốt, không phạm phải vấn đề gì nghiêm trọng.";
        Log.e("THÁNG SINH", thangSinh);
        thangSinh = "Bạn hãy vào vai 1 bà đồng, truyền tải lại những ý sau, wording cho khác đi nhưng không được thay đổi ý nghĩa và tên riêng: " + thangSinh;
//        new ChatGPTRequest() {
//            @Override
//            protected void onPostExecute(String result) {
//                tv_person_month_info.setText(result);
//            }
//        }.execute(thangSinh);
        tv_person_month_info.setText(thangSinh);
    }

    private void resultFateStar() {
        String saoMenh = "";
        String tenSao = "";
        String ketLuan = "";
        List<String> sao = dataHoroscope.getSaoChieuMang();
        List<String> saoKetLuan = dataHoroscope.getGiaiSaoKetLuan();
        List<String[]> saoChu = dataHoroscope.getLuanSaoChieuMangChu();
        List<int[]> saoSo = dataHoroscope.getLuanSaoChieuMangSo();
        List<String> menh = dataHoroscope.getMenh();
        for (int i = 0; i < menh.size(); i++) {
            if (Objects.equals(menhNguHanh, menh.get(i))) {
                for (int j = 0; j < saoSo.get(i).length; j++) {
                    if(month == saoSo.get(i)[j])
                    {
                        tenSao = sao.get(j);
                        saoMenh = saoChu.get(0)[j];
                        ketLuan += "- " + saoKetLuan.get(j);
                        break;
                    }
                }
            }
        }
        tv_person_fate_star.setText(tenSao);
        tv_person_fate_star_info.setText(saoMenh);
        tv_person_fate_star_conclude.setText(ketLuan);
    }
    private void resultBone()
    {
        String bone = "";
        List<String> Chi = dataHoroscope.getDiaChi();
        List<int[]> cotSo = dataHoroscope.getCotConGiSo();
        List<String[]> cotChu = dataHoroscope.getCotConGiChu();
        for(int i = 0; i < Chi.size(); i++)
        {
            if(namAmLich == Chi.get(i))
            {
                for(int j = 0; j < cotSo.get(i).length; j++)
                {
                    if(month == cotSo.get(i)[j])
                    {
                        bone += "- " + cotChu.get(0)[j];
                    }
                }
            }
        }
        tv_person_bone_info.setText(bone);
    }
    private void resultAdvice()
    {
        List<String> loiKhuyen = advices.getLoiKhuyen();
        Random random = new Random();
        int randomNumber = random.nextInt(loiKhuyen.size() - 1);
        String khuyen = "- " + loiKhuyen.get(randomNumber);
        tv_person_advice.setText(khuyen);
    }
    private void onClick() {
        btn_close.setOnClickListener(v -> {
            finish();
        });
        btn_unsaved.setOnClickListener(v -> {
            Intent intent = getIntent();
            if (!isSaved) {
                Person person = new Person(name, birthday, gender, time);
                database.getPersonDAO().insert(person);
                int id = person.getId(); // Lấy ID của Person vừa được insert vào database
                intent.putExtra("ID", id);
                intent.putExtra("Saved", true);
                isSaved = true;
                btn_unsaved.setVisibility(View.INVISIBLE);
                btn_saved.setVisibility(View.VISIBLE);
                Toast.makeText(this, "Đã lưu hồ sơ", Toast.LENGTH_SHORT).show();
            }
            PersonAdapter adapter = new PersonAdapter(database.getPersonDAO().getAllPersons());
            List<Person> newList = database.getPersonDAO().getAllPersons();
            adapter.updateList(newList);
            adapter.notifyDataSetChanged();
        });

        btn_saved.setOnClickListener(v -> {
            Intent intent = getIntent();
            if (isSaved) {
                int id = intent.getIntExtra("ID", -1);
                if (id != -1) {
                    database.getPersonDAO().deleteById(id);
                    isSaved = false;
                    intent.removeExtra("ID");
                    btn_saved.setVisibility(View.INVISIBLE);
                    btn_unsaved.setVisibility(View.VISIBLE);
                    Toast.makeText(this, "Đã xóa hồ sơ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Không thể xóa hồ sơ", Toast.LENGTH_SHORT).show();
                }

            }
            PersonAdapter adapter = new PersonAdapter(database.getPersonDAO().getAllPersons());
            List<Person> newList = database.getPersonDAO().getAllPersons();
            adapter.updateList(newList);
            adapter.notifyDataSetChanged();
        });
    }
}
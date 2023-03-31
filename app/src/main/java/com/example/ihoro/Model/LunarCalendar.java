package com.example.ihoro.Model;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LunarCalendar {
    private DataHoroscope dataHoroscope;
    private ConvertDuongToAmLich amLich;
    public LunarCalendar()
    {
        dataHoroscope = new DataHoroscope();
        amLich = new ConvertDuongToAmLich();
    }
    public String Solar2Lunar(String birthday)
    {
        int[] formatedDay = standardized(birthday);
        return FormatDate(amLich.convertSolar2Lunar(formatedDay[0], formatedDay[1], formatedDay[2], 7.0));
    }
    private int[] standardized(String birthday)
    {

        String[] dateParts = birthday.split("/");
        int[] dateInts = new int[dateParts.length];
        for (int i = 0; i < dateParts.length; i++) {
            dateInts[i] = Integer.parseInt(dateParts[i]);
        }
        return dateInts;
    }
    private String FormatDate(int[] birthday)
    {
        int solarYear = birthday[2];
        String dateString = birthday[0] + "/" + birthday[1] + "/";
        SimpleDateFormat inputFormat = new SimpleDateFormat("d/M/");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/");

        String formattedDate = "";
        String lunarYear = "";
        try {
            // Parse chuỗi ngày/tháng/năm vào đối tượng Date
            Date date = inputFormat.parse(dateString);

            // Chuyển đổi lại sang chuỗi theo định dạng mới
            formattedDate = outputFormat.format(date);

            List<String> can = dataHoroscope.getThienCan();
            List<String> chi = dataHoroscope.getDiaChi();
            lunarYear = can.get((solarYear - 3) % 10) + " " + chi.get((solarYear - 3) % 12);
            Log.e("Lunar Birthday", formattedDate + lunarYear);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formattedDate + lunarYear;
    }
}

package com.example.ihoro.Model;

import android.util.Log;

import com.example.ihoro.Model.Data.DataHoroscope;

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
    public int[] Solar2LunarRawNoTextOutput(String birthday)
    {
        int[] formatedDay = standardized(birthday);
        return amLich.convertSolar2Lunar(formatedDay[0], formatedDay[1], formatedDay[2], 7.0);
    }
    public String convertToCanChi(String birthday)
    {
        int[] formatedDay = standardized(birthday);
        String lunarYear = "";
        List<String> can = dataHoroscope.getThienCan();
        List<String> chi = dataHoroscope.getDiaChi();
        int solarYear = formatedDay[2];
        return lunarYear = can.get((solarYear - 3) % 10) + " " + chi.get((solarYear - 3) % 12);
    }
    public String convertToCan(String birthday)
    {
        int[] formatedDay = standardized(birthday);
        String Can = "";
        List<String> can = dataHoroscope.getThienCan();
        List<String> chi = dataHoroscope.getDiaChi();
        int solarYear = formatedDay[2];
        return Can = can.get((solarYear - 3) % 10);
    }
    public String convertToChi(String birthday)
    {
        int[] formatedDay = standardized(birthday);
        String Chi = "";
        List<String> can = dataHoroscope.getThienCan();
        List<String> chi = dataHoroscope.getDiaChi();
        int solarYear = formatedDay[2];
        return Chi = chi.get((solarYear - 3) % 12);
    }

    public String Menh(String birthday)
    {
        int[] formatedDay = standardized(birthday);
        String lunarYear = "";
        List<String> can = dataHoroscope.getThienCan();
        List<String> chi = dataHoroscope.getDiaChi();
        int solarYear = formatedDay[2];
        int MenhSum = 0;
        String Can = can.get((solarYear - 3) % 10);
        String Chi = chi.get((solarYear - 3) % 12);
        for(int i = 0; i < can.size(); i++)
        {
            if(Can == "Quý")
            {
                MenhSum += 5;
                break;
            }
            if(can.get(i) == Can)
            {
                MenhSum += (int) Math.ceil(i / 2.0f);
                break;
            }
        }
        Log.e("Can","" + MenhSum);
        for(int i = 0; i < chi.size(); i++)
        {
            if(Can == "Hợi")
            {
                MenhSum += 2;
                break;
            }
            if(chi.get(i) == Chi)
            {
                MenhSum += ((int) Math.ceil(i / 2.0f) - 1) % 3;
                break;
            }
        }
        Log.e("Mệnh","" + MenhSum);
        if(MenhSum > 5) MenhSum -= 5;
        String[] Menh = {"Kim", "Thủy", "Hỏa", "Thổ", "Mộc"};
        return Menh[MenhSum - 1];
    }
    public int[] standardized(String birthday)
    {

        String[] dateParts = birthday.split("/");
        int[] dateInts = new int[dateParts.length];
        for (int i = 0; i < dateParts.length; i++) {
            dateInts[i] = Integer.parseInt(dateParts[i]);
        }
        return dateInts;
    }
    public int[] standardizedTime(String time)
    {

        String[] timeParts = time.split(":");
        int[] timeInts = new int[timeParts.length];
        for (int i = 0; i < timeParts.length; i++) {
            timeInts[i] = Integer.parseInt(timeParts[i]);
        }
        return timeInts;
    }
    public String FormatDate(int[] birthday)
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

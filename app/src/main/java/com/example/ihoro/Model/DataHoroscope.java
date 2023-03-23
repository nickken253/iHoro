package com.example.ihoro.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataHoroscope {
    private List<String> months;
    private List<String> ThienCan;
    private List<String> DiaChi;
    private List<String> days;
    private List<List<String>> PhaSanVo;
    private List<List<String>> PhaSanChong;
    private List<String> GioSinh;
    public DataHoroscope()
    {
        //Ngày tốt ngày xấu
        String[] tmpDay = {"Số khắc cha khắc mẹ, khắc vợ chồng, con cái. Phải đi xa xứ lập nghiệp mới mong được yên ổn.",
                "Bố mẹ thường mất sớm trước 60, 66 tuổi, hoặc nếu có lấy vợ, lấy chồng thì các bạn sẽ không được lâu bền.",
                "Có số đi xa xứ, khi đó được nhiều người nể trọng, từ tầm 36 tuổi trở lên làm ăn phát đạt.",
                "Nhà có điều kiện cha mẹ để lại, lớn lên có của. Tuy nhiên, phải tu tâm dưỡng tính thì mới đỡ buồn rầu.",
                "Số này là số vinh hoa, gặp ngày làm giàu, phải tu chí thì sẽ đạt được sang trọng.",
                "Số mai sau lớn lên hay chơi bời, bỏ nhà đàn đúm với bạn bè làm cho cha mẹ buồn phiền lo nghĩ. Người này dễ hư hỏng, một số người thì nghiện ngập hoặc tù tội, phạm pháp. Là con gái thì khắc chồng và nhiều bạn bè."};
        days = Arrays.asList(tmpDay);

        // Thiên Can 10 năm: Quý = năm - 3 = 0
        String[] Can = {"Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ", "Canh", "Tân", "Nhâm"};
        ThienCan = Arrays.asList(Can);

        // Địa Chi 12 năm: Hợi = năm - 3 chia hết cho 12
        String[] Chi = {"Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất"};
        DiaChi = Arrays.asList(Chi);

        // Phá sản của vợ: tháng 1 -> tháng 0
        List<String> tmpNull = new ArrayList<>();
        tmpNull.add("");

        List<String> tmp;
        String[] VoTmp1 = {"Thân", "Tý", "Thìn"};
        tmp = Arrays.asList(VoTmp1);
        PhaSanVo.add(tmp);

        String[] VoTmp2 = {"Hợi", "Mão", "Mùi"};
        tmp = Arrays.asList(VoTmp2);
        PhaSanVo.add(tmp);

        PhaSanVo.add(tmpNull);
        PhaSanVo.add(tmpNull);
        PhaSanVo.add(tmpNull);
        PhaSanVo.add(tmpNull);
        PhaSanVo.add(tmpNull);
        PhaSanVo.add(tmpNull);

        String[] VoTmp3 = {"Dậu", "Sửu", "Tỵ", "Dần", "Ngọ", "Tuất"};
        tmp = Arrays.asList(VoTmp3);
        PhaSanVo.add(tmp);

        PhaSanVo.add(tmpNull);
        PhaSanVo.add(tmpNull);
        PhaSanVo.add(tmpNull);

        // Phá sản của chồng: tháng 1 -> tháng 0
        PhaSanChong.add(tmpNull);
        PhaSanChong.add(tmpNull);
        PhaSanChong.add(tmpNull);
        PhaSanChong.add(tmpNull);
        PhaSanChong.add(tmpNull);
        PhaSanChong.add(tmpNull);
        PhaSanChong.add(tmpNull);
        String[] ChongTmp2 = {"Hợi", "Mão", "Mùi"};
        tmp = Arrays.asList(VoTmp2);
        PhaSanChong.add(tmp);
        String[] ChongTmp3 = {"Dậu", "Sửu", "Tỵ", "Dần", "Ngọ", "Tuất"};
        tmp = Arrays.asList(VoTmp3);
        PhaSanChong.add(tmp);
        PhaSanChong.add(tmpNull);
        PhaSanChong.add(tmpNull);
        String[] ChongTmp1 = {"Thân", "Tý", "Thìn"};
        tmp = Arrays.asList(VoTmp1);
        PhaSanChong.add(tmp);

        //Giờ sinh
        String[] gio = {"Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu"};

    }
}

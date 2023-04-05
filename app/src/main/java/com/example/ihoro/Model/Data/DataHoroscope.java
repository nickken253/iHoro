package com.example.ihoro.Model.Data;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DataHoroscope {
    private List<String> months = new ArrayList<>();
    private List<String> ThienCan = new ArrayList<>();
    private List<String> DiaChi = new ArrayList<>();
    private List<String[]> days = new ArrayList<>();

    private List<String[]> PhaSanVo = new ArrayList<>();
    private List<String[]> PhaSanChong = new ArrayList<>();
    private List<String> GioSinh = new ArrayList<>();

    private List<String[]> ThienCanTotXauChu = new ArrayList<String[]>();
    private List<int[]> ThienCanTotXauSo = new ArrayList<int[]>();
    private List<Map.Entry<Integer, Integer>> listStartHour = new ArrayList<>();

    private List<int[]> GioTheoThangSo = new ArrayList<int[]>();
    private List<String[]> GioTheoThangChu = new ArrayList<String[]>();

    private List<int[]> GioTheoThang2So = new ArrayList<int[]>();
    private List<String[]> GioTheoThang2Chu = new ArrayList<String[]>();
    private List<int[]> GioKhongVoChong = new ArrayList<int[]>();
    private List<String[]> CotConGiChu = new ArrayList<>();
    private List<int[]> CotConGiSo = new ArrayList<>();
    private List<String> SaoChieuMang = new ArrayList<>();
    private List<String[]> LuanSaoChieuMangChu = new ArrayList<>();
    private List<int[]> LuanSaoChieuMangSo = new ArrayList<>();
    private List<Map.Entry<String, String>> CungMenh = new ArrayList<>();

    private List<String[]> CoThanQuaTuNam = new ArrayList<>();
    private List<String[]> CoThanQuaTuNu = new ArrayList<>();
    private List<String> Menh = new ArrayList<>();

    public List<String> getGiaiSaoKetLuan() {
        return GiaiSaoKetLuan;
    }

    private List<String> GiaiSaoKetLuan = new ArrayList<>();

    // -------------------------------------

    public DataHoroscope() {
        //Ngày tốt ngày xấu - DONE
        {
            days.add(new String[]{
                    "Số khắc cha khắc mẹ, khắc vợ chồng, con cái. Phải đi xa xứ lập nghiệp mới mong được yên ổn.",
                    "Bố mẹ thường mất sớm trước 60, 66 tuổi, hoặc nếu có lấy vợ, lấy chồng thì các bạn sẽ không được lâu bền.",
                    "Có số đi xa xứ, khi đó được nhiều người nể trọng, từ tầm 36 tuổi trở lên làm ăn phát đạt.",
                    "Nhà có điều kiện cha mẹ để lại, lớn lên có của. Tuy nhiên, phải tu tâm dưỡng tính thì mới đỡ buồn rầu.",
                    "Số này là số vinh hoa, gặp ngày làm giàu, phải tu chí thì sẽ đạt được sang trọng.",
                    "Số mai sau lớn lên hay chơi bời, bỏ nhà đàn đúm với bạn bè làm cho cha mẹ buồn phiền lo nghĩ. Người này dễ hư hỏng, một số người thì nghiện ngập hoặc tù tội, phạm pháp. Là con gái thì khắc chồng và nhiều bạn bè."
            });
        }
        // Thiên Can 10 năm: Quý = năm - 3 = 0
        String[] Can = {"Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ", "Canh", "Tân", "Nhâm"};
        ThienCan = Arrays.asList(Can);

        // Địa Chi 12 năm: Hợi = năm - 3 chia hết cho 12
        String[] Chi = {"Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất"};
        DiaChi = Arrays.asList(Chi);
        // Số phá sản - DONE
        {
            ArrayList<String> tmpNull = new ArrayList<>();
            tmpNull.add("-");
            ArrayList<String> tmp = new ArrayList<>();
            // Phá sản của vợ: tháng 1 -> tháng 0
            {
                PhaSanVo.add(new String[]{"Thân", "Tý", "Thìn"});
                PhaSanVo.add(new String[]{"Hợi", "Mão", "Mùi"});
                PhaSanVo.add(new String[]{" "});
                PhaSanVo.add(new String[]{" "});
                PhaSanVo.add(new String[]{" "});
                PhaSanVo.add(new String[]{" "});
                PhaSanVo.add(new String[]{" "});
                PhaSanVo.add(new String[]{" "});
                PhaSanVo.add(new String[]{"Dậu", "Sửu", "Tỵ", "Dần", "Ngọ", "Tuất"});
                PhaSanVo.add(new String[]{" "});
                PhaSanVo.add(new String[]{" "});
                PhaSanVo.add(new String[]{" "});
            }
            // Phá sản của chồng: tháng 1 -> tháng 0
            {
                PhaSanChong.add(new String[]{" "});
                PhaSanChong.add(new String[]{" "});
                PhaSanChong.add(new String[]{" "});
                PhaSanChong.add(new String[]{" "});
                PhaSanChong.add(new String[]{" "});
                PhaSanChong.add(new String[]{" "});
                PhaSanChong.add(new String[]{" "});
                PhaSanChong.add(new String[]{"Hợi", "Mão", "Mùi"});
                PhaSanChong.add(new String[]{"Dậu", "Sửu", "Tỵ", "Dần", "Ngọ", "Tuất"});
                PhaSanChong.add(new String[]{" "});
                PhaSanChong.add(new String[]{" "});
                PhaSanChong.add(new String[]{"Thân", "Tý", "Thìn"});
            }
        }

        // Giờ sinh - DONE
        {
            String[] gioSinh = {"Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất"};
            GioSinh = Arrays.asList(gioSinh);

            // Giờ âm lịch: tháng 1 -> tháng 0
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 20));
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 0));
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 30));
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 40));
            listStartHour.add(new AbstractMap.SimpleEntry<>(23, 20));
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 40));
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 30));
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 0));
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 20));
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 0));
            listStartHour.add(new AbstractMap.SimpleEntry<>(21, 40));
            listStartHour.add(new AbstractMap.SimpleEntry<>(22, 0));
        }

        // Thiên can tốt xấu - DONE
        {
            ThienCanTotXauChu.add(new String[]{" ",
                    "Số phạm Cô Thần, số khắc vợ chồng, khắc con, lại thêm phận bạc, lại có anh em không hòa, mọi việc tự lo liệu.",
                    "Số phạm Quả Tú, số khắc vợ chồng, khắc con, lại thêm phận bạc, gái gặp số này không chồng con gì cả.",
                    "Số phạm Đại Bại, người lập gia đình không thành, sự nghiệp phiêu lưu.",
                    "Số phạm Lang Phạm không hợp trên đất cha mẹ, gia đình, sự nghiệp khó thành.",
                    "Số phạm Bát Bại thì gia đình sự nghiệp lập không thành, trai đông tây - gái nam bắc, số này lưu lạc phong trần.",
                    "Số phạm Tiểu Lang Phạm, trai thì làm con nuôi người ta, bằng không thì cũng làm hạ bộ, gái thì kỵ cha kỵ mẹ, kỵ anh em bà con, ...",
                    "Số phạm Tiểu Lang Phạm, trai thì làm con nuôi người ta, bằng không thì cũng làm hạ bộ, gái thì kỵ cha kỵ mẹ, kỵ anh em bà con, ...",
                    "Số phạm Gia Sát, trên đất cha mẹ lập nghiệp không thành, đi xứ khác làm ăn thịnh vượng.",
                    "Số phạm Tam Hình Sát, cẩn thận với pháp luật và tù tội, khả năng cao tương lai bạn sẽ liên quan đến tranh chấp và tòa án.",
                    "Số phạm Đại Hao, làm ăn khéo gặp thất bại, mất mát tiền bạc thình lình, nên sống cần dè dặt cẩn trọng.",
                    "Số được Lục Hợp, cha mẹ, anh em làm ăn đều thuận, ăn mặc rộng rãi.",
                    "Số phạm Quan Sát, lúc nhỏ khó nuôi, lớn lên dễ gặp tai nạn hoặc bệnh tật.",
                    "Số phạm Quan Sát, lúc nhỏ khó nuôi, lớn lên dễ gặp tai nạn hoặc bệnh tật.",
                    "Số phạm Đản Mạng Sát, lúc cha mẹ mới sinh thì khó nuôi, có hạn năm 3, 6, 12 tuổi, nếu qua được thì tới 21, 31 tuổi trong gia đình có bi thương.",
                    "Số phạm Đản Mạng Sát, lúc cha mẹ mới sinh thì khó nuôi, có hạn năm 3, 6, 12 tuổi, nếu qua được thì tới 21, 31 tuổi trong gia đình có bi thương.",
                    "Số này gặp Thiên Ấn, người được sang trọng, rảnh rang, nếu làm chăn nuôi hoặc nông nghiệp thì sẽ thịnh vượng và có sản nghiệp lớn.",
                    "Số này gặp Thiên Ấn, người được sang trọng, rảnh rang, nếu làm chăn nuôi hoặc nông nghiệp thì sẽ thịnh vượng và có sản nghiệp lớn.",
                    "Số này gặp Phước Tinh, người sang trọng, sống lâu có học dễ đỗ đạt cao, còn làm ăn thì được sản nghiệp lớn",
                    "Số này gặp Thiên Quan, người thành sau có chức có phận chốn triều đình, sống lâu thì thêm sang trọng.",
                    "Số này gặp Hiệp Lộc, được giàu sang, có tính thông minh, thân mạng không tai họa, gặp được vinh hoa.",
                    "Số này gặp Dương Vận, thì anh em cốt nhục sẽ không hòa hợp, có số làm thợ khéo, anh em ở xa cách không được nhờ.",
                    "Số này gặp Kim Ô, là người thông minh hiểu việc, đi xứ nào cũng có tài lợi thịnh vượng, sự nghiệp an cư",
                    "Số này gặp Văn Tinh, có số văn chương tấn phát, làm ăn thịnh vượng, nhưng cẩn thận ngày sau mất trắng rồi đi ăn xin."
            });
            // Quý
            ThienCanTotXauSo.add(new int[]{1, 8, 1, 2, 3, 6, 11, 4, 10, 3, 2, 9, 1, 11, 5, 4, 0, 4, 4, 11, 11, 1, 4});
            // Giáp 1
            ThienCanTotXauSo.add(new int[]{0, 0, 10, 8, 9, 12, 2, 5, 9, 6, 12, 0, 0, 2, 3, 6, 10, 1, 8, 1, 2, 3, 8});
            // Ất
            ThienCanTotXauSo.add(new int[]{4, 11, 10, 11, 12, 12, 6, 3, 8, 8, 10, 4, 12, 2, 3, 10, 8, 12, 0, 2, 3, 4, 11});
            // Bính
            ThienCanTotXauSo.add(new int[]{4, 12, 4, 11, 6, 9, 6, 11, 10, 7, 9, 7, 3, 1, 4, 10, 8, 1, 11, 4, 5, 6, 12});
            // Đinh
            ThienCanTotXauSo.add(new int[]{7, 12, 4, 5, 6, 12, 2, 7, 10, 10, 8, 3, 7, 5, 12, 10, 8, 11, 10, 5, 6, 7, 10});
            // Mậu
            ThienCanTotXauSo.add(new int[]{7, 3, 10, 5, 12, 6, 2, 5, 9, 9, 7, 7, 3, 6, 11, 6, 10, 7, 2, 4, 7, 6, 2});
            // Kỷ
            ThienCanTotXauSo.add(new int[]{10, 3, 1, 11, 3, 11, 6, 3, 12, 1, 6, 6, 10, 7, 10, 10, 4, 6, 1, 5, 1, 7, 1});
            // Canh
            ThienCanTotXauSo.add(new int[]{10, 3, 7, 2, 9, 11, 11, 11, 1, 1, 5, 10, 6, 8, 9, 10, 6, 5, 5, 7, 8, 9, 5});
            // Tân
            ThienCanTotXauSo.add(new int[]{10, 6, 7, 8, 9, 6, 1, 3, 8, 2, 4, 6, 10, 9, 8, 1, 5, 4, 4, 8, 9, 10, 4});
            // Nhâm
            ThienCanTotXauSo.add(new int[]{10, 6, 1, 2, 3, 6, 11, 1, 6, 1, 3, 1, 9, 10, 7, 2, 4, 5, 5, 10, 10, 12, 5});
            // Giáp 2
            ThienCanTotXauSo.add(new int[]{1, 9, 4, 5, 6, 9, 1, 1, 2, 5, 11, 4, 12, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0});
            /*
            Vợ chồng khắc nhau, con cái, anh chị em không hòa hợp.
            Số này phạm Cô thần Quả tú.
            Người lập gia không thành, sự nghiệp phiêu lưu.
            Không hợp trên đất cha mẹ, gia đình, sự nghiệp khó thành, trai đông tây - gái nam bắc, số này lưu lạc phong trần.
            Trai thì làm con nuôi, gái thì kỵ cha kỵ mẹ, kỵ anh em bà con, ...
            Trên đất cha mẹ lập nghiệp không thành, đi xứ khác làm ăn thịnh vượng.
            Số này cẩn thận với pháp luật và tù tội, khả năng cao tương lai bạn sẽ liên quan đến tranh chấp và tòa án.
            Làm ăn khéo gặp thất bại, mất mát tiền bạc thình lình, nên sống cần dè dặt cẩn trọng.
            Cha mẹ, anh em làm ăn đều thuận, ăn mặc rộng rãi.
            Người khó nuôi, dễ gặp tai nạn hoặc bệnh tật.
            Số này khó nuôi, có hạn năm 3, 6, 12 tuổi, nếu qua được thì tới 21, 31 tuổi trong gia đình có bi thương.
            -------------
            Số này nếu làm chăn nuôi hoặc nông nghiệp thì sẽ thịnh vượng và có sản nghiệp lớn.
            Người sang trọng, sống lâu có học dễ đỗ đạt cao.
            Người thành sau có chức có phận.
            Người này thông minh, tài hoa gặp được giàu sang.
            Số này anh em ruột sẽ không hòa hợp, có người làm thợ kéo.
            Người thông minh hiểu biết, tài lợi thịnh vượng.
            Văn chương tấn phát nhưng cẩn thận ngày sau mất trắng rồi đi ăn xin.
            */
        }

        // Giờ sinh luận theo tháng. - DONE
        {
            // Từ tháng sinh so theo giờ sinh mà ra.
            /*
            Hợi là số 12 - 0
            Tí - Sửu - Dần - Mão - Thìn - Tị - Ngọ - Mùi - Thân - Dậu - Tuất - Hợi
            1  - 2   - 3   - 4   - 5    - 6  - 7   - 8   - 9    - 10  - 11   - 12
             */

            GioTheoThangChu.add(new String[]{
                    "Số này sinh phạm vào giờ chết non.",
                    "Số này sinh phạm vào giờ chết non.",
                    "Số này sinh phạm vào giờ chết non.",
                    "Sinh vào giờ phạm Bệnh máu huyết: băng huyết, suy thận, máu trắng, chảy mất máu, ...",
                    "Phạm vào giờ chết do chìm tàu, thuyền, chết đuối sông nước, qua được 12 tuổi là nhờ phúc lớn ông bà",
                    "Phạm vào giờ chết do chìm tàu, thuyền, chết đuối sông nước, qua được 12 tuổi là nhờ phúc lớn ông bà",
                    "Sinh vào giờ này thường khó nuôi hoặc bố mẹ ly dị hoặc bị chết chém, tai nạn mà chết",
                    "Sinh vào giờ này thường khó nuôi hoặc bố mẹ ly dị hoặc bị chết chém, tai nạn mà chết",
                    "Lúc nhỏ người này có bệnh về da liễu",
                    "Lúc nhỏ người này có bệnh về da liễu",
                    "Người này thường hay đau bệnh, ốm vặt liên miên",
                    "Sinh vào giờ này kỵ tên đạn, cẩn thận chết do đạn bắn, đạn lạc",
                    "Sinh vào giờ này kỵ tên đạn, cẩn thận chết do đạn bắn, đạn lạc",
                    "Sinh vào giờ này cẩn thận số đi ăn xin, chém lén, nếu qua thì do phúc ông bà rất lớn"
            });
            // T1
            GioTheoThangSo.add(new int[]{5, 2, 8, 9, 3, 4, 6, 12, 5, 11, 6, 5, 10, 10});
            // T2
            GioTheoThangSo.add(new int[]{8, 2, 0, 11, 4, 0, 5, 11, 5, 11, 7, 5, 10, 10});
            // T3
            GioTheoThangSo.add(new int[]{6, 2, 8, 11, 5, 4, 4, 10, 5, 11, 8, 5, 10, 10});
            // T4
            GioTheoThangSo.add(new int[]{10, 5, 11, 12, 6, 7, 3, 9, 2, 8, 9, 6, 4, 1});
            // T5
            GioTheoThangSo.add(new int[]{5, 11, 0, 1, 7, 0, 2, 8, 2, 8, 10, 6, 4, 1});
            // T6
            GioTheoThangSo.add(new int[]{8, 11, 0, 2, 8, 7, 1, 7, 2, 8, 11, 6, 4, 1});
            // T7
            GioTheoThangSo.add(new int[]{6, 1, 7, 3, 9, 10, 6, 12, 11, 12, 12, 2, 8, 4});
            // T8
            GioTheoThangSo.add(new int[]{3, 1, 7, 4, 10, 0, 5, 11, 11, 12, 1, 2, 8, 4});
            // T9
            GioTheoThangSo.add(new int[]{5, 1, 7, 5, 11, 10, 4, 10, 11, 12, 2, 2, 8, 4});
            // T10
            GioTheoThangSo.add(new int[]{8, 4, 10, 6, 12, 1, 2, 9, 2, 3, 3, 6, 12, 7});
            // T11
            GioTheoThangSo.add(new int[]{6, 4, 10, 7, 1, 0, 2, 8, 2, 3, 4, 6, 12, 7});
            // T12
            GioTheoThangSo.add(new int[]{3, 4, 10, 8, 2, 1, 1, 7, 2, 3, 5, 6, 12, 7});

        }

        // Giờ sinh luận theo tháng kiểu 2. - DONE
        {
            // Từ giờ sinh so theo tháng sinh mà ra.
            GioTheoThang2Chu.add(new String[]{
                    "Người này phạm giờ chết do bị bỏng, chết cháy.",
                    "Người này phạm giờ chết do bị bỏng, chết cháy.",
                    "Người sinh giờ này cẩn thận chết do tai nạn xe cộ, ngã xe, ngã ngựa",
                    "Người sinh giờ này cẩn thận chết do tai nạn xe cộ, ngã xe, ngã ngựa",
                    "Người này phạm giờ xấu, chết do cho cắn, rắn cắn hoặc ong đốt.",
                    "Người này phạm giờ xấu, chết do cho cắn, rắn cắn hoặc ong đốt.",
                    "Người sinh giờ này số không chết ở nhà",
                    "Người sinh giờ này số không chết ở nhà",
                    "Người sinh giờ này số không chết ở nhà",
                    "Người này phạm giờ xấu, bé thì suốt ngày thuốc thang, lớn lên thì hay ốm vặt",
                    "Người này phạm giờ xấu, bé thì suốt ngày thuốc thang, lớn lên thì hay ốm vặt",
                    "Người này phạm giờ xấu, bé thì suốt ngày thuốc thang, lớn lên thì hay ốm vặt",
                    "Người này phạm giờ xấu, bé thì suốt ngày thuốc thang, lớn lên thì hay ốm vặt",
                    "Người này phạm giờ xấu, bé thì suốt ngày thuốc thang, lớn lên thì hay ốm vặt",
                    "Người này phạm giờ xấu, bé thì suốt ngày thuốc thang, lớn lên thì hay ốm vặt"
            });
            // Tý
            GioTheoThang2So.add(new int[]{1, 7, 1, 7, 1, 7, 1, 7, 3, 5, 7, 3, 6, 9, 12, 4, 5});
            // Sửu
            GioTheoThang2So.add(new int[]{2, 8, 4, 10, 2, 8, 4, 6, 8, 3, 6, 9, 12, 0, 0});
            // Dần
            GioTheoThang2So.add(new int[]{3, 9, 7, 1, 3, 9, 5, 7, 9, 7, 8, 0, 0, 0, 0});
            // Mão
            GioTheoThang2So.add(new int[]{4, 10, 4, 10, 4, 10, 6, 8, 1, 7, 8, 10, 11, 0, 0});
            // Thìn
            GioTheoThang2So.add(new int[]{5, 11, 1, 7, 5, 11, 7, 9, 11, 10, 11, 0, 0, 0, 0});
            // Tỵ
            GioTheoThang2So.add(new int[]{6, 12, 10, 4, 6, 12, 8, 10, 12, 1, 2, 7, 8, 0, 0});
            // Ngọ
            GioTheoThang2So.add(new int[]{1, 7, 1, 7, 1, 7, 9, 11, 1, 1, 2, 7, 8, 10, 11});
            // Mùi
            GioTheoThang2So.add(new int[]{2, 8, 4, 10, 2, 8, 10, 12, 2, 3, 6, 9, 12, 0, 0});
            // Thân
            GioTheoThang2So.add(new int[]{3, 9, 1, 7, 3, 9, 11, 1, 3, 1, 2, 0, 0, 0, 0});
            // Dậu
            GioTheoThang2So.add(new int[]{4, 10, 4, 10, 4, 10, 12, 2, 4, 1, 2, 0, 0, 0, 0});
            // Tuất
            GioTheoThang2So.add(new int[]{5, 11, 1, 7, 11, 5, 1, 3, 5, 0, 0, 0, 0, 0, 0});
            // Hợi
            GioTheoThang2So.add(new int[]{6, 12, 4, 10, 6, 12, 2, 4, 6, 3, 6, 9, 12, 4, 5});
        }

        // Người tuổi gì, sinh giờ này trai không vợ, gái không chồng. - DONE
        {
            /*
            Hợi là số 12 - 0
            Hợi - Tí - Sửu - Dần - Mão - Thìn - Tị - Ngọ - Mùi - Thân - Dậu - Tuất
            0   - 1  - 2   - 3   - 4   - 5    - 6  - 7   - 8   - 9    - 10  - 11
             */
            // Tuổi Hợi, Tý, Sửu
            GioKhongVoChong.add(new int[]{3, 11, 0, 0});
            GioKhongVoChong.add(new int[]{3, 11, 9, 5});
            GioKhongVoChong.add(new int[]{3, 11, 0, 0});
            // Tuổi Dần, Mão, Thìn
            GioKhongVoChong.add(new int[]{6, 2, 0, 0});
            GioKhongVoChong.add(new int[]{6, 2, 0, 0});
            GioKhongVoChong.add(new int[]{6, 2, 0, 0});
            // Tuổi Tỵ,  Mùi
            GioKhongVoChong.add(new int[]{9, 5, 0, 0});
            GioKhongVoChong.add(new int[]{0, 0, 0, 0});
            GioKhongVoChong.add(new int[]{9, 5, 0, 0});
            // Tuổi Thân, Dậu, Tuất
            GioKhongVoChong.add(new int[]{12, 11, 0, 0});
            GioKhongVoChong.add(new int[]{12, 11, 0, 0});
            GioKhongVoChong.add(new int[]{12, 11, 0, 0});
        }

        // Coi người này tuổi gì, cốt con gì - DONE
        {
            CotConGiChu.add(new String[]{" ",
                    "Người cốt Trâu là người tính ngay thẳng với người, đi xa hay gặp được anh em bạn bè tử tế. Những việc làm có ích cho đời thì không cần được đền ơn vẫn làm hoài.",
                    "Người cốt Hổ là người ít khi phát đạt ở quê hương, đi xa xứ làm ăn mới khá. Mệnh số sang trọng, ăn mặc đầy đủ, mưu cầu gì thì có nấy, có quyền hành oai võ. Dễ ăn dễ uống, bất luận ngon dở.",
                    "Người cốt Mèo là người làm việc gì lúc ban đầu cũng quyết tâm làm lớn, về sau lại như không. Học nhiều biết ít, dễ phát triển ở quê hương hay những nơi quen thuộc, dần dần đến khi lớn tuổi cũng khá. Tính nhát gan, dễ an vui.",
                    "Người cốt Rồng là người mệnh sang trọng lại có oai quyền, tài lợi phát đạt, có danh tiếng. Cuộc sống yên vui, không hay phải bôn ba xa xứ.",
                    "Người cốt Rắn là người thường ưa ở chổ yên tĩnh nhưng tay chân lại mau lẹ, tính nóng nảy hung tợn. Ít bệnh hoạn, ít tai nạn, mệnh an vui, không hay phải bôn ba xa xứ.",
                    "Người cốt Ngựa là người mệnh sang trọng, ăn mặc đầy đủ, tính thích di chuyển. Tướng mạo tốt, mưu mô giỏi, tay chân lanh lẹ.",
                    "Người cốt Dê là người càng lớn tuổi cuộc sống càng thong thả. Số không được nhờ cha mẹ, phải từ hai bàn tay trắng lập nghiệp. Dẫu ăn ở tử tế bao nhiêu cũng hay bị ghét.",
                    "Người cốt Khỉ là người khó ở yên một chỗ, ưa đi chơi. Thông minh ứng biến, nhưng không có sự dè dặt, ít đề phòng người khác.",
                    "Người cốt Gà là người mệnh sang trọng, có danh có tiếng. Thường gặp quí nhân, đi đến đâu cũng có người phò tá, giúp đỡ. Tính siêng năng mau lẹ, của có công mới hưởng, không có công không hưởng.",
                    "Người cốt Chó là người có tính cách khẳng khái, ít sợ ai, hay giúp đỡ mọi người, có lòng bênh vực anh em, không chịu lời nói nặng lời, ít có hoạn nạn, thường khi lớn tuổi mới tạo được sự nghiệp.",
                    "Người cốt Heo là người thường có tính ngay thẳng, có mệnh an nhàn sung sướng nhưng ít phát đạt ở quê hương bản xứ. Sống tử tế, dễ ăn dễ uống nhưng rất để ý đến thân thể.",
                    "Người cốt chuột là người tâm tính không can đảm, hay thù, nhỏ mọn, hay có bệnh lặt vặt trong mình, hay buồn rầu, ít an vui, tính hay tranh luận. Mệnh số ở mức bình thường."
            });
            // Tuổi Hợi = 0
            CotConGiSo.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
            // Tuổi Tý
            CotConGiSo.add(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1});
            // Tuổi Sửu
            CotConGiSo.add(new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2});
            // Tuổi Dần
            CotConGiSo.add(new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3});
            // Tuổi Mão
            CotConGiSo.add(new int[]{5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4});
            // Tuổi Thìn
            CotConGiSo.add(new int[]{6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5});
            // Tuổi Tỵ
            CotConGiSo.add(new int[]{7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6});
            // Tuổi Ngọ
            CotConGiSo.add(new int[]{8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 7});
            // Tuổi Mùi
            CotConGiSo.add(new int[]{9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8});
            // Tuổi Thân
            CotConGiSo.add(new int[]{10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9});
            // Tuổi Dậu
            CotConGiSo.add(new int[]{11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
            // Tuổi Tuất
            CotConGiSo.add(new int[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        }

        // Cung Mệnh suy luận ra sao chiếu mạng vợ chồng - DONE
        {
            // Trường Sinh = 1
            SaoChieuMang = Arrays.asList("Trường Sinh (Thiện Tinh)",
                    "Mộc Dục (Dâm Tinh)", "Quan Đài (Quý Tinh)",
                    "Lâm Quan (Tùy Tinh)", "Đế Vượng (Phúc Tinh)",
                    "Suy (Hung Tinh)", "Bệnh Phù (Bại Tinh)", "Tử (Ác Tinh)",
                    "Mộ (Phù Tinh)", "Tuyệt (Hung Tinh)", "Thai (Tùy Tinh)", "Dưỡng (Phù Tinh)");
            Menh = Arrays.asList("Kim", "Mộc", "Thủy", "Hỏa", "Thổ");
            // Kim = 0
            LuanSaoChieuMangSo.add(new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3});
            LuanSaoChieuMangSo.add(new int[]{10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9});
            LuanSaoChieuMangSo.add(new int[]{7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6});
            LuanSaoChieuMangSo.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
            LuanSaoChieuMangSo.add(new int[]{7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6});

            LuanSaoChieuMangChu.add(new String[]{
                    "Cha mẹ tích đức dày công,\nNên nay con hưởng phước hồng Trường sinh.\nVợ chồng duyên nợ được thành,\nTrăm năm tơ tóc, yến anh giao hòa.\nSống lâu an hưởng một nhà,\nTrọn đời có một, dâu là có hai.\nTôi trai, tớ gái hàng ngày,\nSố này có đức, hậu lại được nhờ.\n\n=> Số này trọn tốt.",
                    "Chẳng may số  hề  ở trời,\nSanh nhằm  Mộc Dục  đổi đời căn duyên.\nHôn nhân  trắc trở chớ phiền,\nMột đời thứ nhứt không yên gia đình.\nĐời sau vương vấn linh đình,\nThứ ba hoà hiệp chung tình trăm năm.\nLo cho huynh đệ nhất tâm,\nViệc rồi kết oán thù thâm nỡ đành.\n\n=> Số này trước  xấu sau tốt.",
                    "Than ôi trong cảnh phòng loan,\nSinh nhầm Quan Đài đeo mang nợ tình.\nHai đời phải chịu linh đình,\nThình lình gặp mối chung tình tứ ba.\nNgày sau nên cửa nên nhà,\nĐến già trọn đạo gọi là phu thê.\nTrong bề gia đạo bề huề,\nTrề gia nội trợ mọi bề đặng an.\n\n=> Số này trước xấu sau tốt",
                    "Hỡi thân phận bạc sau này,\nLâm Quan rủi gặp nỗi này đớn đau.\nVợ chồng ai cũng ước ao,\nTại sao có bạn khác nào như không.\nCác sông các núi vợ chồng,\nY tình không hạp loan phòng quạnh hiu.\nNhớ trong buồn tuổi bao nhiêu,\nĐến khi gặp mặt khó yêu tình chàng.\n\n=> số này phải chịu trọn đời",
                    "Khá nên tích đức thi công,\nSanh nhằm Đế Vượng phước hồng tương giao.\nHôn nhân gặp chỗ sang giàu,\nMột đời thông thả cùng nhau phỉ nguyền.\nThiên nhiên sở định lương duyên,\nThượng hòa hạ lục miêng miêng đời đời.\nSố này duyên nợ chẳng dời,\nThảnh thơi lo liệu an nơi gia đình.\n\n=> Số này trước sau trọn tốt",
                    "Thảm thay căn số vô phần,\nGặp duyên bạc phận sanh nhầm chữ Suy.\nMạng ai nấy tính không tùy,\nGặp nhau hiềm tỵ khác gì tù nhân.\nĐôi co nhiều tiếng thiệt hơn,\nSâm thương hai ngã như đờn thiếu giây.\nHai đời phải chịu đổi xây,\nThứ ba mới đặng sum vầy nợ duyên.\n\n=> Số này trước xấu sau tốt",
                    "Thảm buồn cho cảnh nợ duyên,\nSanh nhầm chữ Bệnh lụy liên gia đình.\nThở than phiền trách phận mình,\nRồi đây thọ lãnh giữ gìn lư hương.\nSanh ly tử biệt hai đường,\nDẫu mà không thác tang lương chia lìa.\nThứ nhì mới đặng đó đây sum vầy.\n\n=> số này đời thứ nhất không đặng, đời thứ 2 mới tốt",
                    "Câu rằng phu phụ tình thâm,\nPhạm nay chữ Tử vương nhằm cho ta.\nVợ chồng không đặng hiệp hòa,\nKhông trùng duyên nợ đâu mà bình an.\nMột đời thứ nhất lo toan,\nKhông lìa thì thác hai đàng biệt ly.\nĐời sau trọng nghĩa trọn nghi,\nKết nguyền tơ tóc phải thì bền lâu.\n\n=> Số này trước xấu sau tốt",
                    "Vợ chồng nghĩa nặng tình thâm,\nSanh nhầm chữ Mộ vương lâm cho chàng.\nCăn duyên mù mịt lỡ làng,\nKhi tan, khi hiệp đôi đàng mới xong.\nTrước đời xóm kiến chòm ong,\nĐời sau quy hiệp bưởi hồng đa đoan.\nVợ chồng mới đặng bình an,\nĐến sau rồi cũng bình an một mình.\n\n=> Số này vợ chồng lộn xộn rồi cũng góa",
                    "Vợ chồng duyên nợ chẳng lành,\nSanh nhằm chữ Tuyệt bao đành sầu đau.\nThêm sầu số phận quản bao,\nXem trong duyên nợ khắc hào phu thê.\nMãng lo tranh đấu bộn bề,\nTrải qua bao độ già tề mới ăn.\nBởi do số hệ chớ than,\nKỳ ba trời định mới an gia đình.\n\n=> Số này hai đời không bền,đời thứ ba mới bền",
                    "Hồng nhan cốt cách xanh tươi,\nXuê xoa ăn mặc, tiếng cười có duyên.\nDè đâu tình nghĩa ưu phiền,\nLương duyên thứ nhất vẹn tuyền đặng đâu.\nCủa tiền hao tốn ngỏ hầu,\nThứ nhì mới đặng giao đầu phụng loan.\nPhỉ nguyền tình thiếp nghĩa chàng,\nGia đình phát đạt đặng an một nhà.\n\n=> Số này thứ nhì mới đặng bền vững",
                    "Số này trời đất cho ta,\nVợ chồng phối ngẫu giao hòa bình an.\nPhụng loan kết cánh bầy đàn,\nMột năm sanh dưỡng phòng loan kịp kỳ.\nĂn mặc đầy đủ số no,\nVợ chồng một tuổi vậy thời giàu sang.\nChớ lo duyên nợ lỡ làng,\nVợ chồng hòa hiệp luận bàn thất gia.\n\n=> Số này vợ chồng đồng một tuổi và một tháng sanh thì đặng giàu sang và trong một năm thì có con mau chóng"
            });
            GiaiSaoKetLuan = Arrays.asList(
                    "Đây là sao đại diện cho sự phước thọ, sinh khí, thịnh vượng. Cung Mệnh có sao này thường chỉ người mập mạp, to lớn, nhân từ và có sức khỏe tốt.",
                    "Đây là sao đại diện cho sự dâm dật, phong tình, ưa tắm gội, sạch sẽ, trưng diện. Cung Mệnh có sao này thường chỉ người nông nổi, bất định, dễ thay đổi và bỏ dở công việc ở giữa chừng.",
                    "Đây là sao đại diện cho sự quyền uy, chức vụ, công danh lớn mạnh, chức vị và thi khoa cử. Cung Mệnh có sao này thường chỉ người có gia đình khá giả, quần áo chỉnh tề.",
                    "Đây là sao đại diện cho sự khoe khoang, tự phụ, may mắn, quyền quý. Cung Mệnh có sao này thường chỉ người thích làm dáng, làm điệu, điệu bộ, nói năng kiểu cách",
                    "Đây là sao đại diện cho sự thịnh vượng, gia tăng tài lộc, con cái. Cung Mệnh có sao này thường chỉ người uy nghi, đường bệ, tính tình quảng đại, từ thiện, bác ái, có tài lãnh đạo, có óc lãnh tụ.",
                    "Đây là sao đại diện cho sự sa sút, yếu đuối. Cung Mệnh có sao này thường chỉ người có tài khéo, thích hợp với ngành có sự tỉ mỉ, chính xác, có hoa tay, còn có sự suy yếu, sa sút, không thành đạt, yếu đuối về thể xác, bất định, hay lo, đưa đến lao tổn",
                    "Đây là sao đại diện cho sự đau yếu, bệnh tật, buồn rầu.",
                    "Đây là sao đại diện cho sự đa sầu, đa cảm, buồn phiền, thăng trầm, kín đáo. Cung Mệnh có sao này thường chỉ người hay suy nghĩ sâu xa, tính toán kỹ lưỡng, có kế hoạch.",
                    "Đây là sao đại diện cho sự đần độn, chậm, tối, u mê, tiêu tán, khô cạn, ngăn trở công việc.",
                    "Đây là sao đại diện cho sự tiêu diệt, bế tắc, chấm dứt, khô cạn, ngăn trở công danh. Cung Mệnh có sao này thường chỉ người khôn ngoan, đa mưu túc trí, có tay nghề đặc sắc.",
                    "Đây là sao đại diện cho sự phong lưu khoái lạc, u mê, sinh nở, dễ tin. Cung Mệnh có sao này thường chỉ người ham vui, thích chơi bời, phóng đãng, dễ tin người, nhẹ dạ, tính tình không dứt khoát, khó cầu công danh, thi cử",
                    "Đây là sao đại diện cho sự chăm chỉ, cẩn thận, cần cù, nuôi nấng, duy trì. Cung Mệnh có sao này thường chỉ người có tính tình chăm chỉ, cẩn thận, cần cù, có tên riêng, tên đặc biệt, tên cúng cơm, biệt danh, biệt hiệu, có sự thay đổi tên họ."
            );
        }



        // Luận Cô thần Quả tú - DONE
        {
            // Nam mệnh
            CoThanQuaTuNam.add(new String[]{"Tý", "Sửu", "Tỵ", "Ngọ", "Mùi", "Hợi"});
            CoThanQuaTuNam.add(new String[]{" "});
            CoThanQuaTuNam.add(new String[]{" "});
            CoThanQuaTuNam.add(new String[]{"Dần", "Mão", "Thìn", "Thân", "Dậu", "Tuất"});
            CoThanQuaTuNam.add(new String[]{" "});
            CoThanQuaTuNam.add(new String[]{" "});
            CoThanQuaTuNam.add(new String[]{"Tý", "Sửu", "Tỵ", "Ngọ", "Mùi", "Hợi"});
            CoThanQuaTuNam.add(new String[]{" "});
            CoThanQuaTuNam.add(new String[]{" "});
            CoThanQuaTuNam.add(new String[]{"Dần", "Mão", "Thìn", "Thân", "Dậu", "Tuất"});
            CoThanQuaTuNam.add(new String[]{" "});
            CoThanQuaTuNam.add(new String[]{" "});

            // Nữ mệnh
            CoThanQuaTuNu.add(new String[]{"Tỵ", "Hợi"});
            CoThanQuaTuNu.add(new String[]{"Tý", "Ngọ"});
            CoThanQuaTuNu.add(new String[]{"Sửu", "Mùi"});
            CoThanQuaTuNu.add(new String[]{"Dần", "Thân"});
            CoThanQuaTuNu.add(new String[]{"Mão", "Dậu"});
            CoThanQuaTuNu.add(new String[]{"Thìn", "Tuất"});
            CoThanQuaTuNu.add(new String[]{"Tỵ", "Hợi"});
            CoThanQuaTuNu.add(new String[]{"Tý", "Ngọ"});
            CoThanQuaTuNu.add(new String[]{"Sửu", "Mùi"});
            CoThanQuaTuNu.add(new String[]{"Dần", "Thân"});
            CoThanQuaTuNu.add(new String[]{"Mão", "Dậu"});
            CoThanQuaTuNu.add(new String[]{"Thìn", "Tuất"});
        }


    }

    public List<String> getMonths() {
        return months;
    }

    public List<String> getThienCan() {
        return ThienCan;
    }

    public List<String> getDiaChi() {
        return DiaChi;
    }

    public List<String[]> getDays() {
        return days;
    }

    public List<String[]> getPhaSanVo() {
        return PhaSanVo;
    }

    public List<String[]> getPhaSanChong() {
        return PhaSanChong;
    }

    public List<String> getGioSinh() {
        return GioSinh;
    }

    public List<String[]> getThienCanTotXauChu() {
        return ThienCanTotXauChu;
    }

    public List<int[]> getThienCanTotXauSo() {
        return ThienCanTotXauSo;
    }

    public List<Map.Entry<Integer, Integer>> getListStartHour() {
        return listStartHour;
    }

    public List<int[]> getGioTheoThangSo() {
        return GioTheoThangSo;
    }

    public List<String[]> getGioTheoThangChu() {
        return GioTheoThangChu;
    }

    public List<int[]> getGioTheoThang2So() {
        return GioTheoThang2So;
    }

    public List<String[]> getGioTheoThang2Chu() {
        return GioTheoThang2Chu;
    }

    public List<int[]> getGioKhongVoChong() {
        return GioKhongVoChong;
    }

    public List<String[]> getCotConGiChu() {
        return CotConGiChu;
    }

    public List<int[]> getCotConGiSo() {
        return CotConGiSo;
    }

    public List<String> getSaoChieuMang() {
        return SaoChieuMang;
    }

    public List<String[]> getLuanSaoChieuMangChu() {
        return LuanSaoChieuMangChu;
    }

    public List<int[]> getLuanSaoChieuMangSo() {
        return LuanSaoChieuMangSo;
    }


    public List<Map.Entry<String, String>> getCungMenh() {
        return CungMenh;
    }


    public List<String[]> getCoThanQuaTuNam() {
        return CoThanQuaTuNam;
    }

    public List<String[]> getCoThanQuaTuNu() {
        return CoThanQuaTuNu;
    }

    public List<String> getMenh() {
        return Menh;
    }
}

package com.example.ihoro.Model.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataHoroscopeCouple {
    private List<String[]> TuoiAm60 = new ArrayList<>();
    private List<String[]> Menh60 = new ArrayList<>();
    private List<String[]> ThienCanDiaChiChu = new ArrayList<>();
    private List<String[]> ThienCanDiaChiLuan = new ArrayList<>();
    private List<String> BatQue = new ArrayList<>();
    private List<String[]> BatQueCungMenh = new ArrayList<>();
    private List<String> ThienCan = new ArrayList<>();
    private List<String> DiaChi = new ArrayList<>();


    public DataHoroscopeCouple()
    {
        // Tuổi & Mệnh 60 năm - DONE
        {
            TuoiAm60.add(new String[]{
                    "Giáp Tý", "Ất Sửu", "Bính Dần", "Đinh Mão", "Mậu Thìn", "Kỷ Tỵ", "Canh Ngọ", "Tân Mùi", "Nhâm Thân", "Quý Dậu",
                    "Giáp Tuất", "Ất Hợi", "Bính Tý", "Đinh Sửu", "Mậu Dần", "Kỷ Mão", "Canh Thìn", "Tân Tỵ", "Nhâm Ngọ", "Quý Mùi",
                    "Giáp Thân", "Ất Dậu", "Bính Tuất", "Đinh Hợi", "Mậu Tý", "Kỷ Sửu", "Canh Dần", "Tân Mão", "Nhâm Thìn", "Quý Tỵ",
                    "Giáp Ngọ", "Ất Mùi", "Bính Thân", "Đinh Dậu", "Mậu Tuất", "Kỷ Hợi", "Canh Tý", "Tân Sửu", "Nhâm Dần", "Quý Mão",
                    "Giáp Thìn", "Ất Tỵ", "Bính Ngọ", "Đinh Mùi", "Mậu Thân", "Kỷ Dậu", "Canh Tuất", "Tân Hợi", "Nhâm Tý", "Quý Sửu",
                    "Giáp Dần", "Ất Mão", "Bính Thìn", "Đinh Tỵ", "Mậu Ngọ", "Kỷ Mùi", "Canh Thân", "Tân Dậu", "Nhâm Tuất", "Quý Hợi",
            });
            Menh60.add(new String[]{
                    "Chấn", "Tốn", "Khảm", "Càn", "Đoài", "Cấn", "Ly", "Khảm", "Khôn", "Chấn",
                    "Càn", "Đoài", "Cấn", "Ly", "Khảm", "Khôn", "Chấn", "Tốn", "Ly", "Càn",
                    "Khôn", "Chấn", "Tốn", "Chấn", "Càn", "Đoài", "Cấn", "Ly", "Khảm", "Khôn",
                    "Ly", "Khảm", "Khôn", "Chấn", "Tốn", "Cấn", "Càn", "Đoài", "Cấn", "Ly",
                    "Tốn", "Đoài", "Càn", "Đoài", "Cấn", "Ly", "Khảm", "Khôn", "Chấn", "Tốn",
                    "Cấn", "Ly", "Khảm", "Khôn", "Chấn", "Tốn", "Khôn", "Càn", "Tốn", "Cấn"
            });
        }
        // Thông thơ Thiên Can Địa Chi
        {
            String[] Can = {"Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ", "Canh", "Tân", "Nhâm", "Quý"};
            ThienCan = Arrays.asList(Can);

            String[] Chi = {"Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi"};
            DiaChi = Arrays.asList(Chi);

            // Giáp
            ThienCanDiaChiChu.add(new String[]{
                    "Tình nồng thắm muôn vàn âu yếm,\nNghĩa vợ chồngkhắn khít mến thương.\nKhoa danh rạng rỡ môn đường,\nĐầy nhà con thảo dâu hiền về sau.",
                    "Vợ chết trước chồng sầu chất ngất\nLỡ sang ngang, lỡ nối nhịp cầu.\nĐã nợ ái ân đành sống gượng,\nNgười còn kẻ mất dở dang nhau.",
                    "Vợ chết trước chồng sầu chất ngất\nLỡ sang ngang, lỡ nối nhịp cầu.\nĐã nợ ái ân đành sống gượng,\nNgười còn kẻ mất dở dang nhau.",
                    "Tim tan nát, vợ chồng cách bức,\nVết thương đau, thiếu phụ khóc chồng.\nNước trong khôn rửa lệ sầu,\nTrăng thu in bóng, não nùng cô đơn.",
                    "Buồn muốn đem xuân trả lại trời,\nMất tiền chẳng tiếc, tiếc người trẻ trung.\nThương nhau tan nát cõi lòng,\nNgày xuân mòn mỏi, má hồng kém phai.",
                    "Gặp nhau buổi tiết thu năm ấy,\nThu này về nào thấy bóng em.\nEm đi, đi mãi chẳng về,\nThu về anh mãi ủ ê dạ sầu.",
                    "Xuân có hoa mai, cần hoa cúc,\nTấm lòng yêu, yêu cả và hai.\nNăm tháng càng ngày lưu luyến mãi,\nTrăm năm một phụng đôi loan hiệp bày.",
                    "Vợ chồng cắn đắng không hòa,\nKhi thời vui vẻ, khi tan nát lòng.\nLắm khi cầm của không bền,\nKhi ăn chẳng hết, khi bòn chẳng ra.\nLấy đức mới giữ nghiệp nhà.",
                    "Nào khi hẹn ngọc thề vàng,\nNào ngờ kim mã ngọc đường về ai?\nNgàn mây ẩn bóng tà dương,\nTủi thân lắm lúc, nên dường chỉ kim.\nBền lòng gắn chí cho hay,\nĐừng cho dang dỡ mảnh tình năm xưa.\nKhuyên đừng ngựa lọc, xe lừa,\nCó ngày gió rước, trăng đưa ngỡ ngàng.",
                    "Ngắm trăng đôi lứa yêu đương,\nDưới trăng thỏ thẻ niềm tây canh dài.\nSương khuya thắm ướt tóc mai,\nNương trăng vui vẻ hài hòa lứa đôi.\nTrăm năm tạc một lời nguyền,\nHôn con, nhìn vợ vui vầy mến thương.",
                    "Ngắm trăng đôi lứa yêu đương,\nDưới trăng thỏ thẻ niềm tây canh dài.\nSương khuya thắm ướt tóc mai,\nNương trăng vui vẻ hài hòa lứa đôi.\nTrăm năm tạc một lời nguyền,\nHôn con, nhìn vợ vui vầy mến thương.",
                    "Vóc ngà tươi thắm kém phai,\nMá hồng nhợt nhạt, tóc dài cũng thưa.\nThủy chung một mối tình chung,\nVàng phai đá nát vẫn còn thương nhau.\nĐừng cho trăng tủi hoa sầu,\nTrăm năm giữ một nhịp cầu mà thôi."
            });

            ThienCanDiaChiLuan.add(new String[]{
                    "Vợ chồng điều hòa, ăn ở cùng nhau như đôi chim Cưu, con trống kêu một tiếng thì con mái kêu theo rập ràng.",
                    "Dẫu có công danh cũng lận đận, không bền và người vợ thường bị sản nạn. Có con không nhờ, e sợ người vợ sẽ chết trước người chồng.",
                    "Dẫu có công danh cũng lận đận, không bền và người vợ thường bị sản nạn. Có con không nhờ, e sợ người vợ sẽ chết trước người chồng.",
                    "Cũng như thuyền trôi ngược, như lá vàng sắp gặp tiết thu sang úa rụng. Sợ e người chồng sẽ chết trước. Phải ăn ở cho có đạo nghĩa mới bền lâu. Có câu: “Nhân từ giã thọ, hung bạo giác vong”.",
                    "Thì dù có tiền của cũng khi hiệp khi tan, như hoa nở rồi lại héo. Người vợ bệnh liên miên. Phải lấy đức mới ăn ở đời được.",
                    "Cũng như người đi trễ xe, tính một đường mà làm một nẻo. Làm ăn có khi thành khi bại Vợ chồng thương yêu nhau nhưng e người vợ chết trước. Sau tuổi 41 sẽ phát đạt thịnh vượng.",
                    "Chồng chữ Giáp mà có vợ tuổi Ngọ thì khó nuôi con được vẹn toàn. Người chồng phải có vợ lẽ mới được yên vui.",
                    "Vợ chồng hay xảy ra cãi vã, thường bị phá sản, vợ chồng cắn đắng, cũng như người đi đường xa mệt mà mặt trời đã chen lặn. Phải tu tâm tích đức mới bền.",
                    "Vợ chồng thường hay cãi vã, ít được đầm ấm. Dời đổi chỗ ăn ở đôi ba lần mới yên.",
                    "Vợ chồng chung sống hạnh phúc, an vui,  khoa danh rạng rỡ, con cháu sum vầy.",
                    "Vợ chồng chung sống hạnh phúc, an vui,  khoa danh rạng rỡ, con cháu sum vầy.",
                    "Tuy vợ chồng tâm đầu ý hiệp nhưng người vợ thường hay bịnh hoạn, dù công danh có rạng rỡ song e gặp bước thăng trầm không lường được. Phải ăn ở cho có tâm có đức thì mới khá."
            });

            // Ất
            ThienCanDiaChiChu.add(new String[]{
                    "Nghiêng vai tựa cửa thơ song,\n" +
                            "Gió xuân thoang thoảng hương lòng nở nang.\n" +
                            "Bóng nàng dưới ánh trăng tàn,\n" +
                            "Chập chờn ẩn hiện như hình tiên nga.\n" +
                            "Dịu dàng bóng liễu thướt tha,\n" +
                            "Mùi hương ngây ngất dễ say lòng người.\n" +
                            "Vợ chồng xứng lứa vừa đôi!",
                    "Biển tình, vẫn sóng yên gió lặng,\n" +
                            "Đã yêu nhau nên nghĩa vợ chồng.\n" +
                            "Trăm năm sắt đá tâm đồng,\n" +
                            "Khi ngâm ngợi nguyệt, khi cười cợt hoa.\n" +
                            "Sum vinh con cháu đầy nhà,\n" +
                            "Trở về vận cuối, cửa nhà thêm vui.",
                    "Biển tình, vẫn sóng yên gió lặng,\n" +
                            "Đã yêu nhau nên nghĩa vợ chồng.\n" +
                            "Trăm năm sắt đá tâm đồng,\n" +
                            "Khi ngâm ngợi nguyệt, khi cười cợt hoa.\n" +
                            "Sum vinh con cháu đầy nhà,\n" +
                            "Trở về vận cuối, cửa nhà thêm vui.",
                    "Có những lúc buồn sa nước mắt,\n" +
                            "Có những hồi son sắt yêu đương.\n" +
                            "Chẳng qua là nợ trái oan,\n" +
                            "Lấy thân mà trả nợ tình cho xong.\n" +
                            "Ai ơi giữ chí cho bền,\n" +
                            "Xin đừng than oán trách trời sao nên.\n" +
                            "Kiếp này trả nợ cho xong,\n" +
                            "Đừng làm cho nặng nợ chồng kiếp sau.",
                    "Lam Điền gieo ngược đã thành song,\n" +
                            "Loan phụng nên duyên đẹp chữ đồng.\n" +
                            "Thiên lý tương phùng do nguyệt lão,\n" +
                            "Bá niên thanh khí hiệp mây rồng.",
                    "Lam Điền gieo ngược đã thành song,\n" +
                            "Loan phụng nên duyên đẹp chữ đồng.\n" +
                            "Thiên lý tương phùng do nguyệt lão,\n" +
                            "Bá niên thanh khí hiệp mây rồng.",
                    "Cảnh góa bụa nỗi sầu chất ngất,\n" +
                            "Kẻ khuất người còn, dạ thắt chia phôi.\n" +
                            "Lắm cơn khi tủi, khi hờn,\n" +
                            "Lòng thương chỉ có bóng đèn âm u!\n" +
                            "Từ đây hai nẻo cách xa,\n" +
                            "Gần nhau chỉ có những hồi chiêm bao!",
                    "Long môn sanh quý tử,\n" +
                            "Hổ huyệt xuất công hầu.\n" +
                            "Châu, Trần này có Châu Trần nào hơn.\n" +
                            "Trăm năm chẳng lỗi nhịp đờn,\n" +
                            "Cùng hòa một khúc hương lòng thắm tươi.",
                    "Cây khô nghe sấm nức chồi,\n" +
                            "Đạo chồng nghĩa vợ, giận rồi lại thương.\n" +
                            "Trăm năm vẹn đạo can thường,\n" +
                            "Tuy không xướng họa, nhưng thông cảm nhiều.",
                    "Dương cầm sớm dứt đường tơ.\n" +
                            "Đứt dây lỡ dở, khô khan mạc sầu.\n" +
                            "Vóc mai gầy vỏ tuyết sương,\n" +
                            "Ngàn thu như chiếc cánh buồm bơ vơ.\n" +
                            "Bước đi âu cũng ngại ngùng!\n" +
                            "Dừng chân đứng lại, ngẫm mình lẻ đôi!\n" +
                            "Trách ai làm bát bể, hột cơm rơi,\n" +
                            "Dĩa nghiêng cà đổ, rã rời duyên ta.",
                    "Từ đây vắng bóng vợ hiền,\n" +
                            "Người thì đủ cặp, anh thì lẻ đôi.\n" +
                            "Chợ đời tan hợp không chừng,\n" +
                            "Đã buồn chợ sớm, vui chi chợ chiều.\n" +
                            "Thương nhau xin chứng lòng thành,\n" +
                            "Sầu vương ghi mãi trong lòng tâm tang.",
                    "Từ đây vắng bóng vợ hiền,\n" +
                            "Người thì đủ cặp, anh thì lẻ đôi.\n" +
                            "Chợ đời tan hợp không chừng,\n" +
                            "Đã buồn chợ sớm, vui chi chợ chiều.\n" +
                            "Thương nhau xin chứng lòng thành,\n" +
                            "Sầu vương ghi mãi trong lòng tâm tang."

            });
            ThienCanDiaChiLuan.add(new String[]{
                    "Vợ chồng chung sống hạnh phúc, an vui, có con, có của, vinh hiển gia đình, công danh rạng rỡ.",
                    "Gia đình hạnh phúc, vợ chồng chung sống đến ngày đầu bạc răng long, con cái ngoan hiền. Rất tốt, cũng như trăng thu tỏ rạng. Phú quý giàu sang; sanh trai đầu lòng tốt hơn sanh gái.",
                    "Gia đình hạnh phúc, vợ chồng chung sống đến ngày đầu bạc răng long, con cái ngoan hiền. Rất tốt, cũng như trăng thu tỏ rạng. Phú quý giàu sang; sanh trai đầu lòng tốt hơn sanh gái.",
                    "Gia đình không được hạnh phúc, vợ chồng ăn ở thường bất hòa, khi hiệp khi tan, âu cũng là cái duyên cái số.",
                    "Gia đình hạnh phúc, con cái thảo hiền. Cũng như Lưu Lang vào vào động Thiên Thai gặp vợ tiên. Hay là như Vương Song Phước gặp nàng Huệ Khôi trăm năm gắn bó.",
                    "Gia đình hạnh phúc, con cái thảo hiền. Cũng như Lưu Lang vào vào động Thiên Thai gặp vợ tiên. Hay là như Vương Song Phước gặp nàng Huệ Khôi trăm năm gắn bó.",
                    "Vợ chồng chia cắt đôi đường. Cũng như đi đêm gặp lúc trăng mờ. Cơ nghiệp sụp đổ, công danh lỡ dỡ. Không xa nhau thì cũng có kẻ còn người mất.",
                    "Vợ chồng gắn bó, yêu thương. Thật tốt, cũng như cá ở Long môn hóa rồng. Sanh con đặng khoa danh rạng rỡ, vinh hiển hậu lai.",
                    "Gia đình hạnh phúc viên mãn, vợ chồng rất toại nguyện, danh phận rỡ ràng. Tuy có người ganh tỵ, nhưng cũng được bình an. Sanh con cái tuy có tài hay, song thường trắc trở khoa danh. Vợ chồng hay tranh cãi, nhưng chung sống đến già.",
                    "Duyên vợ chồng đứt ghánh giữa đường. Cũng như thuyền đi ngược gió, tuy làm ăn cố gắng song không có kết quả, chừng nửa đời sẽ phân ly.",
                    "Vợ chồng gặp nhiều khó khăn trong cuộc sống . Làm ăn rất vất vả, công danh chẳng toại. Nửa chừng người vợ sẽ chết trước.",
                    "Vợ chồng gặp nhiều khó khăn trong cuộc sống . Làm ăn rất vất vả, công danh chẳng toại. Nửa chừng người vợ sẽ chết trước."


            });

            // Bính
            ThienCanDiaChiChu.add(new String[]{
                    "Niềm tâm sự đầy vơi nhỏ lệ!\n" +
                            "Đời trăm năm những ngỡ toại lòng.\n" +
                            "Thời gian để hận khó nguôi,\n" +
                            "Lứa đôi dang dỡ ngậm ngùi tuổi xanh!\n" +
                            "Muốn sang thế giới vô hình,\n" +
                            "Nước non cõi ấy gặp người bạn xưa!",
                    "Trăng còn có khi tròn khi khuyết,\n" +
                            "Tình đôi ta chỉ biết thủy chung.\n" +
                            "Ngàn năm mây ẩn bóng trăng lòng,\n" +
                            "Nước trong trăng rọi, chứng lòng sắt son.",
                    "Bình hương để lỡ nhịp cầu,\n" +
                            "Còn đâu trong đẹp như trăng đêm rằm.\n" +
                            "Thề duyên sớm đã phụ phàng,\n" +
                            "Non sông, trăng nước, bẽ bàng vì ai?\n" +
                            "Ngắm trăng chỉ biết thở dài,\n" +
                            "Nước trong trăng lặn, buồn chăng hỡi buồn!",
                    "Cảnh ly hận, trăng khuya gió sớm,\n" +
                            "Lòng cảm thương khoảng vắng đêm trường.\n" +
                            "Não nồng tâm sự thê lương!\n" +
                            "Đường đời mưa gió, sớm chiều vắng anh.\n" +
                            "Ngẫm suy muôn dặm cõi đời,\n" +
                            "Bước đi một bước, ngậm ngùi cho thân.",
                    "Cảnh ly hận, trăng khuya gió sớm,\n" +
                            "Lòng cảm thương khoảng vắng đêm trường.\n" +
                            "Não nồng tâm sự thê lương!\n" +
                            "Đường đời mưa gió, sớm chiều vắng anh.\n" +
                            "Ngẫm suy muôn dặm cõi đời,\n" +
                            "Bước đi một bước, ngậm ngùi cho thân.",
                    "Tình ân ái mặn nồng đầm ấm,\nSánh vai nhau ngắm cảnh nhìn trăng,\nNhững đêm ngồi mãi dưới trăng,\nYêu nhau tha thiết sợ Hằng Nga ghen!\nLòng vui sướng đùa mây vờn gió,\nSống dai đến  tuổi bạc đầu còn thương.",
                    "Nửa chừng vắng bóng chốn trần ai,\n" +
                            "Em ở, anh đi chẳng đoái hoài.\n" +
                            "Có phải dương gian nhiều cực khổ,\n" +
                            "Mà anh vội trơà chốn diêâm đài?\n" +
                            "Lưu luyến xót thương, em kể lể,\n" +
                            "Lạnh lùng anh ở chốn dạ đài.\n" +
                            "Trăm năm muốn dứt tình thêm bận,\n" +
                            "Mãi mãi lòng em giữ thủy chung.",
                    "Lòng son để nhóm lửa phiền,\n" +
                            "Giọt châu lã chã dễ hoen má hồng.\n" +
                            "Số trời định thường hay tranh cãi,\n" +
                            "Hết giận rồi thì càng lại yêu nhau.\n" +
                            "Khi vui kể hết đuôi đầu,\n" +
                            "Khi buồn thì lại cau mày cắn răng.\n" +
                            "Nhưng rốt cuộc sống dai trăm tuổi,\n" +
                            "Có căn cơ con cái đủ đông.",
                    "Mây xanh dọi nước trong xanh,\n" +
                            "Trách ai lỗi hẹn lời nguyền ba sinh.\n" +
                            "Non nước hỡi ai nguyền năm trước!\n" +
                            "Lỗi lời thề vội tách sang ngang.\n" +
                            "Thề xưa thôi đã phụ phàng,\n" +
                            "Non sông hoa gấm, lở làng bởi ai?",
                    "Cảnh hiu quạnh, vợ chồng than thở,\n" +
                            "Buổi cơ hàn như lúc sum vinh.\n" +
                            "Âu là cũng nợ ba sinh,\n" +
                            "Lúc vinh, cơn nhục như hình nam kha.\n" +
                            "Mạng đã thế, ta đành chịu vậy,\n" +
                            "Tình đôi ta trước cũng như sau,\n" +
                            "Yêu nhau phải chịu chua cay cuộc đời.",
                    "Cảnh hiu quạnh, vợ chồng than thở,\n" +
                            "Buổi cơ hàn như lúc sum vinh.\n" +
                            "Âu là cũng nợ ba sinh,\n" +
                            "Lúc vinh, cơn nhục như hình nam kha.\n" +
                            "Mạng đã thế, ta đành chịu vậy,\n" +
                            "Tình đôi ta trước cũng như sau,\n" +
                            "Yêu nhau phải chịu chua cay cuộc đời.",
                    "Tạ với ơn trên, tận với tình,\n" +
                            "Vợ chồng chung sống nếp hy sinh.\n" +
                            "Vì nhà bẩn chật, vì con dại,\n" +
                            "Cực khổ cũng cam tận với tình.\n" +
                            "Giao long núp dưới gầm cầu,\n" +
                            "Chờ khi gặp gió lẫy lừng tung mây."
            });
            ThienCanDiaChiLuan.add(new String[]{
                    "Vợ chồng chung sống hạnh phúc. Ăn ở mặc dù có con cái đề huề và vợ chồng yêu thương nồng nàn, nhưng người vợ sẽ chết trước.",
                    "Vợ chồng sống thủy chung, son sắt. Làm ăn được khá giả, hết cơn bĩ cực đến hồi vinh sang. Phải có con đỡ đầu mới khá. Người vợ e phải mang bệnh tật và đổi chỗ ở đôi ba lần mới yên. Phải tu thân tích đức mới được trường thọ.",
                    "Vợ chồng lúc đầu ăn ở đầm ấm, sau e phải phân ly. Phải ăn ở cho có đạo nghĩa mới tốt.",
                    "Vợ chồng xa cách. Chẳng khác nào chim mắc bẫy, én lạc đàn, ghe cạn nước và phải chia lìa trong lúc nửa đời, chồng chết trước vợ.",
                    "Vợ chồng xa cách. Chẳng khác nào chim mắc bẫy, én lạc đàn, ghe cạn nước và phải chia lìa trong lúc nửa đời, chồng chết trước vợ.",
                    "Thì rất tâm đầu ý hiệp, có tiền của khá giả, sanh con cái đều đủ, hưởng phước thanh nhàn, sống lâu.",
                    "Thì chẳng khác gì cây gặp mùa Xuân, đâm chồi mọc rể. Sanh con cái đều đủ gái trai, nhưng số nữa chừng thì chồng chết trước.",
                    "Cũng như cây gặp đất tốt nẩy chồi. Làm ăn thạnh phát, của cải rất giàu sang. Vợ chồng thường tranh cãi, nhưng vẫn chung sống đến già.",
                    "Thì vợ chồng buổi đầu keo sơn gắn bó, nhưng nữa chừng lại bình vỡ gương tan. Âu cũng là tiền nhân hậu quả, việc trả nợ ái ân tái hôn đời sau thì mới được đầm ấm và sang giàu.",
                    "Thì cũng như chim én lạc bầy. Đường công danh trắc trở. Cảnh gia đình suy sụp. Không sanh được con trai, vợ chồng buồn phiền, anh em lãnh đạm. Phải ăn ở có đạo đức mới khá.",
                    "Thì cũng như chim én lạc bầy. Đường công danh trắc trở. Cảnh gia đình suy sụp. Không sanh được con trai, vợ chồng buồn phiền, anh em lãnh đạm. Phải ăn ở có đạo đức mới khá.",
                    "Trước tiên phải chịu cảnh cơ hàn, sau mới khá giả, yên vui; con cháu đông đủ. Phải bền chí và cố gắng thì sau mới vinh hiển."
            });
            // Đinh
            ThienCanDiaChiChu.add(new String[]{
                    "Đời lắm lúc trêu cay ngậm đắng,\n" +
                            "Cơn nguy nàn mới rõ lòng nhau.\n" +
                            "Trăm năm tạc dạ ghi xương,\n" +
                            "Dẫu mòn bia đá dám sai tấc lòng.",
                    "Đời lắm lúc trêu cay ngậm đắng,\n" +
                            "Cơn nguy nàn mới rõ lòng nhau.\n" +
                            "Trăm năm tạc dạ ghi xương,\n" +
                            "Dẫu mòn bia đá dám sai tấc lòng.",
                    "Non cao thẳm ngất lòng sầu,\n" +
                            "Tình xưa ai vẽ lên màu thê lương!\n" +
                            "Tình xưa càng nghĩ càng thương,\n" +
                            "Biết bao khoảng vắng đêm trường khóc nhau.\n" +
                            "Gối nghiêng tầm tả giọt châu,\n" +
                            "Màn hoa chăn gối thêm sầu chứa chan.",
                    "Trăm năm gắn bó mối tâm đồng,\n" +
                            "Cũng như trong mộng kết thành lứa đôi.\n" +
                            "Trăm năm duyên nợ thề nguyền,\n" +
                            "Càng vui càng thắm, càng nồng tình yêu.\n" +
                            "Sớm sanh trai gái nối dòng,\n" +
                            "Cũng như xuân đến đượm nhuần hoa tươi.",
                    "Đời son trẻ đến ngày tóc bạc,\n" +
                            "Đạo vợ chồng son sắt thủy chung.\n" +
                            "Có những lúc bên màm dưới trướng,\n" +
                            "Con hầu cha nghe những lời khuyên.\n" +
                            "Quây quần đông đảo một nhà,\n" +
                            "Vợ con chầu chực nghe lời dạy răn.\n" +
                            "Trăm năm  giữ vững đạo hằng,\n" +
                            "Như chim liền cánh, như cây giao cành.",
                    "Duyên hội ngộ, tơ tình muôn kiếp,\n" +
                            "Quả tim nồng khắn khít trăm năm.\n" +
                            "Canh khuya gió lộng đèn chong,\n" +
                            "Nhỏ to tâm sự mặn nồng mến thương.\n" +
                            "Những khi dạo cảnh đêm dài,\n" +
                            "Yêu nhau, đôi lứa nhìn trăng mỉm cười.",
                    "Xuân sang, duyên đẹp, đẹp hơn hoa,\n" +
                            "Một tấm tình yêu mãi đến già.\n" +
                            "Năm tháng ngày càng vui vẻ lạ,\n" +
                            "Sanh con trai gái, cháu đầy nhà.\n" +
                            "Duyên chi thắm tơ tình muôn kiếp,\n" +
                            "Nghĩa phu thê trọn đạo ở đời.\n" +
                            "Từ tuổi xanh cho đến niên cao,\n" +
                            "Vợ chồng hòa thuận, cháu con sum vầy.",
                    "Tim rạn nứt, bao giờ lành lại?\n" +
                            "Khóc hờn duyên than thở lâm ly!\n" +
                            "Phận bèo đau khổ thiếu chi,\n" +
                            "Chán vạn người khổ, riêng gì phận ta.\n" +
                            "Duyên đã khiến mối tơ ai nối,\n" +
                            "Đã xa nhau rồi lại gặp nhau.\n" +
                            "Ngậm ngùi chi xiết  đau thương,\n" +
                            "Ba sinh là nợ cũng đành phôi pha.\n" +
                            "Trăm năm chồng vợ hiệp hòa.",
                    "Một tấm tình yêu dệt gấm hoa,\n" +
                            "Thương nhau gây dựng cửa nên nhà.\n" +
                            "Trăm năm gắn bó tình chung thủy,\n" +
                            "Kết mối đồng tâm rất đậm đà.\n" +
                            "Suối biếc non xanh dệt chỉ hồng,\n" +
                            "Thương nhau gắn bó mảnh tâm đồng.\n" +
                            "Ba sinh nghĩa nặng lòng son tạc,\n" +
                            "Chín khúc tơ vương dệt chữ đồng.",
                    "Lều tranh đôi mái tóc xanh,\n" +
                            "Yêu nhau nồng thắm, mối tình thủy chung.\n" +
                            "Những khi gió gác, trăng sân,\n" +
                            "Má đào ẩn dưới mày xanh một nhà.\n" +
                            "Anh nguyền giữ vẹn lời thề,\n" +
                            "Trăm năm giữ một lời nguyền mà thôi.\n" +
                            "Ra công gắng sức tài bồi,\n" +
                            "Hết cơn lao khổ, tới ngày hiển vinh.\n" +
                            "Đừng nên giông tố bất bình.",
                    "Lều tranh đôi mái tóc xanh,\n" +
                            "Yêu nhau nồng thắm, mối tình thủy chung.\n" +
                            "Những khi gió gác, trăng sân,\n" +
                            "Má đào ẩn dưới mày xanh một nhà.\n" +
                            "Anh nguyền giữ vẹn lời thề,\n" +
                            "Trăm năm giữ một lời nguyền mà thôi.\n" +
                            "Ra công gắng sức tài bồi,\n" +
                            "Hết cơn lao khổ, tới ngày hiển vinh.\n" +
                            "Đừng nên giông tố bất bình.",
                    "Hoa đào phơi phới nếp tinh anh,\n" +
                            "Dan díu thêm hương lúc tuổi xanh.\n" +
                            "Lác đác hoa cài so sắc trắng,\n" +
                            "Là đà liễu rủ lá xanh xanh.\n" +
                            "Xuân về muôn thắm trời cao vút,\n" +
                            "Gió thoảng hương lòng khó vẽ tranh.\n" +
                            "Cây cỏ mơ màng cơn gió lốc!\n" +
                            "Tang bồng mây nước, một trời thanh."
            });
            ThienCanDiaChiLuan.add(new String[]{
                    "Vợ chồng buổi ban đầu cực khổ nghèo thiếu nhưng  yêu thương chăm sóc nhau cùng vượt qua khó khăn, bệnh tật. Chừng gần 30 tuổi sẽ phát đạt, giàu sang. Con cái sum vầy nên danh phận. Ăn ở ân đức mới được khá giả.",
                    "Vợ chồng buổi ban đầu cực khổ nghèo thiếu nhưng  yêu thương chăm sóc nhau cùng vượt qua khó khăn, bệnh tật. Chừng gần 30 tuổi sẽ phát đạt, giàu sang. Con cái sum vầy nên danh phận. Ăn ở ân đức mới được khá giả.",
                    "Vợ chồng úc đầu thì vui vẻ, hạnh phúc, yêu thương nhau, rồi sau vì hoàn cảnh có lúc phải phân ly nhau, khi tan khi hợp, bằng không thì người vợ phải chết trước. Phải ăn ở có ân đức, tu hành thì  mới sống lâu.",
                    "Vợ chồng gắn bó trăm năm hạnh phúc, con cái ngoan hiền.  Cũng như sự tích Bùi Hàng gặp vợ tiên là nàng Vân Anh, kết thành đôi lứa.",
                    "Hạnh phúc trăm năm. Rất tốt, vợ chồng  cũng như đôi chim nhạn đủ cặp trong tiết Thu sang. Sanh trai nên danh phận.",
                    "Vợ chồng hạnh phúc viên mãn. Rất tốt, gái trai đầy đủ, công danh rạng rỡ, vợ chồng chung hưởng tài lộc đến già.",
                    "Vợ chồng hòa thuận, con cháu ngoan hiền. Rất tốt, vợ chồng chung sống hạnh phúc đến già, con cái đông đủ, cảnh nhà thạnh phát.",
                    "Vợ chồng có lúc phân ly sau rồi sum họp vì hoàn cảnh gây nên.",
                    "Vợ chồng gắn bó thủy chung. Người chồng có công danh sáng chói, rực rỡ gia môn. Người vợ sanh con gái trai đầy đủ. Từ tuổi trẻ đến già, vợ chồng được chung hưởng phú quí.",
                    "Vợ chồng buổi ban đầu làm ăn có thành có bại, vợ chồng nên kiên trì tâm trí, chừng30 tuổi sẽ phát đạt giàu sang. Vợ chồng chung sống đến già, con cái đông đảo, ngoan hiền.",
                    "Vợ chồng buổi ban đầu làm ăn có thành có bại, vợ chồng nên kiên trì tâm trí, chừng30 tuổi sẽ phát đạt giàu sang. Vợ chồng chung sống đến già, con cái đông đảo, ngoan hiền.",
                    "Vợ chồng xứng đôi vừa lứa. Rất phù hợp, như cá gặp nước. Công danh toại nguyện, lắm con nhiều của, vợ chồng chung sống từ lúc tuổi xanh cho đến ngày răng long đầu bạc. Danh phận rạng rỡ."
            });

            // Mậu
            ThienCanDiaChiChu.add(new String[]{
                    "Suối biếc non xanh, cuộn chỉ hồng,\n" +
                            "Tơ duyên gắn bó mảnh tâm đồng.\n" +
                            "Ba sinh hương lửa ngàn thu nặng,\n" +
                            "Chín chữ tơ vương kết giải đồng.\n" +
                            "Vàng đá hẹn nhau bền tuế nguyệt,\n" +
                            "Lửa hương nồng thắm sánh non sông.\n" +
                            "Màn loan chung bóng đêm hè vắng,\n" +
                            "Trạc trạc tào khang nghĩa mặn nồng.",
                    "Uất hận chua cay ngán ngẫm đời,\n" +
                            "Tủi hờn trĩu nặng cánh hoa mai.\n" +
                            "Nhìn đời như nước trôi muôn ngả,\n" +
                            "Chạnh thấy lòng ai lạnh não nề.\n" +
                            "\n" +
                            "Thôi đã phôi pha đường dĩ vãng,\n" +
                            "Đây đã vườn xưa tự thuở nào.\n" +
                            "Cắn răng cam chịu mùi chua chát,\n" +
                            "Để khỏi sầu vương, khỏi bẽ bàng.",
                    "Uất hận chua cay ngán ngẫm đời,\n" +
                            "Tủi hờn trĩu nặng cánh hoa mai.\n" +
                            "Nhìn đời như nước trôi muôn ngả,\n" +
                            "Chạnh thấy lòng ai lạnh não nề.\n" +
                            "\n" +
                            "Thôi đã phôi pha đường dĩ vãng,\n" +
                            "Đây đã vườn xưa tự thuở nào.\n" +
                            "Cắn răng cam chịu mùi chua chát,\n" +
                            "Để khỏi sầu vương, khỏi bẽ bàng.",
                    "Có những lúc cười sa nước mắt,\n" +
                            "Có những hồi cơ cực lầm than.\n" +
                            "Cho hay là nợ trái oan,\n" +
                            "Trả rồi thì hết,yên bề gia cang.",
                    "Mùa xuân năm ấy hiệp nhau,\n" +
                            "Quyên ca những tiếng biệt ly não nùng.\n" +
                            "Hoa tàn mấy độ thu đông,\n" +
                            "Nào đâu những lúc nhạc lòng năm xưa?\n" +
                            "Lạnh lẽo giữa ngày sương giá lạnh,\n" +
                            "Tro tàn gợi lại mảnh than hồng.",
                    "Đời thường có lắm lần vinh nhục,\n" +
                            "Như cuộc cờ lúc được, cơn thua.\n" +
                            "Bôn ba âu cũng số phần,\n" +
                            "Miễn cho trọn nghĩa đá vàng thủy chung.\n" +
                            "Lồng đèn khi xách khi treo,\n" +
                            "Vợ chồng khi khó khi nghèo có nhau.",
                    "Đêm thong thả bầu trời vắng lặng,\n" +
                            "Ngắm hoa xuân, nhẹ chuốc chén vàng.\n" +
                            "Bụi đời tràn ngập thời gian,\n" +
                            "Cuộc vui chuốc chén, mộng đời chóng qua.\n" +
                            "Người đối cảnh dưới hiên trăng dọi,\n" +
                            "Cảnh trêu người, gió thổi cát bay.\n" +
                            "Vui này liệu có ai hay,\n" +
                            "Với đêm trăng gió, vợ chồng thảnh thơi.",
                    "Mến nhau vì tấm tình yêu,\n" +
                            "Thương nhau vì nghĩa duyên trời định phân.\n" +
                            "Duyên ngâu dễ gặp bạn lòng,\n" +
                            "Tuy hòa xướng ít, mà thông cảm nhiều.\n" +
                            "Mặc đời dầu dãi phong sương,\n" +
                            "Tình thương chẳng để mơ theo cuộc đời.\n" +
                            "Lòng xuân chẳng bợn thế tình,\n" +
                            "Ngâm câu phu xướng phụ tùy xứng đôi.",
                    "Mến nhau vì tấm tình yêu,\n" +
                            "Thương nhau vì nghĩa duyên trời định phân.\n" +
                            "Duyên ngâu dễ gặp bạn lòng,\n" +
                            "Tuy hòa xướng ít, mà thông cảm nhiều.\n" +
                            "Mặc đời dầu dãi phong sương,\n" +
                            "Tình thương chẳng để mơ theo cuộc đời.\n" +
                            "Lòng xuân chẳng bợn thế tình,\n" +
                            "Ngâm câu phu xướng phụ tùy xứng đôi.",
                    "Phụng loan tan vỡ mối tình đầu,\n" +
                            "Bạn cũ nhớ chăng, lụy thảm sầu.\n" +
                            "Khắp cả người ta đều có bạn,\n" +
                            "Dễ gì tìm được bạn xưa đâu!\n" +
                            "\n" +
                            "Cảnh chiều mưa gió cậy ai?\n" +
                            "Tơ loan chắp mối xuân thừa đủ đôi.\n" +
                            "Chợ đời kẻ ngược, người xuôi,\n" +
                            "Tuy hòa duyên mới, não nồng bạn xưa!",
                    "Tim em trao gởi tình anh,\n" +
                            "Tuổi thơ tha thiết tâm tình hai ta.\n" +
                            "Yêu từ hoa nở độ nào,\n" +
                            "Giờ đây mai nở trên cành chứng tri.\n" +
                            "Đừng cho lỡ mối duyên lành,\n" +
                            "Khơi niềm hạnh phúc bây giờ là đây.",
                    "Tỉnh, mơ như mộng giấc hoàng lương,\n" +
                            "Cảm bấy tình ta, cắt đoạn trường.\n" +
                            "Vóc liễu hình mai còn gợn nhớ,\n" +
                            "Phải chăng trời đất buộc tang thương?\n" +
                            "\n" +
                            "Mở mảnh gương soi tìm lại bóng,\n" +
                            "Xếp tàn áo lạnh để dành hơi.\n" +
                            "Nỗi niềm chia cách tình thêm bận,\n" +
                            "Mãi nhớ người xưa dạ chẳng khuây."
            });
            ThienCanDiaChiLuan.add(new String[]{
                    " Gia đình hạnh phúc xum vầy. Rất tốt, cũng như vườn xuân hoa nở. Sanh con trai con gái vẹn toàn, gia đình hưng thịnh; vợ chồng chung sống đến già, an nhàn phú quí.",
                    "Vợ chồng làm ăn thường hay gặp trở ngại, có lúc an ổn, có cơn nghèo khổ. Nhưng vẫn cùng nhau cam chịu chung sống đến già, song vợ chồng hay tranh cãi.",
                    "Vợ chồng làm ăn thường hay gặp trở ngại, có lúc an ổn, có cơn nghèo khổ. Nhưng vẫn cùng nhau cam chịu chung sống đến già, song vợ chồng hay tranh cãi.",
                    "Vợ chồng cơ cực lầm than. Rất xấu. Công việc làm ăn thất bại nhiều phen, lắm khi gian nan cực khổ; dời đổi chỗ ăn ở đôi ba lần mới yên. Chung cuộc mới được khá giả. Có công mài sắt, có ngày nên kim.",
                    "Vợ chồng lúc đầu vui vẻ, sau lại buồn phiền. Có lúc nhục, có khi vinh. Phải ăn ở cho có tâm đức, về sau mới khá giả.",
                    "Thì được trường thọ. Có con gái khó cậy nhờ. Trước vinh hiển, sau chịu cơ hàn. Phải tu thân mới yên lúc tuổi già. Có con thì không có của, có của thì lại không có con.",
                    "Rất tốt. Vợ chồng hòa thuận từ lúc tuổi xanh đến ngày đầu bạc. Được hưởng thanh nhàn. Sanh gái nhiều hơn trai. Tuổi già nhờ con.",
                    "Vợ chồng là duyên trời định. Chung sống hòa thuận từ lúc xuân xanh cho đến tuổi trăng tàn xế bóng, ân ái mặn nồng. Tiền bạc dư dả, sanh con trai và gái nên danh phận.",
                    "Vợ chồng là duyên trời định. Chung sống hòa thuận từ lúc xuân xanh cho đến tuổi trăng tàn xế bóng, ân ái mặn nồng. Tiền bạc dư dả, sanh con trai và gái nên danh phận.",
                    "Vợ chồng nửa chừng phân ly, có đời vợ sau thì được đầm ấm, bền duyên và con cái đông đủ. Gia đạo vui vầy, làm ăn thạnh phát.",
                    "Vợ chồng  gặp nhau rồi yêu nhau do duyên tiền định, ăn ở thuận hòa ấm êm, trăm năm gắn bó hạnh phúc, sanh con trai và gái vẹn toàn. Vợ chồng kết tóc đến già.",
                    " Vợ chồng sống theo nghề nông làm ruộng, làm vườn trồng cây thì rất hợp. Tình nghĩa vợ chồng không bền, sợ e nửa đời người vợ chết trước. Phải ăn ở có đạo đức tu hành mới sống lâu, sanh con cái đều đủ gái trai."
            });

            // Kỷ
            ThienCanDiaChiChu.add(new String[]{
                    "Năm canh lệ sầu vơi nước mắt,\n" +
                            "Tuổi trẻ trung mất vợ khó khuây.\n" +
                            "Nỗi đau đớn riêng đây tha thiết,\n" +
                            "Khóc òa lên cho thấu trời xanh.\n" +
                            "Trời làm chi, hỡi trời ơi!\n" +
                            "Nỡ đem sanh tử, não người thế gian!",
                    "Năm canh lệ sầu vơi nước mắt,\n" +
                            "Tuổi trẻ trung mất vợ khó khuây.\n" +
                            "Nỗi đau đớn riêng đây tha thiết,\n" +
                            "Khóc òa lên cho thấu trời xanh.\n" +
                            "Trời làm chi, hỡi trời ơi!\n" +
                            "Nỡ đem sanh tử, não người thế gian!",

                    "Duyên kỳ ngộ, tơ tình muôn kiếp,\n" +
                            "Đời trăm năm được mấy vui vầy.\n" +
                            "Đêm khuya trăng giải dọi sân,\n" +
                            "Bóng trăng soi biết dạ sầu phân ly.\n" +
                            "Dưới trăng giọt lệ canh dài,\n" +
                            "Dở dang duyên nợ, ngậm ngùi chia ly!",
                    "Duyên kỳ ngộ, tơ tình muôn kiếp,\n" +
                            "Đời trăm năm được mấy vui vầy.\n" +
                            "Đêm khuya trăng giải dọi sân,\n" +
                            "Bóng trăng soi biết dạ sầu phân ly.\n" +
                            "Dưới trăng giọt lệ canh dài,\n" +
                            "Dở dang duyên nợ, ngậm ngùi chia ly!",
                    "Giờ lặng lẽ, âm thầm qua ngày tháng\n" +
                            "Chạnh niềm xưa hối tiếc mộng yêu thương.\n" +
                            "Ánh thời gian đi mãi không ngừng,\n" +
                            "Ngày phiêu lãng tình xưa còn ghi gắn.\n" +
                            "Xóa bỏ hết những ngày tuyệt vọng.\n" +
                            "Đời đôi ta còn chứa động lòng thương.\n",
                    "Giờ lặng lẽ, âm thầm qua ngày tháng\n" +
                            "Chạnh niềm xưa hối tiếc mộng yêu thương.\n" +
                            "Ánh thời gian đi mãi không ngừng,\n" +
                            "Ngày phiêu lãng tình xưa còn ghi gắn.\n" +
                            "Xóa bỏ hết những ngày tuyệt vọng.\n" +
                            "Đời đôi ta còn chứa động lòng thương.",
                    "Vườn xuân hoa trỗ như mơ,\n" +
                            "Xin chi gặp gỡ bạn đời tri ân.\n" +
                            "Cùng nhau thông cảm mến thương,.\n" +
                            "Cho hoa thêm thắm, cho tình thêm hương.\n" +
                            "Thân ngà ẩn bóng trăng trong,\n" +
                            "Thướt tha vóc liễu, dịu dàng hình mai.\n" +
                            "Trăm năm duyên phận hòa hài,\n" +
                            "Cát đằng núp bóng tùng quân trọn đời.",
                    "Một cành hoa mai, một mối tình,\n" +
                            "Giữ lòng trinh trắng, khóa xuân tiêu.\n" +
                            "Phấn hương những phút cùng chung hưởng,\n" +
                            "Một mảnh tình chung kết giải đồng.\n" +
                            "*\n" +
                            "Trăm năm danh tiếng lẫy lừng,\n" +
                            "Hưởng mùi chung định một đời phong lưu.",
                    "Một cành hoa mai, một mối tình,\n" +
                            "Giữ lòng trinh trắng, khóa xuân tiêu.\n" +
                            "Phấn hương những phút cùng chung hưởng,\n" +
                            "Một mảnh tình chung kết giải đồng.\n" +
                            "*\n" +
                            "Trăm năm danh tiếng lẫy lừng,\n" +
                            "Hưởng mùi chung định một đời phong lưu.",
                    "Những đêm mưa nhẹ gió lay,\n" +
                            "Lá rơi gió thổi xạt xào tâm tư.\n" +
                            "Cô thân vơ vẩn hồn mơ,\n" +
                            "Nhớ thương, thương nhớ não nùng cô đơn.\n" +
                            "Buồn dâng tràn ngập tim côi,\n" +
                            "Lòng riêng, riêng nặng nhớ ngày hân hoan.\n" +
                            "Thuở yêu đương đá vàng hứa hẹn,\n" +
                            "Nào, một tấm tình, một dạ sắt son,\n" +
                            "Ngày nay bình vỡ gương tan,\n" +
                            "Hỡi ai lỗi đạo can thường nhớ chăng?",
                    "Cảnh sa sút, khi buồn khi tủi,\n" +
                            "Gắng cùng nhau trọn đạo gia tề.\n" +
                            "Những đêm mưa gió thảm thê,\n" +
                            "Những ngày nắng cháy da phồng quản chi.\n" +
                            "Miễn là trọn đạo phu thê,\n" +
                            "Trăm năm biển hẹn non thề thủy chung.\n" +
                            "* Xuân thu ngày tháng trôi qua,\n" +
                            "Tấm lòng son sắt mặc dầu gió mưa.",
                    "Đạo chồng vợ tình thâm nghĩa trọn,.\n" +
                            "Chữ nhơn luân chung nhịp sắt cầm..\n" +
                            "Chữ chung tình ôm ấp mộng cao thâm,\n" +
                            "Quyết níu lấy đôi tâm hồn như một.\n" +
                            "Trong dĩ vãng đạo nhơn luân đà cao tột,\n" +
                            "Hiện tại nầy ta cố gắng để noi theo.\n" +
                            "Nợ ái ân tạo hóa đã sắp bày,\n" +
                            "Nên phải sống cho vẹn niềm kim cái."
            });
            ThienCanDiaChiLuan.add(new String[]{
                    "Cũng như rồng mây tương hội, cá nước duyên ưa, vợ chồng tương đắc. Sanh con đầu lòng khó nuôi. Chỗ ăn ở dời đổi đôi ba lần. Phải tu tâm dưỡng tính mới yên, bằng không thì người vợ sẽ bị nạn chết truớc.",
                    "Cũng như rồng mây tương hội, cá nước duyên ưa, vợ chồng tương đắc. Sanh con đầu lòng khó nuôi. Chỗ ăn ở dời đổi đôi ba lần. Phải tu tâm dưỡng tính mới yên, bằng không thì người vợ sẽ bị nạn chết truớc.",
                    "Chỉ ăn ở cùng nhau một khoảng thời gian rồi phân ly. Sau rồi sẽ có vợ khác mới có con cái. Tuổi già chỉ có người con trai mà thôi.",
                    "Chỉ ăn ở cùng nhau một khoảng thời gian rồi phân ly. Sau rồi sẽ có vợ khác mới có con cái. Tuổi già chỉ có người con trai mà thôi.",
                    "Số người chồng phải có vợ lẻ, tuy vậy mà người chồng sẽ trở về với vợ lớn. Người vợ tái hợp sanh đủ con trai và con gái, vợ chồng chung sống đến già, làm ăn thịnh vượng.",
                    "Số người đàn ông phải có vợ lẻ, tuy vậy mà người đàn ông sẽ trở về với vợ lớn. Vợ tái hợp sanh đủ con trai và con gái, vợ chồng chung sống đến già, làm ăn thịnh vượng.",
                    "Vợ chồng ăn ở tâm đầu ý hiệp, thỏa chí ước ao, nhưng vì hoàn cảnh mà chồng phải có vợ thứ. Vợ sau ăn ở cũng hòa thuận và có con nên danh phận.",
                    "Thì rất tốt, làm ăn cũng có khi thịnh khi suy, nhưng chung cuộc rồi vợ chồng được sống lâu và sang giàu, con cái đông đủ. Hào con có người phát quan.",
                    "Thì rất tốt, làm ăn cũng có khi thịnh khi suy, nhưng chung cuộc rồi vợ chồng được sống lâu và sang giàu, con cái đông đủ. Hào con có người phát quan.",
                    "Nữa chừng rồi vợ chồng phải phân ly vì cung mạng xung khắc. Phải tu tâm dưỡng tính mới yên tuổi già.",
                    "Thì rất khổ nhọc trong buổi đầu, làm ăn thất bại, chừng 30 tuổi trở lên mới khá. Co ùcon nhiều, nhưng không được hiếu hạnh. Vợ chồng chung sống đến già (trước cực khổ, sau sang giàu)",
                    "Thì ăn ở tâm dầu ý hiệp, nhưng làm ăn có khi thành bại vô chừng, có của phụ ấm cũng hết. Chừng 30 tuổi trở lên mới yên. Vợ chồng chung sống đến già."
            });

            // Canh
            ThienCanDiaChiChu.add(new String[]{
                    "Bổn phận gái tề gia tần tảo.\n" +
                            "Thờ tổ tiên trọn đạo dâu con,\n" +
                            "Giữ gìn đức hạnh tiết trinh.\n" +
                            "Chữ Tùng phận gái thật là đảm đương.\n" +
                            "Trăm năm tạc một chữ đồng,\n" +
                            "Tóc xanh đến tuổi bạc đầu còn thương.\n" +
                            "Có những lúc trăng khuya gió sớm,\n" +
                            "Nhìn đàn con lẫm liệt nên người.\n" +
                            "Nhìn nhau mỉm miệng vui cười,\n" +
                            "Vợ chồng thỏa chí tạ ơn Phật Trời.",
                    "Cung đàn đã dứt đường tơ,\n" +
                            "Đứt dây dường ấy chứa chan mạch sầu.\n" +
                            "Ngày xanh đã dở dang nhau,\n" +
                            "Tuổi xanh nghĩ buổi bạc đầu lệ rơi!\n" +
                            "Vóc mai gầy võ tuyết sương,\n" +
                            "Từ đây chiếc bách cánh buồm bơ vơ.\n" +
                            "Ngại ngùng gió sớm, mưa khuya,\n" +
                            "Con côi, mẹ góa tảo tần sớm trưa.\n" +
                            "Trời đất bao la ngày tháng rộng,\n" +
                            "Mãi mãi lòng này giữ thủy chung.",
                    "Cung đàn đã dứt đường tơ,\n" +
                            "Đứt dây dường ấy chứa chan mạch sầu.\n" +
                            "Ngày xanh đã dở dang nhau,\n" +
                            "Tuổi xanh nghĩ buổi bạc đầu lệ rơi!\n" +
                            "Vóc mai gầy võ tuyết sương,\n" +
                            "Từ đây chiếc bách cánh buồm bơ vơ.\n" +
                            "Ngại ngùng gió sớm, mưa khuya,\n" +
                            "Con côi, mẹ góa tảo tần sớm trưa.\n" +
                            "Trời đất bao la ngày tháng rộng,\n" +
                            "Mãi mãi lòng này giữ thủy chung.",
                    "Thần tiên phảng phất cảnh như đây,\n" +
                            "Nặng nợ tình chung cũng như vầy.\n" +
                            "Chén rượu, cuộc cờ tùy thế cuộc,\n" +
                            "Khai hoa kết quả thỏa lòng đây.\n" +
                            "Vốn thân đã nặng tình chung thủy,\n" +
                            "Nửa bước phong trần lúc tỉnh say.\n" +
                            "Dở túi càn khôn gieo giống Lạc,\n" +
                            "Trăm năm gắn bó mảnh tâm Hồng.",
                    "Nghĩ về lối cũ mà thương,\n" +
                            "Sông quanh mấy khúc, đoạn trường mấy ai.\n" +
                            "Non cao chất ngất dạ sầu,\n" +
                            "Cảnh xưa ai vẽ đoạn sầu thê lương.\n" +
                            "Nỗi niềm lệ ứa đôi dòng,\n" +
                            "Trăm năm nát một tấm lòng từ đây!",
                    "Nghĩ về lối cũ mà thương,\n" +
                            "Sông quanh mấy khúc, đoạn trường mấy ai.\n" +
                            "Non cao chất ngất dạ sầu,\n" +
                            "Cảnh xưa ai vẽ đoạn sầu thê lương.\n" +
                            "Nỗi niềm lệ ứa đôi dòng,\n" +
                            "Trăm năm nát một tấm lòng từ đây!",
                    "Thấm thoát ngày xanh đến bạc đầu,\n" +
                            "Ngày về cõi thọ, nghĩ âu lo.\n" +
                            "Trăm năm ai giữ thân này mãi,\n" +
                            "Chạnh nghĩa tào khang, nghĩ thảm sầu.\n" +
                            "*\n" +
                            "Hớn hở hồn nàng về âm cảnh,\n" +
                            "Ngậm ngùi anh ở lại dương gian.\n" +
                            "Hẹn nhau tái ngộ chờ kiếp khác,\n" +
                            "Lưu luyến lòng anh, lụy nhỏ tràn.",
                    "Tình lỡ dở nửa đường đứt gánh,\n" +
                            "Nẻo chia ly thảm cảnh khó nguôi.\n" +
                            "Kể từ độ, vợ chồng kết tóc,\n" +
                            "Bao nhiêu năm như nước cánh bèo.\n" +
                            "Thả lòng theo nước trôi xuôi,\n" +
                            "Linh đinh âu cũng nợ đời trả vay.\n" +
                            "\n" +
                            "Thu xưa cười, thu này lại khóc!\n" +
                            "Măng khóc em, không mấy mà già.\n" +
                            "Bạn xưa khuất bóng đã qua,\n" +
                            "Cây buồn gió lặng, cỏ hoa ngậm ngùi!",
                    "Tình lỡ dở nửa đường đứt gánh,\n" +
                            "Nẻo chia ly thảm cảnh khó nguôi.\n" +
                            "Kể từ độ, vợ chồng kết tóc,\n" +
                            "Bao nhiêu năm như nước cánh bèo.\n" +
                            "Thả lòng theo nước trôi xuôi,\n" +
                            "Linh đinh âu cũng nợ đời trả vay.\n" +
                            "\n" +
                            "Thu xưa cười, thu này lại khóc!\n" +
                            "Măng khóc em, không mấy mà già.\n" +
                            "Bạn xưa khuất bóng đã qua,\n" +
                            "Cây buồn gió lặng, cỏ hoa ngậm ngùi!",
                    "Lòng tơ rướm máu vì đâu,\n" +
                            "Nỗi niềm tâm sự gối đầu cánh tay.\n" +
                            "Chuỗi ngày chua chát giấc mơ,\n" +
                            "Tương tư rỉ máu phủ mờ vết thương.\n" +
                            "Niềm đau thẩm thấu can trường,\n" +
                            "Bèo tan mây vỡ, đọan trường nhớ thương.\n" +
                            "Tình thương muốn dứt lòng thêm bận,\n" +
                            "Mãi mãi bên mình dạ chẳng khuây.",
                    "Duyên đã bén ngỡ tròn chung thủy,\n" +
                            "Tình trăm năm kẻ ngược người xuôi.\n" +
                            "Ngậm ngùi thay nẻo chia phôi,\n" +
                            "Bước đi một bước, tủi thầm biệt ly.\n" +
                            "Lỡ nhịp ái ân đành lỗi hẹn,\n" +
                            "Tình ta chỉ có bấy nhiêu thôi.",
                    "Kể từ độ đào tơ gá nghĩa,\n" +
                            "Bao nhiêu năm, mặt nước cánh bèo.\n" +
                            "Đã đành theo ngọn thủy triều,\n" +
                            "Chia tay nhau cũng bởi lòng hóa công.\n" +
                            "Người xưa khuất, nước mắt sa,\n" +
                            "Lệ lòng lai láng, muôn ngàn nhớ thương."
            });
            ThienCanDiaChiLuan.add(new String[]{
                    "Vợ chồng chung sống hạnh phúc, yên vui. Trăm năm phu xướng phụ tùy, làm ăn thạnh phát. Sanh trai gái đều đủ. Tuổi càng cao càng hưởng hạnh phúc.",
                    "Vợ chồng rất xung khắc, tuy có con cái đều đủ nhưng không cậy nhờ. Vợ chồng sớm chia cách, người chồng sẽ chết trước vợ.",
                    "Vợ chồng rất xung khắc, tuy có con cái đều đủ nhưng không cậy nhờ. Vợ chồng sớm chia cách, người chồng sẽ chết trước vợ.",
                    "Vợ chồng hạnh phúc, có con cái đều thông minh. Vợ chồng hòa thuận, nhưng gặp vận xấu lối 31, 33 tuổi, rồi cảnh nhà mới êm đẹp vinh hiển. Vợ chồng có số thọ mạng.",
                    "Vợ chồng làm ăn thường gặp trở ngại, có con cái đều đủ gái trai, người chồng không được chung tình. Người vợ phải ăn ở có đạo đức mới được. Sợ e người vợ chết trước.",
                    "Vợ chồng làm ăn thường gặp trở ngại, có con cái đều đủ gái trai, người chồng không được chung tình. Người vợ phải ăn ở có đạo đức mới được. Sợ e người vợ chết trước.",
                    "Thì cũng như ngựa chạy đường dài, gà gáy sáng. Giàu sang thình lình. Phải ăn ở có đạo đức mới giữ vững sản nghiệp. Vợ chồng chung sống đến già, con cái có đều đủ. Người vợ chết trước chồng.",
                    "Vợ chồng buổi đầu khắn khít yêu thương nồng nhiệt, nhưng nửa chừng phải phân ly, mặc dù có con cái. Chung cuộc người chồng sẽ tái hôn, làm ăn thạnh phát đến già. Có số thọ mạng.",
                    "Vợ chồng buổi đầu khắn khít yêu thương nồng nhiệt, nhưng nửa chừng phải phân ly, mặc dù có con cái. Chung cuộc người chồng sẽ tái hôn, làm ăn thạnh phát đến già. Có số thọ mạng.",
                    "Buổi đầu vợ chồng vui vẻ mặn nồng, nửa chừng lại chia cách phân ly. Tuy có con cũng không được nhờ cậy.",
                    "Vợ chồng rất xung khắc, khó ăn ở cho đến chung cuộc được, hào con sẽ có tật bệnh. Có đời vợ sau sẽ có con nên danh phận.",
                    "Cũng như cây già trổ hoa. Từ 30 tuổi gia đình gặp tai biến. Tuy có con đủ trai gái, nhưng thất bại, khi lâm chung sẽ không thấy mặt các con. Người vợ đầu tiên sẽ bị bệnh chết trước. Có vợ sau được yên vui."

            });

            // Tân
            ThienCanDiaChiChu.add(new String[]{
                    "Đêm thanh vắng, vợ chồng than thở,\n" +
                            "Cảnh nguy nan cơ cực đủ điều.\n" +
                            "Dẫu cho may rủi đến đâu,\n" +
                            "Cũng đem vàng đá mà liều với thân.\n" +
                            "Song thưa thiếu phụ thờ ơ,\n" +
                            "Một làn gió thoảng bơ phờ vóc mai.\n" +
                            "Ai đem gieo mối hận hoài,\n" +
                            "Một trời thu để đôi người sầu thu.",
                    "Trăm năm một tấm lòng mong ước,\n" +
                            "Đạo vợ chồng, số định tác thành.\n" +
                            "Lều tranh đôi mái tóc xanh,\n" +
                            "Yêu nhau như một, tấm lòng thủy chung.\n" +
                            "Tim em gởi trọn tình anh,\n" +
                            "Tháng ngày bao quản cuộc đời nắng mưa.\n" +
                            "Những khi rượu sớm trà trưa,\n" +
                            "Vui câu phu xướng phụ tùy sánh vai.",
                    "Trăm năm một tấm lòng mong ước,\n" +
                            "Đạo vợ chồng, số định tác thành.\n" +
                            "Lều tranh đôi mái tóc xanh,\n" +
                            "Yêu nhau như một, tấm lòng thủy chung.\n" +
                            "Tim em gởi trọn tình anh,\n" +
                            "Tháng ngày bao quản cuộc đời nắng mưa.\n" +
                            "Những khi rượu sớm trà trưa,\n" +
                            "Vui câu phu xướng phụ tùy sánh vai.",
                    "Đêm trăng sáng, bầu trời quang đảng,\n" +
                            "Đạo vợ chồng tha thiết như băng.\n" +
                            "Trăm năm trọn vẹn đạo hằng,\n" +
                            "Tình chồng nghĩa vợ như trăng đêm rằm.\n" +
                            "Duyên niên ta gặp nhau đây,\n" +
                            "Tháng năm vui hưởng trong vòng nhân sinh.\n" +
                            "Ở cho trọn đạo ân tình.\n" +
                            "Đẹp đôi chung thủy, vẹn câu đạo tùng.",
                    "Tình nồng thắm do nơi nguyệt lão,\n" +
                            "Sánh vai nhau trọn đạo vợ chồng.\n" +
                            "Trăm năm một tấm lòng son,\n" +
                            "Dẫu mòn bia đá, dám sai tấc lòng.\n" +
                            "Từ tuổi xanh cho đến niên cao,\n" +
                            "Vợ chồng chung hưởng tuổi trời ấm no.",
                    "Tình nồng thắm do nơi nguyệt lão,\n" +
                            "Sánh vai nhau trọn đạo vợ chồng.\n" +
                            "Trăm năm một tấm lòng son,\n" +
                            "Dẫu mòn bia đá, dám sai tấc lòng.\n" +
                            "Từ tuổi xanh cho đến niên cao,\n" +
                            "Vợ chồng chung hưởng tuổi trời ấm no.",
                    "Lứa đôi hội ngộ nhau đây,\n" +
                            "Chớ phai duyên thắm, chớ phai chữ đồng.\n" +
                            "Trăm năm vui đẹp duyên nồng,\n" +
                            "Để cho vẹn mối chỉ hồng thắm tươi.\n" +
                            "Như xuân muôn tía ngàn hồng,\n" +
                            "Như sen mùa hạ nở hoa trong hồ.",
                    "Trăng, nước có vơi, đầy, tròn, khuyết,\n" +
                            "Tình đôi ta chỉ biết thủy chung.\n" +
                            "Ngàn sao ẩn bóng trăng trong,\n" +
                            "Gió xao sóng gợn, chứng lòng sắt son.\n" +
                            "Thề duyên chớ để bất bằng,\n" +
                            "Chữ tình trong đẹp như trăng nước này.",
                    "Trăng, nước có vơi, đầy, tròn, khuyết,\n" +
                            "Tình đôi ta chỉ biết thủy chung.\n" +
                            "Ngàn sao ẩn bóng trăng trong,\n" +
                            "Gió xao sóng gợn, chứng lòng sắt son.\n" +
                            "Thề duyên chớ để bất bằng,\n" +
                            "Chữ tình trong đẹp như trăng nước này.",
                    "Vợ chồng hòa thuận yên vui,\n" +
                            "Trong vinh hoa vẫn hai bàn tay không.\n" +
                            "Tình đầm ấm hoa chiều trăng sớm,\n" +
                            "Mỗi một mùa vẻ đẹp thiếu chi.\n" +
                            "Nắm tay dìu dắt, âm thầm mến yêu.\n" +
                            "Đào tơ sen ngó từ khi,\n" +
                            "Ngây thơ đôi lứa, chung tình trăm năm.",
                    "Nào hay duyên đẹp ứa đôi ta,\n" +
                            "Một buổi chia lìa, dạ xót xa.\n" +
                            "Kẻ ở, người đi, tình lỡ dở,\n" +
                            "Ngậm ngùi duyên nợ, lệ chan hòa.\n" +
                            "*\n" +
                            "Ao nước trăm năm còn tưởng nhơ,\n" +
                            "Cảnh chiều mưa gió cậy ai đây?",
                    "Nào hay duyên đẹp ứa đôi ta,\n" +
                            "Một buổi chia lìa, dạ xót xa.\n" +
                            "Kẻ ở, người đi, tình lỡ dở,\n" +
                            "Ngậm ngùi duyên nợ, lệ chan hòa.\n" +
                            "*\n" +
                            "Ao nước trăm năm còn tưởng nhơ,\n" +
                            "Cảnh chiều mưa gió cậy ai đây?"
            });
            ThienCanDiaChiLuan.add(new String[]{
                    "Vợ chồng rất khắc kỵ, cho nên hào con không được tốt, hữu sanh vô dưỡng. Vợ chồng tuy yêu nhau, nhưng cũng gặp nhiều tai họa, thường hay lo buồn.",
                    "Vợ chồng rất đầm ấm hạnh phúc, làm ăn có lúc thịnh lúc suy, nhưng từ 30 tuổi thì phát đạt. Con cái khó nuôi. Vợ chồng chung sống đến già.",
                    "Vợ chồng rất đầm ấm hạnh phúc, làm ăn có lúc thịnh lúc suy, nhưng từ 30 tuổi thì phát đạt. Con cái khó nuôi. Vợ chồng chung sống đến già.",
                    "Vợ chồng rất tương đắc, êm đẹp như trăng thu. Tuy có lúc nghèo khó buổi đầu, về sau thì phú quí. Sanh con trai gái đều đủ, sẽ có một người thành đạt. Vợ chồng chung sống đến già, có số thọ mạng.",
                    "Vợ chồng tình nồng thắm, hạnh phúc. Cung mạng tương sanh, vợ chồng làm ăn thịnh phát. Sanh con trai gái đầy đủ. Nhưng người chồng là người có học vấn thì sau này công danh rực rỡ. Vợ chồng chung sống đến già.",
                    "Vợ chồng tình nồng thắm, hạnh phúc. Cung mạng tương sanh, vợ chồng làm ăn thịnh phát. Sanh con trai gái đầy đủ. Nhưng người chồng là người có học vấn thì sau này công danh rực rỡ. Vợ chồng chung sống đến già.",
                    "Vợ chồng ăn ở cùng nhau rất thuận hòa. Sanh con cái đông đủ, có số thọ sang. Chỉ e người chồng có thêm vợ lẽ.",
                    "Có con cái đông đủ, hào con trai phát đạt công danh. Tiểu vận ba mươi mốt tuổi gặp tai ách. Vợ chồng chung sống đến già. Nhưng người vợ thường hay đau ốm.",
                    "Có con cái đông đủ, hào con trai phát đạt công danh. Tiểu vận ba mươi mốt tuổi gặp tai ách. Vợ chồng chung sống đến già. Nhưng người vợ thường hay đau ốm.",
                    "Vợ chồng rất hòa thuận hạnh phúc, người chồng sẽ làm nên sự nghiệp, chung hưởng đến già. Vợ chồng có số thọ nhàn, song khó nuôi con.",
                    "Thì vợ chộng được êm đẹp buổi ban đầu, sau hay tranh cãi. Tuy vậy, sanh con cái đầy đủ. Sợ e người vợ phải chết trước.",
                    "Thì vợ chộng được êm đẹp buổi ban đầu, sau hay tranh cãi. Tuy vậy, sanh con cái đầy đủ. Sợ e người vợ phải chết trước."
            });

            // Nhâm
            ThienCanDiaChiChu.add(new String[]{
                    "Nhịp cầu đã bắt, tuổi ngây thơ,\n" +
                            "Đã mấy thu qua vẫn đợi chờ.\n" +
                            "Gió thổi lá vàng rơi lã chã.\n" +
                            "Năm canh đôi lứa mối tình mơ.\n" +
                            "*\n" +
                            "Nước trong ẩn bóng niềm thương,\n" +
                            "Đường đời hiểm trở, tình trường thiết tha.",
                    "Tuổi già hiu quạnh một mình,\n" +
                            "Chuyện cũ như gợi nỗi niềm năm xưa.\n" +
                            "Bạn bè cũ,bây giờ đâu vắng?\n" +
                            "Những lời xưa văng vẳng đêm thanh.\n" +
                            "Bâng khuâng non nước một mình,\n" +
                            "Nhớ hồi chuyện cũ, nhớ người tri âm.",
                    "Tuổi già hiu quạnh một mình,\n" +
                            "Chuyện cũ như gợi nỗi niềm năm xưa.\n" +
                            "Bạn bè cũ, bây giờ đâu vắng?\n" +
                            "Những lời xưa văng vẳng đêm thanh.\n" +
                            "Bâng khuâng non nước một mình,\n" +
                            "Nhớ hồi chuyện cũ, nhớ người tri âm.",
                    "Gió thu hiu hắt , nỗi cô đơn,\n" +
                            "Rả rích thêm chi giọng dế hờn.\n" +
                            "Nước chảy xuôi dòng theo bọt trắng,\n" +
                            "Lá vàng lìa cánh nhuộm dòng trong.\n" +
                            "Lạnh lùng đêm vắng, mưa hòa gió,\n" +
                            "Man mác lòng đơn, mộng lẫn sầu.\n" +
                            "Mấy độ sen tàn, nhìn cúc thắm,\n" +
                            "Lời ta than thở, mộng cô đơn!",
                    "Ôn lại chuyện xưa, chạnh nhớ nhau,\n" +
                            "Non nước xa khơi, biết tìm đâu.\n" +
                            "Trời xa, đất rộng, bao nhiêu hận,\n" +
                            "Năm, tháng còn dài giọt lệ sầu.\n" +
                            "*\n" +
                            "Những khi ngắm cảnh thêm sầu,\n" +
                            "Còn tình chăng nữa, cũng là lụy thôi!",
                    "Gió thu về, thê lương dạ ủ,\n" +
                            "Nước dòng sâu khố tả mạch sầu.\n" +
                            "Bi ca luống bận lòng đau,\n" +
                            "Trăng thu bỡ ngỡ, gió thu lạnh lùng.\n" +
                            "Bởi số kiếp phải sao chịu vậy,\n" +
                            "Bóng thời gian đưa đẩy cho qua.\n" +
                            "Tình chung hòa với đạo nhà,\n" +
                            "Trăm năm giữ vững mảnh tình thiết tha.",
                    "Ai có biết mối tình lỡ dở.\n" +
                            "Duyên kiếp nầy đã dở dang nhau.\n" +
                            "Nỗi đau như muối xát lòng,\n" +
                            "Ngày xanh chỉ để má hồng phôi pha.\n" +
                            "Xót thương chỉ hận trời qua,\n" +
                            "Niềm thương khó gởi suối vàng biết nhau.\n" +
                            "Trăm năm còn bận dạ sầu.\n" +
                            "Dầu ai hơn nữa, dạ sầu phân vân?",
                    "Kể từ tuổi tơ hồng vương vấn.\n" +
                            "Đạo vợ chồng chung hưởng tháng ngày.\n" +
                            "Tấc lòng đâu dám đơn sai,\n" +
                            "Lòng chàng ý thiếp, tâm đồng họa hai.\n" +
                            "Sách đèn, cơm áo bấy nay,\n" +
                            "Vì con tiêu hết chua cay cuộc đời.\n" +
                            "Trăm năm giữ vẹn một lời,\n" +
                            "Dầu thay mái tóc, dám lơi tấm lòng.",
                    "Đạo vợ chồng ở đời trọn kiếp,\n" +
                            "Tình đôi ta chỉ biết thủy chung.\n" +
                            "Đêm khuya ánh nguyệt dòm song,\n" +
                            "Bóng trăng soi biết tấm lòng sắt son",
                    "Đào tơ sen ngó từ lâu.\n" +
                            "Ngây thơ những ngỡ bạc đầu có nhau.\n" +
                            "Uyên ương chia rẽ lòng đau.\n" +
                            "Lạc bầy chắp cánh, thẹn ngày tuổi xuân.\n" +
                            "Tình xưa lai láng âm thầm.\n" +
                            "Bến xưa nghĩ lại, ngậm ngùi tuổi xanh.",
                    "Thề xưa giữ vẹn đạo hằng,\n" +
                            "Nguyện trăm năm một tấm lòng thủy chung.\n" +
                            "Ngâm câu phu xướng phụ tùy.\n" +
                            "Chồng hòa vợ thuận cửa nhà vẻ vang.\n" +
                            "Trăm năm hưởng phúc thanh nhàn,\n" +
                            "Khi ngâm bóng nguyệt, khi cười hoa tươi.",
                    "Thề xưa giữ vẹn đạo hằng,\n" +
                            "Nguyện trăm năm một tấm lòng thủy chung.\n" +
                            "Ngâm câu phu xướng phụ tùy.\n" +
                            "Chồng hòa vợ thuận cửa nhà vẻ vang.\n" +
                            "Trăm năm hưởng phúc thanh nhàn,\n" +
                            "Khi ngâm bóng nguyệt, khi cười hoa tươi."
            });
            ThienCanDiaChiLuan.add(new String[]{
                    "Thì rất tốt về hậu lai. Buổi đầu gặp nhiều tai ách. Vợ chồng chung sống đến già. Có số thọ nhàn. Nên giữ lòng nhân hậu, hiếu đạo thì tốt bền.",
                    "Thì vợ chồng hòa thuận. Con cái tuy đông, nhưng thường bệnh tật và khó nuôi. Chung cuộc vợ chồng được sống dai, song hiu quạnh.",
                    "Thì vợ chồng hòa thuận. Con cái tuy đông, nhưng thường bệnh tật và khó nuôi. Chung cuộc vợ chồng được sống dai, song hiu quạnh.",
                    "Thì thường bất lợi. Tuy có con cái đông, song tuổi già thường chịu cảnh cực nhọc. Người vợ thường đau ốm bệnh hoạn. Phải tu thân mới yên gia đạo.",
                    "Chồng chữ Nhâm cưới vợ tuổi Thìn thì lúc đầu đầm ấm, về sau phải phân ly, mặc dầu có con cái đông đủ.",
                    "Thì vợ chồng thường gặp nhiều trở ngại buổi ban đầu. Con cháu có đều đủ. Vợ chồng không được hòa vui, nhưng chung sống đến già.",
                    "Thì thường hay bất hòa. Khoảng trung niên thường gặp tai ách. Sanh con trai gái đều đủ. Tuy có của mà không được sung sướng. Sợ e người vợ sẽ chết trước. Nên tu nhân tích đức may qua khỏi.",
                    "Thì sanh con trai gái đều đủ và nên danh phận. Vợ chồng thường bị khẩu thiệt, nhưng vợ chồng cũng chung sống đến già.",
                    "Thì thường trở ngại bước công danh. Tuy vậy từ 30 tuổi trở lên sẽ phát đạt. Có con cái khó nuôi. Người vợ phải kiên chí thì tuổi già mới được phú quí, phong lưu. Người vợ chung sống đến tuổi cao và thọ nhàn.",
                    "Thì gặp cảnh khó khăn, công danh lỡ dở, có con không nhờ. Sợ e vợ chồng phải phân ly. Phải lấy ân đức mà ăn ở với nhau mới tốt.",
                    "Vợ chồng tương đắc, ăn ở cùng nhau đến già. Con cái đều đủ. Hậu vận làm nên. Số trường thọ.",
                    "Vợ chồng tương đắc, ăn ở cùng nhau đến già. Con cái đều đủ. Hậu vận làm nên. Số trường thọ."
            });

            // Quý
            ThienCanDiaChiChu.add(new String[]{
                    "Tuổi thơ đôi lứa yêu thương,\n" +
                            "Như trăng mới mọc, như hoa đương nồng.\n" +
                            "Cùng nhau sát cánh sớm trưa,\n" +
                            "Bữa ăn, giấc ngủ cũng chờ đợi nhau.\n" +
                            "Tình khắn khít chẳng rời một bước,\n" +
                            "Đạo cang thường trước cũng như sau.\n" +
                            "Từ tuổi xanh cho đến niên cao,\n" +
                            "Quanh mình tận hưởng chuỗi ngày ấm no.",
                    "Kể từ độ se tơ kết tóc,\n" +
                            "Tình đôi ta êm ấm, mến thương.\n" +
                            "Trăm năm vẹn đạo cang thường ,\n" +
                            "Dẫu thay mái tóc, dạ còn thương nhau.\n" +
                            "Sống chung đến tuổi bạc đầu,\n" +
                            "Trăng thu chung bóng, nắng xuân ấm lòng.",
                    "Kể từ độ se tơ kết tóc,\n" +
                            "Tình đôi ta êm ấm, mến thương.\n" +
                            "Trăm năm vẹn đạo cang thường ,\n" +
                            "Dẫu thay mái tóc, dạ còn thương nhau.\n" +
                            "Sống chung đến tuổi bạc đầu,\n" +
                            "Trăng thu chung bóng, nắng xuân ấm lòng.",
                    "Gió phảng phất bên màn trước cửa,\n" +
                            "Những đêm thanh, ngắm cảnh nhìn trăng.\n" +
                            "Trăm năm nắm giữ đạo hằng,\n" +
                            "Cho hương thêm thắm, cho tình thủy chung.\n" +
                            "Trăm năm vẹn giữ câu tùng,\n" +
                            "Đèn khuya chung bóng, đem dài sánh vai.",
                    "Dẫu nghèo nhưng chẳng phàn nàn,\n" +
                            "Trong vinh hoa có, hai bàn tay không.\n" +
                            "Buồn chi cho phải bận lòng,\n" +
                            "Vợ chồng chung sống, khó nghèo có nhau.\n" +
                            "Trăm năm ghi gắn tấm lòng,\n" +
                            "Dẫu phai mái tóc, dạ còn thương nhau.",
                    "Dẫu nghèo nhưng chẳng phàn nàn,\n" +
                            "Trong vinh hoa có, hai bàn tay không.\n" +
                            "Buồn chi cho phải bận lòng,\n" +
                            "Vợ chồng chung sống, khó nghèo có nhau.\n" +
                            "Trăm năm ghi gắn tấm lòng,\n" +
                            "Dẫu phai mái tóc, dạ còn thương nhau.",
                    "Trăm năm một mảnh tình kim cải,\n" +
                            "Sông sâu còn đó, non thề còn kia.\n" +
                            "Tấm tình chỉ biết thủy chung,\n" +
                            "Trời trong, sông rộng chứng lòng sắt son.\n" +
                            "Nước, mây phong vị êm đềm,\n" +
                            "Vợ chồng, con cháu vui tuổi già.\n" +
                            "Phận gái vẹn đạo tề gia.",
                    "Có những lúc đoàn viên đông đủ,\n" +
                            "Có những hồi phân rẽ chia ly.\n" +
                            "Nước non cây cỏ buồn hiu,\n" +
                            "Cuộc trăm năm một giấc nồng chiêm bao!\n" +
                            "Có đâu thiên vị người nào,\n" +
                            "Cũng vì số phận thiên tào xử phân.\n" +
                            "Mạng căn âu cũng số phần.",
                    "Có những lúc đoàn viên đông đủ,\n" +
                            "Có những hồi phân rẽ chia ly.\n" +
                            "Nước non cây cỏ buồn hiu,\n" +
                            "Cuộc trăm năm một giấc nồng chiêm bao!\n" +
                            "Có đâu thiên vị người nào,\n" +
                            "Cũng vì số phận thiên tào xử phân.\n" +
                            "Mạng căn âu cũng số phần.",
                    "Duyên chỉ thắm tơ tình vương vấn,\n" +
                            "Đạo vợ chồng trọn chữ thủy chung.\n" +
                            "Trăm năm kết dãi tâm đồng,\n" +
                            "Đầy nhà con thảo dâu hiền hậu lai.\n" +
                            "Trăm năm duyên nợ hòa hài.",
                    "Người trăm tuổi khi nghèo khi khá,\n" +
                            "Cũng như trăng khi khuyết khi tròn.\n" +
                            "Ai ơi! Giữ tấm lòng son,\n" +
                            "Đừng cho lay chuyển tấm lòng đôi ta.\n" +
                            "Vợ chồng chung sống đến già,\n" +
                            "Hết lao khổ đến ngày thảnh thơi.\n" +
                            "Răng long chung hưởng tuổi trời.",
                    "Người trăm tuổi khi nghèo khi khá,\n" +
                            "Cũng như trăng khi khuyết khi tròn.\n" +
                            "Ai ơi! Giữ tấm lòng son,\n" +
                            "Đừng cho lay chuyển tấm lòng đôi ta.\n" +
                            "Vợ chồng chung sống đến già,\n" +
                            "Hết lao khổ đến ngày thảnh thơi.\n" +
                            "Răng long chung hưởng tuổi trời."
            });
            ThienCanDiaChiLuan.add(new String[]{
                    "Thì rất thuận hòa. Sanh con trai gái đông đủ. Gặp năm Tuất và năm Hợi sẽ có sự thay đổi chỗ ăn ở, và phát đạt thạnh cường.",
                    "Thì rất tốt, cũng như trăng mùa Thu tỏ rạng. Vợ chồng ăn ở hòa thuận. Sanh con trái gái đều đủ. Sau nầy, có người con sẽ phát đạt giàu sang.",
                    "Thì rất tốt, cũng như trăng mùa Thu tỏ rạng. Vợ chồng ăn ở hòa thuận. Sanh con trái gái đều đủ. Sau nầy, có người con sẽ phát đạt giàu sang.",
                    "Cũng như hoa cỏ gặp mùa Xuân tươi thắm. Nhưng nữa đời phải chịu cảnh ly biệt. Phải ăn ở có đạo đức mới tốt. Sanh con đều đủ. Tuổi già sung sướng.",
                    "Thì rất tốt. Sanh con trai gái đều đủ. Chừng tuổi già thì phải chịu cảnh cơ hàn, nhưng được trường thọ.",
                    "Thì rất tốt. Sanh con trai gái đều đủ. Chừng tuổi già thì phải chịu cảnh cơ hàn, nhưng được trường thọ.",
                    "Thì rất tốt. Công danh phát đạt. Sanh con cái đều đủ và ngoan hiền. Vợ chồng chung hưởng đến già.",
                    "Mặc dù vợ chồng sanh con trai gái đều đủ, có công danh, nhưng nữa chừng cũng lở dỡ. Vợ chồng nữa đời phải phân ly.",
                    "Mặc dù vợ chồng sanh con trai gái đều đủ, có công danh, nhưng nữa chừng cũng lở dỡ. Vợ chồng nữa đời phải phân ly.",
                    "Thì rất tốt. Trăm năm gắn bó, nối tóc đến già nhưng chung cuộc phải gặp nạn. Nếu ăn ở có đạo đức thì qua khỏi. Sanh con cái và mạnh khỏe.",
                    "Thì việc làm ăn thường thất bại. Người vợ hay bệnh hoạn. Số có công danh, nhưnng nữa đời gặp phải tai ách. Phát đạt muộn. Vợ chồng chung sống đến già.",
                    "Thì việc làm ăn thường thất bại. Người vợ hay bệnh hoạn. Số có công danh, nhưnng nữa đời gặp phải tai ách. Phát đạt muộn. Vợ chồng chung sống đến già."
            });
        }
        // Luận cung mệnh
        {
            BatQue = Arrays.asList("Càn", "Khảm", "Cấn", "Chấn", "Tốn", "Ly", "Khôn", "Đoài");
            // Càn, Khảm, Cấn, Chấn, Tốn, Ly, Khôn, Đoài.

            // Càn
            {
                BatQueCungMenh.add(new String[]{
                        "(Phục Vị)\n" +
                                "Lưỡng Càn phục vị tốt vừa thôi\n" +
                                "Sợ lúc tuổi già chẳng đủ đôi\n" +
                                "Con cháu trung bình không bao phát\n" +
                                "Ruộng vườn nhà cửa lập hai nơi.\n" +
                                "Bậc trung được số giàu sang tuổi già\n" +
                                "Vợ chồng bạch thủ thanh gia\n" +
                                "Trung niên gầy dựng cửa nhà yên vui.",
                        "(Lục sát)\n" +
                                "Luồng thủy triều nguyên phước đức sinh\n" +
                                "Chăn nuôi lục sát nghiệp không thành\n" +
                                "Dâu hiền rể thảo nên khoa cử\n" +
                                "Thôn ấp ngợi khen lộc sẵn thành\n" +
                                "Lục sát phạm ắt phu thê buồn thảm\n" +
                                "Kim cải dở dang nửa đởi\n" +
                                "Duyên nợ đổi đời tương tư ly tán.",
                        "(Thiên Y)\n" +
                                "Cung vị trường sinh được hợp hòa\n" +
                                "Giàu sang nhờ cậy ở tay bà\n" +
                                "Chứa nhiều phúc đức cho con cháu\n" +
                                "Sung sướng cùng nhau đến tuổi già.\n" +
                                "May mắn cuộc đời vượng tài phấn chấn\n" +
                                "Tình yêu lửa đượm hương nồng\n" +
                                "Rể thảo, dâu hiền an nhàn hậu vận.",
                        "(Ngũ quỷ)\n" +
                                "Khẩu thiệt giao tranh có đấu tranh\n" +
                                "Vợ chồng ngũ quỷ họa tương sinh\n" +
                                "Cửa nhà ruộng đất rồi tiêu sạch\n" +
                                "Tử biệt sinh ly khó tạo thành.\n" +
                                "Trước sau bất tường nợ duyên lận đận\n" +
                                "Tâm ý chồng vợ không hòa\n" +
                                "Khiến nên sinh kế quanh năm túng quẩn.",
                        "(Hoạ hại)\n" +
                                "Càn Tốn hai cung khắc rõ ràng\n" +
                                "Cưỡng cầu kết hợp thế sao an\n" +
                                "Nếu không họa hại liên miên đến\n" +
                                "Cũng sẽ chia ly người một đi.\n" +
                                "Trước hợp sau lìa vô cùng khốn đốn\n" +
                                "Con cái trưởng thành cút côi\n" +
                                "Hình ngục oan khiến vợ chồng thương tổn.",
                        "(Tuyệt mệnh)\n" +
                                "Càn, Ly tuyệt mạng ở sao yên\n" +
                                "Sinh nở nguy nan lắm lụy phiền\n" +
                                "Tử biệt sinh ly như đợi sẵn\n" +
                                "Khó nghèo, đắc thọ, phú quy thiên.\n" +
                                "Nợ duyên cầm chắc sầu bi khóc thầm\n" +
                                "Ái ân lỡ nhịp sắc cầm\n" +
                                "Mới hay căn kiếp số phần hẩm hiu.",
                        "(Diên niên)\n" +
                                "Thiên địa càn khôn hợp một nhà\n" +
                                "Vân hành san khí phát tam đa\n" +
                                "Nhiều tài, nhiều lộc, nhiều con cái\n" +
                                "Phát đạt giàu sang thẳng đến già.\n" +
                                "Được số phước đức trường tồn ấm no\n" +
                                "Tài lộc như nước tràn vô\n" +
                                "Cửa nhà đồ sộ quy mô ruộng vườn.",
                        "(Sinh khí)\n" +
                                "Vàng thoi, vàng khối lại sinh vàng\n" +
                                "Phúc lộc diên niên tuổi thọ khang\n" +
                                "Con cháu nên danh hưng tổ nghiệp\n" +
                                "Càn, Đoài phối hợp chắc giàu sang.\n" +
                                "Êm ấm gia đạo trong ngoài yên vui\n" +
                                "Nợ duyên gắn bó trọn đời\n" +
                                "Thê vinh tứ quí số người giàu sang."
                });
            }
            // Khảm
            {
                BatQueCungMenh.add(new String[]{
                        "(Lục sát)\n" +
                                "Đăng hỏa Khảm, Càn số nghịch sinh\n" +
                                "Lương duyên phú quý sớm nên danh\n" +
                                "Có điều trai phải nhường cung vợ\n" +
                                "Nể mặt nhau cho mọi sự lành.\n" +
                                "Tang thương từ thuở hai đàn hiệp hôn\n" +
                                "Buồn cho duyên nợ long đong\n" +
                                "Bất hòa tâm lý vợ chồng đảo điên.",
                        "(Phục Vị)\n" +
                                "Lưỡng Khảm trùng cung cũng tạm nhàn\n" +
                                "Cưới nhau sớm phải chịu trùng tang\n" +
                                "Nếu bằng biệt lập xa cha mẹ\n" +
                                "Cháu con rồi sau cũng có đàn.\n" +
                                "Bình thường cuộc sống nợ duyên êm ấm\n" +
                                "Gia đạo tiền định an bài\n" +
                                "Một đời keo sơn áo cơm no ấm.",
                        "(Ngũ quỷ)\n" +
                                "Cấn, Khảm hình tương số định rồi\n" +
                                "Lấy nhau chỉ để lụy nhau thôi\n" +
                                "Cửa nhà xơ xác thân cơ cực\n" +
                                "Ngũ quỷ đeo theo cứ báo đời.\n" +
                                "Giàu có mấy lần rồi cũng phá sản\n" +
                                "Duyên nợ ắt phải lỡ làng\n" +
                                "Con cái lớn lên đàn điếm du đãng.",
                        "(Thiên Y)\n" +
                                "Nước gặp gió to dậy sóng lên\n" +
                                "Thiên y Chấn, Khảm số làm nên\n" +
                                "Cháu con đông đúc tài miên thạch\n" +
                                "Hoè quế y quan rực trước thềm.\n" +
                                "Quan lộc uy quyền đời sống sung mãn\n" +
                                "Thế vinh tử quý rõ ràng\n" +
                                "Duyên nợ vợ chồng da mồi tóc bạc.",
                        "(Sinh khí)\n" +
                                "Khảm, Tốn nên duyên phước lớn thay\n" +
                                "Thiên y, quan lộc hưởng lâu dài\n" +
                                "Cửa nhà khang lệ, chăn nuôi vượng\n" +
                                "Con cái thông minh đủ trí tài.\n" +
                                "Mạng thọ duyên bền sống vui yên ổn\n" +
                                "Số không sang nhưng no lành\n" +
                                "Gia đạo hòa thuận con cái giỏi.",
                        "(Hoạ hại)\n" +
                                "Khảm, Ly thủy hỏa chớ nên gần\n" +
                                "Phước đức dẫu nhiều cũng cách phân\n" +
                                "Nếu số xa quê mà gặp gỡ\n" +
                                "Cũng cho là tạm sống thanh bần.\n" +
                                "Ấm êm bỗng chốc tai ách buộc ràng\n" +
                                "Số phần chồng vợ đeo mang\n" +
                                "Suốt đời khổ hận sầu than đêm ngày.",
                        "(Tuyệt mệnh)\n" +
                                "Khảm, Khôn tuyệt mệnh biết làm sao\n" +
                                "Dẫu bị oan gia tự thuở nào\n" +
                                "Kết hợp cũng thành sinh tử biệt\n" +
                                "Cháu con nối bước xuống âm tào.\n" +
                                "Lo âu mắc phải dồn dập ốm đau\n" +
                                "Tiền bạc hết, biệt ly sầu\n" +
                                "Không chồng thì vợ cũng vào cõi âm.",
                        "(Diên niên)\n" +
                                "Thủy, Kim phối ngẫu hợp tương sinh\n" +
                                "Trường thọ diên niên số đã dành\n" +
                                "Cháu con hiền hiếu nên danh phận\n" +
                                "Vườn, ruộng, chăn nuôi bại hóa thành.\n" +
                                "Thủy chung như nhứt ai bì phong lưu\n" +
                                "Vợ chồng có số sang giàu\n" +
                                "Hưởng của phụ ẩm trước sau an nhàn."
                });
            }
            // Cấn
            {
                BatQueCungMenh.add(new String[]{
                        "(Thiên Y)\n" +
                                "Thủy năng dưỡng mộc vợ nuôi chồng\n" +
                                "Bởi mệnh cùng cao bà hiếp ông\n" +
                                "Con cháu đầy nhà nhờ phước đức\n" +
                                "Rể hiền, dâu thảo rạng gia phong.\n" +
                                "Phu thê dẫu có nghèo nàn không lo\n" +
                                "Trung niên được của trời cho\n" +
                                "Hậu vận sung mãn quy mô ruộng vườn.",
                        "(Ngũ quỷ)\n" +
                                "Cấn, Khảm giao hòa sự khó hòa\n" +
                                "Biến hình ngũ quỷ họa không xa\n" +
                                "Tuy sinh mà khắc vì phương vị\n" +
                                "Cháu con suy vì hại thất gia.\n" +
                                "Duyên nợ nữa đời chuốc nhiều ảm đạm\n" +
                                "Số ắt dời đổi hai lần\n" +
                                "Nếu không thì phải lâm vòng hoạn nạn.",
                        "(Phục Vị)\n" +
                                "Duyên hòa lưỡng Cấn thật gian nan\n" +
                                "Một khúc tương tư mấy nhịp đàn\n" +
                                "Nghèo khổ gần nhau, giàu cách trở\n" +
                                "Xa quê hòa hiệp số thanh nhàn.\n" +
                                "Số được vui hưởng thê hòa phu thuận\n" +
                                "Phong lưu nhàn hạ bậc trung\n" +
                                "Một đời ái tình nợ duyên an phận.",
                        "(Lục sát)\n" +
                                "Lục sát tương hình kết lứa đôi\n" +
                                "Công danh sự nghiệp nước mây trời\n" +
                                "Mẹ cha, con cháu đều suy bại\n" +
                                "Khốn khổ bi ai suốt cuộc đời.\n" +
                                "Sản nghiệp sẵn sàng lần hồi tẩu tán\n" +
                                "Phu phụ tâm lý nghịch thường\n" +
                                "Trước sau hạnh phúc gia đình hư nát.",
                        "(Tuyệt mệnh)\n" +
                                "Hai cung tuyệt mệnh chớ nên gần\n" +
                                "Cưỡng ép rồi sau họa hại thân\n" +
                                "Bịnh hoạn liên miên tiền của sạch\n" +
                                "Chồng bên núi Sở vợ sông Tần.\n" +
                                "Căn phần khó tránh tang tóc tổn thương\n" +
                                "Trong hai chắc mất một người\n" +
                                "Tử biệt đừng mong tìm phương chạy trốn.",
                        "(Hoạ hại)\n" +
                                "Cấn, Ly phước đức vốn tương sinh\n" +
                                "Phối hợp hòa vui sự nghiệp thành\n" +
                                "Nhà cửa khang trang, vườn đất rộng\n" +
                                "Cháu con hiền hiếu lập nên danh.\n" +
                                "Bất tường tai ách sầu bi gia đình\n" +
                                "Yêu đương một tấm chân tình\n" +
                                "Cũng chưa được đôi mình sánh đôi.",
                        "(Sinh khí)\n" +
                                "Cây khô gặp lửa gọi tương sinh\n" +
                                "Sớm gặp bại suy, muộn mới thành\n" +
                                "Sinh khí tuy nhiều nhưng phải chậm\n" +
                                "Cháu con rồi cũng có uy danh.\n" +
                                "Sống đời loan phụng phước tồn hậu lai\n" +
                                "Quan lộc có hươởg hoạch tài\n" +
                                "Nhà cao cửa rộng quyền uy vô cùng.",
                        " (Diên niên)\n" +
                                "Cấn, Đoài số thấy được diên niên\n" +
                                "Chồng mộc vợ kim khắc ưu phiền\n" +
                                "Giàu có ắt là cam hiếm muộn\n" +
                                "Gặp nhau xa xứ mới là yên.\n" +
                                "Đẹp duyên cá nước tiền tài hưng vượng\n" +
                                "Số này thời vận đáng mừng\n" +
                                "Nhiều con, nhiều của bậc trung thanh nhàn."
                });
            }
            // Chấn
            {
                BatQueCungMenh.add(new String[]{
                        "(Lục sát)\n" +
                                "Chấn, Càn lục sát họa đeo dày\n" +
                                "Chồng vợ bất hòa lắm đắng cay\n" +
                                "Nếu được giàu sang thì cách trở\n" +
                                "Gần nhau lệ đổ suốt canh dài.\n" +
                                "Có số phu thê âm thầm tủi hận\n" +
                                "Gia đạo lục đục bất hòa\n" +
                                "Đời sống cơ hàn, con cái lận đận.",
                        "(Thiên Y)\n" +
                                "Chấn, Khảm thiên y ấy lộc trời\n" +
                                "Cậy nhờ nước tưới lá hoa tươi\n" +
                                "Cháu con thông tuệ đề khoa bảng\n" +
                                "Lộc hưởng vinh sang phúc để đời.\n" +
                                "Trăm tuổi phu thê tình nghĩa nồng thấm\n" +
                                "Vinh hiển thụ hưởng vững bền\n" +
                                "Rể thảo dâu hiền cả nhà êm ấm.",
                        "(Ngũ quỷ)\n" +
                                "Chấn, Cấn kết duyên ngũ quỷ sinh\n" +
                                "Cửa nhà sự nghiệp lập sao thành\n" +
                                "Cháu con bịnh tật, tài hao tán\n" +
                                "Chồng vợ khổ sầu lệ trắng canh.\n" +
                                "Gia đình xáo trộn điêu tàn lửa hương\n" +
                                "Nửa chừng xuân mộng thê lương\n" +
                                "Uyên ương bỏ gánh cang thường từ đây.",
                        "(Phục Vị)\n" +
                                "Rừng cao gió mạnh vụt ào ào\n" +
                                "Hoa trái tơi bời cành lá hao\n" +
                                "Lập nghiệp gian nan mới đạt chí\n" +
                                "Phước lành cũng được hưởng về sau.\n" +
                                "Trong tình duyên nợ, tiền hậu như nhứt\n" +
                                "Có số no ấm cả đời\n" +
                                "Gia đạo yên vui trên hòa dưới thuận.",
                        "(Diên niên)\n" +
                                "Mộc, hỏa tương sinh nhưng nghịch thường\n" +
                                "Cung chồng kém vợ phải chịu nhường\n" +
                                "Dầu cho cách trở rồi sau hợp\n" +
                                "Con cháu diên niên phước thọ trường.\n" +
                                "Trung niên hậu vận sang giàu hưởng trọn\n" +
                                "Cuộc tình bền vững mặn nồng\n" +
                                "Sanh trai đầu lòng trưởng thành quan lớn.",
                        " (Sinh khí)\n" +
                                "Chấn, Ly sinh khí được giao hòa\n" +
                                "Phát đạt giàu sang rạng thất gia\n" +
                                "Con cháu lâu bền danh vọng lớn\n" +
                                "Tương lai thơm nức tiếng tăm nhà.\n" +
                                "Hiệp hôn quan hệ trọn đời thủy chung\n" +
                                "Mạng phú quý, cháu con hùng\n" +
                                "Lớn lên số ắt phước hồng quyền uy.",
                        "(Hoạ hại)\n" +
                                "Chấn, Khôn họa hại khó hòa duyên\n" +
                                "Mộc, thổ tương hiềm lắm lụy phiền\n" +
                                "Nhà cửa, ruộng vườn có cũng hết\n" +
                                "Cháu con đau ốm khổ liên miên.\n" +
                                "Nợ duyên khốn đốn dập dồn oan thiên\n" +
                                "Trong ngoài thất thế đảo điên\n" +
                                "Tai ương bịnh tật dính liền bên lưng.",
                        " (Tuyệt mệnh)\n" +
                                "Chấn, Đoài tuyệt mạng khó gần nhau\n" +
                                "Mộc khắc kim thường biết nói sao\n" +
                                "Nếu đã lỡ mà đeo khổ lụy\n" +
                                "Cháu con hoạn nạn lại xa nhau.\n" +
                                "Duyên nợ trước sau thiệt thòi lứa đôi\n" +
                                "Vợ chồng không ở trọn đời\n" +
                                "Cháu con bất lợi, cút côi lụy phiền."
                });
            }
            // Tốn
            {
                BatQueCungMenh.add(new String[]{
                        "(Hoạ hại)\n" +
                                "Tốn, Càn thủy hỏa khó yên thân\n" +
                                "Họa hại thường sinh biết mấy lần\n" +
                                "Nhà cửa lạnh lùng tiền của hết\n" +
                                "Cháu con thôi cũng chịu cơ bần.\n" +
                                "Yêu đương tác hợp buồn than đêm ngày\n" +
                                "Triền miên tai ách không hay\n" +
                                "Nợ duyên sầu muộn đắng cay cuộc đời.",
                        "(Sinh khí)\n" +
                                "Sinh khí xa xa thấy rạng rồi\n" +
                                "Vợ chồng duyên số tự nơi trời\n" +
                                "Cửa nhà rạng rỡ công danh đẹp\n" +
                                "Con cháu vinh sang nối nghiệp đời.\n" +
                                "Tiền định phu thê hiệp vầy duyên thắm\n" +
                                "Tài lộc phát vượng huy hoàng\n" +
                                "Con cái lớn lên sống đời nhung gấm.",
                        "(Tuyệt mệnh)\n" +
                                "Số ghi tuyệt mệnh khó nên duyên\n" +
                                "Đeo đẳng càng sinh nỗi lụy phiền\n" +
                                "Buồn khổ lại thêm nhiều hoạn nạn\n" +
                                "Con cháu vất vả có đâu yên.\n" +
                                "Chưa chung gối chăn ái tình thỏa mãn\n" +
                                "Số góa lẻ mạng khó toàn\n" +
                                "Duyên nợ đôi đàng rã rời ân hận.",
                        "(Diên niên)\n" +
                                "Phước đức cũng nhờ ở tổ tông\n" +
                                "Tốn, Chấn phối hợp đẹp mây rồng\n" +
                                "Cửa nhà thịnh vượng con cháu quý\n" +
                                "Đại phú do thiên tiểu phú cần.\n" +
                                "Được số phú quí trọn đời an phận\n" +
                                "Tiền bạc điền sản thặng dư\n" +
                                "Duyên nợ vợ chồng trăm năm viên mãn.",
                        "(Phục Vị)\n" +
                                "Hai Tốn yêu nhau hóa hại nhau\n" +
                                "Gần nhau thì chịu số thương đau\n" +
                                "Cửa nhà thiếu hụt con đau bịnh\n" +
                                "Gần khó xa ra mới được giàu.\n" +
                                "Bình thường đời sống, thân danh tốt\n" +
                                "Ba sinh duyên đẹp tình nồng\n" +
                                "Sự nghiệp tử tôn tấn tài vượng lộc.",
                        "(Thiên Y)\n" +
                                "Tốn, Ly phối ngẫu vốn tương hòa\n" +
                                "Cưới hỏi ba năm rạng cửa nhà\n" +
                                "Con cháu học hành đều đỗ đạt\n" +
                                "Rạng danh nhờ lập nghiệp phương xa.\n" +
                                "Mạng trường, thân thế ai bì được đâu\n" +
                                "Uy quyền tiền bạc bền lâu\n" +
                                "Nợ duyên hạnh hưởng sang giàu trăm năm.",
                        "(Ngũ quỷ)\n" +
                                "Ngũ quỷ hình tượng ám ảnh hoài\n" +
                                "Rốt rồi nam bắc cũng chia tay\n" +
                                "Nếu còn vương vấn dây con cái\n" +
                                "Cũng phải bôn ba đến xứ ngoài.\n" +
                                "Sanh cơ khốn đốn bôn chôn cũng hoài\n" +
                                "Nợ duyên vốn đã an bài\n" +
                                "Trung niên ắt phải đổi thay cuộc tình.",
                        "(Lục sát)\n" +
                                "Số sao cay đắng cực thân mình\n" +
                                "Lục sát tương xung phạm khắc hình\n" +
                                "Nhà cửa, ruộng vườn, tiền của sạch\n" +
                                "Cháu con cơ cực, lắm lênh đênh.\n" +
                                "Hiệp hôn đã thấy đeo đai khổ phiền\n" +
                                "Cửa nhà sa sút ngửa nghiêng\n" +
                                "Gây điều đổi nợ thay duyên phũ phàng."
                });
            }
            // Ly
            {
                BatQueCungMenh.add(new String[]{
                        "(Tuyệt mệnh)\n" +
                                "Ly, Càn thủy hỏa chớ nên gần\n" +
                                "Phận mỏng thà cam chịu rẽ phân\n" +
                                "Nếu được cùng nhau đầu tóc bạc\n" +
                                "Cháu con nghèo khó mạng cơ hàn.\n" +
                                "Nợ duyên gãy gánh giữa đàng thảm thương\n" +
                                "Cho hay cái số đoạn trường\n" +
                                "Lụy phiền ly tán bất tường phu thê.",
                        "(Diên niên)\n" +
                                "Chung thủy triều nguyên phước đức sanh\n" +
                                "Đường hoàng hoa lệ đẹp gia đình\n" +
                                "Cháu con hiển đạt nên danh phận\n" +
                                "Đại phú do thiên, tiểu phú cần.\n" +
                                "Được số hiển đạt phu vinh thê ấm\n" +
                                "Tình yêu hương lửa mặn nồng\n" +
                                "Tương lai con cái trưởng thành khoa bảng.",
                        "(Hoạ hại)\n" +
                                "Hai người khắc phá khó nên duyên\n" +
                                "Họa hại buồn thương lắm lụy phiền\n" +
                                "Bịnh hoạn triền miên tiền của sạch\n" +
                                "Cháu con nghèo khó lại không hiền.\n" +
                                "Tiền hậu phu thê thủy chung bất nhứt\n" +
                                "Sống đời tật ách đeo mang\n" +
                                "Vợ chồng đa đoan thiệt thòi thân phận.",
                        "(Sinh khí)\n" +
                                "Sanh khí một vầng ánh sáng tươi\n" +
                                "Đẹp duyên cầm sắt số do trời\n" +
                                "Cửa nhà cao rộng con hiền hiếu\n" +
                                "Lộc thọ vinh sang phước hưởng đời.\n" +
                                "Ý hợp tâm đầu làm nên gia thất\n" +
                                "Trọn đời nhàn hạ phong lưu\n" +
                                "Trung niên, hậu vận thành công mọi bề.",
                        "(Thiên Y)\n" +
                                "Trai Ly gái Tốn số trời dành\n" +
                                "Sớm muộn rồi đây cũng rạng danh\n" +
                                "Con cháu nhờ ơn cha mẹ để\n" +
                                "Vinh sang phước lộc thuở ngày xanh.\n" +
                                "Căn mạng nợ duyên trời cho yên ổn\n" +
                                "Cả đời ấm cúng giàu sang\n" +
                                "Con cái gái trai vẹn toàn căn bổn.",
                        "(Phục Vị)\n" +
                                "Lưỡng Ly chưa hợp thấy mòi suy\n" +
                                "Hai hỏa gặp nhau tắt có khi\n" +
                                "Nghèo khó bên nhau, giàu tử biệt\n" +
                                "Vợ chồng đôi ngả, con phân ly.\n" +
                                "Ái tình, hương lửa trọn đời thủy chung\n" +
                                "Tiền bạc giàu có bậc trung\n" +
                                "Thân, danh hậu vận lẫy lừng tiếng thơm.",
                        "(Lục sát)\n" +
                                "Một giải ngân hà đã trải ra\n" +
                                "Vì phương lục sát khó giao hòa\n" +
                                "Chăn nuôi, vườn ruộng không nên nghiệp\n" +
                                "Gặp gỡ xa quê tạm gọi là.\n" +
                                "Kiết hung luân chuyển dập dồn âu lo\n" +
                                "Trai sa đọa, gái lẳng lơ\n" +
                                "Trước sau rồi cũng hững hờ nợ duyên.",
                        "(Ngũ quỷ)\n" +
                                "Hai ngôi ngũ quỷ khắc xung hình\n" +
                                "Gặp gỡ sau, sao cũng phát sinh\n" +
                                "Tang tóc mẹ cha sầu tử tức\n" +
                                "Mỗi người một ngả hận ly tình.\n" +
                                "Tiền bạc bạo phát nhưng hoài công lao\n" +
                                "Nửa đời căn kiếp ba đào\n" +
                                "Cửa nhà điền sản tiêu hao không còn."
                });
            }
            // Khôn
            {
                BatQueCungMenh.add(new String[]{
                        "(Diên niên)\n" +
                                "Diên niên ấy phước lộc miên trường\n" +
                                "Con cháu lâu dài hướng thọ xương\n" +
                                "Dựng nghiệp chuyên cần lại tính thiện\n" +
                                "Trai hiền, rể hiếu rạng gia tiên.\n" +
                                "Hay duyên phải nợ tiền căn định phần\n" +
                                "Bổn mạng lại có quý nhân\n" +
                                "Được số phú quý vinh thân an nhàn.",
                        "(Tuyệt mệnh)\n" +
                                "Khảm, Khôn số khắc khó nên duyên\n" +
                                "Nếu giàu thì yểu, khó nghèo yên\n" +
                                "Cháu con vất vả thân đa bịnh\n" +
                                "Gia đạo suy vì lắm lụy phiền.\n" +
                                "Căn phần duyên nợ chuốc lấy sầu thảm\n" +
                                "Số phải dở dang nửa đời\n" +
                                "Chồng vợ hai người đổi dời ly tán.",
                        "(Sinh khí)\n" +
                                "Phải chịu gian nan, cực buổi đầu\n" +
                                "Ba năm nghĩ cũng chẳng bao lâu\n" +
                                "Sau này phước lộc trời cho đó\n" +
                                "Nhà cửa vinh quang lọ phải cầu.\n" +
                                "Sinh cơ mọi bề thời hưng phấn chấn\n" +
                                "Gia đạo trước sau hòa thuận\n" +
                                "Thừa thãi trong ngoài ruộng vườn điền sản.",
                        "(Hoạ hại)\n" +
                                "Họa hại trùng trùng kéo tới đây\n" +
                                "Chấn, Khôn khó hợp nợ duyên này\n" +
                                "Sống lâu thêm khổ, sầu ly biệt\n" +
                                "Con cháu vô can bị vạ lây.\n" +
                                "Không hình ngục thì cũng bị bịnh tật\n" +
                                "Duyên nợ lắm vấp buồn khổ\n" +
                                "Đời sống lầm thang, sinh cơ chật vật.",
                        "(Ngũ quỷ)\n" +
                                "Hồi ở xa nhau, thương nhớ nhau\n" +
                                "Gần nhau không cãi cũng sinh đau\n" +
                                "Trong nhà ngũ quỷ năm phương dậy\n" +
                                "Kết cuộc nhà xiêu, gió thổi nhào.\n" +
                                "Cuộc đời vật chất số cực thiếu thốn\n" +
                                "Duyên nợ lận đận nghịch thường\n" +
                                "Con cái bất hòa lớn lên cùng khốn.",
                        "(Lục sát)\n" +
                                "Lục sát hình xung khó kết thành\n" +
                                "Ngân hà trắng xóa nước mênh mông\n" +
                                "Tha phương gặp gỡ còn nhàn hạ\n" +
                                "Một xứ giao hòa, họa hại sinh.\n" +
                                "Duyên nợ ắt chịu sầu bi tháng ngày\n" +
                                "Đa truân hộ hụy nạn tai\n" +
                                "Căn định lục hại tương lai mơ hồ.",
                        "(Phục Vị)\n" +
                                "Tai nạn liên miên, khổ dập dồn\n" +
                                "Nếu tình duyên kết Khôn với Khôn\n" +
                                "Công danh sự nghiệp mòn con mắt\n" +
                                "Kẻ ở, người đi cách nước non.\n" +
                                "Keo sơn gắn bó cháu con vẹn toàn\n" +
                                "Trung niên mấy lượt thăng trầm\n" +
                                "Hậu vận phú quý trăm phần phong lưu.",
                        "(Thiên Y)\n" +
                                "Thiên y kim, thổ lộc trời ban\n" +
                                "Phước thọ miên trường con cháu sang\n" +
                                "Ruộng vườn, nhà cửa đầy mỹ lệ\n" +
                                "Trăm năm vui hưởng chữ bình an.\n" +
                                "Mạng cường hưởng thọ, tài lộc bền lâu"
                });
            }
            // Đoài
            {
                BatQueCungMenh.add(new String[]{
                        " (Sinh khí)\n" +
                                "Đoài, Càn phước đức lớn vô cùng\n" +
                                "Kim thủy tương sinh được ở chung\n" +
                                "Con cháu sau này thành đại nghiệp\n" +
                                "Trai hiền, gái hiếu vẹn can tùng.\n" +
                                "Hôn nhân bền vững lộc quan vượng tài\n" +
                                "Sanh cơ vốn một lời hai\n" +
                                "Lầu cao cửa rộng gái trai ngoan hiền.",
                        "(Hoạ hại)\n" +
                                "Đoài, Khảm họa hại mà tương sinh\n" +
                                "Gặp nhau xa xứ chắc nên danh\n" +
                                "Dẫu không phú quý, vinh hoa lớn\n" +
                                "Cũng hưởng an khang, con cháu vinh.\n" +
                                "Tai ương tật ách dồn dập thê thảm\n" +
                                "Nửa đời thân phận sanh ly\n" +
                                "Phu thê lâm vòng trái ngang lãnh đạm.",
                        "(Diên niên)\n" +
                                "Cháu quí, con vinh, phước đức nhân\n" +
                                "Diên niên ấy phước tự trời ban\n" +
                                "Đầu xanh yêu kính như đầu bạc\n" +
                                "Không được giàu to cũng được sang.\n" +
                                "Phụ ấm sẵn dành bề tài lợi tấn\n" +
                                "Gia đạo thê tử êm ấm\n" +
                                "Duyên nợ trọn đời lửa hương nồng thắm.",
                        " (Tuyệt mệnh)\n" +
                                "Mộc khắc kim thường quá rõ ràng\n" +
                                "Chấn, Đoài tương hợp khó bình an\n" +
                                "Nếu không nghèo khổ, nhiều đau bịnh\n" +
                                "Ắt cũng chia ly người một đàng.\n" +
                                "Chăn gối ái tình khó yên thân phận\n" +
                                "Bỗn lụy phiền, duyên nợ lìa tan\n" +
                                "Cầm bằng căn kiếp đa truân lận đận.",
                        "(Lục sát)\n" +
                                "Trái số nên không trọn nợ duyên\n" +
                                "Hình xung lục sát ở sao yên\n" +
                                "Công danh, tài lộc cầu không được\n" +
                                "Tử biệt sinh ly con cháu phiền.\n" +
                                "Xáo trộn gia đình sanh cơ khốn đốn\n" +
                                "Con cái lớn nhỏ bất tường\n" +
                                "Tình nghĩa lạt phai lăng loàn hỗn độn.",
                        "(Ngũ quỷ)\n" +
                                "Mẹ cha tang tóc cháu con buồn\n" +
                                "Ngũ quỷ phạm thì giọt lệ tuôn\n" +
                                "Đa sinh bịnh tật, đa tai nạn\n" +
                                "Vui ở, buồn bay, mỏng cánh chuồn.\n" +
                                "Cố công cho mấy ra gì kiếp sanh\n" +
                                "Nợ duyên như sợi chỉ mành\n" +
                                "Thân danh sự nghiệp bất thành không sai.",
                        "(Thiên Y)\n" +
                                "Trời dành cung số được thiên y\n" +
                                "Hợp mặt đủ đầy có thiếu chi\n" +
                                "Nhà cửa đường hoàng, vườn ruộng tốt\n" +
                                "Cháu con vinh hiển mấy ai bì.\n" +
                                "Một đàn thê tử vuông tròn giàu sang\n" +
                                "Gia đình sau trước huy hoàng\n" +
                                "Trung niên hậu vận rõ ràng nghiệp danh.",
                        "(Phục Vị)\n" +
                                "Nhật lạc non Đoài sương sắp rơi\n" +
                                "Gặp nhau rồi cũng cách đôi nơi\n" +
                                "Nếu không khăn trắng trùm lên tóc\n" +
                                "Thì khổ triền miên cả cuộc đời.\n" +
                                "Bình thường thì cũng tiền tài bậc trung\n" +
                                "Gia đình thân mạng thung dung\n" +
                                "Trưởng thành con cháu đẹp lòng mẹ cha."
                });
            }
        }
    }

    public List<String[]> getTuoiAm60() {
        return TuoiAm60;
    }

    public List<String[]> getMenh60() {
        return Menh60;
    }

    public List<String[]> getThienCanDiaChiChu() {
        return ThienCanDiaChiChu;
    }

    public List<String[]> getThienCanDiaChiLuan() {
        return ThienCanDiaChiLuan;
    }

    public List<String> getBatQue() {
        return BatQue;
    }

    public List<String[]> getBatQueCungMenh() {
        return BatQueCungMenh;
    }

    public List<String> getThienCan() {
        return ThienCan;
    }

    public List<String> getDiaChi() {
        return DiaChi;
    }
}

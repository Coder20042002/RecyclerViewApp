package com.example.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcVData;
    private PaperAdapter paperAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcVData = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcVData.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rcVData.addItemDecoration(itemDecoration);


        paperAdapter = new PaperAdapter(this,getLisPaper());
        rcVData.setAdapter(paperAdapter);
    }

    private List<Paper> getLisPaper() {
        List<Paper> list = new ArrayList<>();
        list.add(new Paper(R.drawable.b,"Messi giành FIFA The Best 2022: Lập kỷ lục mới, chính thức vượt Ronaldo","Siêu sao người Argentina, Lionel Messi vừa giành giải thưởng \"FIFA The Best 2022\" - \"Cầu thủ nam xuất sắc nhất năm 2022\" do liên đoàn bóng đá thế giới tổ chức và bình chọn. Tiền đạo 35 tuổi vượt qua hai ứng cử viên nặng ký khác là Kylian Mbappe và Karim Benzema để đoạt giải thưởng này. \n Kết quả này đã được dự đoán từ trước bởi Lionel Messi đã thi đấu tuyệt hay tại VCK World Cup 2022 giúp ĐT Argentina có lần thứ 3 đứng trên đỉnh thế giới. Số 10 của ĐT Argentina nhận giải thưởng \"Cầu thủ xuất sắc nhất World Cup 2022\" và về nhì trong cuộc đua \"Vua phá lưới World Cup 2022\" khi kém đúng 1 bàn so với Kylian Mbappe của ĐT Pháp. \n" +
                "\n" +
                "Tính riêng trong năm 2022, siêu sao người Argentina chơi 51 trận tính trên mọi đấu trường, ghi được 35 bàn thắng và kiến tạo 30 lần. Như vậy trung bình, Messi chỉ cần 69 phút để góp dấu giày trong bàn thắng của đội nhà tính trên mọi đấu trường. \n" +
                "\n" +
                "Đây là lần thứ 7 trong sự nghiệp Lionel Messi giành giải thưởng \"Cầu thủ nam xuất sắc nhất năm\" do FIFA bình chọn, nhiều nhất trong lịch sử. Nếu tính riêng kể từ khi \"FIFA The Best\" ra đời, đây là lần thứ hai Messi nhận giải thưởng này, bằng với Cristiano Ronaldo và Robert Lewandowski.\n" +
                "\n" +
                "Siêu sao người Argentina giành danh hiệu này trong cả 3 phiên bản \"FIFA World Player of the year\" (1991-2009), \"FIFA Ballon d'Or\" (2010-2015, giai đoạn gộp chung với danh hiệu \"Quả bóng vàng\") và \"FIFA The Best\" (2016-nay). "));
        list.add(new Paper(R.drawable.c,"Tranh cãi FIFA The Best: Ronaldo gây sốc, Messi bầu Mbappe thứ mấy?","Rạng sáng 28/2 (giờ Việt Nam), Messi đã được vinh danh là cầu thủ nam xuất sắc nhất năm 2022 tại buổi lễ FIFA The Best, đánh bại người đồng đội ở PSG là Kylian Mbappe và đương kim Quả bóng vàng Karim Benzema. Messi nhận được 52 phiếu so với 44 của Mbappe, trong khi Benzema đứng thứ ba với 34 phiếu. \nCác phiếu bầu được thực hiện bởi những người hâm mộ, HLV và đội trưởng các đội tuyển quốc gia và 300 nhà báo từ các quốc gia khác nhau. Với tư cách là đội trưởng Argentina, Messi được phép bỏ phiếu và anh đã bầu cho Neymar xếp trên Mbappe và Benzema.\n" +
                "\n" +
                "Messi có mối quan hệ hết sức thân thiết với Neymar cả trong lẫn ngoài sân cỏ từ thời còn chơi cho Barcelona cho đến khi hai người tái hợp ở PSG. Tuy nhiên, Mbappe đã tận hưởng một năm 2022 đáng nhớ, với điểm nhấn là cú hat-trick vào lưới Argentina của chính Messi trong trận chung kết World Cup 2022 đầy kịch tính.\n" +
                "\n" +
                "Trong khi đó, Cristiano Ronaldo thậm chí không bỏ phiếu dù anh đeo băng đội trưởng Bồ Đào Nha ở World Cup 2022 và kể từ đó không có thông báo nào cho thấy CR7 bị tước băng thủ quân. FIFA xác nhận rằng Pepe đã bỏ phiếu thay mặt cho đội tuyển Bồ Đào Nha."));
        list.add(new Paper(R.drawable.d,"Ronaldo vắng mặt ở đội hình tiêu biểu sau 15 năm, bị FIFA \"dìm hàng\" gây phẫn nộ","Người hâm mộ tỏ ra bức xúc khi FIFA có hành động thiếu tôn trọng dành cho Ronaldo ở lễ trao giải FIFA The Best.\n" +
                "Rạng sáng 28/2 (giờ Việt Nam), Lễ trao giải FIFA The Best 2022 đã khép lại với chiến thắng ở hạng mục \"Nam cầu thủ xuất sắc nhất năm\" thuộc về Lionel Messi. Bên cạnh đó, một hạng mục đáng chú ý khác là \"Đội hình xuất sắc nhất năm của FIFA\" (FIFA FIFPRO Men's World 11) cũng chính thức lộ diện 11 cái tên được vinh danh. \n \"Đội hình xuất sắc nhất\" được bầu chọn trong khoảng thời gian từ 8/8/2021 tới 18/12/2022, do 18.640 cầu thủ chuyên nghiệp tham gia bỏ phiếu.\n" +
                "\n" +
                "Đáng chú ý, Cristiano Ronaldo không có tên bất chấp lọt vào vòng đề cử cuối cùng. Thay vào đó, Lionel Messi, Erling Haaland, Kylian Mbappe và Karim Benzema là những cái tên được lựa chọn ở vị trí tiền đạo. Siêu sao 38 tuổi cũng không tham dự lễ trao giải năm nay.\n" +
                "\n" +
                "Theo thống kê, đây là lần đầu tiên kể từ năm 2006, Ronaldo vắng mặt trong đội hình tiêu biểu FIFA. Trước đó, siêu sao 38 tuổi chia sẻ kỷ lục 15 lần góp mặt ở \"Đội hình tiêu biểu\" với Messi. Giờ đây, với lần thứ 16 được xướng tên, Messi đã độc chiếm kỷ lục này.\n" +
                "\n" +
                "Khi chiếu đoạn video những khoảnh khắc đáng nhớ ở World Cup 2022 , FIFA bất ngờ đưa hình ảnh Ronaldo ngồi dự bị với khuôn mặt không mấy vui vẻ thay vì khoảnh khắc anh ghi bàn hoặc ăn mừng. Chính vì vậy, trên mạng xã hội, người hâm mộ chỉ trích dữ dội FIFA và ban tổ chức The Best, đồng thời cho rằng hành động này thể hiện sự thiếu tôn trọng với Ronaldo:\n" +
                "\n" +
                "\"Họ (FIFA) một lần nữa thiếu tôn trọng Ronaldo\".\n" +
                "\n" +
                "\"Đây không phải lần đầu tiên Ronaldo bị đối xử như vậy\".\n" +
                "\n" +
                "\"Thật chẳng hay ho gì khi FIFA thiếu tôn trọng một huyền thoại như vậy. Tại sao họ lại đăng clip Ronaldo ngồi dự bị dù có nhiều clip khác về anh ấy?\"."));
        list.add(new Paper(R.drawable.e,"Messi \"trốn con\" dẫn vợ đi nhận giải The Best: Phát biểu xúc động, cái kết bất ngờ","Đúng như dự đoán của nhiều người, Lionel Messi kết thúc năm 2022 đầy viên mãn khi nhận giải \"Cầu thủ nam xuất sắc nhất năm\" do FIFA bình chọn. Mặc dù Kylian Mbappe và Karim Benzema cũng đã có một năm thi đấu cực kỳ xuất sắc nhưng siêu sao người Argentina lấn át tất cả với chức vô địch World Cup 2022. \n Theo bảng điểm được công bố từ FIFA, Messi nhận được 728 điểm bình chọn từ các HLV ĐTQG, 717 điểm từ đội trưởng của các ĐTQG, 836 điểm từ giới truyền thông, 52 điểm từ số bàn thắng và 1.345.851 điểm từ các CĐV. Những con số này vượt trội hơn hẳn so với hai người còn lại trong đề cử ở mọi loại điểm. \n" +
                "\n" +
                "Sau khi nhận giải thưởng từ chủ tịch FIFA Gianni Infantino, siêu sao người Argentina đã có những lời phát biểu cực kỳ xúc động. \"Tôi nghĩ rằng mình là người lo lắng nhất trong lễ trao giải ngày hôm nay. Đây là một niềm vinh hạnh khi được đứng ở đây một lần nữa cùng Benzema dù anh ấy không ở đây ngày hôm nay và Kylian (Mbappe). Cả hai đã có một năm rất thành công. \n" +
                "\n" +
                "Tôi muốn gửi lời cảm ơn tới những đồng đội, HLV Scaloni, Dibu (tên thân mật của Emiliano Martinez). Hai người cũng có mặt và giành giải thưởng trong ngày hôm nay. Giải thưởng này có một phần của họ. Đây là thành quả và công sức của cả một tập thể trong suốt một thời gian dài. \n Đối với tôi, năm 2022 là một năm thực sự điên rồ. Tôi đã thực hiện được ước mơ lớn nhất trong cuộc đời sau nhiều năm chiến đấu không ngừng nghỉ. Đó là giấc mơ đối với bất kỳ cầu thủ nào trên thế giới nhưng rất ít người có thể chạm tay tới. Cuối cùng, tôi cũng thực hiện được. Đó quả thật là điều tuyệt vời. \n" +
                "\n" +
                "Tôi cũng xin gửi lời cảm ơn tới những người thân trong gia đình. Đó là điểm tựa vững chắc của tôi trong suốt những năm qua. Tôi cũng xin gửi lời cảm ơn tới người dân Argentina. Chúng tôi đã sống trong một tháng thật đặc biệt và chắc chắn còn trong tâm trí mỗi người trong nhiều năm nữa\".\n" +
                "\n" +
                "Lionel Messi kết thúc bài phát biểu của mình bằng cách đầy bất ngờ khi nhắc nhở 3 cậu nhóc \"đi ngủ sớm\". \"Tôi muốn gửi nụ hôn tới những cậu nhóc của tôi. Chúng không có mặt ở đây ngay hôm nay. Bố biết các con vẫn đang xem lễ trao giải này nhưng nhớ đi ngủ ngay sau khi kết thúc nhé\". Siêu sao người Argentina chỉ dẫn cô vợ Antonela Roccuzzo tới lễ trao thưởng năm nay."));
        list.add(new Paper(R.drawable.b,"Messi giành FIFA The Best 2022: Lập kỷ lục mới, chính thức vượt Ronaldo","Siêu sao người Argentina, Lionel Messi vừa giành giải thưởng \"FIFA The Best 2022\" - \"Cầu thủ nam xuất sắc nhất năm 2022\" do liên đoàn bóng đá thế giới tổ chức và bình chọn. Tiền đạo 35 tuổi vượt qua hai ứng cử viên nặng ký khác là Kylian Mbappe và Karim Benzema để đoạt giải thưởng này. \n Kết quả này đã được dự đoán từ trước bởi Lionel Messi đã thi đấu tuyệt hay tại VCK World Cup 2022 giúp ĐT Argentina có lần thứ 3 đứng trên đỉnh thế giới. Số 10 của ĐT Argentina nhận giải thưởng \"Cầu thủ xuất sắc nhất World Cup 2022\" và về nhì trong cuộc đua \"Vua phá lưới World Cup 2022\" khi kém đúng 1 bàn so với Kylian Mbappe của ĐT Pháp. \n" +
                "\n" +
                "Tính riêng trong năm 2022, siêu sao người Argentina chơi 51 trận tính trên mọi đấu trường, ghi được 35 bàn thắng và kiến tạo 30 lần. Như vậy trung bình, Messi chỉ cần 69 phút để góp dấu giày trong bàn thắng của đội nhà tính trên mọi đấu trường. \n" +
                "\n" +
                "Đây là lần thứ 7 trong sự nghiệp Lionel Messi giành giải thưởng \"Cầu thủ nam xuất sắc nhất năm\" do FIFA bình chọn, nhiều nhất trong lịch sử. Nếu tính riêng kể từ khi \"FIFA The Best\" ra đời, đây là lần thứ hai Messi nhận giải thưởng này, bằng với Cristiano Ronaldo và Robert Lewandowski.\n" +
                "\n" +
                "Siêu sao người Argentina giành danh hiệu này trong cả 3 phiên bản \"FIFA World Player of the year\" (1991-2009), \"FIFA Ballon d'Or\" (2010-2015, giai đoạn gộp chung với danh hiệu \"Quả bóng vàng\") và \"FIFA The Best\" (2016-nay). "));
        list.add(new Paper(R.drawable.c,"Tranh cãi FIFA The Best: Ronaldo gây sốc, Messi bầu Mbappe thứ mấy?","Rạng sáng 28/2 (giờ Việt Nam), Messi đã được vinh danh là cầu thủ nam xuất sắc nhất năm 2022 tại buổi lễ FIFA The Best, đánh bại người đồng đội ở PSG là Kylian Mbappe và đương kim Quả bóng vàng Karim Benzema. Messi nhận được 52 phiếu so với 44 của Mbappe, trong khi Benzema đứng thứ ba với 34 phiếu. \nCác phiếu bầu được thực hiện bởi những người hâm mộ, HLV và đội trưởng các đội tuyển quốc gia và 300 nhà báo từ các quốc gia khác nhau. Với tư cách là đội trưởng Argentina, Messi được phép bỏ phiếu và anh đã bầu cho Neymar xếp trên Mbappe và Benzema.\n" +
                "\n" +
                "Messi có mối quan hệ hết sức thân thiết với Neymar cả trong lẫn ngoài sân cỏ từ thời còn chơi cho Barcelona cho đến khi hai người tái hợp ở PSG. Tuy nhiên, Mbappe đã tận hưởng một năm 2022 đáng nhớ, với điểm nhấn là cú hat-trick vào lưới Argentina của chính Messi trong trận chung kết World Cup 2022 đầy kịch tính.\n" +
                "\n" +
                "Trong khi đó, Cristiano Ronaldo thậm chí không bỏ phiếu dù anh đeo băng đội trưởng Bồ Đào Nha ở World Cup 2022 và kể từ đó không có thông báo nào cho thấy CR7 bị tước băng thủ quân. FIFA xác nhận rằng Pepe đã bỏ phiếu thay mặt cho đội tuyển Bồ Đào Nha."));
        list.add(new Paper(R.drawable.d,"Ronaldo vắng mặt ở đội hình tiêu biểu sau 15 năm, bị FIFA \"dìm hàng\" gây phẫn nộ","Người hâm mộ tỏ ra bức xúc khi FIFA có hành động thiếu tôn trọng dành cho Ronaldo ở lễ trao giải FIFA The Best.\n" +
                "Rạng sáng 28/2 (giờ Việt Nam), Lễ trao giải FIFA The Best 2022 đã khép lại với chiến thắng ở hạng mục \"Nam cầu thủ xuất sắc nhất năm\" thuộc về Lionel Messi. Bên cạnh đó, một hạng mục đáng chú ý khác là \"Đội hình xuất sắc nhất năm của FIFA\" (FIFA FIFPRO Men's World 11) cũng chính thức lộ diện 11 cái tên được vinh danh. \n \"Đội hình xuất sắc nhất\" được bầu chọn trong khoảng thời gian từ 8/8/2021 tới 18/12/2022, do 18.640 cầu thủ chuyên nghiệp tham gia bỏ phiếu.\n" +
                "\n" +
                "Đáng chú ý, Cristiano Ronaldo không có tên bất chấp lọt vào vòng đề cử cuối cùng. Thay vào đó, Lionel Messi, Erling Haaland, Kylian Mbappe và Karim Benzema là những cái tên được lựa chọn ở vị trí tiền đạo. Siêu sao 38 tuổi cũng không tham dự lễ trao giải năm nay.\n" +
                "\n" +
                "Theo thống kê, đây là lần đầu tiên kể từ năm 2006, Ronaldo vắng mặt trong đội hình tiêu biểu FIFA. Trước đó, siêu sao 38 tuổi chia sẻ kỷ lục 15 lần góp mặt ở \"Đội hình tiêu biểu\" với Messi. Giờ đây, với lần thứ 16 được xướng tên, Messi đã độc chiếm kỷ lục này.\n" +
                "\n" +
                "Khi chiếu đoạn video những khoảnh khắc đáng nhớ ở World Cup 2022 , FIFA bất ngờ đưa hình ảnh Ronaldo ngồi dự bị với khuôn mặt không mấy vui vẻ thay vì khoảnh khắc anh ghi bàn hoặc ăn mừng. Chính vì vậy, trên mạng xã hội, người hâm mộ chỉ trích dữ dội FIFA và ban tổ chức The Best, đồng thời cho rằng hành động này thể hiện sự thiếu tôn trọng với Ronaldo:\n" +
                "\n" +
                "\"Họ (FIFA) một lần nữa thiếu tôn trọng Ronaldo\".\n" +
                "\n" +
                "\"Đây không phải lần đầu tiên Ronaldo bị đối xử như vậy\".\n" +
                "\n" +
                "\"Thật chẳng hay ho gì khi FIFA thiếu tôn trọng một huyền thoại như vậy. Tại sao họ lại đăng clip Ronaldo ngồi dự bị dù có nhiều clip khác về anh ấy?\"."));
        list.add(new Paper(R.drawable.e,"Messi \"trốn con\" dẫn vợ đi nhận giải The Best: Phát biểu xúc động, cái kết bất ngờ","Đúng như dự đoán của nhiều người, Lionel Messi kết thúc năm 2022 đầy viên mãn khi nhận giải \"Cầu thủ nam xuất sắc nhất năm\" do FIFA bình chọn. Mặc dù Kylian Mbappe và Karim Benzema cũng đã có một năm thi đấu cực kỳ xuất sắc nhưng siêu sao người Argentina lấn át tất cả với chức vô địch World Cup 2022. \n Theo bảng điểm được công bố từ FIFA, Messi nhận được 728 điểm bình chọn từ các HLV ĐTQG, 717 điểm từ đội trưởng của các ĐTQG, 836 điểm từ giới truyền thông, 52 điểm từ số bàn thắng và 1.345.851 điểm từ các CĐV. Những con số này vượt trội hơn hẳn so với hai người còn lại trong đề cử ở mọi loại điểm. \n" +
                "\n" +
                "Sau khi nhận giải thưởng từ chủ tịch FIFA Gianni Infantino, siêu sao người Argentina đã có những lời phát biểu cực kỳ xúc động. \"Tôi nghĩ rằng mình là người lo lắng nhất trong lễ trao giải ngày hôm nay. Đây là một niềm vinh hạnh khi được đứng ở đây một lần nữa cùng Benzema dù anh ấy không ở đây ngày hôm nay và Kylian (Mbappe). Cả hai đã có một năm rất thành công. \n" +
                "\n" +
                "Tôi muốn gửi lời cảm ơn tới những đồng đội, HLV Scaloni, Dibu (tên thân mật của Emiliano Martinez). Hai người cũng có mặt và giành giải thưởng trong ngày hôm nay. Giải thưởng này có một phần của họ. Đây là thành quả và công sức của cả một tập thể trong suốt một thời gian dài. \n Đối với tôi, năm 2022 là một năm thực sự điên rồ. Tôi đã thực hiện được ước mơ lớn nhất trong cuộc đời sau nhiều năm chiến đấu không ngừng nghỉ. Đó là giấc mơ đối với bất kỳ cầu thủ nào trên thế giới nhưng rất ít người có thể chạm tay tới. Cuối cùng, tôi cũng thực hiện được. Đó quả thật là điều tuyệt vời. \n" +
                "\n" +
                "Tôi cũng xin gửi lời cảm ơn tới những người thân trong gia đình. Đó là điểm tựa vững chắc của tôi trong suốt những năm qua. Tôi cũng xin gửi lời cảm ơn tới người dân Argentina. Chúng tôi đã sống trong một tháng thật đặc biệt và chắc chắn còn trong tâm trí mỗi người trong nhiều năm nữa\".\n" +
                "\n" +
                "Lionel Messi kết thúc bài phát biểu của mình bằng cách đầy bất ngờ khi nhắc nhở 3 cậu nhóc \"đi ngủ sớm\". \"Tôi muốn gửi nụ hôn tới những cậu nhóc của tôi. Chúng không có mặt ở đây ngay hôm nay. Bố biết các con vẫn đang xem lễ trao giải này nhưng nhớ đi ngủ ngay sau khi kết thúc nhé\". Siêu sao người Argentina chỉ dẫn cô vợ Antonela Roccuzzo tới lễ trao thưởng năm nay."));
        return list;

    }
}

public class main {
	public static void main(String[] args) {
        // Tạo lớp trưởng
        LopTruong lopTruong = new LopTruong("Lớp CNTT K17","Dinh Nguyen Chung");

        // Tạo sinh viên
        SinhVien sv1 = new SinhVien("Nguyễn Văn A");
        SinhVien sv2 = new SinhVien("Trần Thị B");
        SinhVien sv3 = new SinhVien("Lê Hoàng C");

        // Đăng ký sinh viên vào danh sách nhận thông báo
        lopTruong.attach(sv1);
        lopTruong.attach(sv2);
        lopTruong.attach(sv3);

        // Lớp trưởng gửi thông báo
        lopTruong.guiThongBao("Lớp sẽ kiểm tra giữa kỳ vào tuần sau.");

        // Một sinh viên rời nhóm nhận thông báo
        lopTruong.detach(sv2);

        // Lớp trưởng gửi thông báo khác
        lopTruong.guiThongBao("Buổi học ngày mai sẽ bắt đầu lúc 8h.");
    }
}

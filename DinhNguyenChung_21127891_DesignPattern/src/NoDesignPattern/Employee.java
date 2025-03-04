package NoDesignPattern;

public class Employee {
	 private String chucVu;

	    public Employee(String chucVu) {
	        this.chucVu = chucVu;
	    }

	    public void handleRequest() {
	        if (chucVu.equals("Đội trưởng")) {
	            System.out.println("Đi tuần, Gán việc cho nhân viên");
	        } else if (chucVu.equals("Giám đốc")) {
	            System.out.println("Ra quyết định, Quản lý tài chính");
	        } else if (chucVu.equals("Nhân viên VP")) {
	            System.out.println("Pha trà, Phê duyệt giấy tờ");
	        } else if (chucVu.equals("Nhân viên Xưởng")) {
	            System.out.println("Vận hành máy móc, Kiểm tra sản phẩm");
	        } else if (chucVu.equals("Kế toán trưởng")) {
	            System.out.println("Quản lý sổ sách, Tính toán lương");
	        } else {
	            System.out.println("Chức vụ không hợp lệ");
	        }
	    }
	    
}

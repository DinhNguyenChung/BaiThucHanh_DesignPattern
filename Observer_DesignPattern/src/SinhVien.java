
public class SinhVien implements Observer {
	   private String hoTen;

	    public SinhVien(String hoTen) {
	        this.hoTen = hoTen;
	    }

	@Override
	public void nhanThongBao(String message) {
		// TODO Auto-generated method stub
		 System.out.println(hoTen + " nhận thông báo: " + message);
	}

}

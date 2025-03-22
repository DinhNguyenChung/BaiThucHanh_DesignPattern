import java.util.ArrayList;
import java.util.List;

public class LopTruong implements Subject {
	 private List<Observer> sinhViens = new ArrayList<>();
	    private String tenLop;
	    private String hoten;

	    public LopTruong(String tenLop,String hoten) {
	        this.tenLop = tenLop;
	        this.hoten = hoten;
	    }

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		 sinhViens.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		 sinhViens.remove(observer);
		
	}

	@Override
	public void notifyObservers(String message) {
		// TODO Auto-generated method stub
		 for (Observer sv : sinhViens) {
	            sv.nhanThongBao(message);
	        }
		
	}
	public void guiThongBao(String message) {
        System.out.println("Lớp trưởng "+this.hoten + " gửi thông báo: " + message);
        notifyObservers(message);
    }

}

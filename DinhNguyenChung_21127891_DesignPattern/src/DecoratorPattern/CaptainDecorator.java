package DecoratorPattern;

public class CaptainDecorator extends WorkDecorator {

	public CaptainDecorator(Work work) {
		super(work);
		// TODO Auto-generated constructor stub
	}
	 public String getDescription() {
	        return super.getDescription() + " - Công việc: Đi tuần, Gán việc cho nhân viên";
	    }

}

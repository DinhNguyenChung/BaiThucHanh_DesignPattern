package DecoratorPattern;

public class OfficeStaffDecorator extends WorkDecorator {

	public OfficeStaffDecorator(Work work) {
		super(work);
		// TODO Auto-generated constructor stub
	}
	 public String getDescription() {
	        return super.getDescription() + " - Công việc: Pha trà, Phê duyệt giấy tờ";
	    }
}	

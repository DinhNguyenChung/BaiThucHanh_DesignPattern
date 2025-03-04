package DecoratorPattern;

public class Main {
	 public static void main(String[] args) {
		 // Captain
	        Work captain = new CaptainDecorator(new BaseEmployee());
	        System.out.println("Captain: ");
	        System.out.println(captain.getDescription());
	        
	        // Director
	        Work director = new DirectorDecorator(new BaseEmployee());
	        System.out.println("Director: ");
	        System.out.println(director.getDescription());
	        
	        // Office Staff
	        Work officeStaff = new OfficeStaffDecorator(new BaseEmployee());
	        System.out.println("Office Staff: ");
	        System.out.println(officeStaff.getDescription());
	    }

}

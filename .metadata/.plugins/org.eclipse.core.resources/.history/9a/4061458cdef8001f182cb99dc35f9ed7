package DecoratorPattern;

public class Main {
	 public static void main(String[] args) {
	        Work emp = new BaseEmployee();

	        emp = new CaptainDecorator(emp);
	        System.out.println(emp.getDescription());

	        emp = new DirectorDecorator(emp);
	        System.out.println(emp.getDescription());
	    }

}

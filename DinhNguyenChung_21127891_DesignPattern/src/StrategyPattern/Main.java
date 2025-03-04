package StrategyPattern;

public class Main {
	 public static void main(String[] args) {
	        Employee emp = new Employee();
	        
	        System.out.println("Captain:");
	        emp.setWorkStrategy(new CaptainStrategy());
	        emp.handleRequest();
	        
	        System.out.println("Office Staff :");
	        emp.setWorkStrategy(new OfficeStaffStrategy());
	        emp.handleRequest();
	    }
}

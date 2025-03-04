package StrategyPattern;

public class Main {
	 public static void main(String[] args) {
	        Employee emp = new Employee();

	        emp.setWorkStrategy(new CaptainStrategy());
	        emp.handleRequest();

	        emp.setWorkStrategy(new OfficeStaffStrategy());
	        emp.handleRequest();
	    }
}

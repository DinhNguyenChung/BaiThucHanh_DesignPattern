package StatePattern;

public class Main {
	public static void main(String[] args) {
        Employee emp = new Employee();
        
        System.out.println("Captain:");

        emp.setRoleState(new CaptainState());
        emp.handleRequest();
        
        System.out.println("Office Staff :");

        emp.setRoleState(new OfficeStaffState());
        emp.handleRequest();
    }
}

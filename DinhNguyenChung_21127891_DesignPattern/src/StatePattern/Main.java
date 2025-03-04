package StatePattern;

public class Main {
	public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setRoleState(new CaptainState());
        emp.handleRequest();

        emp.setRoleState(new OfficeStaffState());
        emp.handleRequest();
    }
}

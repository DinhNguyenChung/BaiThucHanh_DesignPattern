package NoDesignPattern;

public class Main {
	public static void main(String[] args) {
        Employee emp1 = new Employee("Đội trưởng");
        emp1.handleRequest();

        Employee emp2 = new Employee("Nhân viên VP");
        emp2.handleRequest();
    }
}

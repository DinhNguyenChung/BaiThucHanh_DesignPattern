package StatePattern;

public class Employee {
	private RoleState roleState;

    public void setRoleState(RoleState roleState) {
        this.roleState = roleState;
    }

    public void handleRequest() {
        if (roleState != null) {
            roleState.handleRequest();
        } else {
            System.out.println("Chưa có chức vụ");
        }
    }
}

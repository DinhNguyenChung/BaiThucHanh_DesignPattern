package DecoratorPattern;

public class DirectorDecorator extends WorkDecorator {

	public DirectorDecorator(Work work) {
		super(work);
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
        return super.getDescription() + " - Công việc: Ra quyết định, Quản lý tài chính";
    }

}

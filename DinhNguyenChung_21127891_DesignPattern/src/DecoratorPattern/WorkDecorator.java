package DecoratorPattern;

public abstract class WorkDecorator implements Work {
	protected Work decoratedWork;

    public WorkDecorator(Work work) {
        this.decoratedWork = work;
    }

    public String getDescription() {
        return decoratedWork.getDescription();
    }
}

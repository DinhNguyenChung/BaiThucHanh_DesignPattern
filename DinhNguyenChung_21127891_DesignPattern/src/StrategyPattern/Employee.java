package StrategyPattern;

public class Employee {
	 private WorkStrategy workStrategy;

	    public void setWorkStrategy(WorkStrategy workStrategy) {
	        this.workStrategy = workStrategy;
	    }

	    public void handleRequest() {
	        if (workStrategy != null) {
	            workStrategy.doWork();
	        } else {
	            System.out.println("Chưa có chiến lược công việc");
	        }
	    }
}	

package isp.after;

public class Staff implements GeneralEmployee, Employee {

	@Override
	public void coding() {
		System.out.println("Just coding");
		
	}

	@Override
	public void getPaid() {
		System.out.println("And get paid");
		
	}

	@Override
	public void submitTimesheet() {
		System.out.println("Don't forget to submit timesheet");
		
	}

}

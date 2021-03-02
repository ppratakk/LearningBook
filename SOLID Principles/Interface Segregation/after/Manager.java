package isp.after;

public class Manager implements Employee, Management{

	@Override
	public void approveTimesheet() {
		System.out.println("Timesheet has been approved");
		
	}

	@Override
	public void rejectTimesheet() {
		System.out.println("Timesheet has been rejected");
		
	}

	@Override
	public void generateReport() {
		System.out.println("Report generated!!!");
		
	}

	@Override
	public void getPaid() {
		System.out.println("And get paid");
		
	}

}

package isp.before;

public class Manager implements Employee {

	@Override
	public void submitTimesheet() {
		System.out.println("Submit weekly timesheet.");
	}

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

	@Override
	public void coding() {
		throw new UnsupportedOperationException("Coding in unnecessary");
	}

}

package isp.before;

public class Staff implements Employee {

	@Override
	public void submitTimesheet() {
		System.out.println("Submit weekly timesheet.");
	}

	@Override
	public void approveTimesheet() {
		throw new UnsupportedOperationException("Staff cannot approve timesheet");
	}

	@Override
	public void rejectTimesheet() {
		throw new UnsupportedOperationException("Staff cannot reject timesheet");
	}

	@Override
	public void generateReport() {
		throw new UnsupportedOperationException("Staff cannot generate report");
	}

	@Override
	public void getPaid() {
		System.out.println("Your salary is 1029371029378123");
	}

	@Override
	public void coding() {
		System.out.println("Keep calm and coding");
	}

}

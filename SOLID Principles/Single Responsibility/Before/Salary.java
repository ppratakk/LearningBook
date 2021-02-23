package srp.before;

import java.math.BigDecimal;

public class Salary {

	private BigDecimal dailyWage;
	private int dayOfWork;
	private BigDecimal salary;

	// constructor and getter/setter method
	public Salary(BigDecimal dailyWage, int dayOfWork) {
		this.dailyWage = dailyWage;
		this.dayOfWork = dayOfWork;
	}
	public BigDecimal getDailyWage() {
		return dailyWage;
	}
	public void setDailyWage(BigDecimal dailyWage) {
		this.dailyWage = dailyWage;
	}
	public int getDayOfWork() {
		return dayOfWork;
	}
	public void setDayOfWork(int dayOfWork) {
		this.dayOfWork = dayOfWork;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	//method for calculate salary
	public void calculate() {
		salary = dailyWage.multiply(new BigDecimal(dayOfWork));
	}

	//method for email the salary data
	public void emailSalary() {
		System.out.println("Do some stuff about email");
	}

	//method for print salary slip
	public void printSalary() {
		System.out.println("Print slip");
	}
}

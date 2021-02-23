package ocp.after;

import java.math.BigDecimal;

public abstract class Employee {

	private BigDecimal salary;
	
	public abstract BigDecimal calculateTax();

	
	//getter, setter method
	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}

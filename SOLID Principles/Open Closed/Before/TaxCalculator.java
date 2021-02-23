package ocp.before;

import java.math.BigDecimal;

public class TaxCalculator {

	public BigDecimal calculate(Employee employee) {

		if ("MANAGER".equalsIgnoreCase(employee.getPosition())) {
			return employee.getSalary().multiply(new BigDecimal(0.10));
		} else if ("SENIOR".equalsIgnoreCase(employee.getPosition())) {
			return employee.getSalary().multiply(new BigDecimal(0.05));
		} else {
			return employee.getSalary().multiply(new BigDecimal(0.03));
		}

	}

}

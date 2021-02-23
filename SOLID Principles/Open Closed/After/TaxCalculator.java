package ocp.after;

import java.math.BigDecimal;

public class TaxCalculator {

	public BigDecimal calculate(Employee employee) {
		return employee.calculateTax();
	}
}

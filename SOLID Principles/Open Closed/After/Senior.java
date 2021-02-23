package ocp.after;

import java.math.BigDecimal;

public class Senior extends Employee {

	@Override
	public BigDecimal calculateTax() {
		return getSalary().multiply(new BigDecimal(0.05));
	}

}

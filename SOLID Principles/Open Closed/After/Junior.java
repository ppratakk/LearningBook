package ocp.after;

import java.math.BigDecimal;

public class Junior extends Employee {

	@Override
	public BigDecimal calculateTax() {
		return getSalary().multiply(new BigDecimal(0.03));
	}

}

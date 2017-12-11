// @Author: Hermyson Cassiano 
package cap9.questao9_14;

import cap9.questao9_3.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}

	public final void setBaseSalary(double salary) {
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}

	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
	} // end method toString
}

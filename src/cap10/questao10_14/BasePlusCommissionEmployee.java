// @Author: Hermyson Cassiano 
package cap10.questao10_14;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String first, String last, String ssn, Date DayOfBirth, double sales, double rate,
			double salary) {
		super(first, last, ssn, DayOfBirth, sales, rate);
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
		return String.format("%s %s; %s: R$%,.2f", "base salarial", super.toString(), "salario base", getBaseSalary());
	}
}

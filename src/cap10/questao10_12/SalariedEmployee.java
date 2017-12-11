// @Author: Hermyson Cassiano 
package cap10.questao10_12;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String first, String last, String ssn, Date DayOfBirth, double salary) {
		super(first, last, ssn, DayOfBirth);
		setWeeklySalary(salary);
	}

	public final void setWeeklySalary(double salary) {
		weeklySalary = salary < 0.0 ? 0.0 : salary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public double earnings() {
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		return String.format("Salario do empregado: %s\n%s: R$%,.2f", super.toString(), "Salario semanal",
				getWeeklySalary());
	}
}

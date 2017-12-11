// @Author: Hermyson Cassiano 
package cap10.questao10_14;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee(String first, String last, String ssn, Date DayOfBirth, double hourlyWage,
			double hoursWorked) {
		super(first, last, ssn, DayOfBirth);
		setWage(hourlyWage);
		setHours(hoursWorked);
	}

	public final void setWage(double hourlyWage) {
		wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
	}

	public double getWage() {
		return wage;
	}

	public final void setHours(double hoursWorked) {
		hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ? hoursWorked : 0.0;
	}

	public double getHours() {
		return hours;
	}

	public double earnings() {
		if (getHours() <= 40)
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}

	@Override
	public String toString() {
		return String.format("Emprgado por hora: %s\n%s: R$%,.2f; %s: %,.2f", super.toString(), "salario hora", getWage(),
				"horas trabalhada", getHours());
	}

}

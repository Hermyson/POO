// @Author: Hermyson Cassiano 
package cap10.questao10_15;

public class EmployeeTest {

	public static void main(String args[]) {

		Date currentDate = new Date(6, 20, 2010);
		System.out.printf("Data atual é: %s\n", currentDate.toString());
		System.out.println("###################################");
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", new Date(5, 11, 1984),
				800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(6, 15, 1988),
				16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333",
				new Date(8, 25, 1974), 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
				"444-44-4444", new Date(9, 27, 1978), 5000, .04, 300);
		PieceWorker pieceWorker = new PieceWorker("Ralph", "Tang", "777-223-987", new Date(6, 25, 1985), 213, 16);

		System.out.println("Empregados processados ​​individualmente:\n");

		System.out.printf("%s\n%s: R$%,.2f\n\n", salariedEmployee, "ganhou", salariedEmployee.earnings());
		System.out.printf("%s\n%s: R$%,.2f\n\n", hourlyEmployee, "ganhou", hourlyEmployee.earnings());
		System.out.printf("%s\n%s: R$%,.2f\n\n", commissionEmployee, "ganhou", commissionEmployee.earnings());
		System.out.printf("%s\n%s: R$%,.2f\n\n", basePlusCommissionEmployee, "ganhou",
				basePlusCommissionEmployee.earnings());
		System.out.printf("%s\n%s: R$%,.2f\n\n", pieceWorker, "ganhou", pieceWorker.earnings());

		Employee employees[] = new Employee[5];

		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		employees[4] = pieceWorker;

		System.out.println("###################################");
		System.out.println("Empregados processados ​​polimórficamente:\n");

		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);

			if (currentEmployee instanceof BasePlusCommissionEmployee) {

				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

				double oldBaseSalary = employee.getBaseSalary();
				employee.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf("novo salário base com 10%% o aumento é: R$%,.2f\n", employee.getBaseSalary());
			}

			if (currentDate.getMonth() == currentEmployee.getBirthday().getMonth()) {
				System.out.printf("ganhou R$%,.2f. %s\n\n", currentEmployee.earnings() + 100.00,
						"Nota: adicionou um bônus de R$ 100 ao valor da folha de pagamento por aniversário!!!");
			} else {
				System.out.printf("ganhou R$%,.2f\n\n", currentEmployee.earnings());
			}
		}

		for (int j = 0; j < employees.length; j++)
			System.out.printf("Empregado %d is a %s\n", j, employees[j].getClass().getSimpleName());
	}
}

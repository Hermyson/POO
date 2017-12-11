// @Author: Hermyson Cassiano 
package cap8.questao8_6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteSavingsAccount {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quanto de dinheiro esta na conta?: ");
		double startingBalance = scan.nextDouble();

		System.out.print("Insira a taxa de juros anual:");
		double annualInterestRate = scan.nextDouble();

		// SavingsAccount savingAccount = new SavingsAccount();
		SavingsAccount savingsAccount = new SavingsAccount(startingBalance, annualInterestRate);

		System.out.print("Insira quanto tempo que aplicar ");
		double months = scan.nextInt();

		double montlyDeposit;
		double monthlyWithdrawl;
		double interestEarned = 0.0;
		double totalDeposits = 0;
		double totalWithdrawn = 0;

		for (int i = 1; i <= months; i++) {

			System.out.print("Insira o valor depositado por mes: " + i + ": ");
			montlyDeposit = scan.nextDouble();
			totalDeposits += montlyDeposit;

			savingsAccount.deposit(montlyDeposit);

			System.out.print("Insira o valor retirado para " + i + ": ");
			monthlyWithdrawl = scan.nextDouble();
			totalWithdrawn += monthlyWithdrawl;

			savingsAccount.withdraw(monthlyWithdrawl);

			savingsAccount.addInterest();

			interestEarned += savingsAccount.getLastAmountOfInterestEarned();
		}

		scan.close();

		DecimalFormat real = new DecimalFormat("0.00");

		System.out.println("Total depositado: R$" + real.format(totalDeposits));
		System.out.println("Total retirado: R$" + real.format(totalWithdrawn));
		System.out.println("Total de juros: R$" + real.format(interestEarned));
		System.out.println("Balanço final: R$" + real.format(savingsAccount.getAccountBalance()));
	}
}

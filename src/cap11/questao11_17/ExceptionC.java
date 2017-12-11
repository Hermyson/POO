// @Author: Hermyson Cassiano 
package cap11.questao11_17;

import java.util.Scanner;

public class ExceptionC extends ExceptionB {

	public static void lancaExcecaoC() throws Exception, ArithmeticException {
		Scanner input = new Scanner(System.in);
		try {

			System.out.print("Informe um valor para o numerador: ");
			int numA = input.nextInt();
			System.out.print("Informe um valor para o denominador: ");
			int denA = input.nextInt();
			int resA = numA / denA;
			System.out.println("O resultado é: " + resA);
			lancaExcecaoB();

		} catch (Exception exception) {
		}
	}
}
// @Author: Hermyson Cassiano 
package cap11.questao11_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionB extends ExceptionA {

	public static void lancaExcecaoB() throws Exception, InputMismatchException {
		Scanner input = new Scanner(System.in);
		try {

			System.out.print("Informe um valor para o numerador: ");
			int numB = input.nextInt();
			System.out.print("Informe um valor para o denominador: ");
			int denB = input.nextInt();
			int resB = numB / denB;
			System.out.println("O resultado é: " + resB);
			lancaExcecao();

		} catch (Exception exception) {
		}
	}
}

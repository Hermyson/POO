// @Author: Hermyson Cassiano 
package cap11.questao11_17;

import java.util.InputMismatchException;

public class ExceptionA extends Exception {
	public static void lancaExcecao() throws Exception, ArithmeticException, InputMismatchException {
		try {
			ExceptionB.lancaExcecaoB();
			ExceptionC.lancaExcecaoC();

		} catch (InputMismatchException inputMismatchException) {
			System.err.printf("\nException: %s\n", inputMismatchException);
			System.out.println("Você não inseriu inteiros, tente novamente!");

		} catch (ArithmeticException arithmeticException) {
			System.err.printf("\nException: %s\n", arithmeticException);
			System.out.println("Zero é inválido, tente novamente!");
		}
	}

}

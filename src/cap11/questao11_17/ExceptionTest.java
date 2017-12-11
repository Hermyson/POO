// @Author: Hermyson Cassiano 
package cap11.questao11_17;

import java.util.InputMismatchException;

public class ExceptionTest {

	public static void main(String[] args) throws InputMismatchException, ArithmeticException, Exception {
		try {

			ExceptionC.lancaExcecao();
		} catch (ExceptionA ex) {
			System.out.println(ex.getMessage());
		}
	}
}

// @Author: Hermyson Cassiano 
package cap11.questao11_16;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionB ob = new ExceptionB("");
		ExceptionC ob2 = new ExceptionC("");

		try {
			ob.exceptionB();
		} catch (ExceptionA e) {
			System.out.println("Exception: " + e);
		} finally {
			try {
				ob2.metodo();

			} catch (ExceptionA e) {
				System.out.println("Exception: " + e);
			}
		}
	}

}

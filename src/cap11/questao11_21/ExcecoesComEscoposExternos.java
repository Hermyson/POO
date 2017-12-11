// @Author: Hermyson Cassiano 
package cap11.questao11_21;

public class ExcecoesComEscoposExternos {

	public final int a;

	public ExcecoesComEscoposExternos(String num) {
		int b = Integer.parseInt(num);

		try {
			b = 5 / b;
		} catch (ArithmeticException ae) {
			b = 0;
		}
		a = b;
	}

}

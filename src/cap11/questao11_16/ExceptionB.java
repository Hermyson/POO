// @Author: Hermyson Cassiano 
package cap11.questao11_16;

public class ExceptionB extends ExceptionA {

	public ExceptionB(String mensagem) {
		super(mensagem);
	}

	public void exceptionB() throws ExceptionB {
		throw new ExceptionB("Exceção capturada na classe ExceptionB");
	}
}

// @Author: Hermyson Cassiano 
package cap11.questao11_16;

public class ExceptionC extends ExceptionB {

	public ExceptionC(String mensagem) {
		super(mensagem);
	}

	public void metodo() throws ExceptionC {
		throw new ExceptionC("Exceção capturada na classe ExceptionC");
	}
}
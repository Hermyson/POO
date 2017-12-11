// @Author: Hermyson Cassiano 
package cap9.questao9_10;

public class PieceWorker extends Employee {

	public PieceWorker(String nome, String sobreNome, String numSeguroSocial) {
		super(nome, sobreNome, numSeguroSocial);
	}

	@Override
	public String toString() {
		return String.format(super.toString());
	}

}

// @Author: Hermyson Cassiano 
package cap9.questao9_10;

public class Employee {

	private String nome;
	private String sobreNome;
	private String numSeguroSocial;

	public Employee(String nome, String sobreNome, String numSeguroSocial) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.numSeguroSocial = numSeguroSocial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNumSeguroSocial() {
		return numSeguroSocial;
	}

	public void setNumSeguroSocial(String numSeguroSocial) {
		this.numSeguroSocial = numSeguroSocial;
	}

	public String toString() {
		return String.format("%s %s\nNunmero do Seguro Social: ", getNome(), getSobreNome(), getNumSeguroSocial());
	}
}

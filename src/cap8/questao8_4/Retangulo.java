// @Author: Hermyson Cassiano 
package cap8.questao8_4;

public class Retangulo {

	private float comprimento ;
	private float largura ;
	
	public Retangulo(){
		setComprimento(1.0f);
		setLargura(1.0f);
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		if ((comprimento >= 0.0) && (comprimento <= 20.0)) {
			this.comprimento = comprimento;
		} else {
			System.out.println("Comprimento tem que esta entre 0.0 e 20.0");
		}
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		if ((largura >= 0.0) && (largura <= 20.0)) {
			this.largura = largura;
		} else {
			System.out.println("Largura tem que esta entre 0.0 e 20.0");
		}
	}

	public float calcularPerimetro() {
		float p = 2 * (comprimento + largura);
		return p;
	}

	public float calcularArea() {
		float a = (comprimento * largura);
		return a;
	}

}

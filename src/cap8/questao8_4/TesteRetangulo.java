// @Author: Hermyson Cassiano 
package cap8.questao8_4;

import java.util.Scanner;

public class TesteRetangulo {

	public static void main(String[] args) {
		

		Retangulo ret = new Retangulo();
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o comprimento");
		ret.setComprimento(scan.nextFloat());
		System.out.println("Informa a largura");
		ret.setLargura(scan.nextFloat());
		System.out.print("O perimetro: " + ret.calcularPerimetro() + " Area:" + ret.calcularArea());

	}

}

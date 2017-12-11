//@Author: Hermyson Cassiano 
package cap8.questao8_16;

import java.io.IOException;

public class HugeIntegerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HugeInteger H1 = new HugeInteger();
		HugeInteger H2 = new HugeInteger();
		HugeInteger H3 = new HugeInteger();
		H1.input();
		H2.input();
		System.out.println("Adicionando.");
		H3.add(H1, H2);
		System.out.print("Soma = ");
		H3.output();
		boolean L = H3.isLessThan(H1, H2);
		if (L) {
			System.out.println("\nO primeiro HugeInteger é menor");
			System.out.println("O primeiro HugeInteger é menor igual");

		} else {
			System.out.println("\nO primeiro HugeInteger é maior");
			System.out.println("O primeiro HugeInteger é maior igual");
		}
		L = H3.isEqualTo(H1, H2);
		if (!L) {
			System.out.println("Os dois numeros não são iguais!");
		} else {
			System.out.println("Os dois numeros são iguais!");
		}
		System.out.println("Subtraindo.");
		System.out.print("Diferença = ");
		H3.subtract(H1, H2);
	}

}

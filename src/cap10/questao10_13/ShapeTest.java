// @Author: Hermyson Cassiano 
package cap10.questao10_13;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
	public static void main(String[] args) {

		List<Shape> minhasFormas = new ArrayList();
		TwoDimensionalShape quadrado = null;
		ThreeDimensionalShape piscina = null;
		for (int i = 1; i < 10; i++) {
			quadrado = new TwoDimensionalShape(20, i);
			piscina = new ThreeDimensionalShape(20, i + 10, i + 5);
			minhasFormas.add(quadrado);
			minhasFormas.add(piscina);

		}

		for (Shape elem : minhasFormas) {
			if (elem instanceof TwoDimensionalShape) {
				System.out.println("\nSou bidimensional e minha área é:" + elem.obterArea());

			}
			if (elem instanceof ThreeDimensionalShape) {
				piscina = (ThreeDimensionalShape) elem;
				System.out.println("\nSou " + piscina.nome + ", meu volume é:" + piscina.obterVolume());
				System.out.println("E minha área é:" + piscina.obterArea());
			}

		}

	}
}
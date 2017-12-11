// @Author: Hermyson Cassiano 
package cap9.questao9_8;

public class Parallelogram extends Trapezoid {

	public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}

	public double getLargura() {
		return getComprimentoLadoA();
	}

	public double getArea() {
		return (getLargura() * getAltura());
	}

	public String toString() {
		return ("\nAs coordenadas do Paralelogramo s„o: \n" + getPoint1() + "," + getPoint2() + "," + getPoint3() + ","
				+ getPoint4() + "\nA largura È: " + getLargura() + "\nAltura È: " + getAltura() + "\n¡rea È: " + getArea())
				+ "\n";
	}

}

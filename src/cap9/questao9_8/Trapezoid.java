// @Author: Hermyson Cassiano 
package cap9.questao9_8;

public class Trapezoid extends Quadrilateral {

	private double comprimentoLadoA;
	private double comprimentoLadoB;
	private double altura;

	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}

	public double getAltura() {
		return (Math.abs(getPoint1().getY() - getPoint4().getY()));
	}

	public double getComprimentoLadoA() {
		return (Math.abs(getPoint1().getX() - getPoint2().getX()));
	}

	public double getComprimentoLadoB() {
		return (Math.abs(getPoint3().getX() - getPoint4().getX()));
	}

	public double getArea() {
		comprimentoLadoA = getComprimentoLadoA();
		comprimentoLadoB = getComprimentoLadoB();
		altura = getAltura();

		return (.5 * altura * (comprimentoLadoA + comprimentoLadoB));
	}

	public String toString() {
		return ("\nAs coordenadas do Trapezoid s„o:\n " + getPoint1() + "," + getPoint2() + "," + getPoint3() + ","
				+ getPoint4() + "\nAltura È: " + getAltura() + "\n¡rea È: " + getArea()) + "\n";
	}

}

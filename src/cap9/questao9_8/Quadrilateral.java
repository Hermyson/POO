// @Author: Hermyson Cassiano 
package cap9.questao9_8;

public class Quadrilateral {

	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;

	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		point1 = new Point(x1, y1);
		point2 = new Point(x2, y2);
		point3 = new Point(x3, y3);
		point4 = new Point(x4, y4);
	}

	public Point getPoint1() {
		return point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public Point getPoint4() {
		return point4;
	}

	public void setPoint1(double x1, double y1) {
		point1.setX(x1);
		point1.setY(y1);
	}

	public void setPoint2(double x2, double y2) {
		point2.setX(x2);
		point2.setY(y2);
	}

	public void setPoint3(double x3, double y3) {
		point3.setX(x3);
		point3.setY(y3);
	}

	public void setPoint4(double x4, double y4) {
		point4.setX(x4);
		point4.setY(y4);
	}

	public String toString() {
		return ("\nAs coordenadas do quadrilatero são:\n " + getPoint1() + "," + getPoint2() + "," + getPoint3() + ","
				+ getPoint4()) + "\n";
	}
}

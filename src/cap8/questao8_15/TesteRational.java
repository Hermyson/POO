// @Author: Hermyson Cassiano 
package cap8.questao8_15;

public class TesteRational {

	public static void main(String[] args) {
		
		Rational r1 = new Rational(2, 4);
		Rational r2 = new Rational(2, 8);
		System.out.println("r1: " + r1.toString());
		System.out.println("r2: " + r2.toString());
		Rational r3 = Rational.add(r1, r2);
		System.out.println("add: " + r3.toString());
		r3 = Rational.subtract(r1, r2);
		System.out.println("subtract: " + r3.toString());
		r3 = Rational.multiply(r1, r2);
		System.out.println("multiply: " + r3.toString());
		r3 = Rational.divide(r1, r2);
		System.out.println("divide: " + r3.toString());
		System.out.println("divide: " + r3.format(2));

	}
}

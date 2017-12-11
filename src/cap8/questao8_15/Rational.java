// @Author: Hermyson Cassiano 
package cap8.questao8_15;

public class Rational {

	int num;
	int den;

	Rational() {
		num = 1;
		den = 1;
	}

	Rational(int n, int d) {
		int[] ne = reducedNumber(n, d);
		num = ne[0];
		den = ne[1];
	}

	int[] reducedNumber(int n, int d) {
		int temp, x = 1;
		if (d <= n)
			temp = d;
		else
			temp = n;
		for (int i = temp; i >= 2; i--)
			if (n % i == 0 && d % i == 0) {
				x = temp;
				break;
			}
		int c[] = { n / x, d / x };
		return c;
	}

	static Rational add(Rational r1, Rational r2) {
		int d = r1.den * r2.den;
		int n = r1.num * r2.den + r1.den * r2.num;
		Rational r3 = new Rational(n, d);
		return r3;
	}

	static Rational subtract(Rational r1, Rational r2) {
		int d = r1.den * r2.den;
		int n = r1.num * r2.den - r1.den * r2.num;
		Rational r3 = new Rational(n, d);
		return r3;
	}

	static Rational multiply(Rational r1, Rational r2) {
		int d = r1.den * r2.den;
		int n = r1.num * r2.num;
		Rational r3 = new Rational(n, d);
		return r3;
	}

	static Rational divide(Rational r1, Rational r2) {
		int d = r1.den * r2.num;
		int n = r1.num * r2.den;
		Rational r3 = new Rational(n, d);
		return r3;
	}

	public String toString() {
		if (num == 1 && den == 1)
			return "1";
		if (num == 0)
			return "0";
		return num + "/" + den;
	}

	String format(int d) {
		if (num == 1 && den == 1)
			return "1";
		if (num == 0)
			return "0";
		String str = ".";
		for (int i = 1; i <= d; i++)
			str = str.concat("0");
		return num + str + "/" + den + str;
	}
}

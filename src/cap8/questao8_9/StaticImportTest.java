// @Author: Hermyson Cassiano 
package cap8.questao8_9;

//Static import of Math class methods.
import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import static java.lang.Math.E;
import static java.lang.Math.cos;

public class StaticImportTest {
	public static void main(String args[]) {
		System.out.printf("sqrt( 900.0 ) = %.1f\n", sqrt(900.0));
		System.out.printf("ceil( -9.8 ) = %.1f\n", ceil(-9.8));
		System.out.printf("log( E ) = %.1f\n", (E));
		System.out.printf("cos( 0.0 ) = %.1f\n", cos(0.0));
	}
}

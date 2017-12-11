// @Author: Hermyson Cassiano 
package cap8.questao8_8;

public class TesteDate {

	public static void main(String[] args) {
		Date d = new Date(2, 15, 1904);

		for (int i = 0; i < 30; i++) {
			d.nextDay();
			System.out.println(d);
		}
	}
}
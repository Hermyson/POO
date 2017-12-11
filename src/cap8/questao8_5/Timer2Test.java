// @Author: Hermyson Cassiano 
package cap8.questao8_5;

public class Timer2Test {

	public static void main(String[] args) {
		Time2 t1 = new Time2(); // 00:00:00
		Time2 t2 = new Time2(2); // 02:00:00
		Time2 t3 = new Time2(21, 34); // 21:34:00
		Time2 t4 = new Time2(12, 25, 42); // 12:25:42
		Time2 t5 = new Time2(t4); // 12:25:42

		System.out.println("Constructed with: ");
		System.out.println("t1: all arguments defaulted");
		System.out.printf("     %s\n", t1.toUniversalString());
		System.out.printf("     %s\n", t1.toString());

		System.out.println("t2: hour specified: minute and second defaulted");
		System.out.printf("     %s\n", t2.toUniversalString());
		System.out.printf("     %s\n", t2.toString());

		System.out.println("t3: hour and minute specified: second defaulted");
		System.out.printf("     %s\n", t3.toUniversalString());
		System.out.printf("     %s\n", t3.toString());

		System.out.println("t4: hour, minute and second specified");
		System.out.printf("     %s\n", t4.toUniversalString());
		System.out.printf("     %s\n", t4.toString());

		System.out.println("t5: Time2 object t4 specified");
		System.out.printf("     %s\n", t5.toUniversalString());
		System.out.printf("     %s\n", t5.toString());

		// sttempt to initialise t6 with invalid values
		try {
			@SuppressWarnings("unused")
			Time2 t6 = new Time2(27, 74, 99);
		} catch (IllegalArgumentException e) {
			System.out.printf("\nException while initialising t6: %s\n", e.getMessage());
		}
	}

	// exibe um objeto Time2 nos formatos de 24 horas e 12 horas
	private static void displayTime(String header, Time2 t) {
		System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
	}
}

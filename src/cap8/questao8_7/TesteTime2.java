// @Author: Hermyson Cassiano 
package cap8.questao8_7;

public class TesteTime2 {
	public static void main(String[] args) {
		Time2 t1 = new Time2(13, 0, 0);
		t1.tick();
		String test = "13:00:01";
		if (t1.toUniversalString().equals(test)) {
			System.out.println("Teste OK: " + t1.toUniversalString());
		} else {
			System.out.println("Teste falhou. Deveria ser: " + test + ", foi:" + t1.toUniversalString());
		}

		t1.setTime(13, 0, 59);
		t1.tick();

		test = "13:01:00";
		if (t1.toUniversalString().equals(test)) {
			System.out.println("Teste OK: " + t1.toUniversalString());
		} else {
			System.out.println("Teste falhou. Deveria ser: " + test + ", foi:" + t1.toUniversalString());
		}

		t1.setTime(13, 59, 59);
		t1.tick();
		test = "14:00:00";
		if (t1.toUniversalString().equals(test)) {
			System.out.println("Teste OK: " + t1.toUniversalString());
		} else {
			System.out.println("Teste falhou. Deveria ser: " + test + ", foi:" + t1.toUniversalString());
		}

		t1.setTime(23, 59, 59);
		t1.tick();
		test = "00:00:00";
		if (t1.toUniversalString().equals(test)) {
			System.out.println("Teste OK: " + t1.toUniversalString());
		} else {
			System.out.println("Teste falhou. Deveria ser: " + test + ", foi:" + t1.toUniversalString());
		}

	}

}

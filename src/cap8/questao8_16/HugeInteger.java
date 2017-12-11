//@Author: Hermyson Cassiano 
package cap8.questao8_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HugeInteger {

	int[] number = new int[40];
	int j;
	int size;
	char[] s = new char[40];
	String str;

	public HugeInteger() {
		for (int i = 0; i < 39; i++)
			number[i] = 0;
	}

	void input() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite um HugeInteger : ");
		str = in.readLine();
		size = j = str.length();
		for (int i = 0; i < size; i++) {
			s[i] = str.charAt(i);
			number[39 - j] = s[i] - '0';
			j--;
		}
	}

	void output() {
		for (int i = 39; i > 0; i--)
			System.out.print(number[39 - i]);
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < 40; i++)
			str = str.concat(String.valueOf(number[i]));
		return str;
	}

	public void add(HugeInteger H1, HugeInteger H2) {
		for (int j = 0; j < 39; j++) {
			number[39 - j] = number[39 - j] + H1.number[39 - j] + H2.number[39 - j];
			number[39 - j - 1] = number[39 - j] / 10;
			number[39 - j] = number[39 - j] % 10;
		}
	}

	public void subtract(HugeInteger H1, HugeInteger H2) {
		HugeInteger H3 = new HugeInteger();
		int no;

		if (H1.isLessThan(H1, H2)) {
			HugeInteger temp = new HugeInteger();
			temp = H1;
			H1 = H2;
			H2 = temp;
		}
		for (int j = 0; j < 39; j++) {
			if (H1.number[39 - j] < H2.number[39 - j]) {

				int incr = H1.number[39 - j] + 10;
				no = incr - H2.number[39 - j];
				H1.number[39 - j - 1] = H1.number[39 - j - 1] - 1;
			} else {
				no = H1.number[39 - j] - H2.number[39 - j];

			}
			H3.number[39 - j] = no;

		}
		H3.output();
	}

	public boolean isLessThan(HugeInteger H1, HugeInteger H2) {
		boolean less = false;

		for (int i = 0; i < 39; i++) {
			if (H1.number[39 - i] < H2.number[39 - i])
				less = true;
		}
		return less;
	}

	public boolean isEqualTo(HugeInteger H1, HugeInteger H2) {
		boolean same = true;
		for (int i = 0; i < 39; i++) {
			if (H1.number[39 - i] != H2.number[39 - i])
				same = false;
		}
		return same;
	}
}

//@Author: Hermyson Cassiano 
package cap8.questao8_13;

public class IntegerSet {
	boolean[] a = new boolean[101];

	static IntegerSet union(IntegerSet is1, IntegerSet is2) {
		IntegerSet is3 = new IntegerSet();
		for (int i = 0; i < 101; i++) {
			is3.a[i] = is1.a[i] || is2.a[i];
		}
		return is3;
	}

	static IntegerSet intersection(IntegerSet is1, IntegerSet is2) {
		IntegerSet is3 = new IntegerSet();
		for (int i = 0; i < 101; i++) {
			is3.a[i] = is1.a[i] && is2.a[i];
		}
		return is3;
	}

	void insertElement(int i) {
		a[i] = true;
	}

	void deleteElement(int i) {
		a[i] = false;
	}

	public String toString() {
		String str = " ";
		for (int i = 0; i < 101; i++) {
			if (this.a[i] == true)
				str = str.concat(" " + i + " ");
		}
		return str;
	}

	static boolean isEqualTo(IntegerSet is1, IntegerSet is2) {
		for (int i = 0; i < 101; i++) {
			if (is1.a[i] == is2.a[i])
				continue;
			else
				return false;
		}
		return true;
	}
}
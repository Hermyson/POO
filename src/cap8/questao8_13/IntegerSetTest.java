// @Author: Hermyson Cassiano 
package cap8.questao8_13;

import java.util.Random;

public class IntegerSetTest {
	public static void main(String[] args) {
		Random r = new Random();
		IntegerSet is1 = new IntegerSet();
		IntegerSet is2 = new IntegerSet();
		for (int i = 0; i < is1.a.length; i++) {
			is1.a[i] = r.nextBoolean();
		}
		for (int j = 0; j < is2.a.length; j++) {
			is2.a[j] = r.nextBoolean();

		}

		IntegerSet is3 = IntegerSet.union(is1, is2);
		System.out.println("Uniao de IntegerSet1 e IntegerSet2:" + is3.toString());
		IntegerSet is4 = IntegerSet.intersection(is1, is2);
		System.out.println("Interseção de IntegerSet1 e IntegerSet2 :" + is4.toString());
		is1.deleteElement(4);
		System.out.println("Deletar elementos repetidos em IntegerSte1" + is1.toString());
		boolean b1 = IntegerSet.isEqualTo(is2, is2);
		System.out.println(b1);
		boolean b2 = IntegerSet.isEqualTo(is3, is2);
		System.out.println(b2);

	}

}

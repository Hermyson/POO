// @Author: Hermyson Cassiano 
package cap8.questao8_14;

public class DateTest {
	public static void main(String[] args) {

		Date d1 = new Date(11, 13, 2016);
		Date d2 = new Date("November", 13, 2016);
		Date d3 = new Date(317, 2016);

		System.out.println("Format A: MM/DD/YYY");
		System.out.println("Format B: MONTH DD, YYYY");
		System.out.println("Format C: DDD YYYY");

		System.out.println(d1.toString());
		System.out.println(d2.toLongDateString());
		System.out.println(d3.toDayOfYearString());

	}
}

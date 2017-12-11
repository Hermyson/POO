//@Author: Hermyson Cassiano 
package cap8.questao8_12;

public class DateAndTimeTest {


    public static void main(String[] args){
        final int END_DATE = 2016;

        DateAndTime date1 = new DateAndTime();
        DateAndTime date2 = new DateAndTime(12, 25, 2016, 18, 20, 50);

        // increment DateAndTime
        do{
            date2.incrementMinute();
            System.out.printf("%s | %s\n", date2.toUniversalString(), date2.toString());
        }while(date2.getYear() < END_DATE);

    }

}

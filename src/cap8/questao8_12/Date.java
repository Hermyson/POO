//@Author: Hermyson Cassiano 
package cap8.questao8_12;

public class Date {

	private int month; // 1-12
	private int day; // 1-31 based on month
	private int year; // any year

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


    public Date(){
        setMonth(1);
        setDay(1);
        setYear(1900);
    }
    // call checkMonth & checkDay to ensure correct values for each
    public Date(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    public void setDay(int day) {
		this.day = day;
	}
    public void setYear(int year) {
		this.year = year;
	}
    public void setMonth(int month) {
		this.month = month;
	}
    
  
    public int getMonth() {
		return month;
	}
    public int getDay() {
		return day;
	}
    public int getYear() {
		return year;
	}
	
	// constructor: confirm proper value for month and day given the year
	public void Date(int month, int day, int year) {
		// check if month in range
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");

		// check if day in range for month
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

		// check for leap year if month is 2 and day is 29
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

		if (year <= 0) {
			throw new IllegalArgumentException("out-of-range. year must be greater then or equal to 1");
		}

		this.month = month;
		this.day = day;
		this.year = year;

		System.out.printf("Date object constructor for date %s%n", this);
	}

	// return a String of the form month/day/year
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}

	public void nextDay() {
		if ((this.month == 2 && isLeapYear() && this.day + 1 <= daysPerMonth[this.month] + 1)
				|| this.day + 1 <= daysPerMonth[this.month]) {
			this.day++;
		} else {
			this.day = 1;
			nextMonth();
		}
	}

	public void nextMonth() {
		if (this.month < 12) {
			this.month++;
		} else {
			this.month = 1;
			this.year++;
		}
	}

	public boolean isLeapYear() {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}

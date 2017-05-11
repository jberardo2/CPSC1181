package worked_examples;

import common.Day;

public class DaysAlive {

	public DaysAlive() {
	}
	
	public static void run() {
		Day birthday = new Day(1980, 11, 26);
		Day today = new Day();
		int dif = today.daysFrom(birthday);
		
		int anos = dif / 365;
		int meses = (dif / 12) % 12;
		int dias = ((dif / 12) / 12) % 30;
		
		System.out.println("Birthday: " + birthday.toString(true));
		System.out.println("Today: " + today.toString(true));
		System.out.print("You were born " + anos + " yeaers and " + meses + " months and " + dias + " days ago!");		
	}
}
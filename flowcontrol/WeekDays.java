package flowcontrol;

import java.util.Scanner;
public class WeekDays {
	public static void main(String[] args) {
		Scanner week = new Scanner(System.in);
		System.out.print("Input number: ");
		int day = week.nextInt();

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Error! Please enter week number between 1-7.");
		}

	}
}

package flowcontrol;

import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String args[]) {
		int num;
		System.out.println("Enter a number:");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		if (num > 0) {
			System.out.println("Positive Number");
		} else if (num < 0) {
			System.out.println("Nagative Number");
		} else {
			System.out.println("Zero");
		}
	}
}

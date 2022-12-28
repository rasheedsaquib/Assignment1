package flowcontrol;

import java.util.Scanner;

public class GraterNum {
	public static void main(String[] args) {
		int a, b, c;
		Scanner N=new Scanner(System.in);
		System.out.print("First Number:");
		a = N.nextInt();
		System.out.print("Second Number:");
		b = N.nextInt();
		System.out.print("Third Number:");
		c = N.nextInt();
		if (a > b && a > b) {
			System.out.println("Grater Number:" + a);
		} else if (b > c) {
			System.out.println("Grater Number:" + b);
		} else {
			System.out.println("Grater Number:" + c);
		}

	}
}


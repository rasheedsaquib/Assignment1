package flowcontrol;

import java.util.Scanner;
public class SumAndAverage {
	public static void main(String[] args)
	{
		int r, s = 0, t = 0;
		float avg;
		{
			System.out.println("Input the 5 numbers : ");
		}
		for (r = 0; r < 5; r++) {
			Scanner obj = new Scanner(System.in);
			s = obj.nextInt();
			t += s;
		}
		avg = t / 5;
		System.out.println("Totel of 5 no is : " + t + "\nThe Average is : " + avg);
	}
}

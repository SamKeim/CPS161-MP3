package newton_sqrt;

import java.util.Scanner;

public class NewtonApplication {
	public static double NewtonSqRt(double n) {
		double newtonSqRt = n/2.0;
		double newNewtonSqRt = newtonSqRt;
		while((newNewtonSqRt - Math.sqrt(n)) > 0.00000000000001) {
			newtonSqRt = newNewtonSqRt;
			newNewtonSqRt = ((n / newtonSqRt) + newtonSqRt) / 2;
		}
		return newNewtonSqRt;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter N for Newton: ");
		double newton = Math.abs(scn.nextDouble());
		System.out.printf("%-20s %-15.15f\n", String.format("Newton(%.1f)", newton), NewtonSqRt(newton));
		System.out.printf("%-20s %-15.15f", "Math.sqrt", Math.sqrt(newton));
		scn.close();
	}
}
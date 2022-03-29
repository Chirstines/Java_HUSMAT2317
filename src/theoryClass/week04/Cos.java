package theoryClass.week04;

import java.util.Scanner;

public class Cos {
	public static void name(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cos(x) calculator ");
		System.out.print("Input the value of x: ");
		
		//x - The input value, to calculator cos(x)
		double x = scanner.nextDouble();
		scanner.close();
		
		//y - The value that cos(y) = cos(x) and y is a value in range [-2PI, 2PI]
		double y = x;
		
		double cos = 0.0;
		while (Math.abs(y) >= 2*Math.PI) {
			y -= (y>0)? 2*Math.PI : -2*Math.PI;	
		}
		
		double temp = 1;
		
		//Calculator the value of sin(y)
		for (int i = 0; i <= 68; i += 2) {
			cos += temp;
			temp = (-1)*temp*y*y / ((i+1)*(i+2));
		}
		
		System.out.printf("Cos(%s) = %s", x, cos);
	}
}

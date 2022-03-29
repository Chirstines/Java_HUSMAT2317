package theoryClass.week03.homework02;

import java.util.Scanner;

public class AreOfTheRectangularRoom {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int length,width;
		System.out.print("Enter room's length by feet: ");
		length = input.nextInt();
		System.out.print("Enter room's width by feet: ");
		width = input.nextInt();
		int area= length*width;
		double area1 = 0.09290304*area;
		System.out.println("The area of the room: " + "\n" + area +" square feet" + "\n" + area1 + " square metters" );
	}
}
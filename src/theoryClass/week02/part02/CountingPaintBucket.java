package theoryClass.week02.part02;

import java.util.Scanner;

public class CountingPaintBucket {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length, width, box;
		System.out.print("Enter room's length by feet: ");
		width = input.nextDouble();
		length = input.nextDouble();
		double area = length*width;
		box = area/350;
		long a = Math.round(box);
		long t = a+1;
		if(a == box && box > 1) {
			System.out.println("You need: " + a + "paint bucker to paint all" + area + "square feet");
		}
		if(box != a && box>a && box > 1) {
			System.out.println("You need: " + t +"paint bucket to paint all" + area + "square feet");
		}
		if(box != a && box<a && box > 1) {
			System.out.println("You need: " + a + "paint bucket to paint all" + area + "square feet");
		}
		if (box <= 1) {
			System.out.println("You need: 1 paint bucket all 350 square feet ");
		}
	}

}
 
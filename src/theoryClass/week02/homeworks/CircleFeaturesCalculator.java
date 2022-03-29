package theoryClass.week02.homeworks;
import java.util.Scanner;

public class CircleFeaturesCalculator {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the radius of the circle: ");
		double radius = scanner.nextDouble();
		scanner.close();
		//Solve
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI*radius*radius;
		//Output
		System.out.println("Perimeter is = " + perimeter );
		System.out.println("Area is = " + area);
	}
}
package theoryClass.week02.homeworks;
import java.util.Scanner;

public class AreaHexagonCalculator {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the length of a side of the hexagon: ");
		double side = scanner.nextDouble();
		scanner.close();
		//Solve
		double area = (6*side*side)/(4*Math.tan(Math.PI/6));
		//Output
		System.out.println("The area of the hexagon is: " + area);
	}
}
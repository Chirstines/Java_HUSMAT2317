package theoryClass.week02.homeworks;
import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number x: ");
		int x = scanner.nextInt();
		System.out.print("Input the number y: ");
		int y = scanner.nextInt();
		scanner.close();
		//Solve + Output
		System.out.println("Before swapping: x, y = " + x + ", " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping: x, y = " + x + ", " + y);
	}
}
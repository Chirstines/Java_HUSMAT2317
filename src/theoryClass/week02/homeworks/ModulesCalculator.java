package theoryClass.week02.homeworks;
import java.util.Scanner;

public class ModulesCalculator {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int number1 = scanner.nextInt();
		System.out.print("Input the second number: ");
		int number2 = scanner.nextInt();
		scanner.close();
		//Solve
		int divided = number1 / number2;
		int module = number1 - number2 * divided;
		//Output
		System.out.printf("%d module %d give %d", number1, number2, module);
	}
}
package practiceClass.week06.lab04;

import java.util.Scanner;

//Exercise 2.7

public class InputValidation {
	public static boolean isValid(int n) {
		return (0 <= n && n <= 10) || (90 <= n && n <= 100);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter a number between 0-10 or 90-100: ");
			n = scanner.nextInt();
			if (isValid(n)) {
				System.out.println("Entered: " + n);
			}else {
				System.out.println("Invalid input, try again...");
			}
		} while (!isValid(n));
		scanner.close();
	}
}

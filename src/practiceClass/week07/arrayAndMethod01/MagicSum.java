package practiceClass.week07.arrayAndMethod01;

import java.util.Scanner;

//Exercise 2.2

public class MagicSum {
	public static boolean hasEight(int number) {
		while (number > 0) {
			int mod = number % 10;
			if (mod == 8) {
				return true;
			}
			number /= 10;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int sum = 0;
		do {
			System.out.print("Enter a positive integer (or -1 to end): ");
			number = scanner.nextInt();
			if (hasEight(number)) {
				sum += number;
			}
		}while (number != -1);
		scanner.close();
		
		System.out.println("The magic sum is: " + sum);
	}
}

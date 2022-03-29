package practiceClass.week06.lab04;

import java.util.Scanner;

//Exercise 2.5

public class ExtractDigits1 {
	/**
	 * 
	 * This method is used to print out each digit of the number n, in the reverse order.
	 * 
	 * @param n is the number which you want to solve.
	 */
	public static void printExtractDigits(int n) {
		System.out.print("Each digit of int " + n + " in the reverse order: " );
		while (n > 0) {
			System.out.print(n%10 + " ");
			n /= 10;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number : ");
		int n = scanner.nextInt();
		scanner.close();
		
		printExtractDigits(n);
	}
}
package practiceClass.week06.lab04;

import java.util.Scanner;

//Exercise 2.6

public class ReverseInt {
	
	public static void printReverseInteger(int n) {
		System.out.print("The reverse is: " );
		while (n > 0) {
			System.out.print(n%10);
			n /= 10;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();
		scanner.close();
		
		printReverseInteger(n);
	}
}

package theoryClass.week04;

import java.util.Scanner;

//Ex 3
public class PerfectNumber {
	public static boolean isPerfectNumber(long n) {
		if (n < 0) {
			return false;
		}
		long i = (long)Math.sqrt(n);
		if (n == i*i) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check perfect number ");
		System.out.print("Enter the number n = ");
		
		//n = The input number
		long n = scanner.nextLong();
		scanner.close();
		
		if (isPerfectNumber(n)) {
			System.out.printf("%d is a perfect number ", n);
		}else {
			System.out.printf("%d is not a perfect number ", n);
		}
	}
}

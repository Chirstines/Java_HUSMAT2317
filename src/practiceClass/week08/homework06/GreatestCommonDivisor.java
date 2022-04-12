package practiceClass.week08.homework06;

// Exercise 3.4

public class GreatestCommonDivisor {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int firstNumber = 15;
		int secondNumber = 20;
		System.out.printf("GCD(%d, %d) = %d", firstNumber, secondNumber, gcd(firstNumber, secondNumber));
	}
}
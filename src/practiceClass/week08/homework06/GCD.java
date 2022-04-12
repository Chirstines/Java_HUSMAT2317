package practiceClass.week08.homework06;

//Exercise 1.4

public class GCD {
	public static int gcd(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			return firstNumber;
		}
		return gcd(secondNumber, firstNumber % secondNumber);
	}

	public static void main(String[] args) {
		int firstNumber = 12;
		int secondNumber = 14;
		System.out.printf("GCD(%d, %d) = %d", firstNumber, secondNumber, gcd(firstNumber, secondNumber));
	}
}

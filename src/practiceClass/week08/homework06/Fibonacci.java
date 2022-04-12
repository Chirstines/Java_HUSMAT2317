package practiceClass.week08.homework06;

//Exercise 1.2

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.printf("fibonacci(%d) = %d", n, fibonacci(n));
	}
}

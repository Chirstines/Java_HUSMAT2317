package practiceClass.week06.lab04;

//Exercise 1.1

public class Factorial {
	public static void main(String[] args) {
		for (int i = 2; i <= 20; i++) {
			System.out.println("Factorial of " + i + " is: " + factorial(i)); 
		}	
	}
	
	public static int  factorial(int n) {
		int factorialValue = 1;
		for (int i = 2; i <= n; i++) {
			factorialValue *= i;
		}
		return factorialValue;	
	}
}

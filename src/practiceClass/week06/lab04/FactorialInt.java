package practiceClass.week06.lab04;

//Exercise 2.10.0

public class FactorialInt {
	public static void main(String[] args) {
		int n = 1;
		int fn = 1;
		while (fn <= Integer.MAX_VALUE && fn*(n+1) > fn) {
			System.out.printf("The factorial of %d is %d\n", n, fn);
			n++;
			fn *= n;
		}
		System.out.printf("The factorial of %d is out of range", n);
	}
}
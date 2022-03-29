package practiceClass.week06.lab04;

//Exercise 2.4.0

public class Fibonacci {
	public static void main(String[] args) {
		int n = 3;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		double average;
		
		//Print out the first 20 Fibonacci numbers
		System.out.println("The first " + nMax + " Fibonacci numbers are:");
		System.out.print(fnMinus2 + " " + fnMinus1 + " " );
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			System.out.print(fn + " ");
			sum += fn;
			n++;
		}
		System.out.println();
		
		//Compute and print out the average of them
		average = sum*1.0 / nMax;
		System.out.println("The average is " + average);
	}
}
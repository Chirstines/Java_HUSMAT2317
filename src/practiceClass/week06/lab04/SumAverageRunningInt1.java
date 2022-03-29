package practiceClass.week06.lab04;

//Exercise 2.1.1

public class SumAverageRunningInt1 {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		int number = LOWERBOUND;
		
		while (number <= UPPERBOUND) {
			sum += number;
			number++;
		}
		
		average = sum*1.0 / (UPPERBOUND - LOWERBOUND + 1);
		
		System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
		System.out.println("The average is " + average);
	}
}

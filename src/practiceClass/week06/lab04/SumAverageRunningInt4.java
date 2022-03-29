package practiceClass.week06.lab04;

//Exercise 2.1.4

public class SumAverageRunningInt4 {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		final int LOWERBOUND = 111;
		final int UPPERBOUND = 8899;
		int counter = 0;
		
		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
			counter++;
			sum += number;
		}
		
		average = sum*1.0 / counter;
		
		System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
		System.out.println("The average is " + average);
	}
}
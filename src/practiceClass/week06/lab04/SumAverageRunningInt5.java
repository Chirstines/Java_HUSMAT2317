package practiceClass.week06.lab04;

//Exercise 2.1.5

public class SumAverageRunningInt5 {
	public static void main(String[] args) {
		int sum = 0;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		
		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
			sum += number*number;
		}
		
		System.out.println("The sum of the squares of all numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
}

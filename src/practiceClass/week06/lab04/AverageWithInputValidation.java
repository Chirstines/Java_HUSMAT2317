package practiceClass.week06.lab04;

import java.util.Scanner;

//Exercie 2.8

public class AverageWithInputValidation {
	public static boolean isValid(int n) {
		return 0 <= n && n <= 100;
	}
	
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		int NUMBER_STUDENTS = 3;
		int sum = 0;
		double average;
		int numberIn;
		
		for (int studentNo = 1; studentNo <= NUMBER_STUDENTS; studentNo++) {
			do {
				System.out.printf("Enter the mark (0-100) for student %d: ", studentNo);
				numberIn = scaner.nextInt();
				if (isValid(numberIn)) {
					sum += numberIn;
				}else {
					System.out.println("Invalid input, try again ...");
				}
			} while (!isValid(numberIn));
		}
		scaner.close();
		
		average = sum * 1.0 / NUMBER_STUDENTS;
		System.out.printf("The average is: %.2f" , average);
	}
}

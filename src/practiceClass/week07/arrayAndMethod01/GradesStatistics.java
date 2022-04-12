package practiceClass.week07.arrayAndMethod01;

import java.util.Scanner;

//Exercise 1.3

public class GradesStatistics {
	public static int getMinimum(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int getMaximum(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static double getAverage(int[] array) {
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum/array.length;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = scanner.nextInt();
		int[] grades = new int[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.printf("Enter the grade for student %d: ", i+1);
			grades[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.printf("The average is: %.2f\n", getAverage(grades));
		System.out.printf("The minimum is: %d\n", getMinimum(grades));
		System.out.printf("The maximum is: %d\n", getMaximum(grades));
	}
}

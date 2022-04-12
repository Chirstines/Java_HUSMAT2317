package practiceClass.week07.arrayAndMethod01;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 2.11

public class GradesStatisticsVersion02 {
	public static double getAverage(int[] grades) {
		double sum = 0;
		for (int element: grades) {
			sum += element;
		}
		return sum/grades.length;
	}
	
	public static double getMedian(int[] grades) {
		double median;
		Arrays.sort(grades);
		if (grades.length %2 == 0) {
			median = (grades[grades.length/2] + grades[grades.length/2 - 1])*1.0/2;
		}else {
			median = grades[grades.length/2];
		}
		return median;
	}

	public static int getMinimum(int[] grades) {
		int min = grades[0];
		for (int element: grades) {
			if (element < min) {
				min = element;
			}
		}
		return min;
	}
	
	public static int getMaximum(int[] grades) {
		int max = grades[0];
		for (int element: grades) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}

	public static double getStandardDeviation(int[] grades) {
		double standardDeviation;
		double average = getAverage(grades);
		double sum = 0;
		for (int element : grades) {
			sum += element*element - average*average;
		}
		standardDeviation = Math.sqrt(sum*1.0/grades.length);
		return standardDeviation;
	}

	public static void main(String[] args) {
		//get grades
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberStudents = scanner.nextInt();
		
		int[] grades = new int[numberStudents];
		for (int i = 0; i < numberStudents; i++) {
			System.out.printf("Enter the grade for student %d: ", i+1);
			grades[i] = scanner.nextInt();
		}
		scanner.close();
		
		//print grades
		System.out.print("The grades are: [");
		for (int i = 0; i < numberStudents - 1; i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.println(grades[numberStudents-1] + "]");
		
		//print average
		System.out.printf("The average is: %.2f\n", getAverage(grades));
		
		//print median
		System.out.printf("The median is: %.2f\n", getMedian(grades));
		
		//print minimum
		System.out.printf("The minimum is: %d\n", getMinimum(grades));
		
		//print maximum
		System.out.printf("The maximum is: %d\n", getMaximum(grades));
		
		//print standard deviation
		System.out.printf("The standard deviation is: %.2f\n", getStandardDeviation(grades));
	}
}

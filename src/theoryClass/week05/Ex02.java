package theoryClass.week05;

import java.util.Scanner;

public class Ex02 {
	
	public static void printMinimumNumber(int[] array) {
		int min = array[0];
		int indexOfMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				indexOfMin = i;
			}
		}
		System.out.println("The minimum element is: " + min);
		System.out.println("The index of the minimum element is: " + indexOfMin);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive number n - the length of array a: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int index = 0; index < n; index++) {
			System.out.printf("a[%d] = ", index);
			a[index] = scanner.nextInt();
		}
		scanner.close();
		
		printMinimumNumber(a);
	}
}

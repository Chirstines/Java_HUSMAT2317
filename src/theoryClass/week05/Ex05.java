package theoryClass.week05;

import java.util.Scanner;

public class Ex05 {
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.printf("%4d",element);
		}
	}
	
	public static void bubbleSortASC(int[] array) {
		for (int turn = 1; turn <= array.length; turn++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSortDESC(int[] array) {
		for (int turn = 1; turn <= array.length; turn++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
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
		
		System.out.println("Your array:");
		printArray(a);
		System.out.println();
		
		bubbleSortASC(a);
		System.out.println("Your array in Ascending order:");
		printArray(a);
		System.out.println();
		
		bubbleSortDESC(a);
		System.out.println("Your array in Descending order:");
		printArray(a);
		
	}
}
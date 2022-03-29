package theoryClass.week05;

import java.util.Scanner;

public class Ex04 {
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.printf("%4d",element);
		}
	}
	
	public static int[] removeElementInIndex(int[] arr, int index) {
		int[] newArray = new int[arr.length - 1];
		for (int i = 0; i < index; i++) {
			newArray[i] = arr[i];
		}
		for (int i = index + 1; i < arr.length; i++) {
			newArray[i-1] = arr[i];
		}
		return newArray;
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
		
		System.out.println("Array before remove 3-th element:");
		printArray(a);
		System.out.println();
		
		a = removeElementInIndex(a, 2);
		
		System.out.println("Array after revomed 3-th element:");
		printArray(a);
	}
}

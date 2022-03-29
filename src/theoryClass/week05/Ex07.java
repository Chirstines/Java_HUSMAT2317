package theoryClass.week05;

import java.util.Scanner;

public class Example06 {
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.printf("%4d",element);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive number n - the length of array a, b: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int index = 0; index < n; index++) {
			System.out.printf("a[%d] = ", index);
			a[index] = scanner.nextInt();
		}
		int[] b = new int[n];
		for (int index = 0; index < n; index++) {
			System.out.printf("b[%d] = ", index);
			b[index] = scanner.nextInt();
		}
		int[] c = new int[n];
		for (int index = 0; index < n; index++) {
			c[index] = a[index] + b[index];
		}
		scanner.close();
		
		System.out.print("Array a: ");
		printArray(a);
		System.out.println();
		System.out.print("Array b: ");
		printArray(b);
		System.out.println();
		System.out.print("Array c: ");
		printArray(c);
	}
}

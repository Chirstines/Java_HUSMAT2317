package theoryClass.week05;

import java.util.Scanner;

public class Ex03 {
	public static boolean isIncreaseArray(int[] array) {
		int tempElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < tempElement) {
				return false;
			}
			tempElement = array[i];
		}
		return true;
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
		
		if (isIncreaseArray(a)) {
			System.out.println("This array is a increase array.");
		}else {
			System.out.println("This array is not a increase array.");
		}
	}
}
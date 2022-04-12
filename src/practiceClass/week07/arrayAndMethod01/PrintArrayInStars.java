package practiceClass.week07.arrayAndMethod01;

import java.util.Scanner;

//Exercise 1.2

public class PrintArrayInStars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int NUM_ITEMS = scanner.nextInt();
		System.out.print("Enter the value of all items (separated by space): ");
		int[] items = new int[NUM_ITEMS];
		for (int i = 0; i < NUM_ITEMS; i++) {
			items[i] = scanner.nextInt();
		}
		scanner.close();
		
		for (int i = 0; i < NUM_ITEMS; i++) {
			System.out.printf("%d: ", i);
			for (int j = 1; j <= items[i]; j++) {
				System.out.print("*");
			}
			System.out.printf("(%d)\n", items[i]);
		}
	}
}

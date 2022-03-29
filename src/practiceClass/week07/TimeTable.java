package practiceClass.week07;

import java.util.Scanner;

//Exercise 1.6

public class TimeTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		scanner.close();
		System.out.println();
		
		for (int row = -1; row <= size; row++) {
			if (row == -1) {
				for (int column = 0; column <= size; column++) {
					if (column == 0) {
						System.out.printf("%2s |", "*");
					}else {
						System.out.printf("%4d", column);
					}
				}
			}else if (row == 0) {
				for (int column = 0; column <= size; column++) {
					System.out.printf("%4s", "----");
				}
			}else {
				for (int column = 0; column <= size; column++) {
					if (column == 0) {
						System.out.printf("%2d |", row);
					}else {
						System.out.printf("%4d", row*column);
					}
				}
			}
			System.out.println();
		}
	}
}

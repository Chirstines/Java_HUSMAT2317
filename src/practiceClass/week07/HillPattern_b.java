package practiceClass.week07;

import java.util.Scanner;

//Exercise 1.5

public class HillPattern_b {
	public static void printSecondPattern(int size) {
		int MAX_COLUMN = 2*size-1;
		for (int row = 1; row <= size; row++) {
			int start = (MAX_COLUMN - 2*(size + 1 - row) + 1) / 2 + 1;
			int end = start + (2*(size + 1 - row) -1) - 1;
			for (int column = 1; column <= MAX_COLUMN; column++) {
				if (column >= start && column <= end) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		scanner.close();
		
		System.out.println("\nb)");
		printSecondPattern(size);

	}
}

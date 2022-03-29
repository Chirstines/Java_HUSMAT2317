package practiceClass.week07;

import java.util.Scanner;

//Exercise 1.4.c

public class BoxPattern_c {

	public static void printPatternc(int size) {
		for (int row = 1; row <= size; row++) {
			if (row == 1 || row == size) {
				for (int column = 1; column <= size; column++) {
					System.out.print("# ");
				}
				System.out.println();
			}else {
				for (int column = 1; column <= size; column++) {
					if (column == size + 1 - row) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		scanner.close();
		
		System.out.println("\nd)");
		printPatternc(size);
	}
}
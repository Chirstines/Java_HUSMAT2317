package practiceClass.week07;

import java.util.Scanner;

//Exercise 1.1.2

public class SquarePattern02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		scanner.close();
		
		int numberRows = size;
		while (numberRows-->0) {
			int numberColums = size;
			while (numberColums-->0) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}

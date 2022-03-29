package practiceClass.week07;

import java.util.Scanner;

//Exercise 1.1

public class SquarePattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enrer the size");
		int size = scanner.nextInt();
		scanner.close();
		
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= size; column++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}

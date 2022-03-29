package practiceClass.week07;

import java.util.Scanner;

//Exercise 1.2

public class CheckerPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		scanner.close();
		
		for (int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if((row % 2) == 0) {
				}else {
				System.out.print(" #");
			}
				System.out.print("# ");
				}
		}
		System.out.println();
	}
}

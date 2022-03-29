package practiceClass.week07;

import java.util.Scanner;

//Exercise 1.3.

public class TriangularPattern {
	//the first pattern
	public static void printFirstPattern(int size) {
		for (int row = 1; row <= size; row++) {
			for (int colum = 1; colum <= row; colum++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	//the second pattern
	public static void printSecondPattern(int size) {
		for (int row = 1; row <= size; row++) {
			for (int colum = 1; colum <= size + 1 - row; colum++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	//the third pattern
	public static void printThirdPattern(int size) {
		for (int row = 1; row <= size; row++) {
			for (int colum = 1; colum <= size; colum++) {
				if (colum >= row) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	//the fourth pattern
	public static void printFourthPattern(int size) {
		for (int row = 1; row <= size; row++) {
			for (int colum = 1; colum <= size; colum++) {
				if (colum >= size + 1 - row) {
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
		
		//Print the first pattern
		System.out.println("\na)");
		printFirstPattern(size);
		
		//Print the second pattern
		System.out.println("\nb)");
		printSecondPattern(size);
		
		//Print the third pattern
		System.out.println("\nc)");
		printThirdPattern(size);
		
		//Print the fourth pattern
		System.out.println("\nd)");
		printFourthPattern(size);
	}
}
package practiceClass.week05;

import java.util.Scanner;

public class IntegerConverter {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number (string): ");
		String stringNumber = in.nextLine();
		in.close();
		
		int result = Integer.parseInt(stringNumber);
		System.out.printf("The integer value is: %d" + result);
		
	}

}

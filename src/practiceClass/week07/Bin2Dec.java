package practiceClass.week07;

import java.util.Scanner;

//Exercise 2.9

public class Bin2Dec {
	
	public static boolean isValidInput(String s) {
		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) != '0' && s.charAt(index) != '1') {
				return false;
			}
		}
		return true;
	}
	
	public static long convertBin2Dec(String s) {
		long number = 0;
		for (int index = 0; index < s.length(); index++) {
			int x = s.charAt(index) - '0';
			number = 2*number + x;
		}
		return number;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Binary string: ");
		String binaryString = scanner.next();
		scanner.close();
		
		if (!isValidInput(binaryString)) {
			System.out.printf("Error: invalid binary string \"%s\"", binaryString);
		}else {
			System.out.printf("The equivalent decimal number for binary \"%s\" is %d", binaryString, convertBin2Dec(binaryString));
		}
		
	}
}

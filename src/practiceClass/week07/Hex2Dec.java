package practiceClass.week07;

import java.util.Scanner;

//Exercise 2.10

public class Hex2Dec {
	public static boolean isValidInput(String s) {
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			if (!(('0' <= ch && ch <= '9') || ('a' <= ch && ch <= 'f') || ('A' <= ch && ch <= 'F'))) {
				return false;
			}
		}
		return true;
	}
	
	public static long convertHex2Dec(String s) {
		long number = 0;
		for (int index = 0; index < s.length(); index++) {
			char ch = s.toUpperCase().charAt(index);
			int x;
			if ('0' <= ch && ch <= '9') {
				x = ch - '0';
			}else {
				x = 10 + ch - 'A';
			}
			number = 16*number + x;
		}
		return number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Hexdecimal string: ");
		String hexString = scanner.next();
		scanner.close();
		
		if (!isValidInput(hexString)) {
			System.out.printf("Error: invalid hexadecimal string \"%s\"", hexString);
		}else {
			System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is %d", hexString, convertHex2Dec(hexString));
		}
	}
}

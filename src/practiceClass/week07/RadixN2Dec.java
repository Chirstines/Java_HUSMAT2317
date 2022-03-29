package practiceClass.week07;

import java.util.Scanner;

//Exercise 2.12

public class RadixN2Dec {
	public static boolean isValidInput(String s, int radix) {
		if (radix <= 10) {
			for (int index = 0; index < s.length(); index++) {
				char ch = s.charAt(index);
				if (!('0' <= ch && ch <= ('0' + radix - 1))) {
					return false;
				}
			}
			return true;
		}else {
			for (int index = 0; index < s.length(); index++) {
				char ch = s.toUpperCase().charAt(index);
				if (!(('0' <= ch && ch <= '9') || ('A' <= ch && ch <= ('A' + radix - 11)) )) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static long convertRadixN2Dec(String s, int radix) {
		long number = 0;
		for (int index = 0; index < s.length(); index++) {
			char ch = s.toUpperCase().charAt(index);
			int x;
			if ('0' <= ch && ch <= '9') {
				x = ch - '0';
			}else {
				x = 10 + ch - 'A';
			}
			number = radix*number + x;
		}
		return number;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radix: ");
		int radix = scanner.nextInt();
		System.out.print("Enter the string: ");
		String string = scanner.next();
		scanner.close();
		
		if (!isValidInput(string, radix)) {
			System.out.println("Error: invalid string.");
		}else {
			System.out.printf("The equivalent decimal number \"%s\" is %d", string, convertRadixN2Dec(string, radix));
		}
	}
}

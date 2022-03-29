package practiceClass.week07;

import java.util.Scanner;

//Exercise 2.11

public class Oct2Dec {
	public static boolean isValidInput(String s) {
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			if (!('0' <= ch && ch <= '7')) {
				return false;
			}
		}
		return true;
	}
	
	public static long convertOct2Dec(String s) {
		long number = 0;
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			int x = ch - '0';
			number = 8*number + x;
		}
		return number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Octal string: ");
		String octString = scanner.next();
		scanner.close();
		
		if (!isValidInput(octString)) {
			System.out.printf("Error: invalid octal string \"%s\"", octString);
		}else {
			System.out.printf("The equivalent decimal number for octal \"%s\" is %d", octString, convertOct2Dec(octString));
		}
	}
}

package practiceClass.week07;

import java.util.Scanner;

//Exercise 2.2

public class CountVowelsDigits {
	public static boolean isVowelCharacter(char c) {
		switch (c) {
		case 'u':
		case 'e':
		case 'o':
		case 'a':
		case 'i':
			return true;
		default:
			return false;
		}
	}

	public static int getCountOfVowels(String s) {
		int counter = 0;
		for (int index = 0; index < s.length(); index++) {
			if (isVowelCharacter(s.charAt(index))) {
				counter++;
			}
		}
		return counter;
	}
	
	public static boolean isDigitCharacter(char c) {
		return c >= '0' && c <= '9';
	}

	public static int getCountOfDigits(String s) {
		int counter = 0;
		for (int index = 0; index < s.length(); index++) {
			if (isDigitCharacter(s.charAt(index))) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String string = scanner.next().toLowerCase();
		scanner.close();
		
		int length = string.length();
		int numberVowels = getCountOfVowels(string);
		int numberDigits = getCountOfDigits(string);
		
		System.out.printf("Number of vowels: %d (%.2f%%)\n", numberVowels, numberVowels*100.0/length);
		System.out.printf("Number of digits: %d (%.2f%%)\n", numberDigits, numberDigits*100.0/length);
	}
}
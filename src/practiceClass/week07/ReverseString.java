package practiceClass.week07;

import java.util.Scanner;

//Exercise 2.1

public class ReverseString {
	public static String getReverseString(String string) {
		String reverseString = "";
		for (int index = string.length()-1; index >= 0; index--) {
			reverseString += string.charAt(index);
		}
		return reverseString;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String string = scanner.next();
		scanner.close();
		
		System.out.printf("The reverse of the String \"%s\" is \"%s\".", string, getReverseString(string));
	}
}

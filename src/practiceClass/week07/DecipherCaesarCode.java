package practiceClass.week07;

import java.util.Scanner;

//Exercise 2.5

public class DecipherCaesarCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a ciphertext string: ");
		String ciphertext = scanner.next().toUpperCase();
		scanner.close();
		
		System.out.print("The plaintext string is: ");
		for(int index = 0; index < ciphertext.length(); index++) {
			char ch = ciphertext.charAt(index);
			if (ch <= 'C') {
				System.out.print((char)('Z' - ('C' - ch)));
			}else {
				System.out.print((char)(ch - 3));
			}
		}
	}
}
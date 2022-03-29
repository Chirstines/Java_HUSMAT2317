package practiceClass.week07;

import java.util.Scanner;

//Exercise 2.6

public class ExchangeCipher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a plaintext string: ");
		String plaintext = scanner.next().toUpperCase();
		scanner.close();
		
		System.out.print("The ciphertext string is: ");
		int sum = 'A' + 'Z';
		for (int index = 0; index < plaintext.length(); index++) {
			char ch = plaintext.charAt(index);
			System.out.print((char)(sum - ch));
		}
	}
}

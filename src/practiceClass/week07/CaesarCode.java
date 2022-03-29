package practiceClass.week07;

import java.util.Scanner;

//Exercise 2.4

public class CaesarCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a plaintext string: ");
		String string = scanner.next().toUpperCase();
		scanner.close();
		
		System.out.print("The ciphertext string is: ");
		for (int index = 0; index < string.length(); index++) {
			char ch = string.charAt(index);
			if (ch >= 'X') {
				System.out.print((char)('A' + ch - 'X'));
			}else {
				System.out.print((char)(ch + 3));
			}
		}
	}
}
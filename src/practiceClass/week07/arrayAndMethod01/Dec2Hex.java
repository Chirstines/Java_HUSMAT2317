package practiceClass.week07.arrayAndMethod01;

import java.util.Scanner;

//Exercise 1.5

public class Dec2Hex {
	public static String getDec2Hex(int decimal) {
		String hexadecimal = "";
		while (decimal > 0) {
			int mod = decimal % 16;
			if (0 <= mod && mod <= 9) {
				hexadecimal = mod + hexadecimal;
			}else {
				hexadecimal = (char)('A' + mod - 10) + hexadecimal;
			}
			decimal /= 16;
		}
		return hexadecimal;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = scanner.nextInt();
		scanner.close();
		
		System.out.print("The equivalent hexadecimal number is " + getDec2Hex(decimal));	
	}
}

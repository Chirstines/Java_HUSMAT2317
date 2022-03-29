package practiceClass.week05;

import java.util.Scanner;

public class RandomGenerator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the starting number of the range: ");
		int  startingNumber = in.nextInt();
		System.out.print("Input the ending number of the range: ");
		int endingNumber = in.nextInt();
		in.close();
		
		int randomNumber;
		for (int i = 0; i < 10; i++) {
			randomNumber = genRandomFromTo(startingNumber, endingNumber);
			System.out.println("Generated number: " + randomNumber);
		}
	}
	public static int genRandomFromTo(int starting, int ending) {
		int randomNumber = starting + (int)Math.floor(Math.random() * (ending - starting));
		return randomNumber;
	}
}

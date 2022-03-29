package theoryClass.week03.homework02;

import java.util.Scanner;

public class CheckTheBill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price, total = 0;
		int i=1, amount, n;
		System.out.print("Enter the number of products: ");
		n = input.nextInt();
		while ( i <= n ) {
			System.out.print("Price of product number " + i + ": $");
			price = input.nextDouble();
			System.out.print("Amount of product number " + i + ":");
			amount = input.nextInt();
			i++;
			total += price * amount;
		}
		double tax = 1.055 * total;
		System.out.println("Total bill not including tax: $" + total);
		System.out.println("Total bill including tax: $" + tax );
	}
	
	
}

package theoryClass.week03.homework02;

import java.util.Scanner;

public class CalculateBankInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double money, rate, total;
		int year;
		System.out.print("Enter the amount of money at the ");
		money = input.nextDouble();
		rate = input.nextDouble();
		year = input.nextInt();
		total = money * (1 + rate * year/100);
		System.out.println("After " + year + "year(s) of deposit the interest rate of " + rate + "the money you aern is: " + total + "million(s) VND");
	}
}

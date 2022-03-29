package theoryClass.week02.part02;

import java.util.Scanner;

public class ConvertCurrencies {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double euro, rate, dollar;
		System.out.print("Enter the amount of euros you want to convert: ");
		euro = input.nextDouble();
		System.out.print("Enter the exchange rate between euros and dollars: ");
		rate = input.nextDouble();
		dollar = euro * rate ;
		System.out.print(euro + " euro(s) with the exchange rate of " + rate + " is: " + dollar + " dollar(s)");
	}
}

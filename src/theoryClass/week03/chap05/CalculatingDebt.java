package theoryClass.week03.chap05;

import java.util.Scanner;

//Exercise 5.3
public class CalculatingDebt {

	public static double notifyMonthsAfterPaidOff (double debt, double rate, double pay) {
		
		double result;
		double month = -(Math.log(1+(debt/pay)*(1-Math.pow((1+rate/36500),30))))/(30*Math.log(1+rate/36500));
		if(month <= Math.round(month)) result = Math.round(month)  ;
		else result = Math.round(month) + 1;
		return result;
			
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int debt, rate, pay;
		System.out.print("Enter credit debt: ");
		debt = input.nextInt();
		System.out.print("Enter interest rate by year (by percentage): ");
		rate = input.nextInt();
		System.out.print("Enter your payment each month: ");
		pay = input.nextInt();
		input.close();
		System.out.print("It will take you " + notifyMonthsAfterPaidOff (debt, rate, pay) + " month(s) to pay all the credit debt");
		
	}

}

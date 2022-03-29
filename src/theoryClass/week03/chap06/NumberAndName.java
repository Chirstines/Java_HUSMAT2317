package theoryClass.week03.chap06;

import java.util.Scanner;

public class NumberAndName {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character:");
		String str = input.nextLine();
		char[] c = str.toCharArray();
		if(c[0] >= 48 && c[0] <= 57) System.out.println("This is a number");
		if(c[0] >= 65 && c[0] <= 90 || c[0] >= 97 && c[0] <= 122) System.out.println("This is a letter");
		else System.out.println("This is a special character");
		System.out.print("Enter n=");
		int day = input.nextInt();
		switch (day) {
		case 1:
			System.out.println("To day is Monday");
		    break;
		case 2:
		    System.out.println("To day is Tuesday");
		    break;
		case 3:
		    System.out.println("To day is Wednesday");
		    break;
		case 4:
		    System.out.println("To day is Thursday");
		    break;
		case 5:
		    System.out.println("To day is Friday");
		    break;
		case 6:
		    System.out.println("To day is Saturday");
		    break;
		case 7:
		    System.out.println("To day is Sunday");
		    break;
		}
		System.out.print("Enter ordinal number of this month:");
		int month = input.nextInt();
		switch (month) {
	    case 1:
	    	System.out.println("It is January");
	    	break;
	    case 2:
	    	System.out.println("It is February");
	    	break;
	    case 3:
	    	System.out.println("It is March");
	    	break;
	    case 4:
	    	System.out.println("It is April");
	    	break;
	    case 5:
	    	System.out.println("It is May");
	    	break;
	    case 6:
	    	System.out.println("It is June");
	    	break;
	    case 7:
	    	System.out.println("It is July");
	    	break;
	    case 8:
	    	System.out.println("It is August");
	    	break;
	    case 9:
	    	System.out.println("It is September");
	    	break;
	    case 10:
	    	System.out.println("It is October");
	    	break;
	    case 11:
	    	System.out.println("It is November");
	    	break;
	    case 12:
	    	System.out.println("It is December");
	    	break;
	    }
		input.close();
		
	}
	
}

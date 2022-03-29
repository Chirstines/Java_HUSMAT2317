package theoryClass.week02.part02;

import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int d, m, y;
		System.out.print("Enter month, day, year:\nm=");
		m = input.nextInt();
		System.out.print("d=");
		d = input.nextInt();
		System.out.print("y=");
		y = input.nextInt();
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14-m) / 12) - 2;
		int d0 = (d + x + 31*m0/12 ) % 7;
		if(d0==0) {
			System.out.print(d + "/" + m + "/" + y + " is " + "Sunday");
		}
		if(d0==1) {
			System.out.print(d + "/" + m + "/" + y + " is " + "Monday");
		}
		if(d0==2) {
			System.out.print(d + "/" + m + "/" + y + " is " + "Tuesday");
		}
		if(d0==3) {
			System.out.print(d + "/" + m + "/" + y + " is " + "Wednesday");
		}
		if(d0==4) {
			System.out.print(d + "/" + m + "/" + y + " is " + "Thursday");
		}
		if(d0==5) {
			System.out.print(d + "/" + m + "/" + y + " is " + "Friday");
		}
		if(d0==6) {
			System.out.print(d + "/" + m + "/" + y + " is " + "Saturday");
		}	
	}
}

package theoryClass.week02.tests;
import java.util.Scanner;

public class print {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String st;
		System.out.print("Name of Author: ");
		name = sc.nextLine();
		System.out.print("What does the author say?: ");
		st = sc.nextLine();
		System.out.print(name + "says: \"" + st + "\"");
	}
}
	

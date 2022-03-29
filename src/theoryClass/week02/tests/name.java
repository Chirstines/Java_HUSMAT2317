package theoryClass.week02.tests;
import java.util.Scanner;
//Chương trình theo ràng buộc
public class name {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your Name? ");
		String name = input.nextLine();
		System.out.println("Hello " + name + ", nice to meet you!");	
	}
}

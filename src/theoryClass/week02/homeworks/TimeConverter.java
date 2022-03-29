package theoryClass.week02.homeworks;
import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input seconds: ");
		int numberSeconds = scanner.nextInt();
		scanner.close();
		//Solve
		int hour = numberSeconds/3600;
		int minute = (numberSeconds - 3600*hour)/60;
		int seconds = numberSeconds - 3600*hour - 60*minute;
		//Output
		System.out.printf("%d:%d:%d",hour,minute,seconds);
	}
}
package theoryClass.week02.part02;
import java.util.Scanner;
public class WindForce {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		double t, v, wf;
		System.out.println("Ente the temrature(F) and the velocity of the wind(m/s): ");
		System.out.print("t= ");
		t = input.nextDouble();
		v = input.nextDouble();
		wf= 35.74 + 0.6215 * t +(0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.print("Wind force: " + wf);
		
	}
}

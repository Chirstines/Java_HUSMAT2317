package theoryClass.week02.tests;
import java.util.Scanner;
public class SimpleCaculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ex 5.1: ");
		compare(sc);
		System.out.println("================================================");
		System.out.println("Ex 5.2: ");
		arrange1(sc);
		System.out.println("================================================");
		System.out.println("Ex 5.3: ");
		euclid(sc);
		System.out.println("================================================");
		System.out.println("Ex 5.4: ");
		divisible(sc);
		System.out.println("================================================");
		System.out.println("Ex 5.5: ");
		arrange2(sc);
	}
	public static void compare(Scanner sc) { //So sanh xem 3 so co bang nhau khong
		int x,y,z;
		System.out.print("Input x: ");
		x = Integer.parseInt(sc.nextLine());
		System.out.print("Input y: ");
		y = Integer.parseInt(sc.nextLine());
		System.out.print("Input z: ");
		z = Integer.parseInt(sc.nextLine());
		System.out.println("================================================");
		System.out.println("5.1. Compare: ");
		System.out.print("Result: ");
		System.out.println(x == y && y == z);
	}
	public static void arrange1(Scanner sc) { //Kiem tra xem day 3 so co sap xep theo thu tu tang hay giam dan khong
		int x,y,z;
		System.out.print("Input x: ");
		x = Integer.parseInt(sc.nextLine());
		System.out.print("Input y: ");
		y = Integer.parseInt(sc.nextLine());
		System.out.print("Input z: ");
		z = Integer.parseInt(sc.nextLine());
		boolean b = false;
		if(x > y && y > z || x < y && y < z ) {
			b = true;
		}
		System.out.print("5.2 Arrange: ");
		System.out.println(b);
	}
	public static void euclid(Scanner sc) { //Tinh khoang cach Euclid giua 2 diem
		int x1, x2, y1, y2, temp;
		double distance;
		System.out.print("Input x1: ");
		x1 = Integer.parseInt(sc.nextLine());
		System.out.print("Input y1: ");
		y1 = Integer.parseInt(sc.nextLine());
		System.out.print("Input x2: ");
		x2 = Integer.parseInt(sc.nextLine());
		System.out.print("Input y2: ");
		y2 = Integer.parseInt(sc.nextLine());
		temp = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		distance = Math.sqrt(temp);
		System.out.println("5.3 Euclid: ");
		System.out.println("Result: " + distance);
	} 
	public static void divisible(Scanner sc) { //Kiem tra xem hai so co chia het cho 7 khong
		int a,b;
		System.out.print("Input a: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("Input b: ");
		b = Integer.parseInt(sc.nextLine());
		System.out.println(a % 7 == 0 && b % 7 == 0);
	}
	public static void arrange2(Scanner sc) { //Sap xep 3 so theo thu tu tang dan
		int x,y,z;
		System.out.print("Input x: ");
		x = Integer.parseInt(sc.nextLine());
		System.out.print("Input y: ");
		y = Integer.parseInt(sc.nextLine());
		System.out.print("Input z: ");
		z = Integer.parseInt(sc.nextLine());
		if(y > x && z > x) {
			System.out.println(x + ", " + Math.min(y,z) + ", " + Math.max(y,z) );
		} else if (x > y && z > y) {
			System.out.println(y + ", " + Math.min(x,z) + ", " + Math.max(x,z) );
		} else if(x > z && y  > z) {
			System.out.println(z + ", " + Math.min(x,y) + ", " + Math.max(x,y) );
		}
	}
}

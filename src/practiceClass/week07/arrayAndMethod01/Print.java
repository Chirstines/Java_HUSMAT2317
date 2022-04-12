package practiceClass.week07.arrayAndMethod01;

//Exercise 2.3

public class Print {
	public static void print(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length-1] + "]");
	}
	
	public static void print(double[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length-1] + "]");
	}
	
	public static void print(float[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length-1] + "]");
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		print(array);
	}
}
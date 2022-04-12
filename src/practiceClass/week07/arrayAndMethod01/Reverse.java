package practiceClass.week07.arrayAndMethod01;

//Exercise 2.10

public class Reverse {
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}

	public static void reverse(int[] array) {
		for (int i = 0; i <= (array.length-1)/2; i++) {
			int tempValue = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tempValue;
		}
	}

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6};
		int[] array2 = {1, 2, 3, 4, 5, 6, 7};
		System.out.print("array1: ");
		printArray(array1);
		System.out.println();
		System.out.print("array2: ");
		printArray(array2);
		System.out.println();
		System.out.println("=============================");
		
		//reverse array1
		System.out.println("Reverse array1.");
		reverse(array1);
		System.out.print("array1: ");
		printArray(array1);
		System.out.println();
		System.out.println("=============================");
		
		//reverse array2
		System.out.println("Reverse array2.");
		reverse(array2);
		System.out.print("array2: ");
		printArray(array2);
		System.out.println();
	}
}

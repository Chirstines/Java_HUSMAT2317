package practiceClass.week08.homework06;

// Exercise 2.4 

public class BubbleSort {
	
	public static void printArray(int[] array) {
		for (int element: array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] array) {
		for (int turn = 1; turn <= array.length; turn++) {
			for (int i = 1; i < array.length; i++) {
				if (array[i-1] > array[i]) {
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 6, 3, 2, 4, 1, 9, 0, 5};
		System.out.print("Before sort array: ");
		printArray(array);
		bubbleSort(array);
		System.out.print("After sorted array: ");
		printArray(array);
	}
}

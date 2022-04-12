package practiceClass.week08.homework06;

//Exercise 2.1

public class LinearSearch {
	public static int linearSearchIndex(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int key1 = 2;
		int key2 = 6;
		System.out.printf("Index of element %d in array: %d\n", key1, linearSearchIndex(array, key1));
		System.out.printf("Index of element %d in array: %d\n", key2, linearSearchIndex(array, key2));
	}
}

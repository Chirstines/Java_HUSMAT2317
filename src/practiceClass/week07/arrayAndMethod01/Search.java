package practiceClass.week07.arrayAndMethod01;

//Exercise 2.6

public class Search {
	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int key1 = 4;
		int key2 = 8;
		System.out.printf("The array index of %d is %d\n", key1, search(array, key1));
		System.out.printf("The array index of %d is %d\n", key2, search(array, key2));
	}
}

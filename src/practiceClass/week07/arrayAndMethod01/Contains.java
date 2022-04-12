package practiceClass.week07.arrayAndMethod01;

//Exercise 2.5

public class Contains {
	public static boolean contains(int[] array, int key) {
		for (int element : array) {
			if (element == key) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int key1 = 4;
		int key2 = 8;
		System.out.printf("The array contains %d? %s\n", key1, contains(array, key1));
		System.out.printf("The array contains %d? %s\n", key2, contains(array, key2));
	}
}
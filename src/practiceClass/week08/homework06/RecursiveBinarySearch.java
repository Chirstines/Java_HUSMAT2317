package practiceClass.week08.homework06;
 
//Exercise 2.2

public class RecursiveBinarySearch {
	public static boolean binarySearchRecursive(int[] array, int key, int firstIndex, int lastIndex) {
		if (firstIndex == lastIndex) {
			if (array[firstIndex] == key) {
				return true;
			}else {
				return false;
			}
		}
		int middleIndex = (firstIndex + lastIndex) / 2;
		if (key == array[middleIndex]) {
			return true;
		}else if (key < array[middleIndex]) {
			lastIndex = middleIndex - 1;
		}else {
			firstIndex = middleIndex + 1;
		}
		return binarySearchRecursive(array, key, firstIndex, lastIndex);
	}

	public static boolean binarySearch(int[] array, int key) {
		return binarySearchRecursive(array, key, 0, array.length - 1);
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key1 = 10;
		int key2 = 2;
		System.out.printf("The element %d is found? %s\n", key1, binarySearch(array, key1));
		System.out.printf("The element %d is found? %s\n", key2, binarySearch(array, key2));
	}
}
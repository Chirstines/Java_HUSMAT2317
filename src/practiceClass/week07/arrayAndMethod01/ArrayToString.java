package practiceClass.week07.arrayAndMethod01;

//Exercise 2.4

public class ArrayToString {
	public static String arrayToString(int[] array) {
		String ans = "[";
		for (int i = 0; i < array.length - 1; i++) {
			ans += array[i] + ", ";
		}
		ans += array[array.length-1] + "]";
		return ans;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		System.out.println(arrayToString(array));
	}
}
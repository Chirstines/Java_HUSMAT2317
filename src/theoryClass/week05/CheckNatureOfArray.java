package theoryClass.week05;

public class CheckNatureOfArray {
	public static int getRandomNumber(int startingNumber, int endingNumber) {
		int randomNumber = (int)Math.floor(Math.random()*(endingNumber - startingNumber) + startingNumber);
		return randomNumber;
	}
	
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.printf("%4d",element);
		}
	}
	
	public static boolean isIncreaseArray(int[] array) {
		int tempElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < tempElement) {
				return false;
			}
			tempElement = array[i];
		}
		return true;
	}

	public static void main(String[] args) {
	
		int[] array = {1, 3, 6, 9, 11, 13, 14, 17, 19};
		
		//Print array
		System.out.println("Your array: ");
		printArray(array);
		System.out.println();
		
		//Check increase array
		if (isIncreaseArray(array)) {
			System.out.println("This array is a increase array.");
		}else {
			System.out.println("This array is not a increase array.");
		}
		
	} 
}
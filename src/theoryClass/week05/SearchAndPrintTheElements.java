package theoryClass.week05;

public class SearchAndPrintTheElements {
	
	public static int getRandomNumber(int startingNumber, int endingNumber) {
		int randomNumber = (int)Math.floor(Math.random()*(endingNumber - startingNumber) + startingNumber);
		return randomNumber;
	}
	
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.printf("%4d",element);
		}
	}
	
	public static void printPrimeNumbers(int[] array) {
		for (int element : array) {
			if (isPrime(element)) {
				System.out.printf("%4d",element);
			}
		}
	}
	
	public static void printMinimumNumber(int[] array) {
		int min = array[0];
		int indexOfMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				indexOfMin = i;
			}
		}
		System.out.println("The minimum element is: " + min);
		System.out.println("The index of the minimum element is: " + indexOfMin);
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%4d", matrix[row][column]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//Create a integer array
		int length = 20;
		int[] values = new int[length];
		for (int i = 0; i < length; i++) {
			values[i] = getRandomNumber(0, 100);
		}
		
		//Print all the elements of array
		System.out.println("Print all the elements of array: ");
		printArray(values);
		System.out.println();
		System.out.println();
		
		//Print all prime number in the array
		System.out.println("Print all prime numbers in the array: ");
		printPrimeNumbers(values);
		System.out.println();
		System.out.println();
		
		//Print the minimum value, the index of it in array
		System.out.println("Print the minimum value and the index of it in array: ");
		printMinimumNumber(values);
		System.out.println();
		
		int numberOfRows = 10;
		int numberOfColumns = 10;
		int[][] matrix = new int[numberOfRows][numberOfColumns];
		for (int row = 0; row < numberOfRows; row++) {
			for (int column = 0; column < numberOfColumns; column++) {
				matrix[row][column] = getRandomNumber(0, 100);
			}
		}
		
		System.out.println("=============================================================");
		System.out.println("Print 2-dimensional array: ");
		printMatrix(matrix);
		System.out.println();
	}
}

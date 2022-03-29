package theoryClass.week03.chap06;

import java.util.Scanner;

public class CompareNumbers {
	
	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void QuickSort(int a[],int left ,int right) {
		if(left + 1 == right) {
			if( a[left] >= a[right] ) swap(a, left, right);
		}
		if(left + 1 < right) {
			int k = left - 1;
			for(int i = left ; i <= right - 1 ; i++ ) {
				if(a[i] <= a[right]) {
					k++;
					swap(a, i, k);
				}
			}
			swap(a, k+1, right);
			QuickSort(a, left, k);
			QuickSort(a, k+2, right);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many nummber do you want to enter ?");
		int n = input.nextInt();
		int []a = new int[100];
		int k = 0;
		System.out.println("Enter your numbers: ");
		for(int i = 1; i <= n; i++) {
			a[i] = input.nextInt();
			if(i >= 2 && a[i] == a[i-1])k++;
		}
		input.close();
		if(k == n - 1)System.out.print("All numbers are equal");
		else {
			QuickSort(a, 1, n);
			System.out.print("The sequence after sorting: ");
			for(int i = 1; i <= n; i++) {
				System.out.print(a[i] + " ");
			}
		}
		
	}

}
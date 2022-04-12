package theoryClass.week07;

import java.util.Scanner;

public class RandomSurferMode {
	
	public static String str1;
	public static String str2;
	public static String str3;
	public static int n;
	public static int m;
	public static double [][]matrix = new double [100][100];
	public static double[] degree = new double [100];
	public static double[] prob0 = new double [100];
	public static double[] prob = new double [100];
	public static double leap;
	
	public static void creatematrix() {
		for(int i = 0; i < str2.length(); i+=4) {
			char a0 = str2.charAt(i);
			int a = a0 - 48;
			char b0 = str2.charAt(i+2);
			int b = b0 - 48;
			matrix[a][b]++;
		}
		
	}
	
	public static void matrixDegrees() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				degree[i] += matrix[i][j];
			}
		}	
	}

	public static void transitionmatrix(){
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = 0.9*matrix[i][j]/degree[i];
				matrix[i][j] += leap;
			}
		}
	}
	
	public static void probabilities () {
		double sum;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				sum = 0;
				for(int k = 0; k < n; k++) {
					sum += prob0[k]*matrix[k][j];
				}
				prob[j] = sum;
			}
			for(int l = 0 ; l < n; l++) {
				prob0[l] = prob[l]; 
			}
		}
		double k = 0;
		for(int i = 0; i < n; i++) {
			double round = (double)(Math.round(prob[i]*100))/100;

			System.out.println("The probability of being in page number " + i + " after " + m + " move(s) is: " + round);
		}
		System.out.println(k);	
	}
	
	public static void main(String [] args) {	
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the amount of website: ");
		str1 = input.nextLine();
		System.out.println("Enter the website(s) and where link(s) on the website lead to: ");
		str2 = input.nextLine();
		System.out.println("Enter the amount of move: ");
		str3 = input.nextLine();
		input .close();
		n = Integer.parseInt(str1);
		m = Integer.parseInt(str3);
		leap = 0.1/n;
		prob0[0] = 1.0;
		creatematrix();
		matrixDegrees();
		transitionmatrix();
		probabilities();
	}	
}

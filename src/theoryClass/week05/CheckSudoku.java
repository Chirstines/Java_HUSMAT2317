package theoryClass.week05;

public class CheckSudoku {
public static boolean check3x3(int row ,int col, int[][] arr) {
		
		return (arr[row][col] != arr[row][col + 1] && arr[row][col] != arr[row - 1][col] && arr[row][col] != arr[row + 1][col + 1] && arr[row][col] != arr[row + 1][col + 1] &&
				arr[row][col] != arr[row + 1][col] && arr[row][col] != arr[row][col - 1] && arr[row][col] != arr[row - 1][col - 1] && arr[row][col] != arr[row - 1][col - 1]);	
	}
	
	public static boolean isSodoku (int [][]arr) {
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 8; j++) {
				for(int k = j + 1 ; k < 9; k++ ) {
					if(arr[i][j] == arr[i][k] || arr[j][i] == arr[k][i]) {
						return false;
					}
				}
			}
		}
		if(!check3x3(1 ,1 ,arr) || !check3x3(4 ,1 ,arr) || !check3x3(7 ,1 ,arr) || !check3x3(7 ,4 ,arr) || !check3x3(4 ,4 ,arr) ||
		   !check3x3(7 ,7 ,arr) || !check3x3(1 ,4 ,arr) || !check3x3(1 ,7 ,arr) || !check3x3(4 ,7 ,arr)) {
			return false;
		}
		return true;		
	}
	
	public static void main(String[] args){
		
		int [][]arr = new int[9][9];
		System.out.println("A random 9x9 matrix:\n");
		for(int i = 0 ;i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				arr[i][j] = (int)((Math.random()) * 9 + 1);
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println("\n");
		}
		if(isSodoku(arr)) {
			System.out.println("Yes, this matrix is a solution for a sudoku game");
		} else {
			System.out.println("No, this matrix is not a solution for a sudoku game");
		}	
	}
}

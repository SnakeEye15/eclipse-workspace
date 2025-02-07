package practice;
import java.util.Scanner;
//program to interchange diagonals of a matrix
public class InterchangeDiagonalMatrix {
	/*
	 * Creating function to change the elements at diagonal
	 */
	public static void diagonalInterchange(int [][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(i==j || (i+j)==matrix.length) {
					int temp=matrix[i][j];
					matrix[i][j]=matrix[i][matrix.length-1-j];
					matrix[i][matrix.length-1-j]=temp;
				}
			}
		}
	}
	/*
	 * Main program starts here:
	 * 
	 */
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the row size of matrix: ");
		int row=scan.nextInt();
		System.out.println("Please enter the column size of matrix: ");
		int col=scan.nextInt();
		int matrix[][]=new int[row][col];
		//calling the input method from another class to take user input:
		matrix=SumOfDiagonal.takeInput(matrix, scan);
		//Matrix before diagonal interchange
		System.out.println("Your input matrix is: ");
		RowAndColumnSum.printMatirx(matrix);
		if(row==col) {
			diagonalInterchange(matrix);
			System.out.println("Update matrix is:");
			RowAndColumnSum.printMatirx(matrix);
		}else {
			System.out.println("As row and column size isn't same so this matrix won't have Diagonal.");
		}
		
		scan.close();
		
	}
}

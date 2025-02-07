package practice;
import java.util.*;
//program to find sum of each row and columns of a matrix
public class RowAndColumnSum {
	/*
	 * Let create a Function to get the sum of rows and column in matrix
	 * @param matrix parameter variable 
	 * @param sum variable to capture sum 
	 * @sumRowCol Function name
	 */
	public static void sumRowCol(int matrix[][]) {
		
		/*
		 * loops to print the sum of rows
		 */
		for(int i=0;i<matrix.length;i++) {
			int sum=0;
			for(int j=0;j<matrix[0].length;j++) {		
				sum+=matrix[i][j];
				
				}
				System.out.println("Sum of "+(i+1)+"th Row is: "+sum);
			}
		/*
		 * loops to print the sum of columns
		 */
		
		for(int i=0;i<matrix.length;i++) {
			int sum2=0;
			for(int j=0;j<matrix[0].length;j++) {
				sum2+=matrix[j][i];
				
			}
			System.out.println("Sum of "+(i+1)+"th Column is: "+sum2);
		}
	}//Function to print the matrix:
	public static void printMatirx(int matrix[][]) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Main program starts here:
	 * @param row variable to store the row size
	 * @param col variable to store column size
	 * @param matrix variable to store the matrix input.
	 */
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the row size of matrix: ");
		int row=scan.nextInt();
		System.out.println("Plese enter the Column size of matrix: ");
		int col=scan.nextInt();
		int[][] matrix= new int[row][col];
		
		//calling the takeInput method of SumOfDiagonal class to take user input for matrix:
		matrix=SumOfDiagonal.takeInput(matrix, scan);
		
		//calling the SumRowCol method to print the sum of row and column:
		sumRowCol(matrix);
		
	}
}


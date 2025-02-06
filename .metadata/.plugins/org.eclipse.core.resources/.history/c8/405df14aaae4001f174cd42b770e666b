package practice;
import java.util.*;
//program to find sum of main diagonal elements of a matrix
public class SumOfDiagonal {
	/*
	 * @let's write the take input from user for matrix:
	 * @param scan Scanner variable to capture input.
	 * @param matrix name of variable for matrix
	 * @param demo name to capture the input 
	 * @param row to capture the row size of matrix
	 * @param col to capture the column size of matrix
	 */
	public static int[][] takeInput(int matrix[][],Scanner scan){
		int row=matrix.length;
		int col=matrix[0].length;
		int [][] demo=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Please enter the value of ("+i+","+j+") element of matrix:");
				demo[i][j]=scan.nextInt();
			}
		}
		return demo;
	}
	
	/*
	 * Function to get the sum of main diagonal
	 * @param matrix variable name of 2D array[matrix]
	 * @param row to capture the row size of matrix
	 * @param col to capture the column size of matrix
	 * @param sum variable to store sum of diagonal elements.
	 */
	public static int sumOfDiagonal(int matrix[][]) {
		int row=matrix.length;
		int col=matrix[0].length;
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					sum+=matrix[i][j];
				}
			}
		}
		return sum;
	}
	/*
	 * Main program starts here:
	 * @param row to capture the size of rows in matrix
	 * @param col to capture the column size of matrix
	 */
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row size:");
		int row=scan.nextInt();
		System.out.println("Enter the column size:");
		int col=scan.nextInt();
		int [][]matrix=new int[row][col];
		//calling the method to take user input.
		matrix=takeInput(matrix,scan);
		
		System.out.println("Sum of main Diagonal is: "+sumOfDiagonal(matrix));
	}

}

package practice;
import java.util.*;
public class PrintMatrixElement {
	/*Function to move and print the elements
	 * 
	 */
	public static void move(int R, int C, int[][] matrix, int ColumnSize) {
		
		while(R>=0 && C<ColumnSize){
			
			System.out.print(matrix[R][C]+" ");
			R--;
			C++;
		}
		System.out.println();
	}
	/*
	 * Main program starts from here:
	 * 
	 */
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter row size: ");
		int row=scan.nextInt();
		System.out.println("Please enter Column size: ");
		int col=scan.nextInt();
		int matrix[][]=new int[row][col];
		
		//calling function to take matrix input from user
		TakeInputForMatrix.takeInput(matrix, scan);
		
		//Printing complete matrix
		PrintMatrix.printMatrix(matrix);
		
		
		//To print the elements from 1st row part:
		
		for(int i=0;i<row;i++) {
			int R=i;
			int C=0;
			
			move(R,C,matrix,col);
		}
		
		//To print the element from last column 2nd part:
		for(int j=1;j<col;j++) {
			int R=row-1;
			int C=j;
			move(R,C,matrix,col);
		}
		
		
		scan.close();
	}
	

}

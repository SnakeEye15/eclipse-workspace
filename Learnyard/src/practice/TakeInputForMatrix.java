package practice;
import java.util.*;
public class TakeInputForMatrix {
	/*
	 *In this call we will crate the method to take input of matrix elements.
	 *@param matrix the input matrix.
	 *@param scan the Scanner class variable to take user input.
	 */
	public static void takeInput(int [][] matrix, Scanner scan) {
		int rowSize=matrix.length;
		int colSize=matrix[0].length;
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				printPrompt(i,j);
				matrix[i][j]=scan.nextInt();
			}
		}
		
	}
	private static void printPrompt(int i, int j) {
        System.out.println("Please enter the (" + i + "," + j + ") element of your matrix");
    }

}

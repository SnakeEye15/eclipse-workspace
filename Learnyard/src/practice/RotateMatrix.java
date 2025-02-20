package practice;
import java.util.*;
public class RotateMatrix {
	/*
	 * Method to reverse the element of any row/column.
	 * @param arr the input row/column.
	 */
	public static void reverse(int arr[]) {
		int i=0;
		int j= arr.length -1;
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	
	/*
	 * Method to get Transpose of Matrix. 
	 * @param matrix the input matrix.
	 * @param temp the variable use to swipe the elements. 
	 */
	public static void transpose(int [][] matrix) {
		int size=matrix.length; //as it's square matrix.
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i<j) {
					int temp=matrix[i][j];
					matrix[i][j]=matrix[j][i];
					matrix[j][i]=temp;
				}
			}
		}	
	}
	/*
	 * Method to rotate the matrix 
	 */
	public static void rotateTheMatrix(int matrix[][]) {
		transpose(matrix);
		for(int i=0;i<matrix.length;i++) {
			reverse(matrix[i]);
		}
	}
	
	/*
	 * Main program starts from here:
	 */
	public static void main (String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the size of Square matrix: ");
		int size=scan.nextInt();
		int [][] matrix=new int [size][size];	
		TakeInputForMatrix.takeInput(matrix, scan);
		System.out.println("Printing matrix before rotation: ");
		PrintMatrix.printMatrix(matrix);
		rotateTheMatrix(matrix);
		System.out.println("Printing matrix after rotation: ");
		PrintMatrix.printMatrix(matrix);
		scan.close();
	}

}

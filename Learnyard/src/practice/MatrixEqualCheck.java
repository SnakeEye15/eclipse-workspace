package practice;
import java.util.*;
public class MatrixEqualCheck {
	/*
	 * Program to check whether two matrix's are equal or not?
	 */
	/*
	 * Check whether the size of two matrix's same or not?
	 * @param MatrixA the first matrix
	 * @param MatrixB the second matrix
	 * @return Normal return statement for function/method: 
	 */
	public static boolean isMatrixSizeSame(int MatrixA[][], int MatrixB[][]) {
		/*
		 * To check whether size of two matrix are same or not?
		 */
		if(MatrixA.length==MatrixB.length && MatrixA[0].length==MatrixB[0].length) {
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * To take input for matrix:
	 * @param row size of rows in matrix
	 * @param col size of column in matrix
	 * @param OutArr array to store input given by user
	 */
	public static int[][] takeInput(Scanner scan,int arr[][]){
		int row=arr.length;
		int col=arr[0].length;
		int OutArr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Please enter the ("+i+","+j+") element:");
				OutArr[i][j]=scan.nextInt();
			}
		}
		return OutArr;
	}
	/*
	 * To check whether the Matrix is same or not?
	 * 
	 */
	public static boolean isMatrixSame(int arr1[][],int arr2[][]) {
		boolean check = false;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				if(arr1[i][j]==arr2[i][j]) {
					check=true;
				}
			}
		}
		return check;
	}
	
	/*
	 * Main method starts here:
	 */
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the row size of Matrix 1: ");
		int row1=scan.nextInt();
		System.out.println("Please enter the column size of Matrix 1: ");
		int col1=scan.nextInt();
		System.out.println("Please enter the row size of Matrix 2: ");
		int row2=scan.nextInt();
		System.out.println("Please enter the row size of Matrix 2: ");
		int col2=scan.nextInt();
		int arr1[][]=new int[row1][col1];
		int arr2[][]=new int[row2][col2];
		//calling method to check whether the size of matrix same or not?
		if(isMatrixSizeSame(arr1,arr2)) {
			arr1=takeInput(scan,arr1);
			arr2=takeInput(scan,arr2);
			
			if(isMatrixSame(arr1,arr2)) {
				System.out.println("Both Matrix are same.");
			}else {
				System.out.println("There are not same.");
			}
		}else {
			System.out.println("There are not same.");
		}
		
		scan.close();
	}
	

}

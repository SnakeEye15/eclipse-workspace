package practice;
import java.util.*;
public class MultiplicationOfMatrix {
	/*
	 * Function to get product of matrix:
	 * 
	 */
	public static void getProduct(int mat1[][], int mat2[][]) {
		int R1=mat1.length;
		int C1=mat1[0].length;
		int C2=mat2[0].length;
		
		for(int i=0;i<R1;i++) {
			for(int j=0;j<C2;j++) {
				int prod=0;
				for(int k=0;k<C1;k++) {
					prod= prod+ ( mat1[i][k] * mat2[k][j]);
				}
				System.out.print(prod+" ");
			}
			System.out.println();	
		}
		
		}
	/*
	 * Main Program starts from here:
	 */
	public static void main (String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Row size for 1st matrix: ");
		int Row1=scan.nextInt();
		System.out.println("Please Enter the Column size for 1st matrix: ");
		int Col1=scan.nextInt();
		System.out.println("Please Enter the Row size for 2nd matrix: ");
		int Row2=scan.nextInt();
		System.out.println("Please Enter the Column size for 2nd matrix: ");
		int Col2=scan.nextInt();
		
		if(Col1 == Row2) {
			//Matrix1:
			int mat1[][]=new int [Row1][Col1];
			//Matrix2:
			int mat2[][]=new int[Row2][Col2];
			//Taking input for 1st matrix:
			System.out.println("Please give input for 1st matrix");
			TakeInputForMatrix.takeInput(mat1, scan);
			System.out.println();
			//Taking input for 2nd matrix:
			System.out.println("Please give input for 2nd matrix");
			TakeInputForMatrix.takeInput(mat2, scan);
			System.out.println();
			
			getProduct(mat1,mat2);
			
		}
		else {
			System.out.println("Multiplication of given matrix size isn't possible: ");
			System.out.println("Note: Mutliplcation of 2 matrix is only possible if and only if column size of 1st matrix is equal to row size of 2nd matrix.");
			
		}
		scan.close();
	}
}

package practice;
//program to add two matrices
import java.util.*;
public class PracticeArray9 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of matrix:");
		try {
		int size =scan.nextInt(); //as its Square matrix so we take only single input.
		int[][] matrix1=new int[size][size];
		int [][] matrix2=new int[size][size];
		int matrix3[][]=new int [size][size];
		System.out.println("Please enter the element for 1st matrix");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				matrix1[i][j]=scan.nextInt();
			}}
		System.out.println("Please enter the element for 2nd matrix");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				matrix2[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("Here is the matrix with sum of these 2 matrix");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
		scan.close();

	}

}

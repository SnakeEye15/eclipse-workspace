package practice;
//program to find lower triangular matrix
import java.util.*;
public class PracticeArray10 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the Row size of maxtrix:");
			int row=scan.nextInt();
			System.out.println("Enter the Column size of matrix:");
			int col=scan.nextInt();
			int matrix[][]=new int[row][col];
			//taking input for matrix;
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					matrix[i][j]=scan.nextInt();
				}
			}
			//now real program starts:
			boolean isLower=true;
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					
					//checking conditions:
					if(j>i && matrix[i][j]!=0) {
						isLower=false;
					}
				}
			}
			if(isLower) {
				System.out.println("It's a Lower Triangular Matrix.");
				//printing the matrix:
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						System.out.print(matrix[i][j]+ " ");
					}
					System.out.println();
				}
			}else {
				System.out.println("It's not a Lower Triangluar Matrix");
			}
			
			
			
			
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
		scan.close();
	}
}

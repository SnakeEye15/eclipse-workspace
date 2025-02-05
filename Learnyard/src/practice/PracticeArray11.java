package practice;
//program to find sum of upper triangular matrix
import java.util.*;
public class PracticeArray11 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		try {
			int size=scan.nextInt();
			int matrix[][]=new int[size][size];
			
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					System.out.println("Please enter ("+i+","+j+") element of matrix:");
					matrix[i][j]=scan.nextInt();
				}
			}
			int sum=0;
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					if(i>=j && matrix[i][j]!=0) {
						sum=sum+matrix[i][j];
					}
				}
			}
			if(sum!=0) {
				System.out.println("The sum of upper triangluar matrix array is: "+sum);
			}else {
				System.out.println("It's not a upper triangular matrix.");
			}
			
		}catch(Exception e) {
			System.err.print(e.getLocalizedMessage());
		}
		scan.close();
	}
}

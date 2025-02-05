package learn;
import java.util.*;

public class LearnArray2 {
	
	public static void subArray(int arr[]) {
		
		int n= arr.length;
		for(int i=0;i<n;i++) {//starting point
			for(int j=i;j<=n;j++) {//ending point
				for(int k=i;k<j;k++) {
					System.out.print(arr[k]+ " ");
				}
				System.out.println();
				
			}
		}
		
				
	}
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of array you want.");
		int n=scan.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Please enter "+(i+1)+" th element of array");
			arr[i]=scan.nextInt();
		}
		subArray(arr);
		
		
		scan.close();
	}

}

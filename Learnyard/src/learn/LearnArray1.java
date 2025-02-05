package learn;

import java.util.Scanner;

public class LearnArray1{
	public static void main (String args[]) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter lenght of array");
		int n=scan.nextInt();
		int arr[]= new int[n];
		for (int i=0;i<n;i++) {
			System.out.println("Please enter "+(i+1)+" th element of array");
			arr[i]=scan.nextInt();
		}
		System.out.println("Please enter position where you want to enter element.");
		int o=scan.nextInt();

		System.out.println("Please enter element you want to enter in array");
		int m=scan.nextInt();
		
		arr[o-1]=m;
		
		System.out.println("Update array will be:");
		
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");;
		}
		
		
		scan.close();
		
	}

}

package learn;
import java.util.*;
public class LearnArray6 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the lenght of array.");
		
		try {
			int n= scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Please enter the "+(i+1)+"th element of array.");
				arr[i]=scan.nextInt();
			}
			
			System.out.println("Please enter the element to search.");
			int k=scan.nextInt();
			int count=0;
			for(int i=0;i<n;) {
				if(k ==arr[i]) {
					System.out.println("-------------/////-----------");
					System.out.println("Index of element is: "+i);
					count++;
					break;
					
				}else {
					i++;
				}
			}
			if(count ==0) {
				System.out.println("-------------/////-----------");
				System.out.println("Element is not present in given array");
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	    scan.close();
	}
}

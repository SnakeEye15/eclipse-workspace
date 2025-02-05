package practice;
import java.util.*;
//Write a program to count total number of even and odd elements in an array.
public class PracticeArray4 {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		try {
			System.out.println("Please enter the size of array:");
			int size=scan.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("Please enter the "+(i+1)+"th element of the array;");
				arr[i]=scan.nextInt();
			}
			int evenCount=0;
			int oddCount=0;
			for(int i=0;i<size;i++) {
				if(arr[i]%2==0) {
					evenCount++;
				}else {
					oddCount++;
				}
			}
			System.out.println("Total number of even element in array: "+evenCount);
			System.out.println("Total number of odd element in array: "+oddCount);
			
			
			scan.close();
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
	}
}

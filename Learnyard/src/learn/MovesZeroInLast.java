package learn;
import java.util.*;
public class MovesZeroInLast {
	/*
	 * Function to moves all zeros in last of any array.
	 * @param arr the input array.
	 *
	 */
	public static void moveZerosToEnd(int arr[]) {
		int size=arr.length;
		int i=0,j =0;
		
		while(j<size) {
			if(arr[j]!=0) {
				arr[i]=arr[j];
				i++;
				
			}
			j++;
		}
		while(i<size) {
			arr[i]=0;
			i++;
		}
	}
	
	/*
	 * Main program starts from here:
	 * 
	 */
	public static void main (String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=scan.nextInt();
		int arr[]=new int[size];
		SecondSmallestElementOfArray.takeInputOfArray(arr, scan);		
		System.out.println("Printing array before zeros move: ");		
		ReverseOfArray.printArray(arr);		
		moveZerosToEnd(arr);		
		System.out.println("Printing array after zero's movement: ");
		ReverseOfArray.printArray(arr);		
		scan.close();
		
	}

}

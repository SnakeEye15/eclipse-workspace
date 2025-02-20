package learn;
import java.util.*;
public class ReverseOfArray {
	/*
	 * Function to reverse the given array;
	 * @param reverseTheArray name of function
	 * @param len variable to store the length of array.
	 * @param i,j two pointers variable from start and end of array.
	 * @param temp instance variable to do swapping of element. 
	 */
	public static void reverseTheArray(int [] arr) {
		int len=arr.length;
		int i=0;
		int j=len-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	
	/*Function to print to array:
	 * Using for each loop to print the element. 
	 * 
	 */
	public static void printArray(int arr[]) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	/*
	 * Main Program start from here:
	 * 
	 */
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		int size=scan.nextInt();
		int arr[]=new int[size];
		SecondSmallestElementOfArray.takeInputOfArray(arr, scan);
		
		System.out.println("Array before reversing is: ");
		printArray(arr);
		
		//reversing the array element:
		reverseTheArray(arr);
		
		System.out.println("Array after reversing the element is: ");
		
		printArray(arr);
		
		scan.close();
		
	}

}

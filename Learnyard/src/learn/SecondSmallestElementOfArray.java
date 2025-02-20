package learn;
import java.util.*;
public class SecondSmallestElementOfArray {
	/*
	 * Function to find out 2nd smallest element of array.
	 * @param secondMiniumumElement function name
	 * @param small,secondSmall variable to store the element during loop.
	 * @return Integer as second smallest number of 
	 */
	public static int secondMinimumElement(int arr[]) {
		int small=1000000,secondSmall=999999;
		
		for(int i=0;i<arr.length;i++) {
			if( arr[i] > small && arr[i]<secondSmall) {
				secondSmall=arr[i];
			}else if(arr[i]<small) {
				secondSmall=small;
				small=arr[i];
			}
			
		}
		
		return secondSmall;
	}
	/*
	 * Function to take input in array
	 * @param len variable to store the length of array.
	 * @param takeInputOfArray function name.
	 * @param arr, scan parameter of function as array and scanner.
	 * @return none. 
	 */
	public static void takeInputOfArray(int[] arr, Scanner scan) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			System.out.println("Please enter the "+(i+1)+"th element of array:");
			arr[i]=scan.nextInt();
		}
	}
	/*
	 * Main Program starts from here:
	 * @param size variable to take input of array size by user.
	 * @param arr name of array created. 
	 * 
	 */
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		int size=scan.nextInt();
		int[] arr= new int[size];
		takeInputOfArray(arr,scan);
		
		
		System.out.println("Second Smallest number of this array is: "+secondMinimumElement(arr));
		
		scan.close();
		
		
	}

}

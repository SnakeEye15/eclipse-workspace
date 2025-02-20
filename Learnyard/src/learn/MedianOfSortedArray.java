package learn;
import java.util.*;
public class MedianOfSortedArray {
	/*
	 * Function to find the median of any shorted array.
	 * 
	 * @param arr the input array
	 * @return the median of the array
	 * 
	 */
	public static double calculateMedian(int arr[]) {
		int size=arr.length;
		double median=0;
		if(size%2==0) {
			median = (arr[size/2]+arr[(size/2)-1])/2.0;
		}else {
			median=arr[size/2];
		}
		
		return median;
	}
	/*
	 * Main program starts from here:
	 * @param size variable to take array size input from user.
	 * @param arr variable to store the array of user's input size.
	 * calling takeInputOfArray method of Another class to take input of array element from user.
	 */
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Make sure to give input as ascending order: ");
		SecondSmallestElementOfArray.takeInputOfArray(arr, scan);
		
		System.out.println("Median of given array is: "+calculateMedian(arr));
		scan.close();
		
	}

}

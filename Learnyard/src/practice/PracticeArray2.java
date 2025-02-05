package practice;
import java.util.*;
//Write a program to find maximum and minimum element in an array.
public class PracticeArray2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Please enter the size of array:");
		    int arraySize=scan.nextInt();
		    int array[]=new int[arraySize];
			for(int i=0;i<arraySize;i++) {
				System.out.println("Please enter the "+(i+1)+"th element of array.");
			    array[i]=scan.nextInt();
			}
			int min=array[0],max=0;
			for(int i=0;i<arraySize;i++) {
				if(array[i]<min) {
					min=array[i];
				}
				if(array[i]>max) {
					max=array[i];
				}
			}
			System.out.println("Mininum of array is:"+min);
			System.out.println("Maximum of array is:"+max);
			scan.close();
			
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
	}
}

package practice;
import java.util.*;

//Write a program to print all negative elements in an array.
public class PracticeArray1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Pleas enter the lenght of array");
			int arraySize=scan.nextInt();
			int array[]=new int[arraySize];
			for(int i=0;i<arraySize;i++) {
				System.out.println("Please enter the "+(i+1)+"th element of array.");
				array[i]=scan.nextInt();
			}
			System.out.println("-*-*-*-*-*-*-*");
			System.out.println("Negative element of this array are:");
			int count=0;
			for(int i=0;i<arraySize;i++) {
				if(array[i]<0) {
					System.out.println(array[i]);
					count++;
				}
			}
			if(count==0) {
				System.out.println("This Array doesn't contains any negative elements.");
			}
			scan.close();
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
	}
}

package practice;
import java.util.*;
//Write a program to find second largest element in an array.
public class PracticeArray3 {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		try {
			System.out.println("Please enter the lenght of array:");
			int size=scan.nextInt();
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("plese enter the "+(i+1)+"th element of array.");
				array[i]=scan.nextInt();
			}
			
			int max1=0;
			int max2=max1;
			for(int i=0;i<size;i++) {
				if(max1<array[i]) {
					max2=max1;
					max1=array[i];
					
					
				}else if(array[i]<max1 && array[i]>max2) {
					max2=array[i];
				}
			}
			
			System.out.println("Second largest element of array is: "+max2);
			
			scan.close();
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
	}

}

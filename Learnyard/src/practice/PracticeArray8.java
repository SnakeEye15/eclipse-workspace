package practice;
import java.util.*;
//Write a program to count total number of duplicate elements in an array.
public class PracticeArray8 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		final int max_size=100;
		System.out.println("Please enter the size of array:");
		try {
			int size=scan.nextInt();
			int array[]=new int[size];
			int freq[]=new int[max_size];
			for(int i=0;i<size;i++) {
				System.out.println("Please enter the "+(i+1)+"th element of array:");
				array[i]=scan.nextInt();
				freq[i]=-1;
			}
			int count=0;
			for(int i=0;i<size;i++) {
				
				for(int j=i+1;j<size;j++) {
					if(array[i]==array[j]) {
						count++;
						break;
					}
				}
				if(freq[i]!=0) {
					freq[i]=count;
				}
			}
			
			System.out.println("Total number of duplicate element in array is:");
			System.out.println(count);
			
		}catch(Exception e){
			System.err.print(e.getMessage());	
		}	
		scan.close();
	}

}

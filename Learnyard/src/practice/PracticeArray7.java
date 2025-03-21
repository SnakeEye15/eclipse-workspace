package practice;
import java.util.*;
//Write a program to print all unique elements in the array.
public class PracticeArray7 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		final int max_size=100;
		System.out.println("Please enter the size of array:");
		try {
			int size=scan.nextInt();
			int array[]=new int[max_size];
			int freq[]=new int[max_size];
			for(int i=0;i<size;i++) {
				System.out.println("Please enter the "+(i+1)+"th element of array:");
				array[i]=scan.nextInt();
				freq[i]=-1;
			}
			for(int i=0;i<size;i++) {
				int count=1;
				for(int j=i+1;j<size;j++) {
					if(array[i]==array[j]) {
						count++;
						freq[j]=0;
					}
				}
				if(freq[i]!=0) {
					freq[i]=count;
				}
			}
			System.out.println("Here is the element which are unique:");
			for(int i=0;i<size;i++) {
				if(freq[i]==1) {
					System.out.print(array[i]+" ");
				}
			}	
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
		scan.close();
	}
}

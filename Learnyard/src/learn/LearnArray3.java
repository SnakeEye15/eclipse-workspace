package learn;
import java.util.*;
public class LearnArray3 {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the size of array.");
		
		int n= scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" th element:");
			arr[i]=scan.nextInt();
			
		}
		int EvenCount=0;
		int OddCount=0;
		
		for (int i: arr) {
			if(i%2==0) {
				EvenCount++;
			}
			else {
				OddCount++;}
		}
		
		if(EvenCount>0) {
			int Index=0;
			int Even[]=new int[EvenCount];
			for(int i=0;i<n;i++) {
				if(arr[i]%2==0) {
					Even[Index]=arr[i];
					Index++;
				}
			}
			for(int j: Even) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		if(OddCount>0) {
			int Index=0;
			int Odd[]=new int[OddCount];
			for(int i=0;i<n;i++) {
				if(arr[i]%2!=0) {
					Odd[Index]=arr[i];
					Index++;
				}
			}
			for(int j:Odd) {
				System.out.print(j+ " ");
			}
		}
		scan.close();
		
	}

}

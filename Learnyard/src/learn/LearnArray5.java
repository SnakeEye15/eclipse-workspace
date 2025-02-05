package learn;
import java.util.*;
public class LearnArray5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.println("Please enter the lenght of array.");
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Please enter the "+(i+1)+"th element of array.");
				arr[i]=scan.nextInt();
			}
			System.out.println("Pleae enter the value K:");
			int k=scan.nextInt();
			k=k%n;
			int result[]=new int[n];
			for(int i=0;i<n;i++) {
				int newIndex=i-k;
				if(newIndex<0) {
					newIndex+=n;
				}
				result[newIndex]=arr[i];
			}
			
			
			for(int i=0;i<n;i++) {
				System.out.print(result[i]+" ");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		scan.close();
	}

}

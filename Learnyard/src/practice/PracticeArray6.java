package practice;
import java.util.*;
//Write a program to delete an element from an array at specified position.
public class PracticeArray6 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of array.");
		try {
			int size=scan.nextInt();
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("Please enter the "+(i+1)+"th element of array:");
				array[i]=scan.nextInt();
			}
			System.out.println("___*____*____*____*____*____*___*__*___*__*");
			System.out.println("Current array is: ");
			for(int i: array) {
				System.out.print(i+ " ");
			}
			System.out.println();
			System.out.println("Please enter the position of element wants to remove:");
			int pos=scan.nextInt();
			System.out.println("___*____*____*____*____*____*___*__*___*__*");
			System.out.println("Updated array is: ");
			if(pos>size || pos<=0) {
				System.out.println("Please enter the correct position.");
			}else if(pos==size) {
				for(int i=0;i<size-1;i++) {
					System.out.print(array[i]+" ");
				}
			}else if(pos==1) {
				for(int i=1;i<size;i++) {
					System.out.print(array[i]+" ");
				}
			}else {
				for(int i=pos-1;i<size-1;i++) {
					array[i]=array[i+1];
				}
				for(int i=0;i<size-1;i++) {
					System.out.print(array[i]+" ");
				}
			}
			
			
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
		scan.close();
	}
}

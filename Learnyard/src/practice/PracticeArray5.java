package practice;
import java.util.*;
//Write a program to insert an element in an array.
public class PracticeArray5 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		try {
			int size=scan.nextInt();
			int array[]=new int[size+1];
			for(int i=0;i<size;i++) {
				System.out.println("Please enter the "+(i+1)+"th element of array:");
				array[i]=scan.nextInt();
			}
			System.out.println("*___*___*___*__*__*__*__*__*__*__*__");
			System.out.println("Please enter the element you want to insert in array:");
			int newElement=scan.nextInt();
			System.out.println("Please enter the position where you want to enter the element:");
			int position=scan.nextInt();
			
				
			System.out.println("*___*___*___*__*__*__*__*__*__*__*__");
			System.out.println("Your current array is:");
		    for(int i: array) {
		    	System.out.println(i);
		    }
			
		    if(position>size+1 || position <=0) {
		    	System.out.println("please check your position and try again.");
		    }else {
		    	for(int i=size;i>=position;i--) {
		    		array[i]=array[i-1];
		    	}
		    }
		    
		    array[position-1]=newElement;
		    size++;
			System.out.println("*___*___*___*__*__*__*__*__*__*__*__");
			System.out.println("New updated array will be:");	
		    
		    for(int i: array) {
		    	System.out.println(i);
		    }
		
		}catch(Exception e){
			System.err.print(e.getMessage());
		}
		scan.close();
	}
}

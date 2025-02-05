package learn;
import java.util.*;
public class LearnArray4 {
	
	public static int [] SumOfelement( int nums[], int target) {
		int result[] = new int[2];
		
		int n=nums.length;
		
		result[0]=-1;
		result[1]=-1;
		
		int i=0;
		int j=n-1;
		
		while(i<=j) {
			
			
			int currentSum=nums[i]+nums[j];
			
			if(currentSum==target) {
				result[0]=i;
				result[1]=j;
				break;
			}else if(currentSum>target) {
				j--;
			}else {
				i++;
			}
		}
		
		return result;
		
	}
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of array;");
		try {
			
			int len=scan.nextInt();
			int Arr[]= new int[len];
			System.out.println("Make Sure you will enter the element in ascending order.");
			for(int i=0;i<len;i++) {
				System.out.println("Please enter the "+(i+1)+" th element of array:");
				Arr[i]=scan.nextInt();
			}
			
			System.out.println("Please enter the value of sum you want.");
			int Sum=scan.nextInt();
			
			int result[]=SumOfelement(Arr,Sum);
			
			System.out.println(result);
			
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		scan.close();
	}

}

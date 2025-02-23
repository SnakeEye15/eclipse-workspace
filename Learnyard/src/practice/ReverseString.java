package practice;
import java.util.*;
public class ReverseString {
	/*
	 * Method to reverse the given string: 
	 */
	private static void reverse(StringBuilder STR) {
		int i=0;
		int j=STR.length()-1;
		while(i<j) {
			char temp=STR.charAt(i);
			STR.setCharAt(i,STR.charAt(j));
			STR.setCharAt(j, temp);
			i++;
			j--;
		}
	}
	
	/*
	 * Main Program starts from here:
	 */
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str=scan.next();
		System.out.println("String before reverse is: "+str);
		StringBuilder S=new StringBuilder(str);
		reverse(S);
		System.out.println("String after reverse is:  "+ S);
		
		
		scan.close();
		
	}
}

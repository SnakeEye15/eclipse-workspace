package practice;
import java.util.*;
public class CheckPalindrome {
	/*
	 * Function to check whether the String is Palindrome of not?
	 * @param str the input String
	 * @param i,j the variable to iterate through loop.
	 * @return true/false base on whether sting is palindrome or not.
	 */
	public static boolean verifyPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		boolean check=true;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				check=false;
			}
			i++;
			j--;
		}
		return check;
	}
	
	/*
	 * Main program starts from here:
	 */
	public static void main (String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the String");
		String str=scan.next();
		if(verifyPalindrome(str)) {
			System.out.println("It's a Palindrome String.");
		}else
			System.out.println("It's not a Palindrome String");
		
		scan.close();
	}

}

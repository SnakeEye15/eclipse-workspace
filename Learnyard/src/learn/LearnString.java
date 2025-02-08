package learn;
import java.util.Scanner;
//Program to get the index of any input char in String:
public class LearnString {
	/*
	 * Main program starts from here:
	 * @param scan variable for Scanner input class.
	 * @param str variable to store the string input.
	 * @param ch to store character input
	 * 
	 * we have used next().charAt(0) to take only first char of input.
	 */
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the String:");
		String str=scan.nextLine();
		System.out.println("Please enter the character you wants to find.");
		char ch=scan.next().charAt(0);
		//Traversing through string and finding out desired character position.
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				System.out.print(i+" ");
			}
		}
		scan.close();
	}
}

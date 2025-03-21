package learn;
import java.util.*;
//Program to reverse the string words.
public class LearnString3 {
	/*
	 * Method to reverse the array
	 * @param i,j variable to store the starting point for both side of array.
	 * 
	 */
	public static void reverse(String[] str) {
		int i=0;
		int j=str.length-1;
		while(i<j) {
			String temp=str[i];
			str[i]=str[j];
			str[j]=temp;
			i++;
			j--;
		}
	}
	
	/*
	 * Method to print the elements of array:
	 * 
	 */
	public static void printArray(String[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	/*
	 * Main Program starts from here:
	 * @param str string variable to store user input.
	 * @param count variable to store the count of space in string to split it into words.
	 * We have take count as 1 cause we have to use it to make array and if any string has 3 space then
	 * it means it have 4 words.
	 * @param arrayStr Array variable to store the each word as element of string.
	 * @param word variable to store the each word char by char
	 * @param index variable to store index for array.
	 */
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the string:");
		String str=scan.nextLine();
		int count=1; 
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		String[] arrayStr=new String[count];
		String word="";
		int index=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) != ' ') {
				word+=str.charAt(i);
			}else {
				arrayStr[index]=word;
				word="";
				index++;
			}
		}
		arrayStr[index]=word;
		reverse(arrayStr);
		printArray(arrayStr);
		
		scan.close();
	}
}

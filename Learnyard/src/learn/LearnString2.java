package learn;
import java.util.Scanner;;
//Program to find the maximum frequency of character
public class LearnString2 {
	/*
	 * Function to find out the maximum frequency character of any string:
	 * @param maxFreqCharInString function name.
	 * @param str parameter string for function.
	 * @param len to store the length of string.
	 * @param maxChar to store the maximum character. 
	 * @param maxFreq to store the frequency of maximum character.
	 * @param temChar to store the temporary character of string.
	 * @param tempMax to store the temporary maximum frequency.
	 * @return the character with maximum frequency.
	 */
	public static char maxFreqCharInString(String str) {
		int len=str.length();
		char maxChar=' ';
		int maxFreq=0;
		int tempMax=0;
		char tempChar=' ';
		for(int i=0;i<len;i++) {
			tempChar=str.charAt(i);
			tempMax=0;
			for(int j=0;j<len;j++) {
				if(tempChar==str.charAt(j)) {
					tempMax=tempMax+1;
				}
			}
			if(tempMax>maxFreq) {
				maxFreq=tempMax;
				maxChar=tempChar;
			}
			
		}
		return maxChar;
	}
	/*
	 * Main program starts from here:
	 * @param str variable name to store the input string.
	 * 
	 */
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String str=scan.nextLine();
		//Calling method and direct printing the returned results:
		System.out.println("Maximum occuring charcter in given string is: "+maxFreqCharInString(str));
		scan.close();
	}
}

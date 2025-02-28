package learn;
import java.util.Scanner;
//Program to get the starting location on word in string.
public class LearnString1 {
/*
 * Lets create a function to check whether the string same or not.
 * @param mainString parameter to store big string
 * @param target parameter to store required String
 * @param startIndex parameter to giving index where we have to start the checking
 * @param i variable to store starting index of main string.
 * @param j variable to store the staring index of target string
 */
public static boolean isSame(String mainString, String target, int startIndex) {
	int i=startIndex;
	int j=0;
	
	while(i<mainString.length() && j<target.length()) {
		if(mainString.charAt(i) != target.charAt(j)) {
			return false;
		}
		i++;
		j++;
	}
	
	return true;
}
/*
 * Main program starts from here:
 * @param scan Scanner class variable
 * @param str variable to store the input string/sentence.
 * @param fStr variable to store the word to find out.
 */
public static void main(String args[]) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Please enter the string here: ");
	String str=scan.nextLine();
	char check='Y';
	while(check=='Y'){
	System.out.println("Please enter the word you want to search:");
	String fStr=scan.next();
	boolean found=false;
	//traversing through complete string.
	for(int i=0;i<str.length();i++) {
		//Calling the method for each iteration to check the target sting found or not?
		if(isSame(str,fStr,i)) {
			System.out.print(i+ " ");
			found=true;
		}
	}
	
	if(!found) {
		System.out.println("Entered element isn't present in Main string:");
	}else {
		System.out.println();
	}
	System.out.println();
	System.out.println("------------///------------");
	System.out.println("Do you want to search any other work also in same string: [Y or N]");
	check=scan.next().charAt(0);
	}
	
	scan.close();
}
}

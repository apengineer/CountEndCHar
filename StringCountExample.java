package test;

import java.util.Scanner;
import java.util.Stack;

public class StringCountExample {

	/*Given a string, count the number of words ending in 'y'  -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" 
	 * (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. 
	 * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


	countYZ("fez day") → 1
	countYZ("daz fez") → 0

	Step2. Make the code generalised to count any char
	 */

	public static int countYZ(String inputString , char key){			
		String []array = inputString.split("\\s");		 
		int count = 0;		 
		for (int i = 0; i < array.length; i++) {
			String string2 = array[i];			
			if( string2.charAt(string2.length()-1) == key){
				count++;
			}			
		}
		return count;
	}

	public static void main(String[] args) {	 

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your string:\t");
		String searchString = scanner.nextLine();

		System.out.print("Please enter your key:\t");
		String skey = scanner.nextLine();

		if(searchString.isEmpty() || skey == null){
			System.out.println("No input. Run again");	

		}else{
			char key = skey.charAt(0);
			scanner.close();
			int count = StringCountExample.countYZ(searchString, key);
			System.out.println("Number of words with "+ key + " at end in the string \""+ searchString+ "\" is " +count);
		}



	}

}

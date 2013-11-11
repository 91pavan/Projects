package text;

import java.util.Scanner;

public class StringReverse {
	/*
	 *  Enter a string and the program will reverse it and print it out.
	 */
	public static String reverseWord(String s) {
		
		StringBuilder sb = new StringBuilder(s.length());
		for(int i=s.length() - 1;i>=0;i--) {
			sb.append(s.charAt(i));
			/* alternative method
			 * new StringBuilder(s).reverse().toString();
			 *  
			 */
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {

		String input;
		System.out.println("Enter the string \n");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		System.out.println("Reversed word : " + reverseWord(input));
	}

}

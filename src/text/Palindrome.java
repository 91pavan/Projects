package text;

import java.util.Scanner;

public class Palindrome {
	/*
	 *  Checks if the string entered by the user is a palindrome.
	 */
	public static boolean checkForPalindrome(String s){
		
		StringBuilder sb = new StringBuilder(s.length());
		for(int i = s.length() -1 ; i >=0; i--){
			sb.append(s.charAt(i));
		}
		/*
		 * Alternative method :
		 * new StringBuilder(s).reverse().toString();
		 */
		return s.equals(sb.toString());
		
	}
	public static void main(String[] args) {
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the word to check if it is a palindrome");
		input = scan.nextLine();
		System.out.println(checkForPalindrome(input.toLowerCase()));
	}

}

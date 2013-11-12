package text;

import java.util.Scanner;

public class Pangrams {
	/*
	 * A pangram or holoalphabetic sentence for a given alphabet 
	 * is a sentence using every letter of the alphabet at least once.
	 * Prints True if the given sentence has all 26 unique words
	 * or False if it doesn't
	 */
	
	public static boolean checkPangrams(String s){
		
		String allAlphabets = "abcdefghijklmnopqrstuvwxyz";
		boolean[] b = new boolean[26];
		char[] charArray = s.toCharArray();
		for(char c: charArray) {
			if(c >=97 && c <=122) {
				if(!b[allAlphabets.indexOf(c)]) {
					b[allAlphabets.indexOf(c)] = true;
				}
			}
		}
		
		for(int i=0;i<b.length;i++) {
			if(b[i] != true) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String input;
		int no_of_inputs = 0;
		System.out.println("Enter the number of input Strings\n");
		Scanner in = new Scanner(System.in);
		no_of_inputs = in.nextInt();
		System.out.println("Enter " + no_of_inputs +" Strings delimited by newLine ");
		for(int i=0; i<=no_of_inputs; i++) {
			input = in.nextLine();
			if(input != null) {
				System.out.println(checkPangrams(input.toLowerCase().trim().replaceAll(" +", "")));
			}
		}
	}

}

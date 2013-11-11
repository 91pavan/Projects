package text;

import java.util.Scanner;

public class CountVowels {
	/*
	 *  Enter a string and the program counts the number of vowels in the text. 
	 *  For added complexity have it report a sum of each vowel found.
	 */
	public static void countVowel(String s) {
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		for(int i=0; i<s.length() ;i++) {
			
			switch(s.toLowerCase().charAt(i)) {
			
			case 'a' : aCount += 1;
					    break;
			case 'e' : eCount += 1;
			   			break;
			case 'i' : iCount += 1;
			   			break;
			case 'o' : oCount += 1;
			   			break;
			case 'u' : uCount += 1;
			   			break;
			default : break;
			}
			
		}
		
		System.out.println("Vowel 'a' count is : "+ aCount);
		System.out.println("Vowel 'e' count is : "+ eCount);
		System.out.println("Vowel 'i' count is : "+ iCount);
		System.out.println("Vowel 'o' count is : "+ oCount);
		System.out.println("Vowel 'u' count is : "+ uCount);
	}
	public static void main(String[] args) {
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Print the word");
		input = scan.nextLine();
		countVowel(input);
	}

}

package text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CountWords {
	/*
	 * Counts the number of individual words in a string which is read from a file.
	 */
	public static void count(String s) {
		
		int UniqueWords = 0;
		boolean[] b = new boolean[256];
		for(int i=0;i<s.length();i++) {
			 if(!b[s.charAt(i)]) {
				 
				 UniqueWords += 1;
				 b[s.charAt(i)] = true;
			 
			 } 
		}
		System.out.println("Unique words in the String is : " + UniqueWords);
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("/home/pavan/input.txt"));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append('\n');
            line = br.readLine();
        }
        String everything = sb.toString();
        count(everything.toLowerCase().trim().replaceAll(" +", ""));
	}

}

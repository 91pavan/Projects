package text;

import java.util.Scanner;

public class StringTransposition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Number of strings to follow:");
        int numberOfStringsToFollow = s.nextInt();
        s.nextLine();
        String[] strings = new String[numberOfStringsToFollow];
        int maxStringLength = 0;
        for(int i = 0; i < numberOfStringsToFollow; i++)
        {
            strings[i] = s.nextLine();

            if(strings[i].length() > maxStringLength)
            {
                maxStringLength = strings[i].length();
            }
        }


        for(int k = 0; k < maxStringLength; k++)
        {
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < numberOfStringsToFollow; j++)
            {
                if(k < strings[j].length())
                {
                    sb.append(strings[j].charAt(k));
                }
                else
                {
                    sb.append(' ');
                }
            }
            System.out.println(sb);
        }
    
	}

}

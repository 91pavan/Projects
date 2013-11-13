package text;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		
		int no_of_students;
		int no_of_scores;
		Scanner scan = new Scanner(System.in);
		String[] firstInput = scan.nextLine().split(" ");
		no_of_students = Integer.parseInt(firstInput[0]);
		no_of_scores = Integer.parseInt(firstInput[1]);
		String[] names = new String[no_of_students];
		double[] grades = new double[no_of_scores];
		double average_grade = 0.0;
		for(int i=0; i<no_of_students ;i++){
			
			String[] raw_data = scan.nextLine().split(" ");
			names[i] = raw_data[0];
			for(int j=1; j<=no_of_scores ;j++) {
				grades[i] += (Integer.parseInt(raw_data[j]));
			}
			average_grade +=grades[i]/(no_of_scores*no_of_students);
			
		}
		System.out.println(average_grade);
		for(int i=0;i<no_of_students;i++) {
			System.out.println(names[i] +" "+ (grades[i]/no_of_scores));
		}
		//System.out.println(no_of_students + " "+ no_of_scores);
	}

}

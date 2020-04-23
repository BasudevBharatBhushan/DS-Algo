package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
System.out.println("Enter the number of Students");
		int n = sc.nextInt();
		int averageMarks = 0;
		int marks[] = new int[n];
		System.out.println("Enter the marks now");
		for(int i = 0; i <n; i++) {
			marks[i] = sc.nextInt();
			 averageMarks += marks[i];
		}
		
//		int averageMarks = 0;
//		   for(int i = 0; i <n; i++) {                       //here the loops in case of arrays cannot be initialised from 1 because their indexing start with 0
//			   averageMarks += marks[i];
//		   }
		averageMarks /= n;
		System.out.println("The average marks are " + averageMarks);
		
		
		
		
		
		
	}

}

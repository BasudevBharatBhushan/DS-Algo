package loop;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);	
		
		int n = sc.nextInt();
		float seriesSum =0;
		
		for(float i = 1; i <= n; i++) {
			seriesSum += 1/i; 
	
		}
		
		   System.out.println(seriesSum);
			
	}

}

package arrays;

import java.util.Scanner;

public class LargestSumHourGlassProblem {

	public static void main(String[] args) {
		System.out.println("bring the console");
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[6][6];
		int max=Integer.MIN_VALUE;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j <6 ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}	
		for(int r =0; r<4;r++) {
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			for(int c=0;c<4;c++) {
				sum1=arr[r][c]+arr[r][c+1]+arr[r][c+2];
				sum2=arr[r+1][c+1];
				sum3=arr[r+2][c]+arr[r+2][c+1]+arr[r+2][c+2];
				if((sum1+sum2+sum3)>max) {
					max=sum1+sum2+sum3;
				}
			}
		}
		System.out.println(max);
	
}
	
}
		
				
		
				    
				
		
	



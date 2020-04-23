package loop;

import java.util.Scanner;

public class SeriesSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
//		float resultSum = 0;
//		
//		for(float i = 1; i <= n; i += 2) {
//			resultSum += 1/i;
//		}
//		
//		float resultDifference = 0;
//		
//		for(float i = 2; i <= n - 1; i += 2  ) {
//			resultDifference -= 1/i;
//		}
//		
//		System.out.println(resultSum + resultDifference);

		float result = 0;
		for(float i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				result -= 1/i;
				
			} else {
				result += 1/i;
			}
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
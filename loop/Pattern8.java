package loop;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
 
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		
//		for(int i = 1; 2 * i <= n + 1; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//	 
//			System.out.println();
//		}
//		for(int i = (n + 1) / 2 + 1; i <= n; i++ ) {
//			for(int j = 1; j <= n - i + 1; j++) {
//				System.out.print("* ");
//		}
//			System.out.println();
//	}

		int rows = 2 * n - 1;
		 for(int i = 1; i <= rows; i++) {
			if(i <= n) {
				for(int j = 1; j <=i; j++) {
					System.out.print("* ");
				}
			
			} else {
				for(int j = 1; j<=rows-i+1; j++) {
					System.out.print("* ");
				}
			
			}
			System.out.println();
		}
	
		                                                        
}
}

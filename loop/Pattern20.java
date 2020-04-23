package loop;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		for(int i = 0; i <= n; i+=2) {
			for(int j = 0; j <=i-1 ; j+=2) {
				System.out.print("  ");
			}
			for(int j = 0; j <= n-i+1; j+=2) {
				System.out.print(j+" ");
			}
			System.out.println();
			}

	}

}

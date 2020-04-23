package loop;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i*=3) {
	    	for(int j = 1; j <= i; j*=3) {
		System.out.print(j+" ");
		}
		System.out.println();
		}

	}

}

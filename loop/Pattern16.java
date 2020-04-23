package loop;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();	

		for(int i = 0; i <= 8; i+=2) {
			 
			for(int j = 0; j <= 9-i; j+=2) {
				System.out.print(j + " ");
			}
			

			System.out.println();
		}

	}

}

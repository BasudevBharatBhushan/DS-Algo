package loop;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
	int n = sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j =1;j<=n-i;j++) {
			System.out.print("  ");
		}
		for(int j =1;j<=2*i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
	}

}

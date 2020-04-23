package loop;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			for(int i = 1;i <= n; i++) {
				System.out.print(" ");

				}
			System.out.print("1");
			
			
			for(int i = 1;i <= n; i++) {
				
				for(int j = 1; j<=n-i; j++) {
					System.out.print(" ");
					 
				}
			
				for(int j =i; j<=i; j++) {
			if(i==1)continue;	
					System.out.print(j+ " ");	
					}
					
				
				for(int j = 2;j <= i ;j++) {


					System.out.print("0 ");
					 
				}
				for(int j =i; j<=i; j++) {
					if(i==1)continue;
					System.out.print(j);
				}
				
				System.out.println();	
			}
			
			
			
			
			
	}

}

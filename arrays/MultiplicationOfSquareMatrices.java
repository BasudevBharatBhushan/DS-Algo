package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationOfSquareMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dimension");
		int N = sc.nextInt();
		
		
		
		int a [][] = new int[N][];
		int b[][] = new int[N][];
		int c[][]=new int [N][];
		System.out.println("enter array a");
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter array b");
		for(int i = 0; i<N; i++ ) {
			for(int j = 0; j<N;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				c[i][j]=0;
				for(int k=0;k<N;k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		for(int[] row:c)
			
			for(int x:row)
				System.out.println(x+" ");
		
		
		for(int[] row:c)
			
			System.out.println(Arrays.toString(row));
	}
	}
		

	



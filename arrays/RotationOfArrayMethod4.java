package arrays;

import java.util.Scanner;

public class RotationOfArrayMethod4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of test cases");
		int TestCases=sc.nextInt();
		StringBuilder s =new StringBuilder();
		while(TestCases-->0) {
			System.out.println("Enter the length of array");
			int N = sc.nextInt();
			int arr[]=new int[N];
			int b[]= new int[N];
			System.out.println("Enter no. of rotation");
			int D=sc.nextInt();
			System.out.println("Enter elements of array");
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
				if(i>=D)
					b[i-D]=arr[i];
				else 
					b[N+i-D]=arr[i];	
			}
		
//			for(int item:b) {
//				System.out.println(item);
//			}
			for(int j=0;j<N;j++)
		      {
		          s.append(b[j]+" ");
		      }
		         s.append('\n');
		}
		System.out.println(s);

	}

}

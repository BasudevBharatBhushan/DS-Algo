package competitiveCoding;

import java.util.*;

public class CandiesProblem {
	
	static long candies(int n, int a[]) {
		int c[]=new int[n];
		Arrays.fill(c, 1);  //Predefined function of array to fill all the elements of array into a single value, for example in this case 1 is being filled in every index
		for(int i =1;i<n;i++) {
			if(a[i]>a[i-1]) {
				c[i]=c[i-1]+1;
			}
		}
		for(int i = n-2;i>=0;i--) {
			if(a[i]>a[i+1]) {
				c[i]=Math.max(c[i+1]+1,c[i] );    //pre defined function which will assign the maximum value between two int values
			}
		}
		long sum =0;
		for(int i=0;i<n;i++) {
			sum=sum+(long)c[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbfer of test cases");
		int TestCaes = sc.nextInt();
		while(TestCaes-->0) {
			System.out.println("Enter the number of students");
			int n = sc.nextInt();
			int a[]= new int[n];
			System.out.println("enter the ratings");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			long finalSum= candies(n,a);
			System.out.println("The minimum number of toffees can be distributed as per the criteria is --->"+finalSum);
		}
	


	}

}





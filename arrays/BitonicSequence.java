package arrays;


import java.util.*;
import java.lang.*;
import java.io.*;

public class BitonicSequence
{
	public static void main (String[] args)
	 {
		System.out.println("console");
	  
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0) {
	     int n = sc.nextInt();
	     int arr[] = new int[n];
	  //   int dp[][] = new int[n][2];
	     for(int i=0;i<n;i++) {
	         arr[i] = sc.nextInt();
	       //  Arrays.fill(dp[i], -1); 
	     }
//	     System.out.println();
//	     printInMatrixStyle(dp);
	    
	     System.out.println(helper(arr, n, 0, 0, 0, false));
	 }
}
	 
	 public static int helper(int arr[], int n, int prev, int pos, int sum, boolean isDec) {
	     if(pos==n) {
	         return sum;
	     }
	     
	     int a = 0, b = 0, c = 0;
	     
	     if(arr[pos]>prev && !isDec) {
	         a = Math.max(a, helper(arr, n, arr[pos], pos+1, sum+arr[pos], false));
	     }
	     
	     if(arr[pos]<prev) {
	         b = Math.max(b, helper(arr, n, arr[pos], pos+1, sum+arr[pos], true));
	     }
	     c = Math.max(c, helper(arr, n, prev, pos+1, sum, isDec));
	     return Math.max(a, Math.max(b, c));
	 }
	 
	

}
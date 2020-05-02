package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * BALANCED ARRAY PROBLEM
 * we have to find the minimum possible value, to be added to any element of each half side ,to make the array balanced
 * balanced array= sum of 1st half elements == sum of 2nd half elements
 */

public class BalancedArrayProblem {

	public static void main (String[] args) throws Exception{
		System.out.println("test cases");
		Scanner sc=new Scanner(System.in);
	    StringBuilder s=new StringBuilder();
	    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	    //int t=Integer.parseInt(reader.readLine().trim());
	    int t=sc.nextInt();
	    while(t--!=0){
	       // int n=Integer.parseInt(reader.readLine().trim());
	    	int n=sc.nextInt();
	        int a[]=new int[n];
	        int sum1=0;
	        int sum2=0;
	        //String nd[]=reader.readLine().trim().split(" ");
	        for(int i=0;i<n;i++){
	           // a[i]=Integer.parseInt(nd[i].trim());
	        	a[i]=sc.nextInt();
	            if(i<n/2)
	              sum1+=a[i];
	            else
	              sum2+=a[i];
	        }
	        System.out.println(sum1+" "+sum2);
	        if(sum1>=sum2)
	           s.append(sum1-sum2);
	        else 
	           s.append(sum2-sum1);
	           
	           s.append('\n');
	    }
	    System.out.println(s);
		
	}
}

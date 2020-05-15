package map;
import java.util.*;
import java.lang.*;
import java.io.*;
/*
 * Given an unsorted array of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Note: If you find multiple answers then print the Smallest number found. Also, expected solution is
 */

public class FindMissingAndRepeating
 {
	public static void main (String[] args)throws Exception
	 {
		System.out.println("console");
	     BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	     StringBuilder s = new StringBuilder();
	     int t = Integer.parseInt(reader.readLine().trim());
	     while(t-->0){
	    	 int min=Integer.MAX_VALUE;
	         Map<Integer,Boolean> map=new HashMap<>();
	         int n =Integer.parseInt(reader.readLine().trim());
	         int arr[]=new int[n];
	         String nd[]=reader.readLine().trim().split(" ");
	         int i=0;
	         for(;i<n;i++){
	             arr[i]=Integer.parseInt(nd[i].trim());
	             if(map.containsKey(arr[i])&& map.get(arr[i])==true) {
		        		if(arr[i]<min) {
		        			min=arr[i];
		        		}
		        	}
	             map.put(arr[i],true);
	             
	         }
	      
	            
	         i=1;
	       
	         while(i<n+1) {
	        	 if(!map.containsKey(i)) {
	        		 s.append(min+" "+i);
	        		 break;
	        	 }
	        	 i++;
	         }
	         
	         s.append('\n');
	         
	        
	     }      
	     System.out.println(s);
	 
	 }
}
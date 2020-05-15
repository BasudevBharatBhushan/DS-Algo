package lists.sets;




import java.util.*;
import java.lang.*;
import java.io.*;
public class FindTheSumOfDistinctElement
 {
	Object c[];
	
	public static void main (String[] args)throws Exception
	 { 
		System.out.println("console");
	     BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	     StringBuilder s = new StringBuilder();
	     int t = Integer.parseInt(reader.readLine().trim());
	     while(t-->0){
	         Set<Integer> set = new LinkedHashSet<>();
	         int n = Integer.parseInt(reader.readLine().trim());
	         int sum=0;
	         int arr[]=new int[n];
	         String nd[]=reader.readLine().trim().split(" ");
	         for(int i=0;i<n;i++){
	             arr[i]=Integer.parseInt(nd[i].trim());
	             set.add(arr[i]);
	            
	         }
	         
	         Iterator iterator = set.iterator();
	        
	         while(iterator.hasNext()) {
	        	 int num = (int) iterator.next();
	        	 sum=sum+num;
	         }
	         
	         while(iterator.hasNext()) {
	        	System.out.print(iterator.next()+" ");
	         }
	         System.out.println(set);
	         
	         System.out.println(sum);
	     }
	 }
}
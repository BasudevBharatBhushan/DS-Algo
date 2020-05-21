package comparatorsAndComparables;


import java.util.*;
import java.lang.*;
import java.io.*;
public class SortByAbsoluteDifference
 {
     Object c[];
	public static void main (String[] args)throws Exception
	 {
		System.out.println("console");
	     BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	     StringBuilder s = new StringBuilder();
	     int t = Integer.parseInt(reader.readLine().trim());
	     while(t-->0){
	         List<Integer> list =new ArrayList<>();
	         String md[]=reader.readLine().trim().split(" ");
	         int m =Integer.parseInt(md[0].trim());
	         int n =Integer.parseInt(md[1].trim());
	        
	         String nd[]=reader.readLine().trim().split(" ");
	         for(int i=0;i<m;i++){
	             
	             list.add(Integer.parseInt(nd[i].trim()));
	         }
	         
	        	 Collections.sort(list,(o1,o2)-> {            //Using Lambda function
	     			
	     			
	     			if(Math.abs(n-o1)>Math.abs(n-o2))return 1;   //Math.abs()---This class is same as the modulus function in mathematics
	     			else if(Math.abs(n-o2)>Math.abs(n-o1))return -1;
	     			return 0; 
	     		});
		
	         System.out.println(list);

	        SortByAbsoluteDifference obj = new SortByAbsoluteDifference();
	        obj.c=list.toArray();
	        
	        for(Object item:obj.c){
	            s.append(item+" ");
	        }
	       
	        
	      s.append('\n');
	     }      
	     System.out.println(s);
	 }
}
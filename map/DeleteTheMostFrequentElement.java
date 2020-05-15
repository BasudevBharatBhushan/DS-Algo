package map;

import java.util.*;
import java.lang.*;
import java.io.*;
public class DeleteTheMostFrequentElement
 {
	public static void main (String[] args)throws Exception
	 {
		 System.out.println("test case");
	    
	     BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	     StringBuilder sc = new StringBuilder();
	     int t = Integer.parseInt(reader.readLine().trim());
	     while(t-->0){
	        String s =reader.readLine();
	        if(s.length()==1) {
	        	sc.append(s);
	        	sc.append('\n');
	        }else {
	        Map<Character,Integer> map = new HashMap<>(); 
	        char arr[]=new char[s.length()];
	        for(int i=0;i<arr.length;i++) {
	        	arr[i]=s.charAt(i);
	        }
	        Arrays.sort(arr);
	        
	        for(int i=1;i<arr.length;i++) {
			    int n =1;
			    if(map.containsKey(arr[i])) {
				    n=map.get(arr[i]);
			 	}
		    	if(arr[i]==arr[i-1]) {
			    	map.put(arr[i], ++n);
		    	}
	    	}
		System.out.println(map);
		if(map.isEmpty()) {
			sc.append(arr[arr.length-1]);
		}else {
		
		   int max=0;char i=48;char maxkey=0;
	       while(i<=57) {
	           if(map.containsKey(i)) {
	               if(map.get(i)>=max) {
	    		       max=map.get(i);
	    			    maxkey=i;
	    		   }
	              
	    	   }
	    	   i++;
	      }
	      
	      sc.append(maxkey);
		}
	      sc.append('\n');
	        }       
	     }
	     System.out.println(sc);
	 }
	
	 
}
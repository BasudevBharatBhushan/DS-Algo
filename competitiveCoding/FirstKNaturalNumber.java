package competitiveCoding;


import java.util.*;
import java.lang.*;
import java.io.*;
public class FirstKNaturalNumber
 {
	public static void main (String[] args)throws Exception
	 {
		
		//METHOD -1(NOT SO OPTIMISED)
		
		
//	     List <Integer> list = new LinkedList<>();
//	     BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
//	     StringBuilder s = new StringBuilder();
//	     int t = Integer.parseInt(reader.readLine().trim());
//	     while(t-->0){
//	         String nd[]=reader.readLine().trim().split(" ");
//	         int n = Integer.parseInt(nd[0].trim());
//	         int k =Integer.parseInt(nd[1].trim());
//	         
//	         int arr[]=new int[n];
//	         String nd2[]=reader.readLine().trim().split(" ");
//	         for(int i=0;i<n;i++){
//	             arr[i]=Integer.parseInt(nd2[i].trim());
//	         }
//	         
//	         for(int i=1;;i++){
//	             boolean present = false;
//	             for(int j=0;j<n;j++){
//	                 if(i==arr[j]){
//	                     present = true;
//	                     break;
//	                 }
//	             }
//	             if(!present){
//	                 list.add(i);
//	             }
//	             if(list.size()==k){
//	                 break;
//	             }
//	         }
//	         
//	         for(int i=0;i<list.size();i++){
//	             s.append(list.get(i)+" ");
//	         }
//	         s.append('\n');
//	     }      
//	     System.out.println(s);
//	 }
//}
		
		
		//NEW AND OPTIMISED METHOD USING HASHMAP AND LINKEDLIST
		
		
		 //System.out.println("console");
	     BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	     StringBuilder s = new StringBuilder();
	     int t = Integer.parseInt(reader.readLine().trim());
	     while(t-->0){
	    	 String nd[]=reader.readLine().trim().split(" ");
	         int n = Integer.parseInt(nd[0].trim());
	         int k =Integer.parseInt(nd[1].trim());
	         
	         int arr[]=new int[n];
	         String nd2[]=reader.readLine().trim().split(" ");
	         for(int i=0;i<n;i++){
	             arr[i]=Integer.parseInt(nd2[i].trim());
	         }
	         
	         Map <Integer,Integer> map = new HashMap();
	         for(int i=1;i<arr.length+k+1;i++) {
	        	 map.put(i, 0);
	         }
	         //System.out.println(map);
	       
	         for(int i=0;i<n;i++) {
	        	 if(map.containsKey(arr[i])) {
	        		int num =map.get(arr[i]); 
	        		 map.put(arr[i], num+1);
	        	 }
	         }
	        // System.out.println(map);
	        List <Integer> list= new LinkedList<>();
	        for(int i=1;i<map.size()+1;i++) {
	        	if(list.size()==k) {
	        		break;
	        	}
	        	if(map.get(i)==0) {
	        		list.add(i);
	        	}
	        }
	        for(int i=0;i<list.size();i++) {
	        	s.append(list.get(i)+" ");
	        }
	        s.append('\n');
	      //  System.out.println(list);
	     }      
	     System.out.println(s);
	 }
}
		
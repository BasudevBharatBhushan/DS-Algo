package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class OrderingOfStringInLexicographicallyManner {
	

	public static void main (String[] args) throws Exception {
		System.out.println("test cases");
	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sc = new StringBuilder();
	    int t = Integer.parseInt(reader.readLine().trim());
	    while(t-->0){
	        int t2 = Integer.parseInt(reader.readLine().trim());
	        String arr[]=new String[t2];
	        String nd[]= reader.readLine().trim().split(" ");
	         for(int i=0;i<t2;i++) {
	        	 arr[i]=(nd[i].trim());
	         }
	        for(int i=0;i<t2;i++){
	            sortString(arr[i]);
	        }
//	        for(int i=0;i<t2-1;i++){
//	            for(int j=0;j<t2-1-i;j++){
//	            	int x=1;
//	            	if(arr[j].length()!=1){
//	            	while((int)arr[j+1].charAt(arr[j+1].length()-x)==(int)arr[j].charAt(arr[j].length()-x)) {
//	            		x++;
//	            	}
//	            }
//	                if((int)arr[j+1].charAt(arr[j+1].length()-x)<(int)arr[j].charAt(arr[j].length()-x)) {
//	                	String temp=arr[j+1];
//	                	arr[j+1]=arr[j];
//	                	arr[j]=temp;
//	                }
//	            }
//	        }
/*
 * INSTEAD OF USING THIS ABOVE HUGE METHOD TO SORT THE ELEMNTS OF A STRING ARRAY, WE CAN USE THIS PREDEFINED FUNCTION	        
 */
	        Arrays.sort(arr);
	        sc.append(arr[0]+" "+arr[arr.length-1]);
	        sc.append('\n');
	    }
	    System.out.println(sc);
		
	}
	public static void sortString(String s){
		    char c[]=new char[s.length()];
		    for(int i = 0; i<s.length(); i++) {
			   c[i]=s.charAt(i);
		    }
		    for(int i = 0; i<s.length()-1; i++) {
			   int minInd =i;
			   for(int j =i+1; j<s.length(); j++) {
			    	if((int)c[j]<(int)c[minInd]) 
					minInd=j;
			   }	
			   char temp = c[i];
			   c[i]=c[minInd];
			   c[minInd]=temp;
			
		    }
		    s=String.valueOf(c);
		}
}

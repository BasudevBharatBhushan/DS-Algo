package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortingOfStringArray {

	public static void main(String[] args) throws Exception{
System.out.println("enter the size of array and then enter the strings in a line separated by space");
	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sc = new StringBuilder();
		
		 int t2 = Integer.parseInt(reader.readLine().trim());
	        String arr[]=new String[t2];
	        String nd[]= reader.readLine().trim().split(" ");
	         for(int i=0;i<t2;i++) {
	        	 arr[i]=(nd[i].trim());   //This is used to take the input of multiple Strings in a line
	         }
	        for(int i=0;i<t2;i++){               
	           arr[i]= sortString(arr[i]);           //to sort the string element of arrays
	        }
	        for(int i=0;i<t2-1;i++){
	            for(int j=0;j<t2-1-i;j++){
	            	int x=1;
	            	if(arr[j].length()!=1){
	            	while((int)arr[j+1].charAt(arr[j+1].length()-x)==(int)arr[j].charAt(arr[j].length()-x)) {
	            		x++;
	            	}
	            }
	                if((int)arr[j+1].charAt(arr[j+1].length()-x)<(int)arr[j].charAt(arr[j].length()-x)) {
	                	String temp=arr[j+1];
	                	arr[j+1]=arr[j];
	                	arr[j]=temp;
	                }
	            }
	        }

	        for(String item:arr) {
	        	System.out.print(item+" ");
	        }
	}

	public static String sortString(String s){
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
	    return s;
	}
}

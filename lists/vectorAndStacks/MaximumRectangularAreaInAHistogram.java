package lists.vectorAndStacks;



import java.util.*;
import java.lang.*;
import java.io.*;
public class MaximumRectangularAreaInAHistogram{
	public static void main (String[] args)throws Exception{
		
	    Scanner scan = new Scanner(System.in);
	    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sc=new StringBuilder();   
	        int n = Integer.parseInt(reader.readLine().trim());
	        long []hist = new long[n];
	        String nd[]=reader.readLine().trim().split(" ");
	    	 
	        for(int i=0;i<hist.length;i++){
	            hist[i]=Long.parseLong(nd[i].trim());                     // {6, 2, 5, 4, 5, 1, 6}.  sample test case
	        }
	        
	     // Create an empty stack. The stack holds indexes of hist[] array 
	        // The bars stored in stack are always in increasing order of their 
	        // heights.
	        Stack<Integer> st = new Stack<>();
	        int i = 0;
	        long area_with_top;   // To store area with top bar as the smallest bar 
	        long max_area = 0;    
	        
	     // Run through all bars of given histogram 
	        while(i<hist.length){
	        	
	        	// If this bar is higher than the bar on top stack, push it to stack 
	            if(st.empty() ||hist[st.peek()] <= hist[i] )
	                st.push(i++);
	            
	         // If this bar is lower than top of stack, then calculate area of rectangle  
	            // with stack top as the smallest (or minimum height) bar. 'i' is  
	            // 'right index' for the top and element before top in stack is 'left index' 
	            else{
	            	int tp = st.pop();   //Store the top index along with popping
	            	 // Calculate the area with hist[tp] stack as smallest bar 
	                area_with_top = hist[tp] * (st.empty()==true?i:i-1-st.peek());
	                
	             // update max area, if needed 
	                if(max_area<area_with_top)
	                    max_area = area_with_top;
	            }
	        }
	        
	        // Now pop the remaining bars from stack and calculate area with every 
	        // popped bar as the smallest bar 
	        while(!st.empty()){
	            area_with_top = hist[st.pop()] * (st.empty()==true?i:i-1-st.peek());
	            if(max_area < area_with_top)
	                max_area = area_with_top;
	        }
	        
	        sc.append(max_area);
	        
	        
	        
	        
	        
	        //MY O(N^2) APPROACH FOR THIS SOLUTION , TIME LIMIT EXCEEDED WHILE SUBMITTING, BUT CODE GIVING CORRECT OUTPUT
	        
	        long maxSum = Integer.MIN_VALUE;
//			 int min =0;
//		   	 long cursum =0;
//		   	 int index =0;
//		   	 int i=0;
//		   	 int j=0;
//		   	 while(i<n) {
//		   		if(j==i) {
//		   			min=arr[j];
//		   		}else if(arr[j]<min) {
//		   			min=arr[j];
//		   		}
//		   		index++;
//		   		cursum=min*(index);
//		   		
//		   		if(cursum>maxSum) {
//		   			maxSum=cursum;
//		   		}
//		   		
//		   		
//		   		if(j==n-1) {
//		   			index=0;
//		   			j=++i;
//		   			
//		   		}else {
//		   			j++;
//		   		}
//		   		 
//		   	 }
//		   	 
//		   	 System.out.println(maxSum);
	      
    }
}
package competitiveCoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindPositionsSubarrayWithGivenSum {
	public static void main (String[] args)throws Exception
	 {
	     BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	     StringBuilder s = new StringBuilder();
	     int t = Integer.parseInt(reader.readLine().trim());
	     while(t-->0){
	    	 String md[]=reader.readLine().trim().split(" ");

	         int n =Integer.parseInt(md[0].trim());
	         int sum=Integer.parseInt(md[1].trim());
	         int arr[]=new int[n];
	         String nd[]=reader.readLine().trim().split(" ");
	         for(int i=0;i<n;i++){
	             arr[i]=Integer.parseInt(nd[i].trim());
	             
	         }
	         int flag =0,wsum=0;
	         int header = 0;
	         
	         for(int i=0;i<n;i++) {
	        	 wsum+=arr[i];
	        	 while(wsum>sum) {
	        		 wsum-=arr[header];
	        		 header++;
	        	 }
	        	 if(wsum==sum) {
	        		 flag=1;
	        		 s.append(header+1+" "+(i+1));
	        		 break;
	        	 }
	         }
	        if(flag==0) {
	        	s.append("-1");
	        }
	      
	        
	      s.append('\n');
	     }      
	     System.out.println(s);
	 }
}


//MY LOGIC USING ARRAYLIST , BUT TIME COMPLEXITY IS HIGH


//BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
//StringBuilder s = new StringBuilder();
//int t = Integer.parseInt(reader.readLine().trim());
//while(t-->0){
//    String md[]=reader.readLine().trim().split(" ");
//    int n =Integer.parseInt(md[0].trim());
//    int k =Integer.parseInt(md[1].trim());
//    int arr[]=new int[n];
//    String nd[]=reader.readLine().trim().split(" ");
//    for(int i=0;i<n;i++){
//        arr[i]=Integer.parseInt(nd[i].trim());
//        
//    }
//   List<Integer> list = new ArrayList<>();
//   
//   n=0;
//  
//   int sum =0;
//
//for(int element:arr) {
//	list.add(sum);
//	n++;
//	sum+=element;
//	if(list.contains(sum-k)) {
//		s.append(list.lastIndexOf(sum-k)+1+" "+n);
//	    n=0;
//		break;
//	}
//}
//
//if(n!=0){
//   s.append("-1");
//}
//
//
// 
//   
// s.append('\n');
//}      

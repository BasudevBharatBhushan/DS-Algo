package arrays;

public class MaximumSumSubArrayOfAtleastKElements {

	public static void main(String[] args) {
     int arr[]= {-1,-2,1,-3};
     int n = arr.length;
     int k =2;
	 int maxSum = Integer.MIN_VALUE;
   	 int cursum =0;
   	 int index =0;
   	 int i=0;
   	 int j=0;
   	 while(i<=n-k) {
   		 cursum+=arr[j];
   		 index++;
   		 
   		 if(index>=k) {
   			 if(cursum>maxSum) {
   				 maxSum=cursum;
   				 
   			 }
   		 }	 
   		 if(j==n-1) {
   		     cursum=0;
   			 index=0;
//   			  i++;
//   			  j=i;
   			 j= ++i;
   			     
   		 } else {
   			  j++;
   		 }
   			
   		 
   	 }
   	 
   	 System.out.println(maxSum);
	}

}

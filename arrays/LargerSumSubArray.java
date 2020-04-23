package arrays;

public class LargerSumSubArray {

	public static void main(String[] args) {
		int a[] = {1,4,-2,4};
		int n = a.length;                  //It is used to store the length of array
		int max= Integer.MIN_VALUE;                 //it will store the minimum value possible
	
		for(int i= 0;i<n;i++) {
			for(int j =i; j<n;j++) {
			
				int curSum = 0;
				for(int k = i; k<=j; k++) {
					System.out.print(a[k] + " ");
					 
					curSum += a[k];
				}
				if(curSum>max) {
					max = curSum;
				}
			}
		}
		System.out.println();
		System.out.println(max);
		
		
		
		
		
		
		
		

	}

}

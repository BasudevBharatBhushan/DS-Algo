package loop;

public class MaximumSumSubArray2 {

	public static void main(String[] args) {
	
		int a[] = {1, 4 , -2, 4};
		int n = a.length;
		int sum[] = new int[n];
		sum[0] = a[0];                   //here we are pre-assigning the value for sum[0]
		for(int i = 1; i<n; i++) {
			sum[i] = sum[i-1] + a[i];
			System.out.print(sum[i] +" ");     //it will print value of sum array from a[1]
		}
		System.out.println();               // just for a next line
		for(int item : sum) {                    
			System.out.print(item+" ");            //it is just to show final or pre-processed values in sum array
		}
		System.out.println();                 //just for a next line
		
				int max = Integer.MIN_VALUE;
		for(int i = 0; i<n; i++) {
			for(int j = i; j<n; j++) {
				int cursum = sum[j] - sum[i] + a[i];   //here we do not have to take the initial cursum as zero becoz here this variable is only being used for
                                                        //storing values...it is not involved in the operation, so... 				
				if(cursum > max) max = cursum;
				
			}
		}
				System.out.print(max);
				
				
	}

}

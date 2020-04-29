package arrays;

public class KadensAlgorithm {

	public static void main(String[] args) {

		// [KADEN'S ALGORITHM]
		
		int a[] = {1, 4, -2, 4};
		int n = a.length;
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		for(int i = 0; i<n; i++) {
			curSum += a[i];
			if(curSum > maxSum) 
				maxSum = curSum;
			
			if(curSum <0) 
				curSum = 0;
			
		}
	System.out.println(maxSum);
	}





//THIS METHOD OF SOLVING THIS QUESTION IOS KNOWN AS ['KADEN'S ALGORITHM']
	}



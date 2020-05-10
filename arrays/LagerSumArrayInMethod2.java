package arrays;

public class LagerSumArrayInMethod2{

	public static void main(String[] args) {
		int a[] = {2,-3,2,4,-1,2,3,-2};
		int n = a.length;
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		for(int i = 0; i <n; i++) {
			curSum+=a[i];
			if(curSum> maxSum) {
				maxSum = curSum;
			}
			if(curSum <0) {
				curSum = 0; 
				
			}
		}
		System.out.println(maxSum);

	}

}

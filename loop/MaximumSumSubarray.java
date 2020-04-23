package loop;

import java.util.Scanner;

public class MaximumSumSubarray {

	public static void main(String[] args) {



int a[] = {1, 4 , -2, 4, -1, 3, 5, -6};
int n = a.length;
		int max = Integer.MIN_VALUE;
for(int i = 0; i<n; i++) {
	for(int j = i; j<n; j++) {
		int cursum = 0;
		for(int k = i; k<=j; k++) {
			cursum += a[k];
		}
		if(cursum > max) {
			max = cursum;
		}
	}
}
		System.out.println(max);
		
		
		
		
		
		
	}

}

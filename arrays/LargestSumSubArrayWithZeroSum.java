package arrays;

import java.util.Scanner;

public class LargestSumSubArrayWithZeroSum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	}
	int maxLen2(int[] arr) {
        int size=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                   if((j-i+1)>size){
                       size=j-i+1;
                   } 
                }
            }
        }
        return size;
	}

}

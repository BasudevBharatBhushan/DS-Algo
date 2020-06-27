package SubArraysAndSubSequences.arrays;

import java.util.Arrays;

public class Longest_Increasing_SubSequence {

	public static void main(String[] args) {
		
		int a[]= {0,4,12,2,10,6,9,13,3,11,7,15};
		int n = a.length;
		int sub[] = new int[n];
		int index[]= new int[n];
		Arrays.fill(sub, 1);
		
		int i=1,j=0;
		
		while(i<n) {
			if(a[j]<a[i]) {
				if(sub[j]+1>sub[i]) {
					sub[i]=sub[j]+1;
					index[i]=j;            //Note if we use condition " if(sub[j]>=a[i]) index[i]=j " we may get different 
					                       // set of subsequences as answer which is also true
				}
			}
			j++;
			
			if(j==i) {
				j=0;
				i++;
			}
		}
		int max=Integer.MIN_VALUE;   int maxSumIndex=0;
		for( i=0;i<n;i++) {
			if(sub[i]>max) {
				max=sub[i];
				maxSumIndex=i;
			}
		}
		System.out.println("Length of longest increasing SubSequence in the Array -->"+max);
		
		int ans[]=new int[max];
		i=maxSumIndex;
		for(j=0;j<max;j++) {
			ans[j]=i;
			i=index[i];
		}
		
		System.out.print("The longest incresing Sub-Sequence :: ");
		for(i=max-1;i>=0;i--) {
			System.out.print(a[ans[i]]+" ");
		}
		
		
//		for(int e:ans) {
//			System.out.print(e+" ");
//		}
		
		
//		for(int e:sub) {
//			System.out.print(e+" ");
//		}
//		
//		System.out.println();
//		
//		for(int e:index) {
//			System.out.print(e+" ");
//		}
		
	}

}

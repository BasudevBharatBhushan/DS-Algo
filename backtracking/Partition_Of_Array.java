package backtracking;

import java.util.*;

public class Partition_Of_Array {

	public static void main(String []args) {
		
		int a[]= {2,1,2,3,4,8};   //Here two separated array will be - [2,1,3,4] & [2,8] sum of each array will be 10
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		ArrayList<Integer> ans = new ArrayList<>();
				
		boolean isPossible= (sum & 1)==0 && partition(a,sum/2,0,ans);               //sum&1 to check even or odd  because if sum will be odd then partition will not be possible at all
		
		if(isPossible) {
			System.out.println("Partition possible with sum of each half = " +sum/2);
			System.out.println("First half of array contains :");
			for(int e:ans) {
				System.out.print(e+" ");
			}
		}else {
			System.out.println("Partition not possible");
		}
		
	}
	static boolean partition(int a[],int sum, int i,ArrayList<Integer> ans) {      //here i denotes the current index
		                                                                           //sum == half of sum of elements of array
		if(i>=a.length || sum<0)return false;
		
		if(sum==0)return true;
		
		ans.add(a[i]);
		
		boolean leftPossible=partition(a, sum-a[i], i+1, ans);
		
		if(leftPossible)return true;
		
		//This line is making the backtracking possible
		ans.remove(ans.size()-1);
		
		return partition(a, sum, i+1, ans);
		
		
	}
}

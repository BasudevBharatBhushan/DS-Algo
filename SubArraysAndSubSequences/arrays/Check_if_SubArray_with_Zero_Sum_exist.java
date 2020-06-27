package SubArraysAndSubSequences.arrays;

import java.util.HashSet;
import java.util.Set;

public class Check_if_SubArray_with_Zero_Sum_exist {

	public static void main(String[] args) {
		
		
		
		int a[]= {6 , -1 ,-3, 4, -2, 2, 4, 6, -12, -7};
        boolean found =false;
	
        
        Set<Integer> set=new HashSet<>();
		int sum=0;
		for(int element:a) {
			set.add(sum);
			sum+=element;
			if(set.contains(sum)) {
				found=true;
				break;
				
			}
			
		}
		
		System.out.println("found "+found);

	}

}

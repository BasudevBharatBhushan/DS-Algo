package lists.sets;
/* 
 * Given an array, find if there exists a subarray with sum equals to zero
 * n<10^5
 */
import java.util.*;
public class SubArrayWithZeroSum {

	public static void main(String[] args) {
	
//		int []a= {2,1,-3,4,2};
//        boolean found =false;
//        
//        for(int i =0;i<a.length;i++) {
//        	int sum =0;
//        	for(int j=i;j<a.length;j++) {                  //PROBLEM USED USING TIME COMPLEXITY O(N^2)
//        		sum +=a[j];
//        		if(sum==0) {                        //USING POINTER ALGORITHM
//        			found=true;
//        			break;
//        		}
//        	}
//        	if(found) break;
//        }
//        System.out.println("found "+found);
		
		
		
		/* NOW BY USING CONCEPT OF SET
		 * TIME COMPLEXITY=o(n)
		 * But extra space used
		 */
		int []a= {2,1,-3,4,2};
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

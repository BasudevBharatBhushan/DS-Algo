package SubArraysAndSubSequences.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import SubArraysAndSubSequences.arrays.K_SumSubArrays.pair;

public class Zero_SumSubArrays {

	public static void main(String[] args) {
		
//		IF WE WANT TO COUNT THE NO. OF SUB-ARRAYS ALONG WITH WE WANT TO PRINT THE THE INTERVAL
		
//      int a[]= {2,1,-3,4,2,-2};                    //  k=0
		
//	    int a[]= {0,0,1,1,2,-3,4,2,-2,2};           //   k=0;
        int a[]= {0,0,0,5,0,0};                     //   k=0;
		
		List<pair> list=new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();
		Map<Integer,Integer> Indexmap = new HashMap<>();
		System.out.println("The Sub-Arrays are:");
	    int  count = 0;	   
		int sum=0;
		map.put(0,1);
		
		
		int i=0;
		int j=0;
		Indexmap.put(0,0);
		for(int e:a) {
			sum+=e;
			
			
			if(map.containsKey(sum)) {                    //map.containsKey(sum-k)  = map.conatainsKey(sum)  ,as k=0;				
				count+=map.get(sum);                      //similarly count+=map.get(sum-k) =---> count+=map.get(sum)
				if(a[i]!=0) {
					list.add(new pair(Indexmap.get(sum),i));     //similarly  list.add(new pair(Indexmap.get(sum-k),i-1)) --> list.add(new pair(Indexmap.get(sum),i-1));
					list.get(0).print();
				}else {
					for(int w=j;w<=i;w++) {
						list.add(new pair(w,i));
						list.get(0).print();	
					}  
				}
			}else{
				j=i+1;
			}
			
			Indexmap.put(sum,i+1);
			map.getOrDefault(sum, 0);
			int value=map.getOrDefault(sum, 0)+1;
			map.put(sum, value);
			i++;
		}
		
		System.out.println();
		System.out.println("No of Subarrays whose sum is 0 = "+count);
		
		
//		IF WE WANT TO JUST COUNT THE NO. OF SUBARRAYS HAVING K SUM 
		
		
////    int a[]= {2,1,-3,4,2,-2};              //     k=0
//		
////	int a[]= {0,0,1,1,2,-3,4,2,-2,2};      //     k=0;
//      int a[]= {0,0,0,5,0,0};                //     k=0;
////    int a[]= {3,4,7,2,-3,1,4,2};           //     k=7;
//		
//		
//	   
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		
//	    int  count = 0;	   
//		int sum=0;
//		map.put(0,1);
//		
		
//		for(int e:a) {
//		sum+=e;
//		
//		
//		if(map.containsKey(sum)) {                    //map.containsKey(sum-k)  = map.conatainsKey(sum)  ,as k=0;				
//			count+=map.get(sum);                      //similarly count+=map.get(sum-k) =---> count+=map.get(sum)
//		}	
//		
//		
//		map.getOrDefault(sum, 0);
//		int value=map.getOrDefault(sum, 0)+1;
//		map.put(sum, value);
//		
//	}
//	
//	
//	System.out.println("No of Subarrays whose sum is 0 = "+count);
//}

	}

}

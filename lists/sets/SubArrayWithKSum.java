package lists.sets;

import java.util.*;
import java.util.Set;

public class SubArrayWithKSum {

	public static void main(String[] args) {
		int []a= {5,2,1,-3,4,2};
		int k=3;
        boolean found =false;
        
        Set<Integer> set=new HashSet<>();
        List<Integer> list = new ArrayList<>();
		int sum=0;
		for(int element:a) {
			set.add(sum);
			sum+=element;
			System.out.println(sum);
			if(set.contains(sum-k)) {
				found=true;
				//System.out.println(sum);
				break;
			}
			
		}
		System.out.println("found "+found);
		
		
		
		//int initial_position =0;
		int final_position=0;
		
		for(int element:a) {
			list.add(sum);
			final_position++;
			sum+=element;
			if(list.contains(sum-k)) {
				found= true;
				
				break;
			}
		}
		
		System.out.println(list);
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)==initial_position) {
//				initial_position=i+1;
//				break;
//			}
//		}
		if(found) {
			System.out.println(list.lastIndexOf(sum-k)+1+" "+final_position);
		}
	

	}

}

package arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class LargestSubArrayWithEqualNoOfZerosAndOnes {  //HERE ALL THE ELEMENTS OF ARRAY SHOULD BE 0 OR 1

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		
		int N =sc.nextInt();
		int arr[]= new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		int n = maxLen2(arr);
		int l = maxLen1(arr);
		
		System.out.println(n);
		System.out.println(l);
		
	 }
	static int maxLen1(int[] arr) {                
		List<Integer> l = new LinkedList<>();
		int max=0;
		for(int z=0;z<arr.length-1;z++) {
			for(int i=z;i<arr.length;i++) {
				l.add(arr[i]);
				int one=0;
				int zero=0;
				for(int j =0;j<l.size();j++) {
					if(l.get(j)==1) {
						one++;
					}else {
						zero++;
					}
				}
				if(one==zero) {
					if(l.size()>max) {
						max=l.size();
					
					}
				}
			}

			l.removeAll(l);
		}
		return max;
	}
	
	static int maxLen2(int[] arr) {
		for(int i=0;i<arr.length;i++){        //CONCEPT: convert all the zeros to -1 and find the largest SubArray giving zero sum
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        
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



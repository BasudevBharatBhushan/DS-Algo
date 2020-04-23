package queue.priorityQueue;
import java.util.*;
public class KLargestElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int TestCases=sc.nextInt();
		while(TestCases--!=0) {
			int SizeOfArray = sc.nextInt();
			int a[]=new int[SizeOfArray];
			int K = sc.nextInt();
			
			for(int i=0;i<SizeOfArray;i++) {
				a[i]=sc.nextInt();
			}
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			for(int i=0;i<SizeOfArray;i++) {
				if(i<K) {
					pq.add(a[i]);
				}else {
					if(pq.peek()<a[i]) {
						pq.poll();
						pq.add(a[i]);
					}
				}
			}
			ArrayList<Integer> ans = new ArrayList<>(pq);
			Collections.sort(ans,Collections.reverseOrder());        //IMPORTANT PRE-DEFINED METHODS
			
			for(int x:ans) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}

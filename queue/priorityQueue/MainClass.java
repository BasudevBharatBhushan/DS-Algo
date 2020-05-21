package queue.priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		
		pq.add("Apple");
		pq.add("Kiwi");
		pq.add("Banana");
		pq.add("Mango");
		
		System.out.println(pq);
		
		System.out.println(pq.remove());             //will out in chronological order
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		PriorityQueue<Integer> pq1=new PriorityQueue<>();

		pq1.add(100);
		pq1.add(25);
		pq1.add(50);
		pq1.add(69);
		pq1.add(69);
		System.out.println(pq1);
		
		System.out.println(pq1.remove());             //will out in chronological order
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		
		
	
	}

}

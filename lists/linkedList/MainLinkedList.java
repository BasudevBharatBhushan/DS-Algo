package lists.linkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
	
		List<Integer> ll= new LinkedList<>();
		
//		ll.add(12);
//		ll.add(2);
//		ll.add(32);        //GENERALLY ALL THE FUNCTIONS OF ARRAYLISTS ARE VALID FOR LINKED LIST 
					
		List<Integer> al =new ArrayList<>();
		
//		getTimeDifference(al);
//		getTimeDifference(ll);
		
		
		
		
        
	}
	//This function is to check the time required for insertion for arrayLists and LinkedList
	static void getTimeDifference(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			list.add(0,i);    //syntax--> list.add(index,element); 
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName()+"--->"+(end-start));
	}

}

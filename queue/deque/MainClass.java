package queue.deque;

//import java.util.ArrayDeque;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
public class MainClass {

	public static void main(String[] args) {
		
		Deque<Integer> a=new ArrayDeque<>();

	    Deque<Integer> c = new LinkedList<>();
	    
	    LinkedBlockingDeque<Integer> b=new LinkedBlockingDeque<>(4);
	    /**
	     * LinkedBlockingDeque is used to make an Deque of desired  size, to avoid memory wastage
	     */
	    
	    b.add(4);
	    b.add(3);
	    b.add(2);
	    b.add(1);
	    
	    try {
	    	b.add(5);
	    }catch(Exception e) {
	    	System.out.println("Exception "+e );
	    }
	    
	}

}

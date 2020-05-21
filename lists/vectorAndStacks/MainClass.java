package lists.vectorAndStacks;

import java.util.Stack;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
		
//		Vector<Integer> v=new Vector();
//		
//		v.add(34);
//		v.add(12);

		Stack<Integer> stack= new Stack<>();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);

		//System.out.println(stack.pop()+" "+stack.peek());
		 
//		stack.remove(2);
//		System.out.println(stack);
//		int sum =0;
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		
	}

}

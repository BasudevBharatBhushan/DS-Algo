package queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
public class LongestValidParenthesis
{
  //LONGEST VALID PARENTHESIS
    public static void main(String args[]) {
    
    	//USING STACK- TIME COMPLEXITY-->0.36
    	
    	
//    	String s ="()(((()())";
//    	//String s =")(";
//    	int ans=0;
//    	Stack<Integer> stk = new Stack<>();
//    	stk.push(-1);                                     
//    	
//    	for(int i=0;i<s.length();i++) {
//    		if(s.charAt(i)=='(') {
//    			stk.push(i);
//    		}else {
//    			stk.pop();
//    			if(stk.isEmpty()) {
//    				stk.push(i);
//    			}else if(!stk.isEmpty()) {
//    				ans=Math.max(ans, i-stk.peek());
//    			}
//    		}
//    	}
//    	System.out.println(ans);
    	
    	//USING DEQUE- TIME COMPLEXITY--> 0.26 
    	
    	String s = "()(((()())";
    	int ans =0;
    	Deque<Integer> dq = new ArrayDeque<>();
    	dq.add(-1);
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)=='(') {
    			dq.addLast(i);
    		}else {
    			dq.removeLast();
    			if(dq.isEmpty()) {
    				dq.addLast(i);
    			}else {
    				ans =Math.max(ans, i-dq.peekLast());
    			}
    		}
    	}
    	
    	System.out.println(ans);
    	
    }
}
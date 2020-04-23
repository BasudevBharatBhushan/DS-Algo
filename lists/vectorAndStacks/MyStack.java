package lists.vectorAndStacks;

import lists.linkedList.MyLinkedList2;

public class MyStack<E>{             //IMPLEMENTATION OF MY STACK USING LINKEDLIST
	
	
	private MyLinkedList2<E> ll=new MyLinkedList2<>();
	void push(E e) {
		ll.add(e);
		
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Peeking  from empty stack is not allowed ");
		}
		return ll.getLastElement();
	}

}

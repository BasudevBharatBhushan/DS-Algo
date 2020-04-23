package queue;

import lists.linkedList.MyLinkedList2.Node;

public class MyQueue <E>{
	private Node<E> head,rear;
 
	public void enqueue(E e) {
		Node <E> toAdd =new Node<E>(e);   //Here we can access node without making obj of myLinkedList because its a static class
		if(head==null) {
			head=rear=toAdd;
			return;                            //hear rear is a not a local pointer variable,so its  value after each enqueue operation will not be taken
		}                                   //by the garbage collector
		rear.next=toAdd;                 //thats why here we have no need to use the while loop
		rear=rear.next;
	}
	
	public E dequeue() {
		if(head==null) {
			return null;
		}
		Node<E> temp=head;
		head=head.next;
		
		if(head==null) {
			rear=null;
		}
		return temp.data;
		
	}
}

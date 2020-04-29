package lists.linkedList;

public class MyLinkedList {
	
	Node head;
	
	void add(int data) {                 //ADD FUNCTION
		Node toAdd = new Node(data);
		
		if(isEmpty()) {      //WITHOUT THIS OUR CODE WILL CRASH...why???
			head = toAdd;    //Suppose the list is initially empty, Head will be initially null, [temp.next--->will give null pointer exception]
			return;
		}
		
		Node temp = head;        //    System.out.print(temp.next+" ");
		while(temp.next != null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	
	void print() {                          //PRINT FUNCTION
		Node temp = head;       //For Traversal of node      
		while(temp!= null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
			
	}
	
	boolean isEmpty() {
//		if(head==null) {
//			return true;              //Condition for boolean isEmpty()
//		}else{
//			return false;
//		}
		
		return head ==null;   //More convenient way of writing the above 4 line code    //'=='  relational operator returns boolean value
	}
	
	void set(int index,int data) {
//		Node temp= head;
//		int i=0;
//		while(temp!=null) {
//			temp.index=i++;
//			temp=temp.next;               //DONE BY ME
//		}
		index();
		Node x=head;
		while(x!=null) {
			if(x.index==index) {
				x.data=data;
				break;
			}
			x=x.next;
		}	
	}
	void index() {
		Node temp= head;
		int i=0;
		while(temp!=null) {
			temp.index=i++;
			temp=temp.next;               
		}
	}
	void remove(int index) {
		index();
		if(index==0) {
			head=head.next;
		}else {
		    Node x=head, y=head;
		    while(x!=null) {
			    if(x.index==index+1) {
				    break;
			    }
			    x=x.next;
		    }
		    while(y!=null) {
			    if(y.index==index-1) {
				   y.next=x;
				   break;
			     }
			     y=y.next;
		    }
	    }
	}
	Node reversalOfLinkedList(Node head) {
		this.head=head;
		if(head==null||head.next==null) {
			return head;
		}
		Node remaining =reversalOfLinkedList(head.next);
		head.next.next=head;
		head.next=null;
		return remaining;
	}
	
	
	static class Node{
		int data;
		Node next;
		int index;
		public Node(int data) {
			this.data =data;
			next=null;
		}
	}

}

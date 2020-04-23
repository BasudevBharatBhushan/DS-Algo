package lists.linkedList;

//import lists.linkedList.MyLinkedList.Node;

public class MyLinkedList2 <E>{     //Using <GENERICS>
		
		Node<E> head;
		
		public void add(E data) {                 //ADD FUNCTION
			Node<E> toAdd = new Node<>(data);
			
			if(isEmpty()) {      //WITHOUT THIS OUR CODE WILL CRASH...why???
				head = toAdd;    //Suppose the list is initially empty, Head will be initially null, [temp.next--->will give null poEer exception]
				return;
			}
			
			Node<E> temp = head;        //    System.out.prE(temp.next+" ");
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=toAdd;
		}
		
		void print() {                          //PRE FUNCTION
			Node<E> temp = head;       //For Traversal of node      
			while(temp!= null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
				
		}
		
		public boolean isEmpty() {
//			if(head==null) {
//				return true;              //Condition for boolean isEmpty()
//			}else{
//				return false;
//			}
			
			return head ==null;   //More convenient way of writing the above 4 line code    //'=='  relational operator returns boolean value
		}
		
		public E removeLast() throws Exception{     //THIS METHOD IS BASICALLY USED  FOR STACK IMPLEMENTATION
			
			Node <E>temp=head;
			
			if(temp==null) {
				throw new Exception("Cannot remove last element from empty linked list");                  
			}
			if(temp.next==null) {
				Node<E> toRemove =head;
				head=null;
				return (E) toRemove.data;
			}
			while(temp.next.next!=null) {         //IMPORTANT CONCEPT
				temp=temp.next;
				
			}
			Node<E> toRemove=temp.next;
			temp.next=null;
			return (E) toRemove.data;  //if we will add generics before every node then it is  not mandatory to mention generics here
			
		}
		
		public E getLastElement() throws Exception {
			Node<E> temp =head;
			if(temp==null) {
				throw new Exception("Cannot remove last element from empty linked list");                  
			}
		    while(temp.next!=null) {
				//if(temp.next==null) {
					//break;
				//}
		    	temp=temp.next;
			}
		    return (E) temp.data;
		}
		
		public static class Node<E>{
			public E data;
			public Node<E> next;
			
			public Node(E data) {
				this.data =data;
				next=null;
			}
		}

	}




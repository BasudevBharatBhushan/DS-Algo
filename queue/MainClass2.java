package queue;

public class MainClass2 {

	public static void main(String[] args) {

		MyQueue<Integer> mq=new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(26);
		mq.enqueue(35);
		mq.enqueue(78);

		System.out.println(mq.dequeue());
		
	}

}

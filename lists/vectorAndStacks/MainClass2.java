package lists.vectorAndStacks;

public class MainClass2 {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> stack= new MyStack<>();
		
		stack.push(23);
		stack.push(90);
		stack.push(139);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		

	}

}

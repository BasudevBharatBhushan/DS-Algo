package oops.exceptionHandling;

public class ThreadSleep {

	public static void main(String[] args) {
		
		fun1();

	}
	static void fun1() {
		int a =5;
		int b =3;
		int c = a/b;
		
		System.out.println(c);
		
		try {
			Thread.sleep(3000);                      //At this point it will hold the execution for 3000 mili-seconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("after delay");
	}

	
}

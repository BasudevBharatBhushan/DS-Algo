package oops.exceptionHandling;

public class ThrowsKeyWord {

	public static void main(String[] args) {
	
		fun1();

	}
	static void fun1() {
		int a =5;
		int b =3;
		int c = a/b;
		
		System.out.println(c);
		
		try {
			fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage()+" occurred");
		}
		
		//ERROR FROM fun2() is handled in fun1()
	}

	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger is coming") ;
		}	
	}
}

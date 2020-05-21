package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		try {
			int a =5;
			int b=0;
			int c = a/b;
			System.out.println(c);
		}catch (Exception e) {       
			System.out.println(e.getMessage()+" occured, please check your code");
		}
		//this try and catch block is an "EXCEPTION HANDLER" used for execution of code till the end even if the there is some error in the middle
		
		System.out.println("Very Important code");
        System.out.println("need to run");
        
        /*
        If there is multiple exception then while using "try and catch block" as handler , we should not create object of main exception class,
        but we should try to handle it or catch it separately  
        */
        
        try {
        	
            int arr[]= new int[5];
            System.out.println(arr[5]);
            
        }catch(ArithmeticException e) {
        	System.out.println(e.getMessage() +" error occured please check your code");
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("index should be in the range of 0 to size of array");
        }catch(IllegalArgumentException e) {
        	System.out.println("check your casting carefully");
        }
        
        fun1();
        fun2();
	}
	static void fun1() {
		int a =5;
		int b =0;
		
		int c =a/b;
		
		System.out.println(c);
		
		/*
		 * THIS FUNCTION WILL THROW THIS TYPE OF ERROR MESSAGE
		 * 
		     Exception in thread "main" java.lang.ArithmeticException:
	         at Introduction/oops.exceptionHandling.MainClass.fun1(MainClass.java:43)
	         at Introduction/oops.exceptionHandling.MainClass.main(MainClass.java:37)

		 */
		
		/*in this error message the exception handler flow is clearly explained
		  first error occurred at line 43, then it check for handler in the function, then move to line 37 where the the function 
		   is called (caller function) --->The main function
		 */
	}
	//THROW KEYWORD
	
	static void fun2() {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger is coming") ;
		}
	}

}

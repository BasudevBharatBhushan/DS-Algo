package methods;

public class Introduction {

	public static void main(String[] args) {

	int firstNumber = 34;
	int secondNumber = 23;
    int result = maxOf(firstNumber, secondNumber); //this is method calling
    System.out.println(result);
    int x=maxOf(2,4);
    System.out.println(x);
    maxOf(1,5);
    int y=maxOf(6);
    System.out.println(y);
    sayHi();                                        // calling of void method
    sayHi();
    evenOdd(firstNumber);
	}
    static int maxOf(int a , int b) {                  //this is how to create method,,,this method will return int value and take two int value
		if (a>b) 
			return a;
	    else                                  //method definition or function definition
			return b;
		
	}
 
    static int maxOf( float b) {    //METHOD OVERLOADING (When class has more than one method by the same name but different parameter
       return 0;	 
    }
 
    static void sayHi() {                                       // here void is used because the method will return nothing
	    System.out.println("Hi");
	    System.out.println("Good Morning");
    }
    static void evenOdd(int a) {
	    if(a%2==0)
		      System.out.println(a+" is even");
	    else
		      System.out.println(a+"is odd");
        }

    }

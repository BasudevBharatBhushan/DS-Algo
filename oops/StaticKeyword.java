package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	static {
		System.out.println("In block 1");               
	}                                            //STATIC BLOCKS---will run before execution of main blocks
	static {
		System.out.println("In block 2");
	}
	
	
	
//	class Person{
//		int age;
//		String name;
//		final static String breed="HomoSapiens";    //here final keyword is used because person is not the main class here
//		
//}
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside main");
		System.out.println(Math.PI);
		


			
//STATIC CLASS
		A objA = new A(); //without making obj of A we cant make object of B   //as A is a public class so it can be accessed directly
		
		
		
		//Example of Non-STATIC Class
		B objB = objA.new B(); //object of B made by importing "Opps.A.B"
		       //OR
		//A.B objB = objA.new B();    //object of B can also be made like this without importing "Opps.A.B"
		
		//Example of STATIC class
		C objC = new A.C();  //as C is a static class so obj of C can be made without making the obj of A by importing it
		       //OR
		//A.C obj C = new A.C();  obj of C without importing "oops.A.C"
		
		

		
	}
		
		
		
}



package oops.polymorphisim;

public class Dog extends Pet{
	String name="Mike";  //it can be called variable hiding because variable overriding is impossible

	
    public void walk() {
	     System.out.println("dog is walking");   //Method Overriding
    }
}

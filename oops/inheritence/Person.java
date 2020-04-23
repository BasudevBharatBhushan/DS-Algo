package oops.inheritence;

public class Person {

	protected String name;  //protected access modifier is used to extend its reference to its children only
	
	public Person(String name) {  //Parameterized parent constructor
	this.name=name;     //if we made a constructor for parent class then we are bound to make the same constructor for children class using "super" keyword for the respective state we wished to initialize through constructor
	//System.out.println("inside person constructor");
	}
	
	public void walk() {                     //void method
		System.out.println(name+" is walking");
	}
	public void eat() {                      //void method
		System.out.println(name+" is Eating");
	}
	public void sleep() {
		System.out.println("person "+name+" is sleeping");
	}
	public static void laughing() {                //related to class but above methods are related to object
		System.out.println("person is laughing");
	}
	public void running() {
		System.out.println("person is running");
	}
}

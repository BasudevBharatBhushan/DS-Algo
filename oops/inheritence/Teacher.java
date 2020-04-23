package oops.inheritence;

//INHERITENCE
public class Teacher extends Person {  //(children) extends (parents)
	public Teacher(String name) {    //Unique Behavior
		super(name);  
		//System.out.println("inside teacher constructor");
		}
	public void teach(){
		System.out.println(name+" is teaching");
	}
	public void sleep() {
		System.out.println("Teacher  "+name+" is sleeping");   //Method Overriding
	}
	public static void laughing() {
		//super.laughing(); //this keyword cannot be used in this overridden method because of static keyword
		System.out.println("teacher is laughing");  //related to class but above methods are related to object
	}
	public void running() {
		super.running();  //super keyword is used to get a immediate reference from parent class
		System.out.println("teacher is running");
	}
}

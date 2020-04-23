package oops.inheritence;

//INHERITENCE
public class Singer extends Person  {    //(children) extends (parents)
	public Singer(String name) { 
		super(name);
		//System.out.println("inside singer constructor");
		}
    public void sing() {         //Unique Behavior
	    System.out.println(name+" is Singing");
    }
    public void sleep() {
		System.out.println("Singer "+name+" is sleeping");   //Method Overriding
	}
    public static void laughing() {
    	//super.laughing(); //this keyword cannot be used in this overridden method because of static keyword
		System.out.println("singer is laughing"); //related to class but above methods are related to object
	}
    public void running() {
    	super.running();   //super keyword is used to get a immediate reference from parent class
		System.out.println("singer is running");
    }
}

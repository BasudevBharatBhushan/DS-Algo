package oops;


		
class Cat{
	boolean hasFur;
	String colour, breed;    //so these are basically behavior or state of the class
	int legs, eyes;
	public void walk() {
		System.out.println("Cat is Walking");   //methods or behavior    //void== returns nothing,,&,,Empty parenthesis,'()' means it takes nothing,or take no arguments, means while calling this method we need not have to pass any parameters 
	}
	public void eat() {
		System.out.println("Cat is Eating");
	}
	public void description() {                     //this is also a method to define the state variables
		System.out.println("my cat has " + legs + " legs and " + eyes + " eyes");
		System.out.println("The colour of my cat is "+colour);
	}
 
}
		
class dog {
		String colour, name;
		boolean bark ;
		
		public void sleep() {                           //function definition in c language 
			System.out.println("the dog is Sleeping");        
			}
		public void description() {
			System.out.println(colour + name + bark);
			
		}
 }
		
public class MaiinClass {                //public class can be one only which should be same with name of file

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();   //new class
		                   
		Cat cat2 = new Cat();
		
		cat1.walk();        //function call in c language
		cat2.eat();          //execution of class using methods (methods are called as function in c language)
		cat1.legs = 4;
		cat2.legs = 4;        //this is how we can update the behavior of each class
		cat1.eyes = 2;
		cat1.colour = "red";
		
		cat1.description();
		cat2.description();
		
		dog sheru = new dog();
		dog tomy =new dog();
		
		sheru.sleep();
		sheru.bark = true;
		sheru.colour = "blue";
		sheru.name = "sheru";
		sheru.description();
		tomy.sleep();
		tomy.bark= true;
		tomy.colour= "white";
		tomy.name="tomy";
		tomy.description();
	}
	

}

package oops.abstraction;

public abstract class Car {
	public abstract void accelerate();
			
	public abstract void breaking();
	
	public void hunk() {      //CONCRETE METHOD
		System.out.println("Car is honking");
	}
	 
}


//As car is a concept and bmw and audi are models
//so we cannot say that car is accelerating or breaking
//In short ,,,we don't need the object of car

//ABSTRACTION KEYWORD
// * after using this keyword we do need to write the implementation of method,its children will write the implementation in the overridden method 
// * Whenever we are abstracting a method then it is mandatory to abstract the class under which it is present
// * Once a class is abstracted, its object can't be made.
// * After abstracting a class ,we have to mandatorily override the abstracted method in children class
// * Non-Abstracted method can also be created in a abstracted class which is called as  CONCRETE METHOD but vice versa is not possible
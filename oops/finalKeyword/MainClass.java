package oops.finalKeyword;

public class MainClass extends Student {
	int rollNo;
//  final int SandleNo;  //This is not possible because,if we are using final keyword then we must initialize it here only
//but this thing can be possible in the local variable but we have to assign some value after it otherwise while printing it it will show error

//	public void getDescription() {         //This will show compile time error because this method cannot be overridden further after the use of final keyword in parent's method
//		System.out.println("The student name is "+NAME);
//	}
	
    final int SANDLE_NO =4;  //final variable should be named in caps for more convenience 
	public static void main(String[] args) {

		final String NAME="Anuj";
//		name = "Aman";   //Cannot be updated due to final keyword or re-assigned
		
		final int BUS_NO;   //This final variable is not initialized while declaration...so it is called as blank variable
		
		//System.out.println(BUS_NO);   //this will show compile time error because the busNo variable is not initialized or not assigned with any value which become a mandatory thing after using the final keyword.
		
		
		final Student obj = new Student();
		Student obj2 = new Student();
		Student obj3 = new Student();
		
		obj2=obj3; //this can be done...reference of obj3 is given to obj2
		
		//obj=obj2;   //this will show compile time error because in case of reference final variable, internal state of the object pointed by that reference variable cannot be changed
		
		//obj.sec= "A";  //but this can be done for a final object variable
		
		//FINAL METHOD ILLUSTRATION
		MainClass object = new MainClass();
		object.getDescription();
		
		
		//final class---if final keyword is used before a class then it cannot be extended
	}

}

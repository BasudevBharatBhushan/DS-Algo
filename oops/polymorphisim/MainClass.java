package oops.polymorphisim;

public class MainClass {

	public static void main(String[] args) {
        
		//RUN TIME POLYMORPHISIM
//we get to know about its properties in run-time		
		Dog d = new Dog();
		
		Pet p = d;    
		                // Up casting
		Animal a = d;
		
		d.walk();
		p.walk();
//here compiler cannot detect that it will call the overridden walk method or pet walk method
		 
		System.out.println(d.name+"  "+p.name);   //it is to show that variables cannot be overridden
		
       // COMPILE TIME POLYMORPHISIM		
//we get to know about its properties in compile time, only		
		greetings();
		
		greetings("Hi there");
		
		greetings(" Hi there",5);
        
	}
	public static void greetings() {
		System.out.println("Hi there ");
	}
	public static void greetings(String s) {   //Method Overloading
		System.out.println(s);
	}
	public static void greetings(String s,int count) {
		for(int i=0;i<count;i++) {
			System.out.print(s);
		}
	}

}

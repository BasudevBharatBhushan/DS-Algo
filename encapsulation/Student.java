package encapsulation;

public class Student {
   private int age;                   //we have to keep the variable of the class as private to achieve encapsulation   //private is an access modifier  which can be accessed only within a class
   private String name;

   public int getAge() {                      
	    return age;                    //getter method (return something but have no parameters)  
   }
   public void setAge(int age) {
	    if(age>20)                                              //setter method (returns nothing but have parameters) 
		    System.out.println("you are too old for this");
	    else                                                 //Restrictions
		    System.out.println("You can take admission");
	
	    this.age=age;         //to keep state variable and parameter variable same   //here we are assigning the parameter age value to the state variable age value
   }
   public String getName() {
	    return name;                //setters and getters for name variable
   }
   public void setName(String name) {
	    this.name = name;
   }



}


/*
 * Key points to be remembered for  ENCAPSULATION
 * 
 * Declare the variable of class as private
 * provide public setter and getter method
 * setter method --->read the variable value
 * getter method---> write the variable value
*/
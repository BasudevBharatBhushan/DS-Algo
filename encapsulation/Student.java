package encapsulation;

public class Student {
   private int age;                   //we have to keep the variable of the class as private to achieve encapsulation   //private is an access modifier
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

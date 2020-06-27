package encapsulation;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		 
		 Student obj = new Student();
//   	 obj.name="Tom";         //It can't be done like this because the state variable of the student class are private  so we cannot update their values and it cannot be accessed outside the student class  
//       obj.age=56;
		 
		  Student basudev = new Student();
          Student Shirley = new Student();
		  basudev.setAge(23);                   //called by setter method
		  Shirley.setAge(18);
		  basudev.setName("basudev");
		  Shirley.setName("Shirley");
		  
		  
		  System.out.println(basudev.getAge());
		  System.out.println(Shirley.getAge());         //called by getter method
		  
		  System.out.println(Shirley.getName());
		  System.out.println(basudev.getName());
	}

}

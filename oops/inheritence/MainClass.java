package oops.inheritence;

public class MainClass {

	public static void main(String[] args) {
		
		//OBJECT OF PARENT CLASS
		Person p = new Person("Bharat");
		p.eat();
		p.walk();
		p.sleep();
		
		//OBJECTS OF CHILDREN CLASS
		Teacher t = new Teacher("Anuj");
		t.eat();   //Inherited Traits     
		t.walk();  //Inherited Traits   
		t.sleep();      //Method Overridden   //Inherited Traits
		t.teach();    //specific trait
		Singer s = new Singer("Shirley Setia");
		s.walk();   //Inherited Traits
		s.eat();    //Inherited Traits
		s.sleep();	  //Method Overridden   //Inherited Traits
		s.sing();    //specific trait
		
		
		
		
		Teacher t1 = new Teacher("");
		Person p1 = t1;  //Upcasting because a teacher is also a person
		
		Singer s1 = new Singer("");
		Person p2 = s1;  //Upcasting because a singer is also a person
		
		Teacher t2 = (Teacher)p1;  //Downcasting, because p1 is actually a teacher now
  //    Teacher t3 =(Teacher)p;   // as it is not showing any compile time error but it will show a run time error
		//why?? because p refers to person and every person cannot be teacher
		
		
		Singer s2 = (Singer)p2; //Downcasting
		
  //    Teacher t4 =(Teacher)p2; //It is not showing any compile error but it will show a run time error
		//why?? p2 is actually a singer so cannot be downcasted into a teacher object
		
		
//  "instanceof" keyword is used to check whether a object is instance of a class or not
	//NOTE::: in this keyword "o" is not capital	
		
		System.out.println(t1 instanceof Teacher);
		System.out.println(s1 instanceof Singer);
		System.out.println(t1 instanceof Person);
		System.out.println(t2 instanceof Person);
		System.out.println(p instanceof Teacher);
		System.out.println(p1 instanceof Teacher);
		System.out.println(s1 instanceof Person);
		
		p.running();
		t.running();    //first it will call the parent running class method and then the overridden running class method
		s.running();    //first it will call the parent running class method and then the overridden running class method
	//why??? because super keyword is used in the overridden methods of children class	
	}

}

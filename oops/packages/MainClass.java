package oops.packages;

//import oops.packages.models.Teacher;
//import oops.packages.models.student;

//instead of importing two class of model package separately,as done above,we can just add * as done below to access all the classes of models
import oops.packages.models.*;



public class MainClass {
	public static void main(String[] args) {
		student obj = new student("Tom"); 
//		obj.name="jery";                     //it is throwing error because it is private in student class
		Teacher teacher = new Teacher();
	}

}

package oops.finalKeyword;

public class Student {
	String sec;
	final int ROLL_NO;       
	final String NAME;       //Blank variables, declared but not initialized
	final static int CLASS;
	final int RANK;
	{
		ROLL_NO=5;           //initializer block, non-static blank variable can be declared here
		NAME = "BHARAT";
	}
	static {
		CLASS = 10;         //static block,,,Static blank variable can be declared here
	}
	public Student() {       //blank variables can also be initialized in the constructor
		RANK=23;
	}
	
	final public void getDescription() {
		System.out.println("The student name is "+NAME);
	}

}

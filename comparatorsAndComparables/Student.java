package comparatorsAndComparables;

public class Student implements Comparable<Student> {
	
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	public String toString() {
		return "Student [marks=" + marks + ",name= "+ name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public String  getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public int compareTo(Student obj) {   
		/*
		 * The return type integer can be +ve ,-ve or zero
		 * In case of Descending Order - if this function returns +ve...that means the current obj is smaller than the argument object and vice versa and if equal then both are equal
		 */
		
		if(this.marks>obj.marks)return -1; //If we have written -50 here or any number then there will be no problem , because it checks whether it is positive or negative
		else if(this.marks<obj.marks) return 1;
		//return 0;   //return zero if both the marks are same
		
		/*
		 *TO WRITE THIS THREE LINE CODE IN ONE LINE
		 *
		 *   return this.marks -obj.marks;               
		 */
		
		/*
		 * If we wish to sort in INCREASING ORDER
		 * if(this.marks>obj.marks)return 1;
		 * else if(this.marks<obj.marks) return -1;
		 */
		
		
		
		//If we wish to sort in such way that if two marks are same the sort them according to name then we can use
		
		return this.name.compareTo(obj.name);   //instead of    return 0;
	}
	
	

}

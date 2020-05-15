package comparatorsAndComparables;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23,"Ram"));
		students.add(new Student(35,"Shaym"));
		students.add(new Student(83,"Aman"));
		students.add(new Student(13,"Rohit"));
		students.add(new Student(65,"Anuj"));
		
		Collections.sort(students);  //It expect an List type argument which must extends comparable
		students.forEach(System.out::println); //LAMBDA FUNCTION 
		
		//Lets suppose the student class do not extend the comparable then we can sort it using comparator class in this way
		
		Collections.sort(students, new SortByNameThenMarks());

		students.forEach(System.out::println);  //LAMBDA FUNCTION 
		/*
		 * Here we are going inside the students , and iterating
		 * previously what we are doing is iterate inside the students and print its element one by one
		 * what lambda function does here-- the println function which is present inside System.out, we used the student property on the student or whatever the is..
		 */
		
		
		
	}

}
//COMPARATORS
		class SortByNameThenMarks implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.name.equals(o2.name)) {
					return o1.marks-o2.marks;
				}else {
					return o1.name.compareTo(o2.name);
				}
				
			}
			
		}

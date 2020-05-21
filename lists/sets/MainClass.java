package lists.sets;   //IT IS JUDT LIKE MATHEMATICAL SET

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		Set<String> fruits=new HashSet<>();
		
	//	Set<String> fruits=new LinkedHashSet<>();    //we can use linked hash set if we want our elements to be printed in a sequential order of our calling
		//IN LINKED HASH SET  WE CANNOT TOOK THE BENEFIT OF CONSTANT TIME OPERATION BEACCUSE LINKED LIST PERFORM LINEAR OPERATION
		
	//	Set<String> fruits=new TreeSet<>(); //this tree set will print the values in a sorted order
		
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		System.out.println(fruits.add("Banana"));   //this will return false  because duplicate elements are not allowed to be added in set
//		System.out.println(fruits.add("Mango"));    //add function returns a boolean value
//		
//		System.out.println(fruits);
		
		
		Set<Integer> x=new HashSet<>();
		x.add(23);
		x.add(1);
		x.add(6);
		Iterator<Integer> iterator = x.iterator();
		
		System.out.println(iterator.next());		
		Set<Integer> y=new HashSet<>();
		y.add(3);
		y.add(1);
		y.add(16);
		Set<Integer> z=new HashSet<>();
		z.add(23);                            
		
//		x.addAll(y);   //UNION OF TWO SETS
//		System.out.println(x);
		
//		x.retainAll(y); //intersection of elements
//		System.out.println(x);
		
		//System.out.println(x.containsAll(z));   //Z is a subset of X==true
		//System.out.println(x.contains(y));
		
	}
  
}

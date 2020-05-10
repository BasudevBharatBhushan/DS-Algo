package lists;
import java.util.ArrayList;
import java.util.List;
public class MyArrayList {

	public static void main(String[] args) {
		
		
		ArrayList fruits = new ArrayList();
   		
	    fruits.add("Apple");          //as generics is not used, so we can fill the fruit arrayList with any data type....
	    fruits.add(23);       //add is a pre-defined function which is used to store elements in the array list
	    
	    System.out.println(fruits);
	    
	    ArrayList<Integer> ranks = new ArrayList();       //<Generics>  as we have used generic so we can only store the said data type or classes inside the rank ArrayList 
	    
	    ranks.add(2);        
	    ranks.add(3);
	    
//	    ranks.add("Bharat");   //will show compile time error because we are not allowed to fill a string value in ranks due to pre defined generics 
	    
	    List<Double> percentage = new ArrayList();   //This also can be done because ArrayList implements list //PREFERRABLE METHOD OF MAKING OBJECT
//BY MAKING OBJECT LIKE THIS INTER-CONVERSION BECOMES EASY-e.g--> Later on Suppose I have to work with stack of ArrayList then by this method it becomes possible
//SO IN TOP LEVEL IT IS UNKNOWN THAT WHAT TYPE OFF LIST IS THIS BUT THE OBJECT IS BEING CREATED OF ArrayList....(Beauty of interface)
	    
	    Pair<String,Integer> p1 = new Pair("Bharat",457);    //PAIR
	    Pair<Boolean,String> p2= new Pair(true,"Anuj");                       //<Generics Concept>
//	    System.out.println(p1.x);                                            
//	    System.out.println(p1.y);
	    
	   p1.getDescription();
	   p2.getDescription();
	   
	   Double r=56.0;   //here This double belongs to the raper class...because it extends to the object  class
	   double t =90.9;   //similarly (int ,Integer)
	   
	   
	   
	}

}

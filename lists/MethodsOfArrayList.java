package lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class MethodsOfArrayList {

	public static void main(String[] args) {
		
		List<String> veges = new ArrayList<>();
		veges.add("carrot");
		veges.add("Potato");         //to add elements in list
		veges.add("brocoli");
		
		System.out.println(veges);
		
		List<String> DryFruits = new LinkedList<>();  //List<String> DryFruits = new LinkedList();  //can also be initialized like this this but this will show a compiler warning without any error
		DryFruits.add("kaju");
		DryFruits.add("badam");
		DryFruits.add("Akhrot");
		DryFruits.add("kismis");
		DryFruits.add("Avocado");
		DryFruits.add("Black Chana");
		DryFruits.add("Green Chana");  //DryFruits.add(index,element);
		
		System.out.println(DryFruits);
		
		
		veges.addAll(DryFruits);   //As both veges and dry fruits are belongs to list at top level so while adding these we do not face any compile time error or any difficulty
     
		
		System.out.println(veges);
		
		System.out.println(DryFruits.get(0));      //to obtain the asked index value
		
		DryFruits.set(1, "Almonds");       //to replace a value from particular index
		System.out.println(DryFruits);
		
		veges.remove(2);
		System.out.println(veges);
		
		veges.clear();                    //to clear all the elements from a particular arraylist
		System.out.println(veges);
		
		List<String> toRemove = new ArrayList<>();
		toRemove.add("Akhrot");
		toRemove.add("kismis");                         //used to remove specific elements
		
		DryFruits.removeAll(toRemove);
		System.out.println(DryFruits);
		
		System.out.println(DryFruits.size());   //to print the size of an array list
		
		System.out.println(DryFruits.contains("kismis"));    //to check a specific contents
		
		System.out.println(veges.isEmpty());   //to check whether the ArrayList is empty or not
		
		
		String temp[]=new String[DryFruits.size()];
		DryFruits.toArray(temp);                          //to make arraylist a array
		                                                          
		for(String e:temp) {
			System.out.print(e+" ");
		}
		
		
		

	}

}

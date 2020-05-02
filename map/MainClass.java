package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		Map<String,Integer> number = new HashMap<>();    //<keyword type, value type>
		Map<String,Integer> n = new HashMap<>();
		
		/*
		 * here all operations are performing in O(1) times
		 * due to hash function 
		 */
		number.put("one", 1);
		number.put("two", 2);    //to insert element and keywords
		number.put("five",5);
		
		System.out.println(number);
		
		n.putAll(number);               //insert an entire map into a new map
		System.out.println(n);
		
		number.putIfAbsent("one", 3);      //it will not insert value against "one" because it is already present in the map
		number.putIfAbsent("six", 6);
		System.out.println(number);
		
		System.out.println(number.get("six"));   //return value against the specified keyword otherwise null
		
		System.out.println(number.getOrDefault("six", 7));  //returns value of the specified keyword if present in the map,otherwise will return the default value
		
		System.out.println(number.containsKey("seven"));  //return a boolean value, to check if the keyword is present or not
		System.out.println(number.containsValue(7));   //return a boolean value, to check if the value is present or not
		
		number.replace("one",10 );  
		number.replace("six", 6,60); // here the old value will be replaced by the new value
		number.replace("two", 3, 30);  //here new value will not be assigned , because the value of keyword "two" == 2, but here it is written 3.
		
		//number.remove("two");
		number.remove("two",3);   //here the value will not remove because "two" ==2  not 3
		
		System.out.println(number);
		
		System.out.println(number.keySet());  //returns set of keywords
		System.out.println(number.values());  //returns set of values
		
		System.out.println(number.entrySet());   //returns set of keywords and values
		/*ENTRY CLASS---
		 *     Entry<K,V>{
		 *        K key;                  
		 *        V value;
		 *      }   
		 */
		
		
		//SUPPOSE WE HAVE TO PERFORM SOME OPERATION WHILE ITERATING , ...USING FOR-EACH LOOP
		Set<Entry<String, Integer>> entries =number.entrySet();
		
		
		//for(Entry<String,Integer> entry:number.entrySet())     //can also be written like this without declaring
		for(Entry<String,Integer> entry:entries) {
			//Operation example:: suppose for each entry we are multiplying the value by 10
			entry.setValue(entry.getValue()*10);
		}
		System.out.println(number);

		
		
		
		
		
	}

}

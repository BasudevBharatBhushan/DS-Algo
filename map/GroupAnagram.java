package map;
import java.util.*;
public class GroupAnagram {
	public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map =new HashMap<>();
        for(String s:strs){
            char charArray[]=s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>());
            }
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }

	public static void main(String[] args) {
		String arr[]= {"eat","tea","tan","ate","nat","bat"};
		
		List<List<String>> list = new LinkedList<>();
		list= groupAnagrams(arr);
		System.out.println(list);
	
	}
	
	public static List<List<String>> groupAnagrams2(String[] strs){
		int index []=new int[256];
		 Map<String,List<String>> map =new HashMap<>();
		 for(String s:strs) {
			 
		 }
		 
		 
		
		 return new LinkedList<>(map.values());
	}

}

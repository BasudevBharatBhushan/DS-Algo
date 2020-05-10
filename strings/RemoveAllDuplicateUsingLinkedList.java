package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class RemoveAllDuplicateUsingLinkedList {
	Object[] obj;

	public static void main (String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		System.out.println("test case");
		int t = Integer.parseInt(reader.readLine().trim());
		while(t-->0){
		    String s = reader.readLine();
		    List<Character> list = new LinkedList<>();
		    for(int x=0;x<s.length();x++) {
		    	list.add(x,s.charAt(x));
		    }
		    int i=0;
		    while(i>=0) {
		    	if(i>list.size()-1) {
		    		break;
		    	}
		    	int j =0;
		    	while(j>=0) {
		    		if(j>list.size()-1) 
		    			break;
		    		else if(list.get(i)==list.get(j)&& i!=j)
		    			list.remove(j);
		    		else
		    			j++;
		    	}
		    	i++;
		    }
		  
		    RemoveAllDuplicateUsingLinkedList r = new RemoveAllDuplicateUsingLinkedList();
		    r.obj=list.toArray();
//		    char c[] = new char[list.size()];
//		    for(int z=0;z<list.size();z++) {
//		    	c[z]=list.get(z);
//		    }
//		    s=String.valueOf(c);
		    for(Object item:r.obj) {
		    	sb.append(item);
		    }
		    
		   // sb.append(s);
		    sb.append('\n');
	}
	System.out.println(sb);	
	
	}
	
}

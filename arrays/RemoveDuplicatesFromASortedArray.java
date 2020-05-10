package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromASortedArray {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("bring the console");
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sc = new StringBuilder();
	    int N = Integer.parseInt(reader.readLine().trim());
	  
	    int a[]=new int[N];
	    String nd[]=reader.readLine().trim().split(" ");
	    for(int i=0;i<N;i++) {
	    	a[i]=Integer.parseInt(nd[i].trim());
	    }
	    
	    List<Integer> l = new LinkedList<>();
	    for(int i=0;i<N;i++) {
	    	l.add(a[i]);
	    }
	    System.out.println(l);
	    
	    
	    int j=0;
	    while(j<l.size()-1) {
	    	if(l.get(j)==l.get(j+1)) {
	    		l.remove(j+1);
	    	}else{
	    		j++;
	    	}
	    }
	    System.out.println(l);
	    
	    int b[]=new int[l.size()];
	    for(int i=0;i<b.length;i++) {
	    	b[i]=l.get(i);
	    }
	    for(int item:b) {
	    	System.out.print(item+" ");
	    }
		}
}

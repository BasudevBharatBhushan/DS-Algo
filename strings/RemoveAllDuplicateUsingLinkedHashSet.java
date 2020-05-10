package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class RemoveAllDuplicateUsingLinkedHashSet {
	Object[] c;

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("test cases");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sc = new StringBuilder();
		int t = Integer.parseInt(reader.readLine().trim());
		while(t-->0) {
			String s = reader.readLine();
			LinkedHashSet<Character> set =new LinkedHashSet<>();
			for(int i=0;i<s.length();i++) {
				set.add(s.charAt(i));
			}
			RemoveAllDuplicateUsingLinkedHashSet p = new RemoveAllDuplicateUsingLinkedHashSet();
			p.c=set.toArray();
			
			for(Object item:p.c) {
				sc.append(item);
			}
	        sc.append('\n');	
	   }
		System.out.println(sc);

	}

}

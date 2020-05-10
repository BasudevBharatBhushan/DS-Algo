package map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ConvertASentenceIntoItsEquivalentMobileNumericKeypadsequence
 {
     Object c[];
	public static void main (String[] args)throws Exception
	 {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sc =new StringBuilder();
		 Map<Integer,Integer> map = new HashMap<>();
		for(int i=2,j=65;j<=80;i++,j+=3) {
			map.put(j, i);
		}
		for(int i =2,j=66;j<=81;j+=3,i++) {
			map.put(j, (i*10)+i);
		}
		for(int i =2,j=67;j<=82;j+=3,i++) {
			map.put(j, (i*100)+(i*10)+i);
		}
		map.put(83, 7777);
		map.put(90, 9999);
		
		for(int i=8,j=84;j<=87;i++,j+=3) {
			map.put(j, i);
		}
		for(int i =8,j=85;j<=88;j+=3,i++) {
			map.put(j, (i*10)+i);
		}
		for(int i =8,j=86;j<=89;j+=3,i++) {
			map.put(j, (i*100)+(i*10)+i);
		}
		
		int t =  Integer.parseInt(reader.readLine().trim());
		while(t-->0) {
		
			String s =reader.readLine();
			List<Integer> list=new LinkedList<>();
			for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				list.add(0);
			}else {
		     	list.add(map.get((int)s.charAt(i)));
			}
		}
		ConvertASentenceIntoItsEquivalentMobileNumericKeypadsequence obj = new ConvertASentenceIntoItsEquivalentMobileNumericKeypadsequence();
		
		obj.c=list.toArray();
		for(Object item:obj.c) {
			sc.append(item);
		}
		sc.append('\n');
		
		}	
		System.out.println(sc);
	 }
}
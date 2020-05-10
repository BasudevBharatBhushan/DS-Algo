package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberOfCamelCaseLetter {
	public static void main (String[] args) throws Exception {
		System.out.println("test cases");
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sc = new StringBuilder();
	    int t = Integer.parseInt(reader.readLine().trim());
	    while(t-->0){
	        String s = reader.readLine();
	        int sum =0;
	        for(int i =0;i<s.length();i++){                             //ASCII CODE CONCEPT
	            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
	                sum++;
	            }
	        }
	        sc.append(sum);
	        sc.append('\n');
	    }
	    System.out.println(sc);
	}

}

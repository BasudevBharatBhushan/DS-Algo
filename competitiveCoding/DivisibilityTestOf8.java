package competitiveCoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;    

public class DivisibilityTestOf8 {

	public static void main (String[] args)throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s =new StringBuilder();
		
		System.out.println("test cases");
		
		int t =  Integer.parseInt(reader.readLine().trim());
		while(t-->0) {
		
			String n =reader.readLine();
			if(n.length()>3) {
			char c[]=n.toCharArray();
			
			StringBuffer sb=new StringBuffer();
			sb.append(c[n.length()-3]+""+c[n.length()-2]+""+c[n.length()-1]);
			int k = Integer.parseInt(sb.toString().trim());
			if(k%8==0) {
				s.append("1");
			}else {
				s.append("-1");
			}
			}else {
				int num = Integer.parseInt(n);
				if(num%8==0) {
					s.append("1");
				}else {
					s.append("-1");
				}
				
			}
			
			
     	}

		System.out.println(s);
	}
}

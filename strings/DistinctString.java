package strings;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class DistinctString {
	public static void main (String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		System.out.println("test case");
		int t = Integer.parseInt(reader.readLine().trim());
		while(t-->0){
		    String s = reader.readLine();
		    boolean visited[]=new boolean[s.length()];
		    int sum =0;
		    for(int i=0;i<s.length();i++){
		        for(int j=i-1;j>=0;j--){
		            if(s.charAt(j)==s.charAt(i) && !visited[j]){
		                sum++;
		                visited[j]=true;
		            }
		        }
		    }
		    sb.append("no. of changes that had to be made to make the string disinct--> "+sum);
		    sb.append('\n');
		}
		System.out.println(sb);
	}
}
package lists.linkedList;

import java.util.*;
import java.lang.*;
import java.io.*;
public class RemoveSpaces
 {
     Object []c;
	public static void main (String[] args)throws Exception
	 {
	  BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	     StringBuilder sc = new StringBuilder();
	     int t = Integer.parseInt(reader.readLine().trim());
	     while(t-->0){
	         RemoveSpaces obj=new RemoveSpaces();
	         String s = reader.readLine();
	         List <Character> list = new LinkedList();
	         for(int i=0,z=0;i<s.length();i++){
	             if(s.charAt(i)==32){
	                 continue;
	             }else{
	                 list.add(s.charAt(i));
	                 z++;
	             }
	         }
	         obj.c=list.toArray();
	         for(Object item:obj.c){
	             sc.append(item);
	         }
	         sc.append('\n');
	     }
	     System.out.println(sc);
	 }
}
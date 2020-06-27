package recursion;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Pattern1
 {
public static void main (String[] args)
	 {
		
	   int n = -4;
	   met(n-5,n);
	    
	 }
	 
	 static void met(int n,int x) {
		if(n<=0) {

			met2(n,x);
			if(x-n==5) {
			System.out.print(x);
		}
			
			return;
		}
		
			met(n-5,x);
			if(x-n == 5) {
				System.out.print(n+" "+x);
			}else {
				System.out.print(n+" ");
			}
		
	}
	
	static void met2(int n,int x) {
		if(n==x) {
			System.out.print(n+" ");
			return;
		}
		
		met2(n+5,x);
		System.out.print(n+" ");
	}
}
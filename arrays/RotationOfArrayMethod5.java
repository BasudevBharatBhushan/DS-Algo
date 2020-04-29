package arrays;

import java.util.Scanner;

public class RotationOfArrayMethod5 {
	 static void printLeftRotate(String a[], int n, int r)
	    {
	     
	        
	        int i;
	        
	        for ( i = r; i < n; i++)
	        {
	            System.out.print(a[i]+" ");
	        }
	        
	        for (i = 0; i < r; i++)
	        {
	            System.out.print(a[i]+" ");
	        }
	    }
	    
	    static void readInputs()
	    {
	        Scanner sc = new Scanner(System.in);
	        int testCases = sc.nextInt();
	        
	        while(testCases-- > 0)
	        {
	            int n = sc.nextInt();
	            int r = sc.nextInt();
	            int i;
	            
	            String a[] = new String[n];
	            
	            for(i = 0; i < n; i++)
	            {
	                a[i] = sc.next();
	            }
	            
	            printLeftRotate(a, n, r);
	            System.out.println();
	        }
	    }

	public static void main(String[] args) {
		readInputs();

	}

}

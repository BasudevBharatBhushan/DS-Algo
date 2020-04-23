package loop;
import java.util.Scanner;
public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 int a = 0;
		 int b = 1;
		 System.out.print(a +" ");
         System.out.print(b + " ");
         
         for(int i = 0; i < n-2; i++) {
        	 int c = a + b;                   //this int c can be taken previously as int c = 0, and here we could have written c = a +b;
        	 System.out.print(c+ " ");
         a=b;
         b=c;                                
         }
		
		
		
		
		
	}

}

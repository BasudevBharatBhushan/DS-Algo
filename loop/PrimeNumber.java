package loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    boolean isPrime = true;
    for(int i = 2; i * i <= n; i++) {
	   if (n % i == 0) {
	      isPrime = false;
	      break;                     //till now I can't find any valid reason for the presence of break
	   }
   }	
     if(n < 2  ) isPrime = false;
     
	 System.out.println(" this Number is prime " + isPrime);

  }

}

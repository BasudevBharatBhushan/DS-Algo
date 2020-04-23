package whileLoop;

import java.util.Scanner;



public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int temp = n;
			int reversedNumber = 0;
			while(temp > 0) {
				int lastDigit = temp % 10;
				reversedNumber = reversedNumber * 10 + lastDigit;
				temp /= 10;
			
				
				System.out.println(reversedNumber +" "+ temp + " " + lastDigit);
				//this above code is to understand the process
		
			}
			
			if(reversedNumber == n) {
				System.out.println(n +" is a Palindrome");
			} else {
				System.out.println(n + " is not a palindrome");
			}
			
			
			
			
			
			
			
			
			
			
			
			
	}

}

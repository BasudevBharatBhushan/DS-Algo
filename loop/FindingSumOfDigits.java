package loop;

import java.util.Scanner;

public class FindingSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int sum = 0;

for(int i = 1; i <= n; i++) {
	sum += i;

	
	if(i<n) {
		System.out.print(i + "+");               // i included these if conditions to make this code more clear otherwise these are not needed
	}else {
		System.out.print(i);
	}
}
System.out.println();                                // for an extra line
System.out.println("= "+sum);
	}

}

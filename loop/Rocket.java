package loop;

import java.util.Scanner;

public class Rocket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the passcode to launch the rocket");
		int n = sc.nextInt();
		if(n==1457) {
		System.out.println("Here we go-----3...2...1...launch ");
		System.out.println();
			
		for(int i =0; i<6; i++) {
			for(int j=0;j<6-i;j++) {
				System.out.print(" ");
			}	
			System.out.print("*");
			for(int j=0;j<2*i;j++) {
				System.out.print(" ");
			}
		    System.out.println("*");
		}
	
for(int i=1;i<=14;i++) {
		System.out.print("*");
}
System.out.println();
for(int i =1; i<=5; i++) {
	for(int j =1; j<=4; j++) {
		System.out.print(" ");
	}
	System.out.print(": ");
	if(i==1) {
		System.out.print("I");
	}else if (i==2) {
		System.out.print("N");
	}else if(i==3) {
		System.out.print("D");
	}else if(i==4) {
		System.out.print("I");
	}else{
		System.out.print("A");
	}
	System.out.println(" :");
}
System.out.println("    *   *");
for(int i =0; i<3; i++) {
	for(int j =0; j<3-i; j++) {
		System.out.print(" ");
	}
	System.out.print("*");
	for(int j =0; j<i; j++) {
		System.out.print(" ");
		
	}
	
	System.out.print("*   *");
	for(int j =0; j<i; j++) {
		System.out.print(" ");
	}
	System.out.println("*");
}

for(int i =1; i<=14; i++) {
	
	if(i>=6 && i<=8) {
		System.out.print(" ");       //here continue function can't be used as it will not print spaces
	}else {
		System.out.print("*");
	}
	
}
System.out.println();

System.out.println("    *   *");
System.out.println("     * *");
System.out.println("      *");




		}else {
			System.out.println("Wrong Passcode-------System failure");
		}
	}

}

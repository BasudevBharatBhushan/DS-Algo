package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
long x = sc.nextLong();

System.out.println(x);		 
double y = sc.nextDouble();
System.out.println(y);

String r = sc.nextLine();
System.out.println(r);
	}

}

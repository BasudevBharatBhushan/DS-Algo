package loop;
import java.util.Scanner;
public class FactorialUsingForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int factorial = 1;
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			//factorial = factorial * i; also can be written as 
			factorial *=i;
		
		}
		System.out.println(factorial);
		
		
		
		
		
		
		
	}

}

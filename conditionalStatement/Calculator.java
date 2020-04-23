package conditionalStatement;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
    System.out.println("Enter  First Number");
		int a = sc.nextInt();
    System.out.println("Enter the second number");
     	int b = sc.nextInt();
    System.out.println("Enter the operation");
        sc.nextLine();                           //before int/float , if we want to take a string value,
                                                         //we have to write this otherwise
                                                         //the string input or value we wish to take will be consumed on enter
	  	char operation = sc.nextLine().charAt(0);
		
      int result = 0;
      switch(operation)  {
	    case '+':
			result = a + b;
		    break;
	    case '-':
			result = a - b;
		    break;
	    case '*':
			result = a * b;
		    break;
	    case '/':
			result = a / b;
		    break;
		default:
			System.out.println("Invalid Entry");
			
			
		}
		    System.out.println("The result is " + result);
				
	}

}
 
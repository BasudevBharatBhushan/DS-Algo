package conditionalStatement;

public class TernaryOperator {                        //shortened form of if else...

	public static void main(String[] args) {
		
		         //General statement of ternary operator   variable = condition ? expression true : expression false;
		         //here we have to create a class of random variable to (eg.- maxOfBothNumber) to operate this ternary operator 
		 
          int a = 1;
          int b = 8;
          int maxOfBothNumbers = 0;

          maxOfBothNumbers = a > b ? a : b;

          System.out.println("max of both number is " + maxOfBothNumbers);
		

//	if(a>b) {
//	System.out.println(a);        //if we wish to write the above code in if else  long term form
//	} else {
//		System.out.println(b);
//	}
//		
//		
	}

}

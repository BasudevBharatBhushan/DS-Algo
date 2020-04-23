package conditionalStatement;

public class NestingUsingTernaryOperator {

	public static void main(String[] args) {
		
       int a= 12, b=18, c=10;
       int result=0;
       result = a > b ? a > c ? a : c : b > c ? b : c;
       System.out.println("the largest of three number is " + result);   //this is damm simpler
	}

}






// result = a > b ? a > c ? a : c : b > c ? b : c   
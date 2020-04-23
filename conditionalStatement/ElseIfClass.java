package conditionalStatement;

public class ElseIfClass {

	public static void main(String[] args) {
	
         int number = 23;
         if(number <= 10) {
	        System.out.println("the number is less than 10");  //block to be executed if condition 1 is true
            } else if(number >= 10 && number <= 20) {
	        System.out.println("the number is greater than 10 but less han 20");  //block to be executed if condition 1 is false and condition 2 is true
            } else if(number >= 20 && number <= 30 ) {
            System.out.println("the number is greater than 20 and less than 30");  
            } else {
	        System.out.println("the number is greater than 30");        //block to be executed if all the above conditions are false
       }		
	}
}

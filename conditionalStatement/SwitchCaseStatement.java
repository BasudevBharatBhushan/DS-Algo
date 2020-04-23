package conditionalStatement;
import java.util.Scanner;
public class SwitchCaseStatement {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
    int dayOfweek = sc.nextInt();
    switch(dayOfweek) {
       case 1:
         System.out.println("I m in home");
	     break;
       case 2:
	     System.out.println("i m in office");
	     break;
       case 3:
	     System.out.println("i m in field");
	     break;
	
       default:
	     System.out.println("I m in garden");
		
 }
		
		
		
		
		
	}
	

}

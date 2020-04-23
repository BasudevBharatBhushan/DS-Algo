package conditionalStatement;

public class MergeSwicCases {

	public static void main(String[] args) {
		
		int dayOfweek =2;
		switch(dayOfweek) {
		  case 1:                                     
		  case 2:                                 //merging of switch cases means simply removing the break statement between two cases
		     System.out.println("I m in home");
			 break;
		  case 3:
			 System.out.println("i m in field");
			 break;
	      default:
			 System.out.println("I m in garden");
				
		 }
				
				
				
				
				
			}
			

		

	
	
	

}

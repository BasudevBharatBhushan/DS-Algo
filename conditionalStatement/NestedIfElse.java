package conditionalStatement;

public class NestedIfElse {                     //taking new if condition inside a if condition

	public static void main(String[] args) {
		
          int a = 12, b = 8, c = 10;    //it can also be taken like this and it is simpler

          int result = 0;    //class of random variable
          int resultOfTernareyOperator = 0; //this class is random variable is taken to print the same result by ternary operator
          
          if(a > b)          
          {                        
             if(a > c) 
             {
	            result = a;
	   
             } 
                else                            // because if a > b and c > a then automatically c will be the largest number
                {
	                result = c;
                 }   
         } 
           else  
           {
	          if(b > c)            // this block will be executed when only b > a, then here we have to check only if b is also > c then b will be the largest
	          {
		        result = b;
	          }
	            else 
	              {
		          result = c;
		   
	              }
          }
          
          resultOfTernareyOperator = a>b?a>c?a:c:b>c?b:c;
	         System.out.println("largest of three number is " + result); 	
		     System.out.println("Using ternary operator the largest of three number is "+resultOfTernareyOperator);
	} 
}





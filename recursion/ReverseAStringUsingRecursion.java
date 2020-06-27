package recursion;

public class ReverseAStringUsingRecursion {

	public static void main(String[] args) {
		 String s =reverseAString("abcde");
		 
		 System.out.println(s);
		

	}
	
	static String reverseAString(String s) {
		if(s.isEmpty()) {
			
			return s;
		}
		
		
		return reverseAString(s.substring(1))+s.charAt(0);
	}

}

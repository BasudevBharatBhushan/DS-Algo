package recursion;

public class CheckWhetherAStringIsPalindrome {

	public static void main(String[] args) {
		 
        palindrome("onion");
		
	}
	static void palindrome(String s) {
		if(s.length()==0 || s.length()==1) {
			System.out.println("Palindrome");
			return;
		}
		
		if(s.charAt(0)==s.charAt(s.length()-1)) {
	         palindrome(s.substring(1, s.length()-1));
		}else {
			System.out.println("Not Palindrome");
			return;
		}
	}

}

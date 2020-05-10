package strings;

public class PrintAllTheSubsequencesUsingRecursionMethod {

	public static void main(String[] args) {
		printSubsequences("123");
		int sum1=0;

	}
	public static void printSubsequences(String input,String outputSoFar) {
		if(input.length()==0) {
			System.out.println(outputSoFar);
			return;
		}
		//we choose not to include the first character
		printSubsequences(input.substring(1), outputSoFar);
		
		//we choose to include the first character
		printSubsequences(input.substring(1), outputSoFar+input.charAt(0));
	}
	public static void printSubsequences(String input) {
		printSubsequences(input, "");
	}

}

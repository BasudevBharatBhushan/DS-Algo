package recursion;

public class PrintAllTheSubSequencesUsingrecursion {

	public static void main(String[] args) {


		printSubSequences("xyz");

	}
	
	static void printSubSequences(String input, String outputSoFar) {
		if(input.length()==0) {
			System.out.println(outputSoFar);
			return;
		}
		
		printSubSequences(input.substring(1), outputSoFar);
		printSubSequences(input.substring(1), outputSoFar+input.charAt(0));
	}
	
	static void printSubSequences(String input) {
		printSubSequences(input,"");
	}

}

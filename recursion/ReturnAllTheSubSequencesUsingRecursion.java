package recursion;

public class ReturnAllTheSubSequencesUsingRecursion {

	public static void main(String[] args) {
	
        String ans[]=findSubsequence("xyz");
        for(String e:ans) {
        	System.out.println(e);
        }
		
	}
	
	static public String[] findSubsequence(String s) {
		if(s.length()==0) {
			String smallAns[]= {""};
			return smallAns;	
		}
		
		
		String ans[]=findSubsequence(s.substring(1));
		String smallAns[]=new String[2*ans.length];
		
		int i=0;
		for(;i<ans.length;i++) {
			smallAns[i]=ans[i];
		}
		
		for(int j=0;j<ans.length;j++,i++) {
			smallAns[i]=s.charAt(0)+ans[j];
		
		}
		return smallAns;
		
	}
	
	

}

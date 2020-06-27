package SubArraysAndSubSequences.strings;

public class ReturnAllTheSubsequencesUsingRecursionMethod {
	public static void main(String[] args) {
		String str ="xyz";
        String ans[]=findSubSequences(str);
        for(int i=0;i<ans.length;i++) {
        	System.out.println(ans[i]);
        }
        String ans3[]=findSubSequences3(str);
        for(int i=0;i<ans3.length;i++) {
        	System.out.println(ans3[i]);
        }
	}

	public static String[] findSubSequences(String str) {
		if(str.length()==0) {
			String ans[]={""};       //Empty Strings
			return ans;
		}
		String smallAns[]=findSubSequences(str.substring(1));
		String ans[]=new String[2*smallAns.length];
		
		
		
		for(int i=0;i<smallAns.length;i++) {
			ans[i]=smallAns[i];
		}
		for(int i=0;i<smallAns.length;i++) {
			ans[i+smallAns.length]=str.charAt(0)+smallAns[i];
		}
		return ans;
	}
	public static String[] findSubSequences2(String str) {   //Essentially the same function, just used an extra variable int k for better understanding
		if(str.length()==0) {
			String ans[]={""};       //Empty Strings
			return ans;
		}
		String smallAns[]=findSubSequences2(str.substring(1));
		String ans[]=new String[2*smallAns.length];
		
		int k=0;
		
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=smallAns[i];
			k++;
		}
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=str.charAt(0)+smallAns[i];
			k++;
		}
		return ans;
	}
	
	public static String[] findSubSequences3(String str) {
		if(str.length()==0) {
			String ans[]={""};       //Empty Strings
			return ans;
		}
		String smallAns[]=findSubSequences(str.substring(1));
		String ans[]=new String[2*smallAns.length];
		
		
		int i=0;
		for(;i<smallAns.length;i++) {
			ans[i]=smallAns[i];
		}
		for(;i<smallAns.length;i++) {
			ans[i]=str.charAt(0)+smallAns[i];
		}
		return ans;
	}
}

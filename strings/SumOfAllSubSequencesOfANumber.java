package strings;

public class SumOfAllSubSequencesOfANumber {

	public static void main(String[] args) {
		String str ="123";
		int sumOfAlltheSubSequences=0;
        String ans[]=findSubSequences(str);
        for(String e:ans) {
        	System.out.println(e);
        }
        for(int i=0;i<ans.length;i++) {
        	if(i<ans.length-1) {
	        	int sum=0;int n =Integer.parseInt(ans[i+1]);
	        	while(n!=0) {
	        		sum=sum+(n%10);
	        		n/=10;
            }
        	sumOfAlltheSubSequences=sumOfAlltheSubSequences+sum;
        	}
        }
        System.out.println(sumOfAlltheSubSequences);

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

}

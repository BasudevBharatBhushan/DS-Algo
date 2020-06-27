package recursion;
import java.util.*;

public class PermutationsInStrings {
	static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		
		//We have used set to print the unique strings only....in cases like "abcc"  repetition occurs
		
			permutations("abc", 0, 2);
	}
	
	static void permutations(String s, int l , int r) {
		if(l==r) {
			if(set.contains(s))return;
			set.add(s);
			System.out.println(s);
			return;
		}
		
		for(int i=l;i<=r;i++) {
			s=interchange(s, l, i);
			permutations(s, l+1, r);
			System.out.println(l+"    "+i);
			s=interchange(s, l, i);
		}
	}
	
	static String interchange(String s, int l, int r) {
		
		char c[]=s.toCharArray();
		
		char temp = c[l];
		c[l]=c[r];
		c[r]=temp;
		
		return String.valueOf(c);
	}

}

package strings;

public class Anagrams {

	public static void main(String[] args) {
       
		String a = "abb";
		String b = "bba";
		
		boolean isAnagram = false;
		
		boolean visited [] = new boolean[b.length()];
		
		if(a.length() == b.length()) {
			
			for(int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				isAnagram = false;
				for(int j = 0; j <a.length();j++) {
					if(b.charAt(j)== c && !visited[j]) {
						visited [j] = true;
						isAnagram = true;
						break;
					}
					
				}
				if(!isAnagram) {        //can also be written as if(isAnagram==false)
					break;
				}
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("not Anagram ");
		}
		
		
		
		
		
		
		
		
	}

}

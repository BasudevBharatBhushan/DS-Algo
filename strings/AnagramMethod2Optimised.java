package strings;

public class AnagramMethod2Optimised {

	public static void main(String[] args) {
		
		String a = "abb";
		String b = "abb";
		boolean isAnagam = true;
		
      int al[] = new int[256];
      
      
      for(char c: a.toCharArray()) {
    	  int index = (int) c;
    	  al[index]++;
      }
    	  for(char c: b.toCharArray()) {
        	  int index = (int) c;
        	  al[index]--;
      }
		
	 for(int i = 0; i<256; i++) {
		 if(al[i] != 0) {
			 isAnagam = false;
			 break;
		 }
	 }
		if(isAnagam) 
			System.out.println("anagram");
		else 
			System.out.println("not anagram");
		
		

	}

}

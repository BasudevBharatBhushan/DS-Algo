package strings;

public class BubbleSortingOfString {

	public static void main(String[] args) {
		String a = "zxy";
		int n = a.length();
		char c[] = new char[n];
		
		for(int i=0;i<n;i++) {
			 c[i]= a.charAt(i);
		}

		for(int i = 0; i<n-1;i++) {
			boolean sorted =true;
			for(int j = 0; j<n-1-i; j++) {
				if ((int)c[j+1]<(int)c[j]) {	
					char temp = c[j+1];
					c[j+1]=c[j];
					c[j]=temp;
				
					
					
			        sorted = false;
				    
				}	
			}
			if(sorted) break;
		}
		
		a=String.valueOf(c);
				System.out.println(a);


	}

}

package ascii;

public class ObtainASCIIValueOfAChar {

	public static void main(String[] args) {
	
		char x ='a';
		int b = (int)x;
		System.out.println(b);
		
		//OR
		
		int c =(int)'e';
		System.out.println(c);
		
		
		String s ="Bharat";
        
		int y = (int)s.charAt(2);
		System.out.println(y);
		
		s=s.replace('a', 'u');
		
		System.out.println(s);
	}

}

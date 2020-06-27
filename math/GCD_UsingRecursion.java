package math;

public class GCD_UsingRecursion {

	public static void main(String[] args) {
		
		System.out.println(gcd(0,5));
		

	}
	static long gcd(long a,long b) {
		if(b==0) {
			return a;
		}
		
		return gcd(b,a%b);
	}

}

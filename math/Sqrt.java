package math;

public class Sqrt {

	public static void main(String[] args) {
		findSqrt(10);

	}
	static double square(double n,double i,double j) {
		double mid = (i+j)/2;
		double mul = mid*mid;
		
		// If mid itself is the square root, 
	    // return mid 
		if(mul==n || Math.abs(mul-n)<0.00001) {
			return mid;
			
			// If mul is less than n,  
		    // recur second half 
		}else if(mul<n) {
			return square(n,mid,j);
			
			
			// Else recur first half 
		}else {
			return square(n, i, mid);
		}
	}
	
	static void findSqrt(double n) {
		double i=1;
		boolean found =false;
		
		while(!found) {
			if(i*i==n) {
				found = true;
				System.out.println(i);
			}else if(i*i>n) {
				double res= square(n,i-1,i);
				found = true;
				System.out.printf("%.5f", res); 
				//System.out.println(res);
			}
			i++;
		}
	}
	

}

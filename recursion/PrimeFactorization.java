package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		
		factor(16,list);
		
		for(int e:list) {
			System.out.print(e+" ");
		}
		System.out.println();
       

		
	}
	static boolean isPrime(int x) {
		for(int i=2;i*i<=x;i++) {
			if(x%i==0)return false ;
		}
		return true;
	}
	
	static void factor(int x,List<Integer> list) {
		
		if(isPrime(x)) {
			list.add(x);
			return;
		}
		
		
		for(int i=2;;i++) {
			if( x % i==0) {
				
				list.add(i);
				factor(x/i,list);
				break;
				
			}
		}
	}
	
}

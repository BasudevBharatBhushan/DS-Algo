package loop;

public class ConditionForInfiniteLoops {

	public static void main(String[] args) {
		//infinite loop occurs in following cases
		//   1) if wrong conditions are written, eg.-
		
		for(int i = 0; i < 10; i--) {
			System.out.println(i);           //here if i is starting from 0, then i-- is wrong condition
		}
		
//   2) if middle condition is left
		
		
		//  3) if all three conditions are left, e.g- 
		 
		for(;;) {
			System.out.println("hello world");
		}
	}

}

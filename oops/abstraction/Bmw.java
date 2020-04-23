package oops.abstraction;

public class Bmw extends Car {   //Extension is done to avoid complexity 
	
	public void accelerate() {
		System.out.println("BMW is Acceleratng");
	}

	@Override   //this is a annotation which is saying that the method is overridden
    public void breaking() {
	     System.out.println("BMW is breaking");
	
}
	
	
}

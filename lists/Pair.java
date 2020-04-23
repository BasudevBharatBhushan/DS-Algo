package lists;

public class Pair<X,Y> {  //here <Generics> is used so that we can use variable of any data type as per our choice while calling the class  
	
	X x;
	Y y;
	
	public Pair(X x,Y y) {        //parameterized constructor
		this.x=x;
		this.y=y;
		
	}
	
	public void getDescription() {
		System.out.println(x+"  "+y);
	}
}

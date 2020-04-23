package methods;

public class PassbyValue {

	public static void main(String[] args) {
int c = 34;
int d = 12;
System.out.println(c + "  " + d);

swap(c,d);


	}
static void swap(int a, int b) {
	
	a = a-b;
	b = a+b;
	a=b-a;
	System.out.println("After swapping "+a+" "+b);
}

}




//So this is  a test to determine whether java is a pass by value or not.
// So basically we  r checking here: after calling the method the a will take c value and the d will take b value. so the value of a and b will interchange then. but the root value of c and d will remain intact
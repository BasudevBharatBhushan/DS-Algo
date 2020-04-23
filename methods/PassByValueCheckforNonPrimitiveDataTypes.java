package methods;

class Dog {
	int legs;
}
public class PassByValueCheckforNonPrimitiveDataTypes {

	public static void main(String[] args) {
		
		Dog c = new Dog();
		c.legs = 4;
		Dog d = new Dog();
		d.legs = 3;
		swap(c,d);
		
		System.out.println(c.legs + "   " + d.legs);
		Dog e = new Dog();
		e.legs=4;
		changeDog(e);
		System.out.println(e.legs);
	}
static void swap(Dog a, Dog b) {
	Dog temp = a;
	a = b;
	b = temp;
}
static void changeDog(Dog x) {
	x.legs=6;
}
}


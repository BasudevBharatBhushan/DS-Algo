package map;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		pen pen1 =new pen(10,"Blue");
        pen pen2 = new pen(10,"Blue");
        System.out.println(pen1);
        System.out.println(pen2);
        
        System.out.println(pen1==pen2);
        System.out.println(pen1.equals(pen2));  //after overriding equal method, we get this true
        
        Set pens = new HashSet();
        pens.add(pen1);
        pens.add(pen2);
        System.out.println(pens);  //before overriding the HashCode() it was treating pen1 and pen2 as different element
	}

}
class pen{
	int price;
	String colour;
	
	public pen(int price,String colour) {
		this.price=price;
		this.colour=colour;
	}
	/*
	 * Here we gonna override the equals() and hashCode() method of parent class Object
	 */
//	@Override
//	public boolean equals(Object obj) {
//		pen that = (pen) obj;  //Casting
//		boolean isEqual = this.price==that.price && this.colour.equals(that.colour);
//		return isEqual;	
//	}
//	@Override
//	public int hashCode() {
//		return price +colour.hashCode();
//	}
	
/*
 * So this overriding is done by eclipse which is completely error free for all type of objects
 * It is handling all the edge cases
 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pen other = (pen) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}

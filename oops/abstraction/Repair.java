package oops.abstraction;

public class Repair {
//	public static void repairCar(Bmw car) {
//		System.out.println("car is repaired");  //complexity is created if we are creating different methods for different car...So we use the method of abstraction
//	}                                           //method overloading
//	public static void repairCar(Audi car) {
//		System.out.println("car is repaired");
//	}

	//AFTER INHERTENCE, WE CAN JUST MAKE ONE METHOD
	public static void repairCar(Car car) {
		System.out.println("car is repaired");
	}

	
	public static void main(String[] args) {
		Bmw Bmw = new Bmw();
		Audi Audi = new Audi();
		
//   	Car car = New Car();   //not possible due to abstraction of car class
		
		repairCar(Bmw);
		repairCar(Audi);
 
	}

}

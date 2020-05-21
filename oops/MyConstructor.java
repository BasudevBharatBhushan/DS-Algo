package oops;
class Vehicle{
	int wheels;
	Vehicle(){            //No-Arg Constructor    //CONSTRUCTOR has no return type...It has just the variable same to the class
		wheels = 4;
	}
	
}
class ModernVehicle{
	int wheels;
	int headlights;
	int engine;                    //If we wish to keep the name of state variable and parameter variable same then we use the key word "this.variable"
	String colour;
	ModernVehicle(int noOfWheels,int engine){   //Parameterized constructor
		wheels = noOfWheels;
		headlights = 2;      //as generally there are always two head-lights present
		this.engine = engine;  //"this.variable" keyword is used to keep the state variable and parameter variable same
	}
	ModernVehicle(int wheels,String colour){     //constructor overloading
		this.wheels=wheels;
		this.colour=colour;
	}
}
public class MyConstructor {
	MyConstructor(){
		System.out.println("object is now created");
		
	}

	public static void main(String[] args) {
		
MyConstructor obj = new MyConstructor();

Vehicle car = new Vehicle();                //calling of no-Arg constructor
car.wheels = 3;
System.out.println(car.wheels+"  wheels");

ModernVehicle jeep = new ModernVehicle(4,4);     //calling of parameterized constructor
ModernVehicle Scooty = new ModernVehicle(2,1);
ModernVehicle jaguar = new ModernVehicle(2,"red");
System.out.println("jeep has "+jeep.wheels+" wheels and scooty has "+Scooty.wheels+" wheels");
System.out.println("jeep has "+jeep.engine+" engines and scooty has "+Scooty.engine+" engine");
System.out.println("both scooty and car has "+jeep.headlights+" "+Scooty.headlights+" headlights");
System.out.println("jaguar has "+jaguar.colour+" colour and "+jaguar.wheels+" wheels");
	}

}

package oops.singletons;

public class MainClass {

	public static void main(String[] args) {
		AppConfig obj = AppConfig.getInstance();  //because get instance is an static function and static function is related to class
		AppConfig obj1= AppConfig.getInstance(); //so these are basically the same object only 
		AppConfig obj2= AppConfig.getInstance();//so these objects are created by accessing that one object only
		AppConfig obj3= AppConfig.getInstance();
	}

}

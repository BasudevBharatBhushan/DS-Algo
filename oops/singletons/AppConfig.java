package oops.singletons;

public class AppConfig {
	private AppConfig(){  //as the default constructor is private now so u cannot make obj out of this...or at-least multiple object...for efficient use of memory ...to avoid repeated memory allocation for multiple objects to perform a single operation
			  
	}
	//private static AppConfig obj = new AppConfig();   //it is that one and only object  //if we do so then the appConfig singleton will be initialized upon opening the app even if we do not need this for operation
	private static AppConfig obj = null;   //initially taken as null...in case we do not need this in whole operation
	
	public static AppConfig getInstance() {   //Return type = AppConfig  //work of this function is to return that one instance(not multiple) or object which is made by the class
		if(obj==null)   //so this 'if class' is used for more optimization...suppose we don't need this appConfig singleton in whole operation...then with the help of this it will not be initialized un-necessarily upon opening the app
			obj = new AppConfig();
		
		return obj;   //once initialised it will not enter into the if class anymore because it will not be null anymore
	}
}





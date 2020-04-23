package oops.interfaces; 

public class Person implements Student, YouTuber{

	public static void main(String[] args) {
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
	
	//	YouTuber obj2 =new YouTuber();    //not possible because we can't instantiate an interface or we can't make an object of interface
 				//but this can be done
		YouTuber obj2 =obj;  //Upcasting is allowed   //here obj2 is restricted to youtuber only
		obj2.editVideo();
		obj2.makeVideo();
		
		//obj2.study();    //not possible because obj2 only possess youtuber qualities

	}

	@Override
	public void makeVideo() {
		System.out.println("person is making video");
		
	}

	@Override
	public void study() {
		System.out.println("person is studying");
	
		
	}

	@Override
	public void editVideo() {
		System.out.println("youtuber is editing the video");
    		
		
	}

	


}



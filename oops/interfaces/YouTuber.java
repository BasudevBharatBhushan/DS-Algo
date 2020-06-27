package oops.interfaces;

public abstract interface YouTuber extends VideoEditor { //Interface can extend another interface
	
	abstract void makeVideo();      //Abstract method   
//By default the methods of a interfaces are abstract,static,final and public, so if we do not mention 'abstract' and 'public' then also its OK
	
	default void uploadVideo() {  //we can make a concrete method in interface due to the changes in java-8, by using the default keyword
		System.out.println("Upload the video");
	}

}
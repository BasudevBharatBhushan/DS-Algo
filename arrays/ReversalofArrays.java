package arrays;


public class ReversalofArrays {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int n = a.length;
	
		for(int i=0;i<n/2;i++) {
	    	  int temp = a[i];
	    	  a[i]=a[n-i-1];
	    	  a[n-i-1]=temp;
	      }
      for(int item:a) {
  	System.out.print(item+" ");
  }
		
      }
	}











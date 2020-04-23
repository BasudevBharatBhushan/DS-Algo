package arrays;


public class ReversalofArrays {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int n = a.length;
		
	//	int b[]=new int[a.length];
	
//		for(int i =0;i<=n;i++) {
//			b[i]=a[n-i];
//		}
//		for(int item:b) {
//			System.out.print(item+" ");
//		}
//		
//		for(int i =n; i>=n-1;i--) {
//			b[i]=a[n-i];
//		}
//		for(int i =0;i<=n;i++) {
//			b[i]=a[n-2];
//		}
//		for(int item:b) {
//			System.out.print(item+" ");
//		}
//		
//	int t =1;	
//    int r =3;
//    while(t-->0) {
//    while(r-->0) {
//    	for(int i=0;i<n;i++) {
//    		b[i]=a[i];
//    	}
//    	a[n-1]=a[0];
//    	
//    	for(int i=0;i<n-1;i++) {
//    		a[i]=b[i+1];
//    	}
//   }
//    
//    for(int item:a) {
//    	System.out.print(item+" ");
//    }
//    }
//      for(int i=0;i<n/2;i++) {
//    	  int temp = a[i];
//    	  a[i]=a[n-i-1];
//    	  a[n-i-1]=temp;
//      }
//      for(int item:a) {
//      	System.out.print(item+" ");
//      }
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











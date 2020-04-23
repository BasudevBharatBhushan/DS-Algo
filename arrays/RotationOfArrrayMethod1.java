package arrays;

public class RotationOfArrrayMethod1 {                     //Time complexity : O(n * d)
                                                           //	Auxiliary Space : O(1)
	static void NumberOfRotation(int arr[],int N,int D) {
		for(int i=0;i<D;i++) {
			RotationOfArray(arr,N);
			
		}
		
	}
	static void RotationOfArray(int arr[],int N){
		int temp=0;
		temp=arr[0];
		for(int i=0;i<N-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[N-1]=temp;
	}
	static void PrintArray(int arr[],int N) {
		for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
		}
	}
	 

	public static void main(String[] args) {
	
     
		int arr[]= {1,2,3,4,5};
		int N=arr.length;
		int D=2;
		NumberOfRotation(arr,N,D);
		PrintArray(arr, N);
	}

}

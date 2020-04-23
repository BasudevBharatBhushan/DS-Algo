package arrays;
import  java.util.*;                     //MY METHOD OF ROTATION OF ARRAYS, BUT GREATER TIME COMPLEXITY 
public class RotaionOfArrayMethod2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of test cases");
		int TestCases=sc.nextInt();
		while(TestCases-->0) {
			System.out.println("Enter the length of array");
			int N = sc.nextInt();
			int arr[]=new int[N];
			System.out.println("Enter no. of rotation");
			int D=sc.nextInt();
			int b[]=new int[N];
			System.out.println("Enter elements of array");
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			while(D-->0) {
				for(int i=0;i<N;i++) {
					b[i]=arr[i];
				}
				int temp=arr[0];
				for(int i=0;i<N-1;i++) {
					arr[i]=arr[i+1];
				}
				arr[N-1]=temp;
				
			}
			for(int item:arr) {
				System.out.println(item);
			}
		}
	

	}

}

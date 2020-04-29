package arrays;
import java.util.*;                          //MOST EFFICIENT ONE
import java.lang.*;
import java.io.*;
public class RotationOfArrayMethod3 {

	public static void main(String[] args)throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s =new StringBuilder();
		//Scanner sc =new Scanner(System.in);
		System.out.println("test cases");
		//int t = sc.nextInt();
		int t =  Integer.parseInt(reader.readLine().trim());
		while(t-->0) {
			//int n = sc.nextInt();
			//int d = sc.nextInt();
			String nd[] = reader.readLine().trim().split(" ");
			int n = Integer.parseInt(nd[0].trim());
	        int d = Integer.parseInt(nd[1].trim());
	        String nums[] = reader.readLine().trim().split(" ");
	        
	        int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				//arr[i]=sc.nextInt();
				 arr[i] = Integer.parseInt(nums[i].trim());
			}
			rotateLeft(arr, d,n);
//			for(int item:arr) {
//				System.out.print(item+" ");
//			}
			for(int j=0;j<n;j++) {
		          s.append(arr[j]+" ");
		    }
		    s.append('\n');
		}
		System.out.println(s);

	}
	static void reverse(int a[],int start,int end) {
		while(start<end) {
			a[start]+=a[end];                  //swapping without using the third variable
			a[end]=a[start]-a[end];
			a[start]-=a[end];
			start++;
			end--;
			
		}
	}
	static void rotateLeft(int a[],int d,int n) {
	
		reverse(a,0,d-1);
		reverse(a,d,n-1);
		reverse(a,0,n-1);
		
	}

}

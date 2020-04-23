package arrays.pointersAlgorithm;
import java.util.*;
public class Triplet {  //to check 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Test Cases");
		int t = sc.nextInt();
		while(t-->0) {
			System.out.println("Enter the length of Array");
			int n = sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements of Array");
			for(int i =0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Triplet g = new Triplet();
			if(g.findTriplets(a,n))
				System.out.println("1");    //1 is printed if a triplet is available whose sum is 0 in the array
			else
				System.out.println("0");   //0 is printed if a triplet is unavailable whose sum is 0 in the array
		}
	
	}
	public boolean findTriplets(int arr[],int n) {
		Arrays.sort(arr);

		for(int i=0;i<n-2;i++) {
			if(twoSum(arr,-arr[i],i+1)) return true;		
		}
		
		return false;

	}
	
	public boolean twoSum(int a[],int x,int i) {  //this is the method or function to find twoSum problem
		int j = a.length-1;
		
		while(i<j) {
			if(a[i]+a[j]>x) {
				j--;
			}else if(a[i]+a[j]<x) {
				i++;
			}else {
				return true;
			}
		}
		return false;
		
	}

}

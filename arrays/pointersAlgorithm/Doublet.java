package arrays.pointersAlgorithm;
import java.util.Scanner;
public class  Doublet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the desired sum result");
		int x = sc.nextInt();
		Doublet obj = new Doublet();
		boolean result = obj.twoSum(a,x);
		
		if(result)
			System.out.println("1");  //desired doublet available
		else
			System.out.println("0");  //desired doublet unavailable
		
	

	}

	public boolean twoSum(int a[],int x) {  //this is the method or function to find twoSum problem
		int i = 0; int j = a.length-1;
		
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

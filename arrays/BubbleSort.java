package arrays;

public class BubbleSort {

	public static void main(String[] args) {
	
int a [] = {2,1,8,-3,6,4,12};
int n = a.length;

for(int i = 0; i<n-1;i++) {
	
	boolean sorted = true;
	for(int j = 0; j<n-1-i; j++) {
		if (a[j+1] < a[j]) {
			
		
		//int temp = a[j+1];
		//a[j+1] = a[j];               //swapping of value using a third variable
		//a[j] = temp;
		//here it cannot be done without using temp because if we do so then after a[j+1] =a[j], the value of a[j+1] will be lost from existence so we cannot use 
	//	a[j] = a[j+1] any further because it will the same value only.
			
	
		
		a[j]=a[j]-a[j+1];
		a[j+1]=a[j]+a[j+1];   //swapping of value without using third variable
		a[j]=a[j+1]-a[j];
		
		sorted = false;
		}
		
	}
	if(sorted) break;
}
		for(int item:a) {
			System.out.print(item + "  ");
		}

	}

}

package recursion;

public class FindAllThePathInAMatrix {

	public static void main(String[] args) {
		System.out.println(path(7,7));
		System.out.println(path1(7,7));

	}
	
	static int path(int n,int m) {
		//System.out.println(n+" "+m);
		if(n==1 || m==1)return 1;
		
		return path(n,m-1)+path(m,n-1);
	}
	
	static int path1(int n,int m) {
		//System.out.println(n+" "+m);
		if(n==1 || m==1)return 1;
		
		return path(n,m-1)+path(n-1,m);
	}

}

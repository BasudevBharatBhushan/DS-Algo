package recursion;

import java.util.Arrays;

public class FloodFill {

	public static void main(String[] args) {
		 int[][] matrix = {
             {1, 1, 1, 1, 1, 1},
             {1, 1, 2, 2, 1, 1},
             {1, 1, 2, 2, 1, 1},
             {2, 2, 2, 2, 2, 2}};
		 
//		 int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
//	                {1, 1, 1, 1, 1, 1, 0, 0},
//	                {1, 0, 0, 1, 1, 0, 1, 1},
//	                {1, 2, 2, 2, 2, 0, 1, 0},
//	                {1, 1, 1, 2, 2, 0, 1, 0},
//	                {1, 1, 1, 2, 2, 2, 2, 0},
//	                {1, 1, 1, 1, 1, 2, 1, 1},
//	                {1, 1, 1, 1, 1, 2, 2, 1},
//	                };
		 final long dfsApproachStart = System.nanoTime();
             floodFill(matrix, 2, 2, 3, 2);
             
             printMatrix(matrix);
             System.out.println("\nTotal time taken by this approach : [" + (System.nanoTime() - dfsApproachStart) / 1000 + "] us");
	}
	
	static void floodFill(int a[][],int r,int c,int toFill,int prevFill) {
		System.out.println(r+" "+c);
		int row=a.length;
		int col = a[0].length;
		
		if(r<0 || r>=row || c<0 || c>=col) {
			return;
		}
		if(a[r][c]!=prevFill) {
			return;
		}
		
		a[r][c]=toFill;
		
		floodFill(a , r-1, c  , toFill, prevFill);
		floodFill(a , r  , c-1, toFill, prevFill);
		floodFill(a , r+1, c  , toFill, prevFill);
		floodFill(a , r  , c+1, toFill, prevFill);
		
		
	}
	
	
	

	
	
	static void printMatrix( int [][]matrix) {
		for(int e[]:matrix) {
			for( int element:e) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}

}



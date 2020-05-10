package arrays;
import java.util.*;
import java.io.*;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int mat[][]= {{1,2,3},     //syntax to declare a 2D array with elements
		              {4,5,6}, 
		              {7,8,9}};

		print2D(mat);
		System.out.println();
		printInMatrixStyle(mat);
	}
	static void print2D(int mat[][]) {
	//Loop through all the rows
		for(int i=0;i<mat.length;i++) {
			//Loop through all the elements of current rows
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
		}
	}
	
	static void print2DArrayUsingForEachLoop(int mat[][]) {
		//loop through all the rows
		for(int[] row:mat)
			//Loop through all columns of current row
			for(int x:row)
				System.out.println(x+" ");
	}
	
	public static void printInMatrixStyle(int mat[][]) {
		
		//Loop through all the rows
		for(int[] row:mat)
			//converting each row as string
			//and then printing in a separate line
			System.out.println(Arrays.toString(row));
	}

}

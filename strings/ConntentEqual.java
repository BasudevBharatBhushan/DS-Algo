package strings;

import java.util.Scanner;

public class ConntentEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String h  = "anuj";
		String g = new String("anuj");
		System.out.println(h.equals(g));
		System.out.println(h==g);
		System.out.println(h.contentEquals(g));
	}

}

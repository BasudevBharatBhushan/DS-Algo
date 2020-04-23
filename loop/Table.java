package loop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int tableOf = sc.nextInt();
    int n = sc.nextInt();
    for(int i=1; i <= n ; i++) {
	  System.out.println(tableOf + "*" + i + "=" + tableOf *i);    // for more clarification
	  //System.out.println(tableOf *i);
}





	}

}

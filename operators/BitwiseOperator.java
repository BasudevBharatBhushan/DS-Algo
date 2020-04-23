package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 5;
int b = 6;
int z = 5 & 6;
System.out.println(z);

int c = 10;
int d = 13;
int y = c | d;
System.out.println(y);

int x = 13 >> 1;
int w = 13 >> 2;
int v = 13 << 1;

System.out.println(x + " " + w + " " + v);
	}

}

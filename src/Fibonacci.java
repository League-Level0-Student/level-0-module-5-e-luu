
public class Fibonacci {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int c = 1;
	for (int i = 0; c<144; ) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
}
}

package project1;

public class Fibonacci {

	public static void main(String[] args) {
//		0,1,1,2,3,5,8,13
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int c;
		for(int i=0;i<8;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}

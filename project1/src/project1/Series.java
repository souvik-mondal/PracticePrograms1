package project1;

import java.util.Scanner;

public class Series {

	Scanner sc=new Scanner(System.in);
	int x;
	int n;
//	to accept the number of terms & the value of x
	void input ( ) {
		x=sc.nextInt();
		n=sc.nextInt();
	}
//	to calculate the sum of the series
	void sum_of_series( ) {
		input();
		int index=0;
		double num;
		int denom;
		double sum=0;
		double sign=1;
		for(int i=1;i<=n;i=i+1) {
			num=calculate(x,index);
			denom=calculate(index);
			System.out.println("term"+(num/denom));
			sum=sum+sign*(num/denom);
			sign=sign*(-1);
			index=index+2;
		}
		display(sum);
	}
//	to display the sum of the series
	void display(double s) {
		System.out.println(s);
	}
//	to calculate the power of x using iteration
	double calculate (int x, int p) {
		double result=1;
		for(int i=1;i<=p;i++) {
			result=result*x;
		}
		return result;
	}
//	to calculate the factorial of the denominator
	int calculate(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}

}

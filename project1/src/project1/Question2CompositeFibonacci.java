package project1;

import java.util.Scanner;

public class Question2CompositeFibonacci {
	public void Comp_Fibo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			display(i);
		}
		sc.close();
	}
	public void display(int num) {
		if(check_Composite(num) && chk_Fibo(num)==1) {
			System.out.println(num);
		}
	}
	public boolean check_Composite(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return true;
			}
		}
		return false;
	}
	public int chk_Fibo(int n) {
		int f1=5*n*n-4;
		int f2=5*n*n+4;
		if(Math.pow((int)Math.sqrt(f1), 2)==f1 || Math.pow((int)Math.sqrt(f2), 2)==f2) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		 Question2CompositeFibonacci qs=new Question2CompositeFibonacci();
		 qs.Comp_Fibo();
	}

}

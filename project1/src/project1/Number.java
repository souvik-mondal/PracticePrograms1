package project1;

import java.util.Scanner;

public class Number {
	int num;// to store the number
	int c;//to count factors
	static int count;//assign 0 for count frequency
	Number (int nn){
		//parameterized constructor to initialize the data member num=nn
		num=nn;
	}
			public int count_of_factors(int i) {
				//returns the number of the factors (num), excluding itself, using a recursive technique
				c=0;
				if(i>num/2) {
					return c;
				}
				else if(num%i==0) {
					c++;
					return c+count_of_factors(i+1);
				}
				else {
					count_of_factors(i+1);
					return count_of_factors(i+1);
				}
			}
			public int sum_of_digits(int i) {
					int sum=0;
					while(i>0) {
						sum+=i%10;
						i=i/10;
					}
					if(sum>9) {
						return sum_of_digits(sum);
					}
					else {
						return sum;
					}
			}
			public void check() {
				//checks whether the given number is Composite Magic number by invoking the functions and displays the result with an appropriate message
				if(count_of_factors(1)>1 && sum_of_digits(num)==1) {
					System.out.print(num+",");
					Number.count++;
				}
			
			}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Number nb;
		Number.count=0;
		System.out.print("Enter the lower limit:");
		int m=sc.nextInt();
		System.out.print("Enter upper limit:");
		int n=sc.nextInt();
		if(m<n) {
			System.out.print("THE COMPOSITE MAGIC INTEGERS ARE:");
			for(int i=m;i<=n;i++) {
				nb=new Number(i);
				nb.check();
			}
			System.out.println();
			System.out.print("FREQUENCY OF COMPOSITE MAGIC INTEGERS IS:"+Number.count);
		}
		sc.close();
	}

}

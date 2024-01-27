package project1;
import java.util.*;

public class Matrix {
	Scanner sc=new Scanner(System.in);
	int matrix[][];
	int order;
	public void getData(){
		System.out.print("Enter the order of the matrix:");
		order=sc.nextInt();
		matrix = new int[order][order];
		System.out.println("Enter the elements of the matrix:");
		for(int i=0;i<order;i++) {
			for(int j=0;j<order;j++) {
				System.out.print("Enter value of location "+i+","+j+":");
				matrix[i][j]=sc.nextInt();
			}
		}
	}
	public void display() {
		for(int i=0;i<order;i++) {
			for(int j=0;j<order;j++) {
				System.out.print(matrix[i][j]+"\t");	
			}
			System.out.println();
		}
	}
	public void column_Sum() {
		int sum=0;
		for(int i=0;i<order;i++) {
			sum=0;
			for(int j=0;j<order;j++) {
				sum+=matrix[j][i];
			}
			System.out.println("Sum of "+(i+1)+" column:"+sum);
		}
	}
	public void second_max() {
		int max=matrix[0][0];
		int smax=matrix[0][0];
		for(int i=0;i<order;i++) {
			for(int j=0;j<order;j++) {
				if(matrix[i][j]>max) {
					max=matrix[i][j];
				}
			}
		}
		for(int i=0;i<order;i++) {
			for(int j=0;j<order;j++) {
				if(matrix[i][j]>smax && matrix[i][j]<max) {
					smax=matrix[i][j];
				}
			}
		}
		System.out.println("Second largest element of this matrix is:"+smax);
	}
	public void right_lower() {
		System.out.println("The right-lower matrix is:");
		for(int i=0;i<order;i++) {
			for(int s=order-1;s>i;s--) {
				System.out.print("\t");
			}
			for(int j=order-i-1;j<order;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Matrix mx=new Matrix();
		mx.getData();
		mx.display();
		mx.column_Sum();
		mx.second_max();
		mx.right_lower();
	}

}

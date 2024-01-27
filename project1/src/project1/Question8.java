package project1;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of rows and columns");
		int size=sc.nextInt();
		int [][]array=new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print("Enter the element at ("+i+","+j+")");
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original matrix:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		int [][]transposedarray=new int [size][size];
		//transposing a matrix
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				transposedarray[j][i]=array[i][j];
			}
		}
		System.out.println("Transposed matrix:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(transposedarray[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Mirror of transposed matrix:");
		for(int i=0;i<size;i++) {
			for(int j=size-1;j>=0;j--) {
				System.out.print(transposedarray[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}

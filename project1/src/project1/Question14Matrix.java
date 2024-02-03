package project1;

import java.util.Scanner;

public class Question14Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the square matrix:");
		int size=sc.nextInt();
		int [][]arr=new int[size][size];
		int []boundary_elements=new int[size*4-4];
		int product_nonboundary=1;
		int k=0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print("Enter the element at location ("+i+","+j+"):");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original matrix:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i==0||i==size-1||j==0||j==size-1) {
					boundary_elements[k++]=arr[i][j];
				}
				else {
					product_nonboundary*=arr[i][j];
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<boundary_elements.length-1;i++) {
			for(int j=0;j<boundary_elements.length-1-i;j++) {
				if(boundary_elements[j]>boundary_elements[j+1]) {
					int temp=boundary_elements[j];
					boundary_elements[j]=boundary_elements[j+1];
					boundary_elements[j+1]=temp;
				}
			}
		}
		k=0;
		for(int i=0;i<size;i++) {
			arr[0][i]=boundary_elements[k++];
		}
		for(int i=1;i<size;i++) {
			arr[i][size-1]=boundary_elements[k++];
		}
		for(int i=size-2;i>=0;i--) {
			arr[size-1][i]=boundary_elements[k++];
		}
		for(int i=size-2;i>=1;i--) {
			arr[i][0]=boundary_elements[k++];
		}
		System.out.println("Rearranged matrix:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=1;i<size-1;i++) {
			for(int j=1;j<size-1;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Product of the non-boundary values:"+product_nonboundary);
		
	}

}

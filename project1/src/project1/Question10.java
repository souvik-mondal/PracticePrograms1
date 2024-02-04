package project1;

import java.util.Scanner;

public class Question10 {
	public int[] reverseArray(int []a) {
		int left=0;
		int right=a.length-1;
		while(left<right) {
			a[left]+=a[right];
			a[right]=a[left]-a[right];
			a[left]=a[left]-a[right];
			left++;
			right--;
		}
		return a;
	}
	public int[][] transposeSquare(int [][]a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i;j<a[i].length;j++) {
				if(i!=j) {
					a[i][j]+=a[j][i];
					a[j][i]=a[i][j]-a[j][i];
					a[i][j]=a[i][j]-a[j][i];
				}
			}
		}
		return a;
	}
	public int[][] transposeNonSquare(int [][]a) {
		int [][]b=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i]=a[i][j];
			}
		}
		displayMatrix(b);
		return b;
	}
	
	public int[][] rotateMatrix90ClockwiseOr270AntiClockwise(int [][]a) {
		if(a.length==a[0].length) {
			a=transposeSquare(a);
		}
		else {
			a=transposeNonSquare(a);
		}
		for(int i=0;i<a.length;i++) {
			a[i]=reverseArray(a[i]);
		}
		return a;
	}

	  public void displayMatrix(int[][] matrix) {
	        for(int i = 0; i < matrix.length; i++) {
	            for(int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows (M) and columns (N): ");
	        int M = scanner.nextInt();
	        int N = scanner.nextInt();

	        if(M < 3 || M > 9 || N < 3 || N > 9) {
	            System.out.println("Invalid input. M and N must be greater than 2 and less than 10.");
	            scanner.close();
	            return;
	        }

	        int[][] A = new int[M][N];
	        int sum = 0;
	        System.out.println("Enter the elements of the matrix: ");
	        for(int i = 0; i < M; i++) {
	            for(int j = 0; j < N; j++) {
	                A[i][j] = scanner.nextInt();
	                if(A[i][j] % 2 != 0) {
	                    sum += A[i][j];
	                }
	            }
	        }

	        // Create an instance of Question10
	        Question10 q10 = new Question10();

	        // Display the input matrix
	        System.out.println("Input Matrix: ");
	        q10.displayMatrix(A);

	        // Rotate the matrix by 270 degrees anti-clockwise
	        A = q10.rotateMatrix90ClockwiseOr270AntiClockwise(A);
	        System.out.println("Matrix after 270 degree rotation: ");
	        q10.displayMatrix(A);
	        System.out.println("Sum of odd elements: " + sum);
	   scanner.close();
	    }
}

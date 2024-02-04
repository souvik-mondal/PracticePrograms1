package project1;

import java.util.Scanner;

public class Question11DoublyMarkov {
	 public boolean isDoublyMarkov(double[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            double rowSum = 0, colSum = 0;
	            for (int j = 0; j < matrix[i].length; j++) {
	                rowSum += matrix[i][j];
	                colSum += matrix[j][i];
	            }
	            if (rowSum != 1 || colSum != 1) {
	                return false;
	            }
	        }
	        return true;
	    }

    public static void main(String[] args) {
        Question11DoublyMarkov q = new Question11DoublyMarkov();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the order of the matrix (between 3 and 9):");
        int N = scanner.nextInt();

        if (N < 3 || N > 9) {
            System.out.println("SIZE IS OUT OF RANGE.\nINVALID ENTRY");
            scanner.close();
            return;
        }

        double[][] M = new double[N][N];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                M[i][j] = scanner.nextDouble();
                if (M[i][j] < 0) {
                    System.out.println("NEGATIVE NUMBERS ENTERED.\nINVALID ENTRY");
                    scanner.close();
                    return;
                }
            }
        }

        if (q.isDoublyMarkov(M)) {
            System.out.println("The matrix is a Doubly Markov matrix.");
        } else {
            System.out.println("The matrix is not a Doubly Markov matrix.");
        }
        scanner.close();
    }

}

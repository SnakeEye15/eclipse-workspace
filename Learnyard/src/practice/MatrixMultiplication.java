package practice;

import java.util.Scanner;

/**
 * Provides methods for matrix multiplication.
 */
public class MatrixMultiplication {

    /**
     * Checks if matrix multiplication is possible between two matrices.
     *
     * @param matrixA the first matrix
     * @param matrixB the second matrix
     * @return true if matrix multiplication is possible, false otherwise
     */
    public static boolean isMatrixMultiplicationPossible(int[][] matrixA, int[][] matrixB) {
        // Check if the number of columns in matrix A matches the number of rows in matrix B
        return matrixA[0].length == matrixB.length;
    }

    /**
     * Performs matrix multiplication between two matrices.
     *
     * @param matrixA the first matrix
     * @param matrixB the second matrix
     * @return the result of matrix multiplication
     */
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        // Get the dimensions of the matrices
        int rowsA = matrixA.length; // Number of rows in matrix A
        int colsA = matrixA[0].length; // Number of columns in matrix A
        int colsB = matrixB[0].length; // Number of columns in matrix B

        // Create a new matrix to store the result of matrix multiplication
        int[][] result = new int[rowsA][colsB];

        // Perform matrix multiplication using nested loops
        for (int i = 0; i < rowsA; i++) { // Iterate over the rows of matrix A
            for (int j = 0; j < colsB; j++) { // Iterate over the columns of matrix B
                for (int k = 0; k < colsA; k++) { // Iterate over the columns of matrix A
                    // Multiply corresponding elements and add to the result
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    /**
     * Reads a matrix from the user.
     *
     * @param scanner the scanner to read input from
     * @param rows    the number of rows in the matrix
     * @param cols    the number of columns in the matrix
     * @return the matrix read from the user
     */
    public static int[][] readMatrix(Scanner scan, int rows, int cols) {
        // Create a new matrix to store the input
        int[][] matrix = new int[rows][cols];

        // Read the matrix from the user
        for (int i = 0; i < rows; i++) { // Iterate over the rows
            for (int j = 0; j < cols; j++) { // Iterate over the columns
                System.out.print("Enter element (" + i + "," + j + "): "); // Prompt the user to enter an element
                matrix[i][j] = scan.nextInt(); // Read the element from the user
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        // Create a new scanner to read input from the user
        Scanner scan = new Scanner(System.in);

        // Read the dimensions of the matrices from the user
        System.out.print("Enter number of rows in matrix A: ");
        int rowsA = scan.nextInt();

        System.out.print("Enter number of columns in matrix A: ");
        int colsA = scan.nextInt();

        System.out.print("Enter number of rows in matrix B: ");
        int rowsB = scan.nextInt();

        System.out.print("Enter number of columns in matrix B: ");
        int colsB = scan.nextInt();

        // Read the matrices from the user
        int[][] matrixA = readMatrix(scan, rowsA, colsA);
        int[][] matrixB = readMatrix(scan, rowsB, colsB);

        // Check if matrix multiplication is possible
        if (isMatrixMultiplicationPossible(matrixA, matrixB)) {
            // Perform matrix multiplication
            int[][] result = multiplyMatrices(matrixA, matrixB);

            // Print the result of matrix multiplication
            System.out.println("Result of matrix multiplication:");
            printMatrix(result);
        } else {
            System.out.println("Matrix multiplication is not possible.");
        }
    }

    /**
     * Prints a matrix in a readable format.
     *
     * @param matrix the matrix to print
     */
    private static void printMatrix(int[][] matrix) {
        // Iterate over the rows of the matrix
        for (int[] row : matrix) {
            // Iterate over the columns of the matrix
            for (int element : row) {
                System.out.print(element + " ");}
			System.out.println();}}}